package proyectoprogra;

public class Empleado {
    private String nombreEmpleado;
    protected int cedula;
    protected int antiguedad;
    protected int telefono;
    protected String correoEmpleado;
    protected int idEmpleado;
    
    public Empleado(){
        this.nombreEmpleado = "";
        this.cedula = 0;
        this.antiguedad = 0;
        this.telefono = 0;
        this.correoEmpleado = "" ;
        this.idEmpleado = 0;
    }
    public void infoEmpleado(){
        
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }   
}
