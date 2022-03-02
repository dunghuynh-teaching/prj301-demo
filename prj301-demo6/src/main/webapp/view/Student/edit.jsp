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
        <c:set var="errors" value="${requestScope.errors}"/>
        
        <c:url var="studentUpdate" value="${request.contextPath}/Student/update"/>
        
        <form action="${studentUpdate}" method="POST">
        <p>Id: ${student.id} <input name="id" value="${student.id}" type=hidden></p>
        
        
        <p>First name: <input name="firstName" value="${student.firstName}" type=text>
            <c:if test="${not empty errors['firstName']}">
                ${errors['firstName']}
            </c:if>
        </p>
        <p>Last name: <input name="lastName" value="${student.lastName}" type=text></p>
        <p><input name="Submit"  type=submit></p>
        </form>


        
    </body>
</html>
