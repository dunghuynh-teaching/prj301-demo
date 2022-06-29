<%-- 
    Document   : studentlist
    Created on : 16/06/2022, 1:26:34 AM
    Author     : DUNGHUYNH
--%>

<%@page import="java.util.List"%>
<%@page import="com.fptuni.prj301.demo.Student.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
    </head>
    <body>
        
         <h1>Student List </h1>
    
                 
         <table>
         <tr><th>ID</th><th>First Name</th><th>Last Name</th></tr>
         <% // your code:  
             // getAttribute
             // print the list
         %>
          <%! List<StudentDTO> list; %>
         <% list = (List<StudentDTO>) request.getAttribute("list"); 
            for (StudentDTO student: list){
                   out.print("<tr><td><a href=student?action=details&id=" + student.getId()+ ">" + student.getId() + "</a></td> " 
                            + "<td>" + student.getFirstName() + "</td> " 
                            + "<td>" + student.getLastName() + "</td> " 
                            + "<td><form action=student>"
                            + "          <input type=hidden name=action value=delete>"
                            + "          <input type=hidden name=id value=" + student.getId() +">"
                            + "          <input type=submit value=Delete> "
                            + "       </form>"
                            + " </td>"     );
            }
        %>
         
       
         
        
            
            
        </table>
         <form action="student">
             
             <input type=hidden name="action" value="create">
             <input type=submit value="Create"></form>
         </form>
    </body>
</html>
