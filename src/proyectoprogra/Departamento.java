package proyectoprogra;
public class Departamento {
    private String Area;
    private String Puesto;
    private String Proyecto;
    private String Responsabilidades;

    public Departamento(){
        this.Area = "";
        this.Puesto = "";
        this.Proyecto = "";
        this.Responsabilidades = "";
    }
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getResponsabilidades() {
        return Responsabilidades;
    }

    public void setResponsabilidades(String Responsabilidades) {
        this.Responsabilidades = Responsabilidades;
    }
    
    
}
