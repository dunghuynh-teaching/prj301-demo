<%-- 
    Document   : studentlist
    Created on : 10/02/2022, 1:13:48 AM
    Author     : DUNGHUYNH
--%>
<%@ page import="java.util.List,com.fptuni.prj301.demo.model.Student" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Student List</title>
    </head>
    <body>
       
        
        <%@include file="/view/layout/header.jsp" %>
        
        <h1>Student List </h1>
        <table>
        <tr><th>ID</th><th>First Name</th><th>Last Name</th></tr> 
        
        <%!  List<Student> list;  %>
        
        <%
             list = (List<Student>) request.getAttribute("list");
             for (Student s: list){
                 out.print("<tr><td>" + s.getId() + "</td> " 
                            + "<td>" + s.getFirstName() + "</td> " 
                            + "<td>" + s.getLastName() + "</td> </tr>"     );
             }
         %>
        </table>
        
    </body>
</html>
