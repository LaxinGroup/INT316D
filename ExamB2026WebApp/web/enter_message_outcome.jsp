<%-- 
    Document   : enter_message_outcome
    Created on : 31 Jul 2026, 1:14:28 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Message Outcome Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Enter Message Outcome Section</h1>
            <p><b>${name}</b><span> your message has been sent to HQ</span><br>Choose below:</p>
            <p><button onclick="location.href='enter_message.jsp'">Enter Another Message</button></p>
            <p><button onclick="location.href='field_agent_menu2.jsp'">Field Agent Menu</button></p>
            <p><button onclick="location.href='menu.html'">Menu Page</button></p>
            <p><button onclick="location.href='index.html'">Main Page</button></p>
            <p><button onclick="location.href='LogoutServlet.do'">Logout</button></p>
        </div>
    </body>
</html>
