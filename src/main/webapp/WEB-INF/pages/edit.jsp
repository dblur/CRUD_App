<%@ page import="userEditor.model.User" %><%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 12.12.2020
  Time: 0:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit page</title>
</head>

<body>
<c:url value="/edit" var="var"/>
<div align="center">
    <h2>Edit user:</h2>
    <form action="${var}" method="post">
        <input type="hidden" name="id" value=${user.id}>
        <table border="0" cellpadding="3">
            <tr>
                <td>New name: </td>
                <td>
                    <label>
                        <input type="text" name="name" placeholder="Type new name" required value=${user.name}>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Email: </td>
                <td>
                    <label>
                        <input type="text" name="email" placeholder="Type new email" required value=${user.email}>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Password: </td>
                <td>
                    <label>
                        <input type="text" name="password" placeholder="Type new password" required value=${user.password}>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Current permissions:</td>
                <td>${user.role}</td>
            </tr>

            <tr>
                <td>Admin:</td>
                <td>
                    <label>
                        <input type="radio" name="role" value="admin">
                    </label>
                </td>
            </tr>
            <tr>
                <td>User:</td>
                <td>
                    <label>
                        <input type="radio" name="role" value="user">
                    </label>
                </td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <button type="submit">Save edited user</button>
                    <button type="reset" onclick="location.href='/list'">Cancel</button> </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
