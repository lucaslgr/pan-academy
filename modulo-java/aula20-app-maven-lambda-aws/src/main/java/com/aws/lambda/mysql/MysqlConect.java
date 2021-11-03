package com.aws.lambda.mysql;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.lambda.mysql.data.RequestDetails;
import com.aws.lambda.mysql.data.ResponseDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConect  implements RequestHandler<RequestDetails, ResponseDetails>
{

    //connecta
    private Connection getConnection() throws SQLException {
        // TODO Auto-generated method stub
        String url = "jdbc:mysql://database-1.cjrriz7oygwx.us-west-2.rds.amazonaws.com:3306";
        String username = "admin";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    //usa a conexao para inserir
    private void insertDetails(RequestDetails requestDetails, ResponseDetails responseDetails) throws SQLException {
        //pega a conexao
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // pega a instancia
        Connection connection = getConnection();
        //cria o estado
        Statement statement = connection.createStatement();
        //passa a query de baixo
        String query = getquery(requestDetails);
        int responseCode = statement.executeUpdate(query);
        if(1 == responseCode)
        {
            responseDetails.setMessageID(String.valueOf(responseCode));
            responseDetails.setMessageReason("Atualizados com sucesso");
        }

    }
    private String getquery(RequestDetails requestDetails) {

        String query = "INSERT INTO dblambda.colaboradores(id, nome) VALUES (";

        query = query.concat("'" + requestDetails.getId() + "','"  + requestDetails.getNome() + "')");

        //INSERT INTO dblambda.colaboradores(id, nome) VALUES (' getID  ', 'getNome');

        return query;
    }
    public ResponseDetails handleRequest(RequestDetails requestDetails, Context arg1) {
        ResponseDetails responseDetails = new ResponseDetails();
        try {
            insertDetails(requestDetails, responseDetails);
        } catch (SQLException sqlException) {
            responseDetails.setMessageID("=(");
            responseDetails.setMessageReason("Putz, deu erro "+sqlException);
        }
        return responseDetails;
    }

}
