package conecta;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Desenvolvedor: Jean Ernani Witt Meier
 * Objetivo: Conectar o software com o banco de dados.
*/

public class ConexaoBD {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sa_fazenda_db";
        
        String user = "root";
        String password = "root";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;  
        }
        
        catch (Exception e){
            System.out.println(e);
            return null; 
        } 
    } 
}