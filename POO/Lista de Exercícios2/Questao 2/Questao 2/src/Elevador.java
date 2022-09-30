import java.util.ArrayList;

public class Elevador {
    private ArrayList <Integer> andarAtual = new ArrayList<>(); 
    private int qntAndares;
    private int capacidade;
    private int qntPessoas;
    private int andar;
    public Elevador(int qntAndares, int capacidade) {
        this.qntAndares = qntAndares;
        this.capacidade = capacidade;
        this.qntPessoas = 0;
        andarAtual.add(0);
    }
    public ArrayList<Integer> getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(ArrayList<Integer> andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getQntAndares() {
        return qntAndares;
    }
    public void setQntAndares(int qntAndares) {
        this.qntAndares = qntAndares;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getQntPessoas() {
        return qntPessoas;
    }
    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }
    public void entrar(){
        if(qntPessoas<capacidade){
            qntPessoas=qntPessoas + 1;
        }
        else{
            System.out.println("Elevador lotado");
        }
    }
    public void sair(){
        if(qntPessoas>0){
            qntPessoas=qntPessoas-1;
        }
        else{
            System.out.println("Nao ha ninguem no elevador");
        }
    }
    public void subir(){
        if(andarAtual.get(andarAtual.size()-1)<qntAndares){
            this.andar = andar+1;
            andarAtual.add(andar);
        }
        else{
            System.out.println("O Elevador esta no ultimo andar");
        }
    }
    public void subirAndar(int totalAndar){
        if(andarAtual.get(andarAtual.size()-1)+totalAndar<qntAndares){
            this.andar = andar + totalAndar;
            andarAtual.add(andar);
        }
        else{
            System.out.println("Nao e possivel chegar nesse andar");
        }
    }
    public void descer(){
        if(andarAtual.get(andarAtual.size())-1>0){
            this.andar= andar - 1;
            andarAtual.add(andar);
        }
        else{
            System.out.println("Voce esta no Terreo");
        }
    }
    public void descerAndar(int totalAndar){
        if(andarAtual.get(andarAtual.size()-1)-totalAndar>0){
            this.andar = andar - totalAndar;
            andarAtual.add(andar);
        }
        else{
            System.out.println("Nao e possivel chegar nesse andar");
        }
    }
    public void podeEntrar(){
        if(qntPessoas<capacidade){
            System.out.println("Voce pode entrar");
        }
        else{
            System.out.println("Elevador Lotado");
        }
    }
}
