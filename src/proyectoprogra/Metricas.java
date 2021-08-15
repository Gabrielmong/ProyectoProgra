package proyectoprogra;
public class Metricas {
    private int cantidadVentas;
    private int empleadosAtentidos;
    private String metas;
    private String atrasos;

    public Metricas(){
        this.atrasos = "";
        this.cantidadVentas = 0;
        this.empleadosAtentidos = 0;
        this.metas = "";
    }
    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public int getEmpleadosAtentidos() {
        return empleadosAtentidos;
    }

    public void setEmpleadosAtentidos(int empleadosAtentidos) {
        this.empleadosAtentidos = empleadosAtentidos;
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public String getAtrasos() {
        return atrasos;
    }

    public void setAtrasos(String atrasos) {
        this.atrasos = atrasos;
    }
    
    
}
