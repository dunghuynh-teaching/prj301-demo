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
        
        <h1>Student Edit </h1>
        
                
        <c:set var="detail1" value="${requestScope.object}" />
        <c:set var="errors" value="${requestScope.errors}" />
        
        <c:url var="studentUpdate" value="${request.contextPath}/Student1/update" />

        
        <form action="${studentUpdate}" method="POST">
        <p>Id: ${detail1.id}<input name="id" value="${detail1.id}" type=hidden></p>
        <p>Firstname: <input name="firstName" value="${detail1.firstName}" type=text>
            <c:if test="${not empty errors.firstName}">
                ${errors.firstName}
            </c:if>
        </p>
        <p>Lastname: <input name="lastName" value="${detail1.lastName}" type=text></p>
        
        <input value="Save" type=submit>
        </form>

        
    </body>
</html>
