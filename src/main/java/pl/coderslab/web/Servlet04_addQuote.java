package pl.coderslab.web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addquote")
public class Servlet04_addQuote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author = request.getParameter("author");
        String content = request.getParameter("content");
        List<Quote> list;

        HttpSession session = request.getSession();

        if (session.getAttribute("quotes")!=null) {
            list = (List<Quote>)session.getAttribute("quotes");
        } else {
            list = new ArrayList<>();
        }
        list.add(new Quote(author, content));
        session.setAttribute("quotes", list);
        getServletContext().getRequestDispatcher("/addquote.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/addquote.jsp").forward(request, response);
    }
}