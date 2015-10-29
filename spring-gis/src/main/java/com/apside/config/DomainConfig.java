/**
 * 
 */
package com.apside.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author bbonheur
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.apside")
@EnableJpaRepositories("com.apside.dao")
public class DomainConfig {

	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "org.hibernate.spatial.dialect.postgis.PostgisDialect";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "true";
	private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "update";

	@Bean
	public DataSource dataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/opendataspringgis");
		dataSource.setUsername("opendata");
		dataSource.setPassword("opendata");
		dataSource.setInitialSize(10);
		dataSource.setMaxActive(100);
		dataSource.setMaxIdle(10);

		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();

		lcemfb.setDataSource(this.dataSource());
		lcemfb.setPackagesToScan(new String[] {"com.apside" });

		HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
		lcemfb.setJpaVendorAdapter(va);

		lcemfb.setJpaProperties(hibProperties());

		lcemfb.afterPropertiesSet();

		return lcemfb;
	}

	private Properties hibProperties() {
		Properties properties = new Properties();
		properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, PROPERTY_NAME_HIBERNATE_DIALECT);
		properties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO, PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO);
		properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, PROPERTY_NAME_HIBERNATE_SHOW_SQL);
		return properties;
	}

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		return transactionManager;
	}
}
