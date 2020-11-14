<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 11.11.2020
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserWebApp</title>
</head>
<body>

<div>
    <h1>UserList webApp project</h1>
</div>

<div>
    <div>
        <h3>Create new user</h3>
        <button onclick="location.href='/add'">Добавить пользователя</button>
    </div>
    <div>
        <h3>Edit saved user</h3>
        <button onclick="location.href='/edit'">Редактировать пользователя</button>
    </div>
    <div>
        <h3>UserList</h3>
        <button onclick="location.href='/list'">Список пользователей</button>
    </div>
</div>
</body>
</html>