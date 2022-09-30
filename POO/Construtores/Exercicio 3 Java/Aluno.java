public class Aluno{
    private String nome;
    private int matricula;
    private double nota1 =0;
    private double nota2=0;
    public Aluno (String n, int m){
        nome = n;
        matricula= m;
    }
    public String getnome(){
        return nome;
    } 
    public void setnome(String nome){
        this.nome = nome;
    }
    public int getmatricula(){
        return matricula;
    }
    public void setmatricula(int matricula){
        this.matricula=matricula;
    }
    public double getnota1(){
        return nota1;
    }
    public void setnota1(double nota1){
        this.nota1=nota1;
    }
    public double getnota2(){
        return nota2;
    }
    public void setnota2(double nota2){
        this.nota2=nota2;
    }
    public double calcularMedia(double nota1,double nota2){
        double media = (nota1+nota2)/2;
        return media;
    }  
}