<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 22.11.2020
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>

<body>

<div>
    <div>
        <div>
            <h2>Add new user:</h2>
        </div>

        <form method="post">

            <label>Name:
                <input type="text" required name="name"><br />
            </label>

            <label>Email:
                <input type="email" required name="email"><br/>
            </label>

            <label>Password:
                <input type="password" required name="pass"><br />
            </label>

            <button type="submit">Add new user</button>
            <button onclick="location.href='/list'">Userlist</button>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Return to main</button>
</div>

</body>
</html>
