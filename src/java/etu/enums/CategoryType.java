/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu.enums;

/**
 *
 * @author Aruna Csw
 */
public enum CategoryType {
    Area,
    TriageCategory,
    PatientCondition,
    WorkingDiagnosis;
    
    private String Label;

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }
  
}
