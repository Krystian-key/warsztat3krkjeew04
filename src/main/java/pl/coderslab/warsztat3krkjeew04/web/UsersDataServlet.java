package pl.coderslab.warsztat3krkjeew04.web;

import pl.coderslab.warsztat3krkjeew04.dao.SolutionDao;
import pl.coderslab.warsztat3krkjeew04.model.Solution;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UsersDate", urlPatterns = {"/usersDate"})
public class UsersDataServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Solution> solutions = new SolutionDao().findAllByUserId(id);
        request.setAttribute("GroupsDeatials", solutions);
        request.getRequestDispatcher("solutions-for-user.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
