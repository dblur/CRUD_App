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
<div align="center">
    <h2>Edit user:</h2>
    <form method="post">
        <table border="0" cellpadding="3">
            <tr>
                <td>New name: </td>
                <td>
                    <label>
                        <input type="text" name="name" placeholder="Type new name" required value=${name}>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Email: </td>
                <td>
                    <label>
                        <input type="text" name="email" placeholder="Type new email" required value=${email}>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Password: </td>
                <td>
                    <label>
                        <input type="text" name="password" placeholder="Type new password" required value=${password}>
                    </label>
                </td>
            </tr>

            <tr>
                <td>Current permissions:</td>
                <td>${role}</td>
            </tr>

            <tr>
                <td>Admin:</td>
                <td>
                    <label>
                        <input type="radio" name="role" value="admin">
                    </label>
                </td>
            </tr>
            <tr>

                <td>User:</td>
                <td>
                    <label>
                        <input type="radio" name="role" value="user">
                    </label>
                </td>
            </tr>

            <tr align="center">
                <td colspan="2"> <button type="submit">Save edited user</button>
                    <button onclick="location.href='/list'">Cancel</button> </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>



