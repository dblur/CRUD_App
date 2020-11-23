<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 23.11.2020
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit page</title>
</head>

<body>
<div>
    <div>
        <div>
            <h2>Edit user:</h2>
        </div>
        <form method="post">
            <label>New name:
                <input type="text" name="name"> <br/>
            </label>
            <label>New email:
                <input type="email" name="email"> <br/>
            </label>
            <label>New password:
                <input type="password" name="pass"> <br/>
            </label>
            <button type="submit">Edit user</button>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/list'">Cancel</button>
</div>

</body>
</html>
