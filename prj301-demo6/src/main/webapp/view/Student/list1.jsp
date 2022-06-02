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
        <!--
        -- Bat object
        -- IN object
        -->
        
        <c:set var="studentList" value="${requestScope.list}" /> 
        <c:set var="row" value="0" />
        
        
        <c:forEach var="student" items="${studentList}">
            
            <c:if test="${row%2==0}">
                <c:set var="color" value="#ffffff" />
            </c:if>
            
            <c:if test="${row%2==1}">
                <c:set var="color" value="#dddddd" />
            </c:if>
            
            
            <c:url var="studentLink" value="${request.contextPath}/Student1/detail">
                <c:param name="id" value="${student.id}" />
            </c:url>
            
            <c:url var="studentEdit" value="${request.contextPath}/Student1/edit">
                <c:param name="id" value="${student.id}" />
            </c:url>
            
            <c:if test="${student.id >0}">
                <tr style="background-color: ${color}">
                    <td><a href="${studentLink}">${student.id}</a></td>
                    <td>${student.firstName}</td><td>${student.lastName}</td>
                    <td><form action="${studentEdit}" method="POST"><input value="Edit" type=submit></form></td>
                </tr> 
            </c:if>
                
            <c:set var="row" value="${row+1}" />
        </c:forEach>
        
                
        </table>
        
    </body>
</html>
