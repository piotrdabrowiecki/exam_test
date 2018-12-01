package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomquote")
public class Servlet04_randomQuote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("quotes")!=null) {
            List<Quote> list = (List<Quote>) session.getAttribute("quotes");
            Random random = new Random();
            int index = random.nextInt(list.size());
            request.setAttribute("randomquote", list.get(index));
            getServletContext().getRequestDispatcher("/randomquote.jsp").forward(request, response);
        } else {
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().append("<p>Nie dodano żadnego cytatu</p>");
        }
    }
}