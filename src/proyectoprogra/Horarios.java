package proyectoprogra;
public class Horarios {
    private int TipoHorario;
    private String HoraEntrada;
    private String HoraSalida;

    public Horarios(){
        this.HoraEntrada = "";
        this.HoraSalida = "";
        this.TipoHorario = '0';
    }
    public int getTipoHorario() {
        return TipoHorario;
    }

    public void setTipoHorario(int TipoHorario) {
        this.TipoHorario = TipoHorario;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }
   
    
}
