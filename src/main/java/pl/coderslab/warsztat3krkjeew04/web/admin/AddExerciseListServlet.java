package pl.coderslab.warsztat3krkjeew04.web.admin;

import pl.coderslab.warsztat3krkjeew04.dao.ExerciseDao;
import pl.coderslab.warsztat3krkjeew04.dao.UsersGroupDao;
import pl.coderslab.warsztat3krkjeew04.model.Exercise;
import pl.coderslab.warsztat3krkjeew04.model.UsersGroup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddExerciseListServlet", urlPatterns = {"/AddExerciseList"})
public class AddExerciseListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String exerciseDesc = request.getParameter("description");
        String exerciseTitle = request.getParameter("title");

        Exercise exercise = new Exercise();
        exercise.setDescription(exerciseDesc);
        exercise.setTitle(exerciseTitle);
        new ExerciseDao().create(exercise);
        response.sendRedirect(request.getContextPath() + "/ShowExerciseList");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/add-exercise-list-admin.jsp").forward(request, response);
    }
}
