/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.prj301.demo.photo;

import com.fptuni.prj301.demo.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNGHUYNH
 */
public class PhotoDAO {
    
    public List <PhotoDTO> list(){
        
        //Student write code here
        
        String sql = "select id, name, description, image_link, category from photo ";
                
     
        
        return null;
        
    }
}
