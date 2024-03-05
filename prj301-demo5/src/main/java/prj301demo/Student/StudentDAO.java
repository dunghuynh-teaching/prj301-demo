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
    /*
    Load student with id
    */
    public StudentDTO load(int id){

        String sql = "select id, firstname, lastname, age from student where id = ?";
    
        try {
            
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);                      
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                                    
                    String firstname = rs.getString("firstname");
                    String lastname = rs.getString("lastname");
                    int age = rs.getInt("age");

                    StudentDTO student = new StudentDTO();
                    student.setId(id);
                    student.setFirstname(firstname);
                    student.setLastname(lastname);
                    student.setAge(age);
                    return student;
            }
        }
        catch (SQLException ex) {
            System.out.println("Query Student error!" + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }
    
    /*
    Insert student and return Id
    */    
    public Long insert(StudentDTO student){
        String sql = "INSERT INTO student( id, firstname, lastname) "               
                + " VALUES (?, ?, ?)";    
        try {
            
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);                      
            
            ps.setInt(1, student.getId());
            ps.setString(2, student.getFirstname());
            ps.setString(3, student.getLastname());

            ps.executeUpdate();
           
	}
        catch (SQLException ex) {
            System.out.println("Insert Student error!" + ex.getMessage());
            ex.printStackTrace();
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
