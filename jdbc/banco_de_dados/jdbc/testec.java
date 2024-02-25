package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testec {
    public static void main(String[] args) throws SQLException {
        //string que vai fazer conexão com o banco
        final String stringdeconexao = "jdbc:mysql://localhost:3306";    
        final String usuario = "root";
        final String senha = "luis1170da##";

        Connection conexao =  DriverManager.getConnection(stringdeconexao, usuario, senha);
   
        System.out.println("conexão efeituada com sucesso");


        conexao.close();
    }

}
