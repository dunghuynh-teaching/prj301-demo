/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj301demo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import prj301demo.utils.DBUtils;

/**
 *
 * @author DUNGHUYNH
 */
public class StudentDAO{
    
    public List<StudentDTO> list(String keyword, String sortCol){
                
        List<StudentDTO> list = new ArrayList<StudentDTO>();
        
        try {

                Connection con = DBUtils.getConnection();            
                String sql = " SELECT id, firstname, lastname, age FROM student ";

                if (keyword != null && !keyword.isEmpty()){
                    sql += " WHERE firstname like ? OR lastname like ? ";
                }

                if (sortCol != null && !sortCol.isEmpty()){
                    sql += " ORDER BY " + sortCol + " ASC ";
                }

                
                PreparedStatement stmt = con.prepareStatement(sql);
                
                if (keyword != null && !keyword.isEmpty()){
                    stmt.setString(1, "%" + keyword + "%");
                    stmt.setString(2, "%" + keyword + "%");
                }
                
                ResultSet rs = stmt.executeQuery();
                
                if (rs != null){
                    while (rs.next()){
                        
                        int id = rs.getInt("id");
                        String firstname = rs.getString("firstname");
                        String lastname = rs.getString("lastname");
                        int age = rs.getInt("age");
                        
                        StudentDTO student = new StudentDTO();
                        student.setId(id);
                        student.setFirstname(firstname);
                        student.setLastname(lastname);
                        student.setAge(age);
                        
                        list.add(student);
                    }
                }
                con.close();
            } catch (SQLException ex) {                
                System.out.println("Error in servlet. Details:" + ex.getMessage());
                ex.printStackTrace();
                
            }
        return list;
    }
    
}
