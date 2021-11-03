package app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.sql.*;

class LambdaRdsMySqlHandler implements RequestHandler<Object, String> {
    public String handleRequest(Object input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("");
        String currentTime = "unavailable";
        try {
            String username = "admin";
            String password = "12345678";
            String dbName = "dblambda";
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + "database-1.cjrriz7oygwx.us-west-2.rds.amazonaws.com" + ":" + 3306 + "/" + dbName + "?useSSL=false", username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT NOW()");
            if (resultSet.next()) {
                currentTime = resultSet.getObject(1).toString();
            }
        } catch (SQLException e) {
            System.out.println("Erro");
        }

        return currentTime;
    }
}
