package maktab_mavernAndJdbcAndOopAndPolymorfism.officAndEmployee;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import javax.swing.*;
import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class DbEmployee extends Db {
    Connection connection;

    @Override
    public void load() throws SQLException {
        this.connection = getConnection();
        String sql = "Select * from employees";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Employee employee = new Employee();
            employee.setId(resultSet.getInt("employee_id"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setJobTitle(resultSet.getString("job_title"));
            employee.setSalary(resultSet.getInt("salary"));
            employee.setReportsTo(resultSet.getInt("reports_to"));
            employee.setOfficeId(resultSet.getInt("office_id"));

            System.out.println(employee);


        }

    }

    @Override
    public void save() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter an id :");
        int id = scanner.nextInt();

        System.out.println("Pleas enter an firstName :");
        String firstName = scanner.next();

        System.out.println("Pleas enter an LastName :");
        String lastName = scanner.next();

        System.out.println("Pleas enter an jobTitle :");
        String jobTitle = scanner.next();

        System.out.println("Pleas enter an salary :");
        int salary = scanner.nextInt();

        System.out.println("Pleas enter an reportsTo (forigen key):");
        int reportsTo = scanner.nextInt();

        System.out.println("Pleas enter an officeId (forigen key):");
        int officeId = scanner.nextInt();


        this.connection = getConnection();
        String sql = "INSERT INTO sql_hr.employees" +
                "(employee_id, first_name, last_name, job_title, salary, reports_to, office_id)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setJobTitle(jobTitle);
        employee.setSalary(salary);
        employee.setReportsTo(reportsTo);
        employee.setOfficeId(officeId);
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getFirstName());
        preparedStatement.setString(3, employee.getLastName());
        preparedStatement.setString(4, employee.getJobTitle());
        preparedStatement.setInt(5, employee.getSalary());
        preparedStatement.setInt(6, employee.getReportsTo());
        preparedStatement.setInt(7, employee.getOfficeId());
        preparedStatement.executeUpdate();
    }
}
