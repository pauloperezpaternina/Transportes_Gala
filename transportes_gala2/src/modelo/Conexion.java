package modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/bdtransportesgala";
        String user="root",pass="12345678";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            
        }
        return con;
    }
    
}
