package in.ka4tik;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String userName = req.getParameter("userName");
        HttpSession session = req.getSession();
        ServletContext servletContext = req.getServletContext();
        if (userName != null && !userName.equals("")) {
            session.setAttribute("savedUserName", userName);
            servletContext.setAttribute("savedUserName", userName);
        }
        writer.println("<p>Request parameter has username as " + userName + "</p>");
        writer.println("<p>Session parameter has username as " + (String) session.getAttribute("savedUserName") + "</p>");
        writer.println("<p>Context parameter has username as " + (String) servletContext.getAttribute("savedUserName") + "</p>");

    }
}
