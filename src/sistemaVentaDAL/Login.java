package sistemaVentaDAL;

//Clase para validar el usuario y contraseña en el Login

import javax.swing.JOptionPane;

public class Login {
    //-----------------------
    //ATRIBUTOS
    //-----------------------
    private String usuario = "rootuser";
    private String contrasena = "root123";
    
    //-----------------------
    //METODOS CONSTRUCTORES
    //-----------------------
    
    public Login() {
        
    }

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    //-----------------------
    //METODOS
    //-----------------------
    public boolean validarLogin(String usuario, String contrasena) {
        if(usuario.equals(this.usuario) && contrasena.equals(this.contrasena)){
            JOptionPane.showMessageDialog(null, "Sesión iniciada correctamente!");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            return false ;
        }
    }
    
    //-----------------------
    //GETTERS AND SETTERS
    //-----------------------
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
