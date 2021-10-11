package ir.pdf4;

import maktab_mavernAndJdbcAndOopAndPolymorfism.officAndEmployee.SqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Trasaction {
    public static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO sql_hr.employee\n" +
            "(empId, name)\n" +
            "VALUES(?, ?);";
    public static final String INSERT_ADDRESS_QUERY = "INSERT INTO sql_hr.Address\n" +
            "(empId, address, city, country)\n" +
            "VALUES(?, ?, ?, ?);\n";
    public static final String selectEmployee = "select * from sql_hr.employee";


    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {

            DataSource datasource = SqlDataSource.createDataSource();
            con = datasource.getConnection();
            con.setAutoCommit(false);
            insertEmployeeData(con, 30, "erfan");
            insertAddressData(con, 3, "chamrann", "Tehra", "USAa");
            printSelectEmployee(con);

            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
                System.out.println("JDBC Transaction rolled back successfully ");
            } catch (SQLException e1) {
                System.out.println("SQLException in rollback" + e.getMessage());
            }
        } finally {
            try{
                if (con != null)
                    con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }

        }

    }




    /**
     * <p>Work of this method is <b>" INSERT INTO sql_hr.Address "</b> </p>
     * @param con
     * @param id
     * @param address
     * @param city
     * @param country
     * @throws SQLException
     */

    public static void insertAddressData(Connection con, int id, String address, String city, String country) throws SQLException {
        PreparedStatement stmt = con.prepareStatement(INSERT_ADDRESS_QUERY);
        stmt.setInt(1, id);
        stmt.setString(2, address);
        stmt.setString(3, city);
        stmt.setString(4, country);

        stmt.executeUpdate();

        System.out.println("Address Data inserted successfully for ID =" + id);
        stmt.close();
    }





    /**
     * <p>Work of this method is <b>"INSERT INTO sql_hr.employee"</b> </p>
     * @param con
     * @param id
     * @param name
     * @throws SQLException
     */
    public static void insertEmployeeData(Connection con, int id, String name) throws SQLException {
        PreparedStatement stmt = con.prepareStatement(INSERT_EMPLOYEE_QUERY);
        stmt.setInt(1, id);
        stmt.setString(2, name);

        stmt.executeUpdate();

        System.out.println("Employee Data inserted successfully for ID =" + id);
        stmt.close();
    }


    /**
     * <p>Work of this method is <b>" select * from sql_hr.employee "</b> </p>
     * @param con
     * @throws SQLException
     *
     *
     *
     */
    public static void printSelectEmployee(Connection con) throws SQLException {
        PreparedStatement stmt = con.prepareStatement(selectEmployee);

        ResultSet resultSet = stmt.executeQuery();

        while (resultSet.next()) {
            int a = resultSet.getRow();
            int id = resultSet.getInt("empId");
            String name = resultSet.getString("name");

            System.out.println(a + " ------->>  " + "id =" + id + ",// name =" + name);



        }
//        con.close();
        stmt.close();
        resultSet.close();
    }
}
