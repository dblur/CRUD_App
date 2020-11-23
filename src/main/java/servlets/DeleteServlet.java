package servlets;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    UserService userService = UserService.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            Long id = Long.parseLong(request.getParameter("id"));
            userService.deleteUser(id);
            response.sendRedirect("/list");

        } catch (Exception e){
            System.out.println("An attempt to access a link /delete without arguments");
            response.sendRedirect("/list");
        }
    }
}
