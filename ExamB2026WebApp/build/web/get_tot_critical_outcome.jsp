<%-- 
    Document   : get_tot_critical_outcome
    Created on : 31 Jul 2026, 1:33:31 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Total Number Of Critical-Priority Messages Outcome Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>View Total Number Of Critical-Priority Messages Outcome Section</h1>
            <p><b>${name}</b> the total number of Critical-Priority Messages : <b>${num}</b><br>Choose below:</p>
            <p><button onclick="location.href='field_agent_menu2.jsp'">Field Agent Menu</button></p>
            <p><button onclick="location.href='menu.html'">Menu Page</button></p>
            <p><button onclick="location.href='index.html'">Main Page</button></p>
            <p><button onclick="location.href='LogoutServlet.do'">Logout</button></p>
        </div>
    </body>
</html>
