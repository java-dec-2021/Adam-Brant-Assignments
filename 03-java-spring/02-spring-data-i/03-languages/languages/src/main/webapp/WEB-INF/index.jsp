<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>home</title>
    </head>
    <body>
        <h1>Languages</h1>

    <div>
        <div>
            <table>
                <thead>
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Creator</th>
                        <th scope="col">Version</th>
                        <th scope="col">Action</th>
                    </tr>
                </thead>
                    <tbody>
                        <c:forEach items= "${languages}" var= "language">
                            <tr>
                                <td><a href="/${language.id}">${language.name}</a></td>
                                <td>${language.creator}</td>
                                <td>${language.version}</td>
                                <td>
                                    <a href="/${language.id}/edit">Edit</a>
                                    <a href="/delete/${language.id}">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
            </table>
        </div>
    <form action="/" method = "POST">
        <div >
            <label for="name" >Name</label>
            <div >
                <input type="text"  id="name" name="name">
            </div>
        </div>
        <div >
            <label for="creator" >Creator</label>
            <div >
                <input type="text"  id="creator" name= "creator">
            </div>
        </div>
        <div >
            <label for="version" >Version</label>
            <div >
                <input type="text"  id="version" name="version">
            </div>
        </div>
        <div >
            <div >
            <button type="submit" >Submit</button>
            </div>
        </div>
    </form>
    </div>
    </body>
</html>