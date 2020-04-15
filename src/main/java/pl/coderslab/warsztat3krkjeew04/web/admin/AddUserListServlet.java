package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.UserDao;
import pl.coderslab.warsztat3krkjeew04.dao.UsersGroupDao;
import pl.coderslab.warsztat3krkjeew04.model.User;
import pl.coderslab.warsztat3krkjeew04.model.UsersGroup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddUserListServlet", urlPatterns ={"/AddUserList"})
public class AddUserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("Username");
        String email = request.getParameter("email");
        int groupId = Integer.parseInt(request.getParameter("userGroupId"));
        String password = request.getParameter("password");
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setUserGroupId(groupId);
        user.setPassword(password);
        user.setUserName(userName);
        new UserDao().create(user);
        response.sendRedirect(request.getContextPath()+"/ShowUsersList");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/add-user-list-admin.jsp").forward(request,response);
    }
}
