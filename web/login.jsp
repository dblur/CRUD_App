<%--
  Created by IntelliJ IDEA.
  User: hom888
  Date: 25.11.2020
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in page</title>
</head>
<body>
<div align="center">
    <div>
        <h2>This is login page</h2>
        <h3></h3>
    </div>
    <div>
        <form action="/login" method="post">
            <table border="0" cellpadding="3">
                <tr>
                    <td>Name:</td>
                    <td>
                        <label>
                            <input type="text" required name="name">
                        </label>
                    </td>
                </tr>

                <tr>
                    <td>Password:</td>
                    <td>
                        <label>
                            <input type="password" required name="password">
                        </label>
                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="Log in">
                        <button onclick="location.href='/'">Return to main</button>
                    </td>
                </tr>

            </table>
        </form>
    </div>
</div>
</body>
</html>
