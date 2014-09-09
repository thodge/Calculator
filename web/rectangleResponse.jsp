<%-- 
    Document   : rectangleResponse
    Created on : Sep 3, 2014, 8:54:49 PM
    Author     : Hodgey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Name changed to:</h1>
        <%
            Object obj = request.getAttribute("area");
            if (obj == null) {
                out.println("404, yo!(jk, it's null)");
            } else {
                out.println(obj.toString());
            }
        %>
    </body>
</html>
