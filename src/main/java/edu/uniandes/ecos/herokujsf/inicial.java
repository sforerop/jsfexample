/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.herokujsf;

import java.io.File;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean
@SessionScoped
public class inicial {

    /**
     * Creates a new instance of inicial
     */
    public inicial() {
    }
    
    private String firstName = "John";
    private String lastName = "Doe";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String showGreeting() {
        return "Hello" + " " + firstName + " " + lastName + "!";
    }
    
}
