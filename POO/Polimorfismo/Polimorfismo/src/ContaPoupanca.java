public class ContaPoupanca extends Conta {
    private double taxaJuros;
    public ContaPoupanca(String nome, double numero, double saldo, double taxaJuros){
        super(nome,numero,saldo);
        this.taxaJuros=taxaJuros;
    }
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void render(ContaPoupanca conta){
        double saldo = conta.getSaldo();
        double taxa = conta.getTaxaJuros();
        saldo = saldo + saldo*(taxa/100);
        conta.setSaldo(saldo);
    }
    
}
/*Da erro por causa do private na class Conta;
 * Assim, eu troco o private por protected, quando se trata de heranca;
 */