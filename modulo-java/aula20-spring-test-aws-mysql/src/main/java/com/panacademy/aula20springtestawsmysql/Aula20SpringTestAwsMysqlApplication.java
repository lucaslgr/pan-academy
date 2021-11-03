package com.panacademy.aula20springtestawsmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Aula20SpringTestAwsMysqlApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        SpringApplication.run(Aula20SpringTestAwsMysqlApplication.class, args);

        Connection con = null;
        String hostName = null;
        String userName = null;
        String password = null;
        String url = null;
        String jdbDriver = null;
        String dataBaseName = null;
        String dataBasePrefix = null;
        String dataBasePort = null;

        hostName = "database-1.cjrriz7oygwx.us-west-2.rds.amazonaws.com";
        userName = "admin";
        password = "12345678";
        jdbDriver = "com.mysql.cj.jdbc.Driver";
        dataBaseName = "dblambda";
        dataBasePrefix = "jdbc:mysql://";
        dataBasePort = "3306";

        url = dataBasePrefix + hostName + ":" + dataBasePort + "/" + dataBaseName;
        Class.forName(jdbDriver);
        con = DriverManager.getConnection(url, userName, password);

        con.close();
    }

}
