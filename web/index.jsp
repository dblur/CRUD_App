<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 22.11.2020
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserWebApp</title>
</head>
<body>
<div align="center">
    <div>
        <h1>CRUD app by dblur</h1>
        <p>Сreated the ability to login users, add/remove/edit existing users</p>
        <h2>Users with admin rights can manage the list of existing users</h2>
        <p>Worked add, delete, update, list functional. Also working login for user and usability admin's Filter</p>
    </div>

    <div>
        <h2>Go to the login page to start using the application</h2>
        <button onclick="location.href='/login'">Login page</button>
        <button onclick="location.href='/list'">User list</button>
    </div>
</div>
</body>
</html>
