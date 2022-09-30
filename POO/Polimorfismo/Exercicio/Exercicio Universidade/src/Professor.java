public class Professor extends Funcionario{
    private String titulacao; // usuario digita "mestre" ou "doutor"
    private int coordOuNao; //se for coordenador digito 1, se nao, digito 0
    private int horasTotais;
    public Professor(String nome, int matricula, String titulacao, int coordOuNao,int horasTotais) {
        super(nome, matricula);
        this.titulacao = titulacao;
        this.coordOuNao = coordOuNao;
        this.horasTotais=horasTotais;
    }
    public int getHorasTotais() {
        return horasTotais;
    }
    public void setHorasTotais(int horasTotais) {
        this.horasTotais = horasTotais;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public int getCoordOuNao() {
        return coordOuNao;
    }
    public void setCoordOuNao(int coordOuNao) {
        this.coordOuNao = coordOuNao;
    }
    public void calcularSalario(){
        if(this.titulacao=="mestre"){
            double salario=(80*horasTotais)+1000;
            if(this.coordOuNao==1){
                salario=salario*1.2;
                setSalario(salario);
            }
        }
        if(this.titulacao=="doutor"){
            double salario=(100*horasTotais)+1000;
            if(this.coordOuNao==1){
                salario=salario*1.2;
                setSalario(salario);
            }
        }
    }
}
