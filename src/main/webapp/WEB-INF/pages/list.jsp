<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 12.12.2020
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User list</title>
</head>
<body>

<table border="1">
    <thead>
    <th> Id: </th>
    <th> Username: </th>
    <th> Password: </th>
    <th> Email: </th>
    </thead>
<tbody>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.password}</td>
        <td>${user.email}</td>
<%--        <td>--%>
<%--            <button onclick="location.href='/edit?id=${user.id}'">Edit</button>--%>
<%--            <button onclick="location.href='/delete?id=${user.id}'">Delete</button>--%>
<%--        </td>--%>
    </tr>
</tbody>
</table>
</body>
</html>
