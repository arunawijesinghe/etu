/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu.controller;

import etu.entity.Category;
import etu.enums.CategoryType;
import etu.enums.Gender;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Aruna Csw
 */
@Named(value = "enumController")
@SessionScoped
public class EnumController implements Serializable {
private CategoryType selected;
    /**
     * Creates a new instance of EnumController
     */
    public EnumController() {
    }
    
    public Gender[] getGenderValues() {
    return Gender.values();
  }
   public CategoryType[] getCategoryValues() {
    return CategoryType.values();
  }
   public CategoryType[] getAreaValues() {
    return CategoryType.values();
  }

    public CategoryType getSelected() {
        return selected;
    }

    public void setSelected(CategoryType selected) {
        this.selected = selected;
    }

  
   
}
