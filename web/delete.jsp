<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 22.11.2020
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user</title>
</head>

<body>

<div>
    <div>
        <div>
            <h2>Delete user:</h2>
        </div>

        <form method="post">
            <tr>
                <td>ID: </td>
                <td>${user.id}
                    <form:hidden path="id"/>
                </td>
            </tr>
        </form>


    </div>
</div>
</body>
</html>
