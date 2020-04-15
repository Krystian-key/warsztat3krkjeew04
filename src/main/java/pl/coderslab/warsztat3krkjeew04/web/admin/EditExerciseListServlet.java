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

@WebServlet(name = "EditExerciseListServlet", urlPatterns ={"/EditExerciseList"})
public class EditExerciseListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String exerciseName = request.getParameter("exerciseName");
        String exerciseDesc = request.getParameter("exerciseDesc");

        Exercise exercise = new Exercise();
        exercise.setId(id);
        exercise.setTitle(exerciseName);
        exercise.setDescription(exerciseDesc);
        ExerciseDao exerciseDao = new ExerciseDao();
        exerciseDao.update(exercise);
        response.sendRedirect(request.getContextPath()+"/ShowExerciseList");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Exercise exerciseList = new ExerciseDao().read(id);
        request.setAttribute("usersExercise", exerciseList);
        request.getRequestDispatcher("/edit-exercise-list-admin.jsp").forward(request,response);
    }
}
