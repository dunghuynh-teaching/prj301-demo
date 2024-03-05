<%@page import="java.util.List"%>
<%@page import="prj301demo.Student.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
    </head>
    <body>
        <%@ include file="/menu.jsp" %>
            <form action='' method=GET> 
                <input name=keyword type=text value="<%=request.getParameter("keyword")!=null?request.getParameter("keyword"):""%>">
                <input type=submit value=Search >
            </form>
            <table>
                    <tr><td>Id</td>
                        <td><a href=?colSort=firstname>First Name</a></td>
                        <td><a href=?colSort=lastname>Last Name</a></td>
                        <td>Age</td></tr>
            <%
               List <StudentDTO> list = (List <StudentDTO>) request.getAttribute("studentlist");
               for (StudentDTO student: list){
            %>
                        <tr><td><%=student.getId()%></td>
                            <td><%=student.getFirstname()%></td>
                            <td><%=student.getLastname()%></td>
                            <td><%=student.getAge()%></td></tr>
            <%
                }
            %>    
            </table>
            </body>
            </html>
    </body>
</html>
