public class Aluno {
    String nome;
    String curso;
    int matricula;
    int ano;
    void mostrarDados(){
        System.out.println("Nome =" + nome);
        System.out.println("Curso ="+ curso);
        System.out.println("Matricula =" + matricula);
    }
    int calcularIdade(int anoAtual){
        int idade = anoAtual - ano;
        return idade;
    }
}
