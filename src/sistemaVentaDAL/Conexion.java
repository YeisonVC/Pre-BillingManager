package sistemaVentaDAL;

//importar libreria descargada para conectar con la base de datos
import java.sql.*;

public class conexion {
    //esta variable nos permitira conectarnos con la BD
    String strConexionDB = "jdbc:sqlite:C:/Users/danie/Desktop/Pre-BillingManager/src/sistemaventa.db";
    
    Connection conn = null;//alias para Connection
    
    public conexion(){// Método Constructor
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conexión Establecida!");
        }catch(Exception e) {
            System.out.println("Error en la conexión " + e);
        }
    }
    
    
    
}
