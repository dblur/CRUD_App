<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 10.11.2020
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit page</title>
</head>
    <body>
    <div>
    <h1>Страница редактирования пользователей</h1>
    <h2>Введите пользователя, которого хотите отредактировать</h2>

    <form method="post">

        <label>Name:
            <input type="text" name="name"><br /> <%--проверить на пустую--%>
        </label>

        <label>Password:
            <input type="password" name="pass"><br />
        </label>

        <button type="submit">Редактировать</button>
    </div>

    </body>
</html>
