package maktab_mavernAndJdbcAndOopAndPolymorfism.officAndEmployee;

import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlDataSource;

public class SqlDataSource {

    public static DataSource createDataSource(){
        MysqlDataSource mysqlDataSource =new MysqlDataSource();


        mysqlDataSource.setURL(DbConfig.URL);
        mysqlDataSource.setUser(DbConfig.USERNAME);
        mysqlDataSource.setPassword(DbConfig.PASSWORD);
        System.out.println("connected to database......");
        return mysqlDataSource;
    }
}
