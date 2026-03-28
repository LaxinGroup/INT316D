<%-- 
    Document   : menu
    Created on : 24 Mar 2026, 16:55:01
    Author     : razku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <div>
            <%
                String siri=getServletContext().getInitParameter("computer");
            %>
            <p>
                Hi, I am <%=siri%> your web app companion.Please enter you name below.
            </p>
            <form action="StartSessionServlet.do" method="POST">
                <table>
                    <tr>
                        <td>Name:</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="text" name="name"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="SUBMIT"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
