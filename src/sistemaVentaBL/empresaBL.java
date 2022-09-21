package sistemaVentaBL;

public class EmpresaBL {
    //------------------------
    //ATRIBUTOS
    //------------------------
    int Nit;
    long postal;
    String nombre, correo, direccion, pais, ciudad;

    public EmpresaBL() {
    }

    public EmpresaBL(int Nit, long postal, String nombre, String correo, String direccion, String pais, String ciudad) {
        this.Nit = Nit;
        this.postal = postal;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.pais = pais;
        this.ciudad = ciudad;
    }
    
    
    //------------------------
    //GETTERS AND SETTERS
    //-----------------------

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public long getPostal() {
        return postal;
    }

    public void setPostal(long postal) {
        this.postal = postal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
