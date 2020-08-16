package pl.coderslab.warsztat3krkjeew04.web;

import pl.coderslab.warsztat3krkjeew04.dao.UsersGroupDao;
import pl.coderslab.warsztat3krkjeew04.model.UsersGroup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name ="UsersGroups", urlPatterns ={"/usersGroups"})
public class UsersGroupsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UsersGroup> usersGroups = new UsersGroupDao().findAll();
        request.setAttribute("usersGroups", usersGroups);
        request.getRequestDispatcher("/users-groups.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
