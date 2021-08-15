package proyectoprogra;

public class Amonestaciones {
    private String falta;
    private int Gravedad;
    private String Reprimienda;
    private int Reincidencia;
    

    public Amonestaciones(){
        this.Gravedad = 0;
        this.Reincidencia = 0;
        this.Reprimienda = "";
        this.falta = "";
    }
    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    public int getGravedad() {
        return Gravedad;
    }

    public void setGravedad(int Gravedad) {
        this.Gravedad = Gravedad;
    }

    public String getReprimienda() {
        return Reprimienda;
    }

    public void setReprimienda(String Reprimienda) {
        this.Reprimienda = Reprimienda;
    }

    public int getReincidencia() {
        return Reincidencia;
    }

    public void setReincidencia(int Reincidencia) {
        this.Reincidencia = Reincidencia;
    }
    
    
}
