/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fptuni.prj301.demo.controller;

import com.fptuni.prj301.demo.model.UserSession;
import com.fptuni.prj301.demo.utils.DBUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fptuni.prj301.demo.model.Student;
import com.fptuni.prj301.demo.dbmanager.StudentManager;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpSession;
import jdk.nashorn.internal.objects.NativeString;
/**
 *
 * @author DUNGHUYNH
 */
public class StudentController1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            String path = request.getPathInfo();
            log(path);
            if (path.equals("/list")){
            // Request data from database
                StudentManager manager = new StudentManager();
                List<Student> list = manager.list();

                request.setAttribute("list", list);

                RequestDispatcher rd = request.getRequestDispatcher("/view/Student/list1.jsp");
                rd.forward(request, response);
            }else if (path.equals("/edit")){
                
                //STUDENT DEVELOPS
                Long id = new Long(request.getParameter("id"));
                StudentManager manager = new StudentManager();
                Student student = manager.load(id);

                request.setAttribute("object", student);

                RequestDispatcher rd = request.getRequestDispatcher("/view/Student/edit1.jsp");
                rd.forward(request, response);
            }else if (path.equals("/detail")){
                
                //STUDENT DEVELOPS
                Long id = new Long(request.getParameter("id"));
                StudentManager manager = new StudentManager();
                Student student = manager.load(id);

                request.setAttribute("object", student);

                RequestDispatcher rd = request.getRequestDispatcher("/view/Student/detail1.jsp");
                rd.forward(request, response);
            }
            else if (path.equals("/update")){
                
                //STUDENT DEVELOPS
                Long id = new Long(request.getParameter("id"));
                StudentManager manager = new StudentManager();
                Student student = manager.load(id);
                
                HashMap<String,String> errors = new HashMap<String,String>();
                boolean hasError = false;
                
                
                String firstName = request.getParameter("firstName");
                
                if (firstName != null && firstName.trim().equals("")){
                    hasError = true;
                    errors.put("firstName","Firstname is empty");
                }
                
                student.setFirstName(firstName);
                
                String lastName = request.getParameter("lastName");
                student.setLastName(lastName);

                if (hasError){
                    request.setAttribute("object", student);
                    request.setAttribute("errors", errors);
                    
                    RequestDispatcher rd = request.getRequestDispatcher("/view/Student/edit1.jsp");
                    rd.forward(request, response);
                }else{
                    manager.update(student);        
                    response.sendRedirect(request.getContextPath()+"/Student1/list");
                }
            }
        }



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
