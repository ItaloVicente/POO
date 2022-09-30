public class Servidor extends Funcionario {
    private int totalHorasExtras;
    public Servidor(String nome, int matricula, int totalHorasExtras) {
        super(nome, matricula);
        this.totalHorasExtras = totalHorasExtras;
    }
    public int getTotalHorasExtras() {
        return totalHorasExtras;
    }
    public void setTotalHorasExtras(int totalHorasExtras) {
        this.totalHorasExtras = totalHorasExtras;
    }
    public void calcularSalario(){
        double salario = (totalHorasExtras*15)+1000;
        setSalario(salario);
    }
}
