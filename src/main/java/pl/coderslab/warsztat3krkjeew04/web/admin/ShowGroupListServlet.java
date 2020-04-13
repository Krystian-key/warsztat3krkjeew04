package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.UsersGroupDao;
import pl.coderslab.warsztat3krkjeew04.model.UsersGroup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowGroupListServlet", urlPatterns ={"/ShowGroupList"})
public class ShowGroupListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UsersGroup> usersGroup = new UsersGroupDao().findAll();
        request.setAttribute("adminUsersGroup",usersGroup);
        request.getRequestDispatcher("/panel-group-list-admin.jsp").forward(request,response);
    }
}
