<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 22.11.2020
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>

<body>
<div>
    <div>
        <div>
            <h2>Users:</h2>
        </div>
        <h3>
            <div>
                <button onclick="location.href='/add'">Add new user</button>
                <button onclick="location.href='/'">Return to main</button>
            </div>
        </h3>
        <table border="1">
            <thead>
            <th> Id: </th>
            <th> Username: </th>
            <th> Password: </th>
            <th> Email: </th>
            <th> Action: </th>
            </thead>
            <tbody>
            <c:forEach var="user" items="${requestScope.userNames}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>
                        <button onclick="location.href='/edit?id=${user.id}'">Edit</button>
                         <button onclick="location.href='/delete?id=${user.id}'">Delete</button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
