public class App {
    public static void main(String[] args) {
        MatrizDeInteiros matriz = new MatrizDeInteiros(3, 3);
        matriz.atribuirValor(1, 2, 3);
        matriz.atribuirValor(2, 1, 4);
        matriz.mostrarMatriz();
        int soma = matriz.somar();
        int encontrar = matriz.encontrar(3);
        System.out.println(encontrar);
        System.out.println(soma);
    }
}
