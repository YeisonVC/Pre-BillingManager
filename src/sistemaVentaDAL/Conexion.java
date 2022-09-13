package sistemaVentaDAL;

//importar libreria descargada para conectar con la base de datos
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //esta variable nos permitira conectarnos con la BD
    String strConexionDB = "jdbc:sqlite:C:/Users/danie/Desktop/Pre-BillingManager/src/Data Bases/sistemaventa.db";
    //Daniel : "jdbc:sqlite:C:/Users/danie/Desktop/Pre-BillingManager/src/Data Bases/sistemaventa.db"
    
    Connection conn = null;//alias para Connection
    
    //MÉTODO REALIZAR CONEXIÓN
    public Conexion(){// Método Constructor
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conexión Establecida!");
        }catch(Exception e) {
            System.out.println("Error en la conexión " + e);
        }
    }
    
    public void cerrarConexion(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println(e);   
        }
    }
    
    //MÉTODO sentencia o codigo sql para manipular tablas para añadir datos
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try{
            //alias preparedStatement, pstm sirve insertar sentencia SQL
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;//1 true
        }catch(Exception e){
            System.out.println("Error: " + e);
            return 0;//0 false
        }
           
    }
    
    //MÉTODO sentencia o codigo sql para manipular tablas para mostrar datos
    //ResultSet da una respuesta
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try{
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

}
