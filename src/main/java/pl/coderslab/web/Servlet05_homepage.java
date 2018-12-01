package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class Servlet05_homepage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        boolean success = false;
        if (request.getParameter("cookiesaccepted")!=null&&request.getParameter("cookiesaccepted").equals("yes")) {
            Cookie newCookie = new Cookie("cookiesaccepted", "yes");
            response.addCookie(newCookie);
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().append("<p>Dziękujemy za akceptację ciasteczek</p>");
            success = true;
        } else {
            for (Cookie c : cookies) {
                if (c.getName().equals("cookiesaccepted")) {
                    success = true;
                    response.setContentType("text/html; charset=UTF-8");
                    response.getWriter().append("<p>Wygląda, że już kiedyś zaakceptowałeś/aś nasze ciasteczka, dzięki</p>");
                    break;
                }
            }
        }
        if (!success) {
            getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);
        }
    }
}