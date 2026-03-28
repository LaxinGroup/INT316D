<%-- 
    Document   : eneter_message
    Created on : 24 Mar 2026, 17:04:20
    Author     : razku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Message Page</title>
    </head>
    <body>
        <div>
            <p>
                Enter a message to be analysed for the Length, the Number of Commas, the Number of Fullstops,
                unique words, non-unique words, and frequency of occurrence of each non-unique words.
            </p>
            <form action="MessageAnalyzerServlet.do" method="POST">
                <table>
                    <tr>
                        <td>Enter Message:</td>
                    </tr>
                    <tr>
                        <td>
                            <textarea id="id" name="message" rows="10" cols="30"></textarea>
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
