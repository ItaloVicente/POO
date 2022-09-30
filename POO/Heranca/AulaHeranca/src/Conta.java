public class Conta {
    protected String titular;
    protected double numero;
    protected double saldo;
    public Conta(String titular, double numero, double saldo){
        this.titular=titular;
        this.numero=numero;
        this.saldo=saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public double getNumero(){
        return numero;
    }
    public void setNumero(double numero){
        this.numero=numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void depositar(double deposito){
        saldo= deposito + saldo;
        //System.out.println(titular + ", Seu saldo e: " + saldo);
    }
    public boolean sacar (double valor){
        if (saldo>=valor){
            saldo=saldo-valor;
            return true;
        }
        else{
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }
    /*public void sacar(double valorSaque){
        if (valorSaque>saldo){
            System.out.println("Saldo Insuficiente, seu saldo e: " + saldo);
        }else{
            saldo= saldo-valorSaque;
        }
    }*/
    public boolean transferir(double valor, Conta conta){
        if(this.saldo>=valor){
            conta.depositar(valor);
            this.sacar(valor);
            return true;
        }
        else{
            return false;
        }
    }//github.com/PEOO2022-2
    public void mostrarDados (Conta cont){
        System.out.println("Conta encontrada: ");
        System.out.println("Titular: " + cont.getTitular());
        System.out.println("Numero da Conta " + cont.getNumero());
        System.out.println("Saldo da Conta " + cont.getSaldo());
    }
    public String toString(){
        return "Titular " + titular + ", numero " + numero + ", saldo " + saldo;
    }
    
}
