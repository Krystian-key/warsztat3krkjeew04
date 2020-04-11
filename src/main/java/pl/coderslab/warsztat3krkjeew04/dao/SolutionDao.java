package pl.coderslab.warsztat3krkjeew04.dao;


import pl.coderslab.warsztat3krkjeew04.model.Solution;
import pl.coderslab.warsztat3krkjeew04.util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SolutionDao {
    private static final String CREATE_SOLUTION_QUERY = "INSERT INTO solutions(created,exercise_id, users_id) VALUES (?, ?, ?);";
    private static final String READ_SOLUTION_QUERY = "SELECT * FROM solutions where id = ?;";
    private static final String FIND_ALL_SOLUTIONS_BY_USER_ID_QUERY = "SELECT * FROM solutions where users_id = ?;";
    private static final String FIND_ALL_SOLUTIONS_BY_EXERCISE_ID_QUERY = "SELECT * FROM solutions where exercise_id = ? ORDER BY created DESC;";
    private static final String UPDATE_SOLUTION_QUERY = "UPDATE solutions SET  updated= ?, description = ? where id = ?;";
    private static final String DELETE_SOLUTION_QUERY = "DELETE FROM solutions WHERE id = ?;";
    private static final String FIND_ALL_SOLUTIONS_QUERY = "SELECT * FROM solutions;";
    private String READ_RECENT_QUERY = "SELECT solutions.id, solutions.created, solutions.updated, solutions.description, exercises.title as exercise, users_id FROM solutions\n" +
            "JOIN exercises ON solutions.exercise_id = exercises.id\n" +
            "ORDER BY updated LIMIT ?;";

    public List<Solution> findRecent(int howMany) {
        List<Solution> result = new ArrayList<>();
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(READ_RECENT_QUERY);
            statement.setInt(1, howMany);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Solution sol = new Solution();
                sol.setId(resultSet.getInt("id"));
                if (resultSet.getTimestamp("updated") != null) {
                    sol.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                }
                sol.setDescription(resultSet.getString("description"));
                sol.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
                sol.setUsersId(resultSet.getInt("users_id"));
                sol.setExercise(resultSet.getString("exercise"));

                result.add(sol);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public Solution create(Solution solution) {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement =
                    connection.prepareStatement(CREATE_SOLUTION_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, solution.getCreated().toString());
            statement.setInt(2, solution.getExerciseId());
            statement.setInt(3, solution.getUsersId());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                solution.setId(resultSet.getInt(1));
            }
            return solution;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Solution read(int id) {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(READ_SOLUTION_QUERY);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Solution solution = new Solution();
                solution.setId(resultSet.getInt("id"));
                solution.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
                if (resultSet.getTimestamp("updated") != null) {
                    solution.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                }
                solution.setDescription(resultSet.getString("description"));
                solution.setExerciseId(resultSet.getInt("exercise_id"));
                solution.setUsersId(resultSet.getInt("users_id"));
                return solution;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Solution solution) {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(UPDATE_SOLUTION_QUERY);
            statement.setInt(3, solution.getId());
            statement.setString(1, solution.getUpdated().toString());
            statement.setString(2, solution.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_SOLUTION_QUERY)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Solution> findAll() {
        List<Solution> solutionArrayList = new ArrayList<>();
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_ALL_SOLUTIONS_QUERY);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Solution solution = new Solution();
                solution.setId(resultSet.getInt("id"));
                solution.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
                if (resultSet.getTimestamp("updated") != null) {
                    solution.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                }
                solution.setDescription(resultSet.getString("description"));
                solution.setId(resultSet.getInt("exercise_id"));
                solution.setId(resultSet.getInt("users_id"));
                solutionArrayList.add(solution);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return solutionArrayList;
    }

    public List<Solution> findAllByUserId(int userId) {
        List<Solution> solutionList = new ArrayList<>();
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(FIND_ALL_SOLUTIONS_BY_USER_ID_QUERY);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Solution solution = new Solution();
                solution.setId(resultSet.getInt("id"));
                solution.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
                if (resultSet.getTimestamp("updated") != null) {
                    solution.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                }
                solution.setDescription(resultSet.getString("description"));
                solution.setExerciseId(resultSet.getInt("exercise_id"));
                solution.setUsersId(resultSet.getInt("users_id"));
                solutionList.add(solution);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return solutionList;
    }

    public List<Solution> findAllByExerciseId(int exerciseId) {
        List<Solution> solutionList = new ArrayList<>();
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(FIND_ALL_SOLUTIONS_BY_EXERCISE_ID_QUERY);
            statement.setInt(1, exerciseId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Solution solution = new Solution();
                solution.setId(resultSet.getInt("id"));
                solution.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
                solution.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                solution.setDescription(resultSet.getString("description"));
                solution.setExerciseId(resultSet.getInt("exercise_id"));
                solution.setUsersId(resultSet.getInt("users_id"));
                solutionList.add(solution);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return solutionList;
    }


}