package pl.coderslab.warsztat3krkjeew04.web;

import pl.coderslab.warsztat3krkjeew04.dao.UserDao;
import pl.coderslab.warsztat3krkjeew04.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name ="UsersGroupsList", urlPatterns ={"/usersGroupsList"})
public class UsersGroupsListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int solutionsId = Integer.parseInt(request.getParameter("groupId"));
        List<User> userList = new UserDao().findAllByGroupId(solutionsId);
        request.setAttribute("usersGroupList", userList);
        request.getRequestDispatcher("/group-details.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
