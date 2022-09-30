public class ContaCorrente extends Conta{
    private double limiteEspecial;
    public ContaCorrente(String titular, double numero, double saldo) {
        super(titular, numero, saldo);
        this.limiteEspecial = 100;
    }
    public ContaCorrente(String nome, double numero, double saldo, double limite){
        super(nome,numero,saldo);
        this.limiteEspecial=limite;
    }
    public double getLimiteEspecial() {
        return limiteEspecial;
    }
    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    public void debitarAnuidade(ContaCorrente conta){
        if(conta.getSaldo()>=50){
            double saldo = conta.getSaldo();
            saldo = saldo - 50;
            conta.setSaldo(saldo);
        }
        else{
            System.out.println("Voce nao tem saldo para debitar a anuidade");
        }
    }
    // Mesmo metodo, mas com parametros diferentes.
    public void debitarAnuidade(double valor){
        saldo=saldo-valor;
    }
    //sobrescrita de metodo, overringing
    public boolean sacar (double valor){
        if(saldo+limiteEspecial>=valor){
            saldo=saldo-valor;
            return true;
        }
        else{
            System.out.println("Saldo Insuficente");
            return false;

        }
    }
    
}