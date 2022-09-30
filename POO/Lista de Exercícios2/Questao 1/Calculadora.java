import java.util.ArrayList;

public class Calculadora{
    private ArrayList <Double> valores = new ArrayList <Double>();
    public double adicionar (double valor){
        double som = 0;
        if(valores.size()==0){
            valores.add((double) 0);
        }
        som = valores.get(valores.size()-1)+valor;
        valores.add(som);
        return som;
    }
    public double subtrair (double valor){
        double subtracao = 0;
        if(valores.size()==0){
            valores.add((double) 0);
        }
        subtracao = valores.get(valores.size()-1)-valor;
        valores.add(subtracao);
        return subtracao;
    }
    public double multiplicar (double valor){
        double multiplicacao = 0;
        if(valores.size()==0){
            valores.add((double) 0);
        }
        multiplicacao = valores.get(valores.size()-1)*valor;
        valores.add(multiplicacao);
        return multiplicacao;
    }
    public double dividir (double valor){
        double divisao = 0;
        if(valores.size()==0){
            valores.add((double) 0);
        }
        divisao = valores.get(valores.size()-1)/valor;
        valores.add(divisao);
        return divisao;
    }
    public void limpar(){
        valores.clear();
        valores.add((double)0);
    }





}