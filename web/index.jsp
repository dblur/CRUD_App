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

    <style>
        #loginWindow {
            width: 300px;
            height: 150px;
            text-align: center;
            padding: 15px;
            border: 3px solid gray;
            display: none;

            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            margin: auto;
        }
        #loginWindow:target {display: block;}
            .close {
                display: inline-block;
                cursor:pointer;
            }
    </style>

</head>

<body>
<div align="center">
    <div>
        <h1>UserList webApp project</h1>
    </div>
    <div>
        <h2>This is v_2.0 my first CRUD_App developer</h2>
        <h3>Now it works with Hibernate!</h3>
    </div>

    <div>
        <div>
            <button onclick="location.href='/add'">Add new user</button>
            <button onclick="location.href='/list'">Userlist</button>
        </div>

        <button>
            <a href="#loginWindow">Log in</a>
        </button>

            <div id="loginWindow">
                Log in window!
                <div>
                    <div>
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
                                        <input type="password" required name="pass"><br />
                                    </label>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div>
                    <button onclick="location.href='/login'">Log in</button>
                    <button> <a href="#" class="close">Close window</a></button>
                    </div>
                </div>
            </div>
        </a>
    </div>
</div>
</body>
</html>
