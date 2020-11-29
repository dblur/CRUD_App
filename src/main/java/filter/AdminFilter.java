package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/add", "/delete", "/edit", "/list"})
public class AdminFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();
        String role = (String) session.getAttribute("role");

        if (role == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login");
            dispatcher.forward(request, response);
        } else if (role.equals("user")) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/user");
            dispatcher.forward(request, response);
        } else if (role.equals("admin")){
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {
    }
}
