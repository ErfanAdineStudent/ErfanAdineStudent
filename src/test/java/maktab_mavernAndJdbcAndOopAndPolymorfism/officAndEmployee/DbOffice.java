package maktab_mavernAndJdbcAndOopAndPolymorfism.officAndEmployee;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;
import java.util.Spliterator;

public class DbOffice extends Db{

    Connection connection;

    @Override
    public void load() throws SQLException {
        this.connection = getConnection();
        String sql = "Select * from offices";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            Office office = new Office();
            office.setId(resultSet.getInt("office_id"));
            office.setAddress(resultSet.getString("address"));
            office.setCity(resultSet.getString("city"));
            office.setState(resultSet.getString("state"));


            System.out.println(office);



        }

    }



    @Override
    public void save() throws SQLException {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter an id :");
         int id = scanner.nextInt();

        System.out.println("Pleas enter an address :");
         String address = scanner.next();

        System.out.println("Pleas enter an city :");
         String city = scanner.next();

        System.out.println("Pleas enter an state :");
         String state = scanner.next();


        this.connection = getConnection();
        String sql = "INSERT INTO sql_hr.offices " + "(office_id, address, city, state) " + "VALUES( ?,?,?,? ); ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Office office = new Office();
        office.setId(id);
        office.setAddress(address);
        office.setCity(city);
        office.setState(state);
        preparedStatement.setInt(1,office.getId());
        preparedStatement.setString(2,office.getAddress());
        preparedStatement.setString(3,office.getCity());
        preparedStatement.setString(4,office.getState());
        preparedStatement.executeUpdate();
    }
}
