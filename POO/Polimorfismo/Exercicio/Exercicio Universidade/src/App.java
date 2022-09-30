public class App {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("UECE");
        Funcionario f1 = new Professor("Italo", 1234, "mestre", 1, 200);
        Funcionario f2 = new Secretario("Blabla", 123, 30);
        Funcionario f3 = new Servidor("Biu", 12345, 20);
        f1.calcularSalario();
        f2.calcularSalario();
        f3.calcularSalario();
        universidade.adicionar(f1);
        universidade.adicionar(f2);
        universidade.adicionar(f3);
        universidade.mostrarDados();

    }
}
