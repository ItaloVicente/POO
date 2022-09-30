public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente a1 = new ContaCorrente("Silvao", 1234, 20000, 125.5);
        System.out.println(a1.getLimiteEspecial());
        ContaPoupanca a2 = new ContaPoupanca("Itainha", 1234, 50000, 15);
        ContaCorrente a3 = a1;
        a1.setTitular("Italo");
        a2.render(a2);
        a1.sacar(20205);
        a1.debitarAnuidade(a1);
        a1.debitarAnuidade(150);
        a1.mostrarDados(a1);
        a2.mostrarDados(a2);
        System.out.println(a1);
        if(a1==a3){
            System.out.println("Eles sao iguais");
        }
        System.out.println(a3.getTitular());//altera o a3 tambem
    }
}
/* Sobrescrita de metodo
 * Ao sacar uma Conta Corrente, voce tem uma limite que pode deixar seu saldo negativo, e o limite especial,
 * entao deve-se alterar o metodo saque, fazer uma sobrescrita de metodo, overringing
 * ex super.numero para acessar a variavel numero na classe mae
 * Classe Object tem a classe "mamae master", ela se chama Object
 * Comparar obejtos muitas vezes nao da certo por nao ocuparem o mesmo lugar de memoria
 * 
 */
