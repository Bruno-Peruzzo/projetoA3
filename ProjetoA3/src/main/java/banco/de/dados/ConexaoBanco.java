package banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String url = "jdbc:mysql://projetoa3.ctcqwqew2f3g.us-east-2.rds.amazonaws.com:3306/db_a3";
    private static final String usuario = "root";
    private static final String senha = "12345678";
    
    private static Connection conn;
    
    public static Connection getConexao(){
        try{
            if (conn == null){
            conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
            }
            else{
                return conn;
                    }
        } catch (SQLException e) {
        e.printStackTrace();
    }
        return null;
    }
}