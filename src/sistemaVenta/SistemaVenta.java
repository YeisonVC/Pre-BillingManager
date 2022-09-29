package sistemaVenta;

/*
 * sistemaVentaBL = paquete para almacenar estructura de informacion que se ira manipulando
 * sistemaVentaDAL= paquete para almacenar la interaccion con la base de datos
 * sistemaVentaGUI = paquete para alacenar toda la parte de la interfaz grafica
 */
import sistemaVentaGUI.*;

public class SistemaVenta {

    public static void main(String[] args) {
        LoginInterfaz l = new LoginInterfaz();
        l.setVisible(true);
    }
}
