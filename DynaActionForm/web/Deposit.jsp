<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%-- 
    Document   : login
    Created on : May 25, 2011, 1:49:50 AM
    Author     : TheSpecialisT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>


       
       
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Deposit Book</title>
    </head>
    <body>
        <html:form action= "/Deposit">
            <table border="1">
                <tbody>
                   <tr>
                        <td colspan="2">
                            <bean:write name="DepositForm" property="error" filter="false"/>
                            Title Page;</td>
                    </tr>
                    <tr>
                        <td>ISBN Number</td>
                        <td><html:text property="ISBNNumber" /></td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td><html:submit value="Delete"/></td>
                    </tr>
                       <tr>
                        <td colspan="2">
                            <bean:write name="DepositForm" property="message" filter = "false"/>
                         </td>
                    </tr>
                </tbody>
            </table>



        </html:form>
    </body>
</html>
