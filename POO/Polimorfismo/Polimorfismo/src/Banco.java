
import java.util.Arrays;
public class Banco{
    private String nome;
    private Conta[] contas;
    private int qntdeContas=0;
    private int totalContas;
    public Banco(String nome, int conta){
        this.nome=nome;
        this.totalContas=conta;
        this.contas= new Conta [conta];
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public Conta[] getContas(){
        return contas;
    }
    public void setContas(Conta[] contas){
        this.contas=contas;
    }
    public boolean adicionarConta(Conta conta){
        if(qntdeContas < totalContas){
            contas[qntdeContas]=conta;
            qntdeContas++;
            return true;
        }
        else{
            return false;
        }
    }
    public Conta procurarConta(double numConta){
        for(int i =0; i < qntdeContas;i++){
            if (contas[i].getNumero() == numConta){
                return contas[i];
            }
        }
        return null;
    }
    public int posicaoConta(double numConta){
        for (int i=0;i<qntdeContas;i++){
            if (contas[i].getNumero()==numConta){
                return i;
            }
        }
        return -1;
    }
    public void sacar(double valor, int qualConta){
        if(contas[qualConta].getSaldo()>=valor){
            contas[qualConta].sacar(valor);
        }
    }
    public void depositar (double valor, int qualConta){
        contas[qualConta].depositar(valor);
    }
    public void tranferir (double valor, int contaqSede, int contaqRecebe){
        if(contas[contaqSede].getSaldo()>valor){
            contas[contaqSede].transferir(valor, contas[contaqRecebe]);
        }
    }
    public void mostrarDados(Banco bank){
        System.out.println("Nome do Banco: " + bank.getNome());
        Conta [] listasContas = bank.getContas();
        System.out.println("Lista das Contas do Banco: ");
        for(int i = 0;i<listasContas.length;i++){
            System.out.println(listasContas[i].toString());
        }
    }
    // ja existe o metodo tranferir

}