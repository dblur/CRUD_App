<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 09.11.2020
  Time: 0:52
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
            <table border="1">
                <thead>
                    <th>Id:</th>
                    <th>Username:</th>
                    <th>Email:</th>
                    <th>Password:</th>
                </thead>
                <tbody>

                    <c:forEach var="user" items="${requestScope.userNames}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.email}</td>
                            <td>${user.password}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Return to main</button>
</div>

</body>
</html>
