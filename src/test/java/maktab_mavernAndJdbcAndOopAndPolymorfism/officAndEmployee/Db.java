package maktab_mavernAndJdbcAndOopAndPolymorfism.officAndEmployee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Db {

   private DataSource dataSource;
   private Connection connection;


    /**
     * <b>constractor</b>
     */
    public Db(){
        this.dataSource = SqlDataSource.createDataSource();
    }


    /**
     * <b>method  save</b>
     * @throws SQLException
     */
    public void save() throws SQLException {

    }

    /**
     * <b>method load
     */
    public void load() throws SQLException {

    }
    public Connection getConnection() throws SQLException {
        this.connection = dataSource.getConnection();
        return connection;
    }
}
