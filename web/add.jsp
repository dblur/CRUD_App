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

<div align="center">
    <h2>Add new user:</h2>
    <form method="post">
        <table border="0" cellpadding="3">
            <tr>
                <td>Name: </td>
                <td>
                    <label>
                        <input type="text" required name="name"><br />
                    </label>
                </td>
            </tr>

            <tr>
                <td>Email: </td>
                <td>
                    <label>
                        <input type="email" required name="email"><br/>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Password: </td>
                <td>
                    <label>
                        <input type="password" required name="password"><br />
                    </label>
                </td>
            </tr>

            <tr align="center">
                <td colspan="2"> <button type="submit">Add new user</button>
                     <button onclick="location.href='/list'">Userlist</button> </td>
            </tr>

            <tr align="center">
                <td colspan="2"> <button onclick="location.href='/'">Return to main</button> </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
