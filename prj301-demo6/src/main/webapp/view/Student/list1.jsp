<%-- 
    Document   : studentlist
    Created on : 10/02/2022, 1:13:48 AM
    Author     : DUNGHUYNH
--%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,com.fptuni.prj301.demo.model.Student" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Student List</title>
    </head>
    <body>
       
        
        <%@include file="/view/layout/header.jsp" %>

        <!-- 
        1. Bat duoc attribute TEN list 
        2. In object list -->
        
        <c:set var="list" value="${requestScope.list}"/>
        
        <h1>Student List </h1>
        <table>
        <tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Action</th></tr> 
        
       
       
        
        </table>
        
    </body>
</html>
