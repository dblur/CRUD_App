<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 12.12.2020
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>

<body>
<div align="center">
    <div>
        <div>
            <h2>A list of users:</h2>
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
            <th> Role: </th>
            <th> Action: </th>
            </thead>
            <tbody>
            <c:forEach var="user" items="${userList}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>${user.role}</td>
                    <td>
                        <button onclick="location.href='/edit/${user.id}'">Edit</button>
                        <button onclick="location.href='/delete/${user.id}'">Delete</button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>