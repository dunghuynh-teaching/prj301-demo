<%-- 
    Document   : studentlist
    Created on : 16/06/2022, 1:26:34 AM
    Author     : DUNGHUYNH
--%>

<%@page import="com.fptuni.prj301.demo.Student.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>
        
         <h1>Student Details </h1>
         
         <jsp:include page="/menu.html" flush="true" />
         
         <p> Login user: ${sessionScope.usersession.username}</p>
                 
         <table>
         
         <tr><td>Id</td><td>${requestScope.object.id}</td></tr>
         <tr><td>First name</td><td>${requestScope.object.firstName }</td></tr>
         <tr><td>Last name</td><td>${requestScope.object.lastName}</td></tr>		 
         
         </table>
         
        
         <form action="student">
             <input type=hidden name="id" value="${requestScope.object.id}">
             <input type=hidden name="action" value="edit">
             <input type=submit value="Edit"></form>
         </form>
        
            
        
    </body>
</html>
