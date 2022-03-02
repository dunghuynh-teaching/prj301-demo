package com.fptuni.prj301.demo.dbmanager;
import java.util.List;
import com.fptuni.prj301.demo.model.Student;
import com.fptuni.prj301.demo.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUNGHUYNH
 */
public class StudentManager {
    
    /*
    List all students
    */
    //ArrayList<Student> list;
    private static ArrayList<Student> list;
    
    static {
        list = new ArrayList<Student>();
        list.add( new Student (new Long(0),"Nam","Tran"));
        list.add( new Student (new Long(1),"Dung","Huynh"));
        list.add( new Student (new Long(2),"Van","Nguyen"));
        list.add( new Student (new Long(3),"Chau","Nguyen"));
    }
        
    public StudentManager(){


    }
    
    
    public List<Student> list(){
        return list;
    }
    
    /*
    List students with paging
    */
    public List<Student> list(int start, int limit){
        return null;
    }
    
    /*
    List students with criteria and paging
    */
    public List<Student> list(String name, int start, int limit){
        return null;
    }
    
    /*
    Load student with id
    */
    public Student load(Long id){

        return   (Student)  list.get(id.intValue());
    }
    
    /*
    Insert student and return Id
    */    
    public Long insert(Student student){
        return null;
    }
    
    /*
    Insert student and return Id
    */ 
    public Long update(Student student){
        
        list.set(student.getId().intValue(), student);
        return  student.getId();
    }
    
        /*
    Insert student and return Id
    */ 
    public void delete(Student student){
        return;
    }
    
            /*
    Insert student and return Id
    */ 
    public void delete(Long id){
        return;
    }
}
