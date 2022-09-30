import java.util.ArrayList;

public class Agenda {
    private ArrayList <Pessoa> pessoas = new ArrayList<>();
    private ArrayList <String> mensagens = new ArrayList<>();
    protected ArrayList <ContatoInfancia> contatosInfancia = new ArrayList<>();
    protected ArrayList <ContatoTrabalho> contatosTrabalho = new ArrayList<>();
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public ArrayList<String> getMensagens() {
        return mensagens;
    }
    public void setMensagens(ArrayList<String> mensagens) {
        this.mensagens = mensagens;
    }
    public void adicionarPessoa (Pessoa pessoa){
            pessoas.add(pessoa);
        }
    public void adicionarContatoInfancia (ContatoInfancia contatoInfancia){
        this.contatosInfancia.add(contatoInfancia);
    }
    public void adicionarContatoTrabalho (ContatoTrabalho contatoTrabalho){
        this.contatosTrabalho.add(contatoTrabalho);
    }
    public Pessoa procurarPessoa (String nome){
        for (int i = 0; i<this.pessoas.size();i++){
            if(pessoas.get(i).getNome().equals(nome)){
                return pessoas.get(i);
            }
        }
        return null;
    }
    public Pessoa alterarTelefone (int antigoTelefone,int novoTelefone){
        for(Pessoa pessoa : this.pessoas){
            if(pessoa.getTelefone()==antigoTelefone){
                pessoa.setTelefone(novoTelefone);
                return pessoa;
            }
        }
        return null;
    }
    public void removerPessoa (String nome){
        for (int i = 0; i<this.pessoas.size();i++){
            if(pessoas.get(i).getNome().equals(nome)){
                pessoas.remove(i);
            }
        }
    }
    public void mostrarLista(){
        for(int i = 0;i<this.pessoas.size();i++){
            System.out.println("Lista de pessoas " + pessoas.get(i).getNome());
        }
    }
    public void enviarMensagem (int numeroContato, String mensagem){
        for(Pessoa pessoa : this.pessoas){
            if(pessoa.getTelefone()==numeroContato){
                System.out.println("Mensagem enviada com sucesso");
                mensagens.add(mensagem);
            }
        }
    }
    public void mostrarMensagens(){
        for(int i =0;i<this.mensagens.size();i++){
            System.out.println("Lista de mensagens " + mensagens.get(i));
        }
    }
    public int posicaoPessoa(String nome){
        for (int i = 0; i<this.pessoas.size();i++){
            if(pessoas.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }
    }
