package mysqllibrary;

import java.sql.*;
import java.util.*;

/**
 * The class is an example of the implementation of sql queries in java
 */
public class SQLExp extends WriteAndRead {
    private TreeMap<String, String> coursesIdName;

    /**
     * We receive the cost of courses that cost more than 100,000. And we write in collections.
     *
     * @param statement        return from the method "connectionSQL", class ConnectionSQL.
     * @param requestStringSQL
     * @return collection request SQL
     */
    public TreeMap<String, String> resultSql(Statement statement, String requestStringSQL) {
        ResultSet resultSet;
        String idCourses;
        String coursesName;
        coursesIdName = new TreeMap<>();
        try {
            resultSet = statement.executeQuery(requestStringSQL);
            while (resultSet.next()) {
                idCourses = resultSet.getString("id");
                coursesName = resultSet.getString("name");
                coursesIdName.put(idCourses, coursesName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return coursesIdName;
    }

    /**
     * Еhe method returns the value of a specific course
     *
     * @param statement        return from the method "connectionSQL", class ConnectionSQL.
     * @param requestStringSQL
     */
    public void resultSqlStudents(Statement statement, String requestStringSQL) {
        ResultSet result;
        String courseName;
        String subscriptionDate;
        try {
            result = statement.executeQuery(requestStringSQL);
            while (result.next()) {
                courseName = result.getString("course_name");
                subscriptionDate = result.getString("subscription_date");
                System.out.println(courseName + " | " + subscriptionDate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * The method returns the value of a specific month of student registration.
     *
     * @param statement        return from the method "connectionSQL", class ConnectionSQL.
     * @param requestStringSQL
     */
    public void resultSqlRegistrationDate(Statement statement, String requestStringSQL) {
        ResultSet resultSet;
        String id;
        String name;
        String age;
        String registrationDate;
        try {
            resultSet = statement.executeQuery(requestStringSQL);
            while (resultSet.next()) {
                id = resultSet.getString("id");
                name = resultSet.getString("name");
                age = resultSet.getString("age");
                registrationDate = resultSet.getString("registration_date");
                System.out.println(id + " | " + name + " | " + age + " | " + registrationDate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
