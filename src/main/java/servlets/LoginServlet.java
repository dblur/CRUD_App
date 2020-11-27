package servlets;

import DAO.UserHibernateDAO;
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
                session.setAttribute("password", password);
                if (session.getAttribute("role").equals("admin") && session.getAttribute("password").equals(user.getPassword())) {
                    response.sendRedirect("/list");
                } else if (session.getAttribute("password").equals(user.getPassword())){
                    response.sendRedirect("/user");
                } else {
                    response.sendRedirect("/login");        // if the password is incorrect
                }
            } else {
                response.sendRedirect("/");     // if user doesn't exist
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
