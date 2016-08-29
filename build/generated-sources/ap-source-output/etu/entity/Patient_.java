package etu.entity;

import etu.entity.Category;
import etu.entity.Department;
import etu.entity.Unit;
import etu.enums.Gender;
import etu.enums.Investigation;
import etu.enums.Outcome;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-29T11:17:52")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, Category> area;
    public static volatile SingularAttribute<Patient, Gender> gender;
    public static volatile SingularAttribute<Patient, String> tname;
    public static volatile SingularAttribute<Patient, Boolean> active;
    public static volatile SingularAttribute<Patient, String> ename;
    public static volatile SingularAttribute<Patient, Unit> unit;
    public static volatile SingularAttribute<Patient, Category> triageCategory;
    public static volatile SingularAttribute<Patient, String> sname;
    public static volatile SingularAttribute<Patient, String> bhtNo;
    public static volatile SingularAttribute<Patient, Category> patientCondition;
    public static volatile SingularAttribute<Patient, Investigation> investigation;
    public static volatile SingularAttribute<Patient, Long> id;
    public static volatile SingularAttribute<Patient, Department> department;
    public static volatile SingularAttribute<Patient, Integer> age;
    public static volatile SingularAttribute<Patient, Outcome> outcome;

}