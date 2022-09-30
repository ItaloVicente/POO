import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList <Funcionario> nomes = new ArrayList<>();
    public Universidade(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Funcionario> getNomes() {
        return nomes;
    }
    public void setNomes(ArrayList<Funcionario> nomes) {
        this.nomes = nomes;
    }
    public void adicionar (Funcionario funcionario){
        nomes.add(funcionario);
    }
    public void mostrarDados(){
        double som=0;
        for(Funcionario funcionario : this.nomes){
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Matricula: " + funcionario.getMatricula());
            System.out.println("Salario: " + funcionario.getSalario());
            som=som+funcionario.getSalario();
        }
        System.out.println("Custo total: " + som);
    }
    
}
