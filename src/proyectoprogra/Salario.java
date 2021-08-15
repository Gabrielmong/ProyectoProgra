package proyectoprogra;
public class Salario {
    private double horasTrabajadas;
    private double salarioHora;
    private double bonos;
    private double extras;
    private double total;
    public Salario(){
        this.bonos= 0.00;
        this.extras= 0.00;
        this.horasTrabajadas=0.00;
        this.salarioHora=0.00;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getBonos() {
        return bonos;
    }

    public void setBonos(double bonos) {
        this.bonos = bonos;
    }

    public double getExtras() {
        return extras;
    }

    public void setExtras(double extras) {
        this.extras = extras;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
