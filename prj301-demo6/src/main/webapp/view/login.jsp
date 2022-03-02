<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
        <title>PRJ301 Demo - Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
</head>
    <body>
        <h1>Please login</h1>
        <c:url var="loginLink" value="${request.contextPath}/Access/login"/>
        
        
        <form action="${loginLink}" name="" method="POST">
            <input name="username" type="text">
            <input name="password" type="password">
            <input value="Login" type="submit">
        </form>
        
    </body>
</html>
