<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>editing</title>
    </head>
    <body>
        <div>
            <div>
            <a href="/delete/${language.id}">Delete</a>
            <a href="/">Dashboard</a>
            </div>
            <div >
            <form action="/" method = "POST">
                <div >
                <label for="name" >Name</label>
                <div >
                <input type="text"  id="name" name="name" value="<c:out value ="${language.name}"/>">
                </div>
                </div>
                <div >
                <label for="creator" >Creator</label>
                <div >
                <input type="text"  id="creator" name= "creator" value="<c:out value ="${language.creator}"/>">
                </div>
                </div>
                <div >
                <label for="version" >Version</label>
                <div >
                <input type="text" id="version" name="version" value="<c:out value ="${language.version}"/>">
                </div>
                </div>
                <div >
                <div >
                <button type="submit" >Submit</button>
                </div>
                </div>
                <input type ="hidden" name="id" value="<c:out value ="${language.id}"/>" >
            
            </form>
            </div>
            </div>
    </body>
</html>