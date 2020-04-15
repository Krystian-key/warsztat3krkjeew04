package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.UserDao;
import pl.coderslab.warsztat3krkjeew04.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowUsersListServlet", urlPatterns ={"/ShowUsersList"})
public class ShowUsersListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = new UserDao().findAll();
        request.setAttribute("ShowUsersList", userList);
        request.getRequestDispatcher("/panel-user-list-admin.jsp").forward(request,response);
    }
}
