<%-- 
    Document   : studentlist
    Created on : 10/02/2022, 1:13:48 AM
    Author     : DUNGHUYNH
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,com.fptuni.prj301.demo.model.Student" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Student Details</title>
    </head>
    <body>
       
        
        <%@include file="/view/layout/header.jsp" %>
        
        <h1>Student Details </h1>
        <c:set var="student" value="${requestScope.object}"/>
        <c:url var="studentEdit" value="${request.contextPath}/Student/edit">
                <c:param name="id" value="${student.id}"></c:param>
        </c:url>
        
        
        <p>Id: ${student.id}</p>
        <p>First name: ${student.firstName}</p>
        <p>Last name: ${student.lastName}</p>
        
        <form action="${studentEdit}" method="POST">
            <input value="Edit" type="Submit">
        </form>
        

        
    </body>
</html>
