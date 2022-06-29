/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.prj301.demo.Student;

import com.fptuni.prj301.demo.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNGHUYNH
 */
public class StudentDAO {
    
    public List<StudentDTO> list(String keyword, String city ){
        
        ArrayList<StudentDTO> list;  
        list = new ArrayList<StudentDTO>();
        
        String sql = "select id, firstname, lastname from student ";

        String where = "";
        String whereJoinWord = " where ";     
        
        if (keyword != null && !keyword.trim().isEmpty()){
            where += whereJoinWord;
            where += " (lastname  like  ? OR lastname like ? )";
            whereJoinWord = " and ";  
        }
        if (city != null && !city.trim().isEmpty())
            where += whereJoinWord;
            where += " city  LIKE ? ";
            whereJoinWord = " and ";
        
        try {
            
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            int index = 1;
            if (keyword != null && !keyword.trim().isEmpty()){
                ps.setString(index, keyword);
                index ++;
                ps.setString(index, keyword);
                index ++;
            }
            
            if (city != null && !city.trim().isEmpty()){
                ps.setString(index, city);
                index ++;
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                    list.add(new StudentDTO (
                                    rs.getLong("id"),
                                    rs.getString("firstname"),
                                    rs.getString("lastname")
                    ));
            }
            return list;

	}
        catch (SQLException ex) {
            System.out.println("Query Student error!" + ex.getMessage());
        }
        return null;	// your code
		//
    }
    
    /*
    Load student with id
    */
    
    
    public StudentDTO load(Long id){

        String sql = "select id, firstname, lastname from student where id = ?";
    
        try {
            
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);                      
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                     return new StudentDTO (
                                    rs.getLong("id"),
                                    rs.getString("firstname"),
                                    rs.getString("lastname"));
                             }
	}
        catch (SQLException ex) {
            System.out.println("Query Student error!" + ex.getMessage());
        }
        return null;
    }
    
    /*
    Insert student and return Id
    */    
    public Long insert(StudentDTO student){
        String sql = "INSERT INTO student( id, firstname, lastname) "               
                + " VALUES (?, ?,?)";    
        try {
            
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);                      
            
            ps.setLong(1, student.getId());
            ps.setString(2, student.getFirstName());
            ps.setString(3, student.getLastName());

            ps.executeUpdate();
           
	}
        catch (SQLException ex) {
            System.out.println("Insert Student error!" + ex.getMessage());
        }
        return null;
    }
    
    /*
    Update student and return Id
    */ 
    public boolean update(StudentDTO student){
        
        
        return false;
    }
    
    /*
    Delete student 
    */ 
    public boolean delete(Long id){
        
        
        return false;
    }
    
            

        
}
