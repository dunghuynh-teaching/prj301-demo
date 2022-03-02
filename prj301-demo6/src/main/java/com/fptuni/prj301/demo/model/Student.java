/**
 *
 * @author DUNGHUYNH
 */
package com.fptuni.prj301.demo.model;

public class Student {
    
    private Long id = null;
    private String firstName = null; 
    private String lastName= null;

    public Student(Long id, String firstName,String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public Student() {
        this.id = null;
        this.firstName = null;
        this.lastName = null;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
