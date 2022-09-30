public class ContatoInfancia extends Pessoa {
    int idade;
    public ContatoInfancia(String nome, int telefone, int idade){
        super(nome,telefone);
        this.idade=idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void mostrarDados(ContatoInfancia pessoa){
        System.out.println("Pessoa encontrada");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
