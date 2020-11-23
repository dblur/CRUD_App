package servlets;

import Entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
    UserService userService = UserService.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");

        userService.editUser(new User(id, name, email, password));
        response.sendRedirect("/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter writer = response.getWriter();
            response.setContentType("text/html");
            Long id = Long.parseLong(request.getParameter("id"));
            writer.println(id);
            request.getRequestDispatcher("edit.jsp").forward(request, response);

        } catch (Exception e){
            System.out.println("An attempt to access a link /edit without arguments");
            response.sendRedirect("/list");
        }
    }
}
