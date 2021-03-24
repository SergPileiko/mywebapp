package com.mastery.java.task.dao;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.dto.Gender;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static int EMPLOYEE_COUNT;
    //   private List<Employee> employees;

    private static final String URL = "jdbc:postgersql://localhost:5432/employeedb";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "****"; // password

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Employee> index() {
        List<Employee> employees = new ArrayList<Employee>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Employee";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Employee employee = new Employee();

                employee.setEmployeeId(resultSet.getLong("employee_id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setDepartmentId(resultSet.getLong("department_id"));
                employee.setJobTitle(resultSet.getString("job_title"));
                employee.setGender(Gender.valueOf(resultSet.getString("gender")));
                employee.setDateOfBirth(resultSet.getDate("date_of_birth"));

                employees.add(employee);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return employees;
    }
    public void save(Employee employee){
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO employee VALUES"; // do later
            statement.executeUpdate(SQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
