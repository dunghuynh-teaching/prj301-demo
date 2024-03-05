<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>
        
        <jsp:include page="/menu.jsp" flush="true" /> 
        <h1>Student Edit </h1>
 
         <p>Login user: ${sessionScope.usersession.username}</p>
         
         
    </body>
</html>
