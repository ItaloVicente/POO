public class Main{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double adicao = calculadora.adicionar(2);
        double multiplicacao = calculadora.multiplicar(5);
        double subtracao = calculadora.subtrair(2);
        calculadora.limpar();
        double divisao = calculadora.dividir(4);
        System.out.println(divisao);
    }
}