<%-- 
    Document   : enter_toss
    Created on : 08 May 2026, 04:03:44
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Toss Page</title>
    </head>
    <body>
        <div>
            <h1>Enter Toss</h1>
            <% String siri=getServletContext().getInitParameter("Comp"),
                    name=(String)session.getAttribute("name");       
            %>
            <p><b><%=name%></b> this is <b><%=siri%></b> lets play</p>
            <form action="GetTossServlet.do" method="POST">
                <table>
                    <tr>
                        <td>
                            <select name="toss">
                                <option value="Heads">Heads</option>
                                <option value="Tails">Tails</option>
                            </select>
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
