<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>dashboard</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
    </head>
    <body>
        <h3>Dojos</h3>

        <a href="newninja.jsp">new ninja</a>
        <a href="newdojo.jsp">new dojo</a>

        <table>
            <th>
                <tr>
                    <th>Dojo Name</th>
                    <th>Ninjas</th>
                    <th>Action</th>
                </tr>
            </th>
            <tbody>
                <c:forEach items="${dojos}" var="dojo">
                    <tr>
                        <td>
                            <c:out value="${dojo.name}"/>
                        </td>
                        <c:forEach items="${ninjas}" var="ninja">
                            <td>
                                <c:out value="${ninja.first_name}"/>
                            </td>
                        </c:forEach>
                        <td>
                            <a href= "/${ninja.id}/edit" > Edit ninja</a>
                            <a href= "/${ninja.id}/delete" > Delete ninja</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>