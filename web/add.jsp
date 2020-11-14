<%--
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
    <%
        if (request.getAttribute("userName") != null) {
            out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
        }
    %>
    <div>
        <div>
            <h2>Add new user:</h2>
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

            <button type="submit">Submit</button>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Return to main</button>
</div>
</body>
</html>
