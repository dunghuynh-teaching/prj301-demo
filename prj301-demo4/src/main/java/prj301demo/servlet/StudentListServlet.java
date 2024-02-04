/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package prj301demo.servlet;

import prj301demo.utils.DBUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import prj301demo.Student.StudentDAO;
import prj301demo.Student.StudentDTO;
import prj301demo.Users.UserDTO;

/**
 *
 * @author DUNGHUYNH
 */
public class StudentListServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentListServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            RequestDispatcher rd = request.getRequestDispatcher("/menu.html");
            rd.include(request, response);

            
            UserDTO user = (UserDTO)request.getAttribute("usersession");
            
            if (user != null)
                out.println("Hello " + user.getName());
            
            
            
            out.println("<h1>Student List </h1>");
            
            String keyword = request.getParameter("keyword");
            
            if (keyword == null) keyword = "";
            String sortCol = request.getParameter("colSort");
            
            out.print(  "    <form action='' method=GET>\n" +
                        "        <input name=keyword type=text value='"+keyword +"'>\n" +
                        "        <input type=submit value=Search >\n" +
                        "    </form>");
            
            
            out.print("<table>");
            out.println("<tr><td>Id</td>");
                        out.println("<td><a href=?colSort=firstname>First Name</a></td>");
                        out.println("<td><a href=?colSort=lastname>Last Name</a></td>");
                        out.println("<td>Age</td></tr>");

                        
            StudentDAO dao = new StudentDAO();
            List<StudentDTO> list = dao.list(keyword, sortCol);
            
            for (StudentDTO student: list){

                        out.println("<tr><td>" + student.getId() + "</td>");
                        out.println("<td>" + student.getFirstname()+ "</td>");
                        out.println("<td>" + student.getLastname()+ "</td>");
                        out.println("<td>" + student.getAge() + "</td></tr>");
            }
   
           

        
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
