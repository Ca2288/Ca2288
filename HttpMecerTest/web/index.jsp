<%-- 
    Document   : index
    Created on : 16 Nov 2021, 1:59:11 PM
    Author     : Student24
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Http Test</title>
    </head>
    <body>
        <form method="Post" action="http://127.0.0.1:8080/HttpMecerTest/firstpost">
            <input name="field" value="input field"/><br/>
            <select size="2" name="list" MULTIPLE>
                <option name="listItem1" value="item One" selected"">item One
                <option name="listItem2" value="item Two" selected"">item Two
                <option name="listItem3" value="item Three" selected"">item Three
            </select><br/>
            <input type ="submit"  name="submit"  value="Go"/>
            
        </form> 
    </body>
</html>
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 <form method="Post" action="http://127.0.0.1:8080/HttpMecerTest/firstpost">
            <input name="space" value="up in space space"/><br/>
            <select size="3" name="list" MULTIPLE>
                <option name="listItem1" value="planets" selected"">planets
                <option name="listItem2" value="earth" selected"">earth
                <option name="listItem3" value="mars" selected"">mars
            </select><br/>
            <input type ="submit"  name="submit"  value="Go"/>
            
        </form> 
    </body>
</html>
