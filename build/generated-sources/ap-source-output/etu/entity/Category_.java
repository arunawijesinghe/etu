package etu.entity;

import etu.enums.CategoryType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-29T11:17:52")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> ename;
    public static volatile SingularAttribute<Category, String> sname;
    public static volatile SingularAttribute<Category, String> tname;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, CategoryType> type;

}