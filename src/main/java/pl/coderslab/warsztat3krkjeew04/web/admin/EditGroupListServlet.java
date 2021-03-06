package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.UsersGroupDao;
import pl.coderslab.warsztat3krkjeew04.model.UsersGroup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditGroupListServlet", urlPatterns ={"/EditGroupList"})
public class EditGroupListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String groupName = request.getParameter("groupname");
        UsersGroup usersGroup = new UsersGroup();
        usersGroup.setId(id);
        usersGroup.setName(groupName);
        UsersGroupDao usersGroupDao = new UsersGroupDao();
        usersGroupDao.update(usersGroup);
        response.sendRedirect(request.getContextPath()+"/ShowGroupList");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        UsersGroup usersGroup = new UsersGroupDao().read(id);
        request.setAttribute("usersGroup", usersGroup);
        request.getRequestDispatcher("/edit-group-list-admin.jsp").forward(request,response);
    }
}
