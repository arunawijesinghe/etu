package etu.entity;

import etu.enums.Gender;
import etu.enums.WebUSerPrivilege;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-29T11:17:52")
@StaticMetamodel(WebUser.class)
public class WebUser_ { 

    public static volatile SingularAttribute<WebUser, String> password;
    public static volatile SingularAttribute<WebUser, Gender> gender;
    public static volatile SingularAttribute<WebUser, String> name;
    public static volatile SingularAttribute<WebUser, Long> id;
    public static volatile SingularAttribute<WebUser, String> email;
    public static volatile SingularAttribute<WebUser, WebUSerPrivilege> webUSerPrivilege;
    public static volatile SingularAttribute<WebUser, String> username;

}