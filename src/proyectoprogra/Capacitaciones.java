package proyectoprogra;

public class Capacitaciones {
    protected String Lugar;
    protected String Fecha;
    protected String Hora;
    protected String TipoCap;
    
    public Capacitaciones(){
        this.Fecha = "";
        this.Hora = "";
        this.Hora = "";
        this.TipoCap = "";
    }
    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getTipoCap() {
        return TipoCap;
    }

    public void setTipoCap(String TipoCap) {
        this.TipoCap = TipoCap;
    }
    
    
}
