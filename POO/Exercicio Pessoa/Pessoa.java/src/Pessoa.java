public class Pessoa{
    private String nome;
    private int telefone;
    public Pessoa (String nome, int telefone) {
        this.nome=nome;
        this.telefone=telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void mostrarDados(Pessoa pessoa){
        System.out.println("Pessoa encontrada");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
    

}