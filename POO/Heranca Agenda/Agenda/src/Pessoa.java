public class Pessoa{
    protected String nome;
    protected int telefone;
    protected Pessoa (String nome, int telefone) {
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