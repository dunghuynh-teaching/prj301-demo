/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.prj301.demo.User;

import com.fptuni.prj301.demo.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author DUNGHUYNH
 */
public class UserDAO{
    
    public UserDTO login(String user, String password){
        
        String sql = "select username, name from users "
                + " where username = ? and password = ?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, user);
            ps.setString(2, password);
            
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                UserDTO userDTO =  new UserDTO();
                
                userDTO.setUsername(rs.getString("username"));
                userDTO.setName(rs.getString("name"));
                userDTO.setLoginDate(new Date());
                
                return userDTO;
                
            }
        }
        catch (SQLException ex) {
            System.out.println("Query Student error!" + ex.getMessage());
        }
        return null;
    }
}
