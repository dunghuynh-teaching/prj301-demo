/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fptuni.prj301.demo.controller;

import com.fptuni.prj301.demo.dbmanager.AccessManager;
import com.fptuni.prj301.demo.model.UserSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DUNGHUYNH
 */
@WebServlet(name = "AccessController1", urlPatterns = {"/Access1"})
public class AccessController1 extends HttpServlet {

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
        if (path.equals("/login")){
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if (username == null){
                    RequestDispatcher rd = request.getRequestDispatcher("/view/login.jsp");
                    rd.forward(request, response);
            }else{
                
//                UserSession usersession = new UserSession();
//                usersession.login(username, password);
//                
//                getAttribute("user")

                   AccessManager manager = new AccessManager();
                   UserSession usersession = manager.login(username, password);
                   
                   if (usersession != null){
                       ///LOGIN SUCCESSFUL
                       
                       HttpSession ss = request.getSession(true);
                       ss.setAttribute("usersession", usersession);
                       
                       response.sendRedirect(request.getContextPath()+"/Student/list");
                   }else{
                        request.setAttribute("error-msg", "Wrong username and password");
                        RequestDispatcher rd = request.getRequestDispatcher("/view/login.jsp");
                        rd.forward(request, response);
                   }
                   
                
            }
        }else if (path.equals("/logout")){
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
