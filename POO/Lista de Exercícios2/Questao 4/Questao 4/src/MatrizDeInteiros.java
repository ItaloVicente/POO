import java.util.ArrayList;
import java.util.List;

public class MatrizDeInteiros {
    int A [] [] ;
    int linha;
    int coluna;
    public MatrizDeInteiros (int linha,int coluna){
        this.A= new int[linha] [coluna];
        this.linha=linha;
        this.coluna=coluna;
        for (int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                this.A[i][j]=0;
            }
        }
    }
    public void mostrarMatriz(){
        List<Integer> linhaI = new ArrayList<>(); 
        for (int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                linhaI.add(this.A[i][j]);
            }
            System.out.println(linhaI);
            linhaI= new ArrayList<>();
        }
    }
    public void atribuirValor(int linha,int coluna, int valor){
        this.A [linha-1] [coluna-1] = valor;
    }
    public boolean eQuadrada(){
        if(this.linha==this.coluna){
            return true;
        }
        return false;
    }
    public int somar(){
        int som = 0;
        for (int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                som = som+this.A[i][j];
            }
        }
        return som;
    }
    public int encontrar(int valor){
        for (int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                if(this.A[i][j]==valor){
                    System.out.println("Linha: " + (i+1));
                    System.out.println("Coluna: " + (j+1));
                    return i+1;
                }
            }
        }
        return -1;
    }

}
