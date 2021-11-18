<%-- 
    Document   : beerSuggestion
    Created on : 17 Nov 2021, 11:12:45 AM
    Author     : Caroline
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Results</title>
    </head>
    <body>
    <center><h1> beer Recommendation for you</h1></center>  
    <p>
        <%
            List<String> theStyle = (List)request.getAttribute("style");
            for (String s : theStyle ) {
                   out.print("<br/>Try:"+s);
                }
                     %>
    </p>   
    </body>
</html>
