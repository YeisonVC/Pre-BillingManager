package sistemaVentaBL;

public class VentaBL {
   //------------------------
   //ATRIBUTOS
   //------------------------
   private long cedula;
   private String cliente;
   private double total;
   private String fecha;
   
   //------------------------
   //CONSTRUCTORES
   //------------------------
   public VentaBL(){
       
   }
   
   //------------------------
   //GETTERS AND SETTERS
   //------------------------

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   

    
   
   
    
    
}
