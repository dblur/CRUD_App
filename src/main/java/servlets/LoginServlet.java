package servlets;

import Entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login") //TODO
public class LoginServlet extends HttpServlet {
    UserService userService = UserService.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        User user;

        if (userService.checkUser(name, password)) {
            HttpSession session = request.getSession();
            if ((user = userService.getUserByName(name)) != null) {
                session.setAttribute("role", user.getRole());
                if (session.getAttribute("role").equals("admin")) {
                    response.sendRedirect("/list");
                } else {
                    response.sendRedirect("/user");
                }
            } else {
                response.sendRedirect("/");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
