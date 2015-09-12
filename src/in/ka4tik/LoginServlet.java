package in.ka4tik;

import in.ka4tik.model.User;
import in.ka4tik.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId, password;
        userId = req.getParameter("userId");
        password = req.getParameter("password");

        LoginService loginService = new LoginService();
        boolean result = loginService.authenticate(userId,password);
        if (result) {
            User user = loginService.getUser(userId);
            req.setAttribute("user",user);
            RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
            dispatcher.forward(req,resp);
        }
        else{
            resp.sendRedirect("login.jsp");
        }

    }
}
