<%-- 
    Document   : student
    Created on : 10/03/2022, 4:55:35 PM
    Author     : DUNGHUYNH
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="color" required="true" %>
<%@attribute name="id" required="true" %>
<%@attribute name="firstName" required="true" %>
<%@attribute name="lastName" required="true" %>

<%-- any content can be specified here e.g.: --%>
<tr style="background-color:${color}"><td><a href="xxx">${id}</a></td>
<td><b>${firstName}</b></td>
<td>${lastName}</td>
<td><a href="yyy">Edit</a></td></tr>