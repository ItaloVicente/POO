public class ContatoTrabalho extends Pessoa {
    String setor;
    public ContatoTrabalho (String nome, int numero, String setor){
        super(nome,numero);
        this.setor=setor;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void mostrarDados(ContatoTrabalho pessoa){
        System.out.println("Pessoa encontrada");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Setor: " + pessoa.getSetor());
    }
}