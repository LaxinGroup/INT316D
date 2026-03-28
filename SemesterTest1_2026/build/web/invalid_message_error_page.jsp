<%-- 
    Document   : invalid_message_error_page
    Created on : 24 Mar 2026, 17:37:49
    Author     : razku
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Message Error Page</title>
    </head>
    <body>
        <div>
            <%
                String message=exception.getMessage();
            %>
            <p>
                <b>
                    Error message --> <%=message%>
                </b>
                Click <a href="index.html">here</a> to start again.
            </p>
        </div>
    </body>
</html>
