package Modelo;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private final String user = "root";
    private final String password = "admin";
    private final String url = "jdbc:mysql://localhost:3306/sistemaventa?useUnicode=true&use"
            + "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
            + "serverTimezone=UTC";
    
    
    public Conexion(){
        conn = null;
        try { 
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if(conn!=null){
                System.out.println("Conexión exitosa");
            }
        }catch(Exception e){
            System.err.println("Error en la conexión: " + e);
        }
        
    }
    
    public static void main(String[] args) {
        Conexion cn = new Conexion();
    }

}
