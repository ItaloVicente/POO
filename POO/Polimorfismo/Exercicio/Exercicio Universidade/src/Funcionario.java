public class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salario;
    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = 1000;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salario: " + this.salario);
    }
    public void calcularSalario(){
        this.salario=1000;
    }
}
