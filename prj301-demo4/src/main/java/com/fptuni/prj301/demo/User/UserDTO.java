/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptuni.prj301.demo.User;

import java.util.Date;

/**
 *
 * @author DUNGHUYNH
 */
public class UserDTO {


    
    private String username;
    private String name;
    private Date loginDate;
    

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
    

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
