<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>home</title>
    </head>
    <body>

        <form action="/result" method = "POST">
            <p>Your name: <input type = "text" name = "firstName"></p>
            <p>Dojo location: 
                <select name = "location">
                    <option value = "New York">New York</option>
                    <option value = "Ohio">Ohio</option>
                    <option value = "Pittsburgh">Pittsburgh</option>
                    <option value = "Some other weird place">Some other weird place</option>
                </select>
            </p>
            <p>Favorite language: 
                <select name = "language">
                    <option value = "Java">Java</option>
                    <option value = "Python">Python</option>
                    <option value = "CSharp">CSharp</option>
                    <option value = "Some weird unheard of language">Some weird unheard of language</option>
                </select>
            </p>
            <p>Comment (optional): </p>
            <p><textarea name = "comment" rows = "4" cols = "50"></textarea></p>
            <p><button>Submit</button> </p>
        </form>
    </body>
</html>