public class Secretario extends Funcionario{
    private double cargaHor;
    public Secretario(String nome, int matricula, double cargaHor) {
        super(nome, matricula);
        this.cargaHor = cargaHor;
    }
    public double getCargaHor() {
        return cargaHor;
    }
    public void setCargaHor(double cargaHor) {
        this.cargaHor = cargaHor;
    }
    public void calcularSalario(){
        if(this.cargaHor==20){
            double salario=1000;
            setSalario(salario);
        }
        if(this.cargaHor==30){
            double salario=1960;
            setSalario(salario);

        }
        if(this.cargaHor==40){
            double salario=2600;
            setSalario(salario);
        }   
    }
    
}
