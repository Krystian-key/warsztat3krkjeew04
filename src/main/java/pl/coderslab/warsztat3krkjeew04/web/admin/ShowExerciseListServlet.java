package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.ExerciseDao;
import pl.coderslab.warsztat3krkjeew04.model.Exercise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowExerciseListServlet", urlPatterns ={"/ShowExerciseList"})
public class ShowExerciseListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Exercise> exercises = new ExerciseDao().findAll();
        request.setAttribute("exercisesList",exercises);
        request.getRequestDispatcher("/panel-exercise-list-admin.jsp").forward(request,response);
    }
}
