<%-- 
    Document   : studentlist
    Created on : 10/02/2022, 1:13:48 AM
    Author     : DUNGHUYNH
--%>
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
        <%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="tag" tagdir= "/WEB-INF/tags/" %>
        
        
        <h1>Student List </h1>
        <table>
        <tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Action</th></tr> 
        
        <c:set var="row" value="0"/>
              
        
        <c:forEach var="student" items="${list}">
        
            <c:if test="${row%2==0}">
                <c:set var="color" value="#ffffff"/>
            </c:if>
            <c:if test="${row%2==1}">
                <c:set var="color" value="#eeeeee"/>
            </c:if>
            
            <c:url var="studentDetail" value="${request.contextPath}/Student/detail">
                <c:param name="id" value="${student.id}"></c:param>
            </c:url>
            <c:url var="studentEdit" value="${request.contextPath}/Student/edit">
                <c:param name="id" value="${student.id}"></c:param>
            </c:url>
            
            <tag:student color="${color}" 
                         id="${student.id}"  
                         firstName="${student.firstName}" 
                         lastName="${student.lastName}"/>
            
            <c:set var="row" value="${row+1}"/>

            
        </c:forEach>
        
        </table>
        
    </body>
</html>
