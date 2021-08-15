package proyectoprogra;
public class Vacaciones {
    private int diasDisponibles;
    private String FechaEntrada;
    private String FechaSalida;

    public Vacaciones(){
        this.FechaEntrada="";
        this.FechaSalida="";
        this.diasDisponibles=0;
    }
    public int getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(int diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }
    
    
}
