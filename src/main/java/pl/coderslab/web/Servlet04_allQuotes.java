package pl.coderslab.web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/allquotes")
public class Servlet04_allQuotes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("quotes")!=null) {
            request.setAttribute("quotes", session.getAttribute("quotes"));
            getServletContext().getRequestDispatcher("/allquotes.jsp").forward(request, response);
        } else {
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().append("<p>Nie dodano żadnego cytatu</p>");
        }
    }
}