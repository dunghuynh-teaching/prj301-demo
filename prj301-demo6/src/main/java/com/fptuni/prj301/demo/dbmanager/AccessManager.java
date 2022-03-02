package com.fptuni.prj301.demo.dbmanager;

import com.fptuni.prj301.demo.model.UserSession;
import java.util.Date;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUNGHUYNH
 */
public class AccessManager {
    
    public UserSession login (String username, String password){
        if (username.equals("dung")){
            UserSession us =  new UserSession();
            us.setUsername(username);
            us.setLoginDate(new Date());
            
            us.setAccessRight("Admin");
            return us;
        }
        return null;
    }
    

}
