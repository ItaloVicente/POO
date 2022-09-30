public class Construtor {
    private String nome;
    private int idade;
    private int matricula;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    } 
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public Construtor(String nome, int idade, int mmatricula){
        this.nome=nome;
        this.idade=idade;
        this.matricula=matricula;
    }
    public Construtor(String n,int i){
        this.nome=n;
        this.idade=i;
    }
    void motrarDados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(matricula);

    }
    /*Assinatura do metodo
    nome_do_metodo + lista de tipos de parametros, olha o tipo
    Aluno(String,String,int,int)
    Aluno(String,int), uma Classe nao pode ter dois metodos com a MESMA ASSINATURA(pode ter o mesmo nome, mas os parametors diferentes)
    this (serve pra confirmar o objeto da classe, para nao dar erro)*/
    /*Encapsulamento: "esconder algo no codigo para nao serem alterados" public,protected,private
    atributos nunca devem ser publicos pois ha uma quebra de encapsulamento
    */
    
}
