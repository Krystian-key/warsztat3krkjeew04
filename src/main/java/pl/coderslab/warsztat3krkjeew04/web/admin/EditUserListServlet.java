package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.UserDao;
import pl.coderslab.warsztat3krkjeew04.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditUserListServlet", urlPatterns ={"/EditUserList"})
public class EditUserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        int groupId = Integer.parseInt(request.getParameter("groupId"));

        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setEmail(email);
        user.setUserGroupId(groupId);
        userDao.update(user);

        response.sendRedirect(request.getContextPath() + "/ShowUsersList");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = new UserDao().read(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("/edit-users-list-admin.jsp").forward(request,response);
    }
}
