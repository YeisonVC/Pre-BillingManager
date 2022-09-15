package sistemaVentaDAL;

//Clase para validar el usuario y contraseña en el Login

import javax.swing.JOptionPane;

public class Login {
    //-----------------------
    //ATRIBUTOS
    //-----------------------
    private String usuario;
    private String contrasena;
    
    //-----------------------
    //METODOS CONSTRUCTORES
    //-----------------------
    
    public Login() {
        
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
    
    public boolean validarContrasena(String contrasena) {
        if(contrasena.equals(this.contrasena)){
            return true;
        }else{
            return false ;
        }
    }
     
    public boolean validarUsuario(String usuario) {
        if(usuario.equals(this.usuario)){
            return true;
        }else{
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
