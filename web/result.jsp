<%-- 
    Document   : result
    Created on : Sep 8, 2014, 7:02:58 PM
    Author     : Hodgey
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${shape} Results</title>
    </head>
    <body>
        <%
            String firstLine = "Your result is: ";
         
            Object answer = request.getAttribute("result");
            String stringAnswer = answer.toString();
            Object shape = request.getAttribute("shape");
            String stringShape = shape.toString();
            %>
    <br /> 
    Your result is: ${result}
    <br/>
    
    <a href="index.html">Go back</a>
    </body>
</html>
