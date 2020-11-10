<%@ page import="app.model.User" %><%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 09.11.2020
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>

<body>
<div>
    <h1>Приложение</h1>
</div>

<div>
    <%
        if (request.getAttribute("userName") != null) {
            out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
        }
    %>
    <div>
        <div>
            <h2>Добавить пользователя</h2>
        </div>

        <form method="post">

            <label>Name:
                <input type="text" name="name"><br /> <%--проверить на пустую--%>
            </label>

            <label>Email:
                <input type="email" name="email"><br/>
            </label>

            <label>Password:
                <input type="password" name="pass"><br />
            </label>

            <button type="submit">Отправить</button>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Вернуться на главную</button>
</div>
</body>
</html>
