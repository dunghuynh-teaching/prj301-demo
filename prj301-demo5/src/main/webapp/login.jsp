<!DOCTYPE html>
<html>
<head>
        <title>PRJ301 Demo - Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
</head>
    <body>
        <h1>Please login</h1>
        <%! String err; %>
        <% err = (String) request.getAttribute("error"); 
        if (err != null) {
            out.print("<h2>"+err+"</h2"); 
        }%>
        <img src="images/header.jpg" width="200">
        <form action="./login" name="" method="POST">
            <input name="user" type="text">
            <input name="password" type="password">
            <input value="Login" type="submit">
        </form>
        
    </body>
</html>
