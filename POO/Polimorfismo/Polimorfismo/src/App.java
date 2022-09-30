public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
/* Polimorfismo
 * Tratar os objetos como todos da mesma classe
 * Framework x Biblioteca, Framework se cria com Polimorfismo, voce "injeta" novas funcoes
 * Se B tem heranca de A, a classe B e uma classe de A, Gerente e um funcionario, se funcionario for uma superclasse
 * Polimorfismo acontece em tempo de EXECUCAO, sobreescrita (exemplo o metodos sacar)
 * Polimorfismo em tempo de compilacao e sobrecarga, dois metodos com o mesmo nome em uma unica
 * Vantagens estrutura de dados heterogenias, poder reutilizar metodos anteriormente declarados
 * *olhar tabela virtual do slide* POLIMORFISMO
 * A b = new B(); nao dara erro, pega primeiro os metodos de B,depois de A, B tem prioridade, se A nao tiver o metodo, nao posso chamar,
 * dara erro.
 * 
 */
