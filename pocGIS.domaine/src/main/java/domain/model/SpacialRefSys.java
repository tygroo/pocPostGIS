package domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bbonheur on 26/10/2015.
 */
@Entity
public class SpacialRefSys {
    
	@Id
    protected Integer srid;

    protected String auth_name;

    protected String authSrid;

    protected String srtext;


}
