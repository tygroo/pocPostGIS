package com.apside;

import com.apside.config.DomainConfig;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.PersistenceContext;

/**
 * Standalone application with Spring Data JPA, Hibernate and Maven
 * 
 * @author bbonheur
 */

public class App {

    public static void main(String[] args) {

        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DomainConfig.class);


        Process proc = new Process();
        proc.LetsGo();
	}
	

}
