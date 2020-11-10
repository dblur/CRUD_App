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
    <h1>Приложение</h1>
</div>

<div>
    <div>
        <div>
            <h2>Пользователи</h2>
        </div>
        <ul>
            <c:forEach var="user" items="${userNames}">
                <li>
                    ${user.name}
                </li>
            </c:forEach>
        </ul>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Вернуться на главную</button>
</div>
</body>
</html>
