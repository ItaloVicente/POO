import java.util.Scanner; 
public class Teste {
    public static void main (String args []){ 
        int vetor []; 
        vetor= new int [5]; 
        int d=1;
        for (int i=0; i<5; i++){ 
            System.out.println("Insira um número para compor o vetor: "); 
            Scanner teclado = new Scanner (System.in); 
            int num = teclado.nextInt(); 
            vetor [i] = num; 
        } 
        System.out.println("Insira um número para ser verificado no vetor: "); 
        Scanner teclado2 = new Scanner (System.in); int num2 = teclado2.nextInt(); 
        for (int i=0;i<5;i++){ 
            if(num2==vetor[i]){ 
                System.out.println("O número está no vetor"); 
                break; 
            }
            else if (i==4){ 
                System.out.println("O número não está no vetor"); 
            } 
        }
        for (int i=0;i<5;i++){ 
            if(vetor[i]>vetor[d]){ 
                vetor[d]=vetor[i];
            }
        }
    }
}