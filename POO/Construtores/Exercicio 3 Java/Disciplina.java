import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disciplina{
    private int codigo;
    private String nome;
    private int quantMax;
    private ArrayList <Aluno> listAlunos = new ArrayList<>();
    public void matricular (int quantMax, Aluno a1){
        String nome = a1.getnome();
        if (this.listAlunos.size()<quantMax){
            this.listAlunos.add(a1);
        }
        else{
            System.out.println("Disciplica lotada");
        }
    }
    public void atribuirNotas (String aluno,double notaNova1,double notaNova2){
        for(int i =0;i<this.listAlunos.size();i++){
            if(this.listAlunos.get(i).getnome().equals(aluno)){
                this.listAlunos.get(i).setnota1(notaNova1);
                this.listAlunos.get(i).setnota2(notaNova2);
            }
        }
    }
    public void alterarNotas (String aluno,double notaNova1,double notaNova2){
        for(int i =0;i<this.listAlunos.size();i++){
            if(this.listAlunos.get(i).getnome().equals(aluno)){
                this.listAlunos.get(i).setnota1(notaNova1);
                this.listAlunos.get(i).setnota2(notaNova2);
            }
            else{
                System.out.println("Aluno nao encontrado em nosso banco de dados");
            }
        }
    }
    public void gerarEstatistica(){
        double maior=0;
        double menor=0;
        double som = 0;
        double melhor = 0;
        String melhorAluno = "";
        for(int i=0;i<this.listAlunos.size();i++){
            double nota1 = this.listAlunos.get(i).getnota1();
            double nota2 = this.listAlunos.get(i).getnota2();
            double mediaAluno = (nota1+nota2)/2;
            if(mediaAluno>=7){
                maior+=1;
            }else{
                menor+=1;
            }
            som = mediaAluno + som;
            if(mediaAluno>melhor){
                melhor = mediaAluno;
                melhorAluno=this.listAlunos.get(i).getnome();
            }
        }
        double media=som/this.listAlunos.size();
        System.out.println("A quant de aprovados foi: " + maior);
        System.out.println("A quant de reprovados foi: " + menor);
        System.out.println("A media da turma foi: " + media);
        System.out.println("O melhor aluno foi: " + melhorAluno);
    }
    /*public ArrayList<Aluno> ordemCrescenteAlfabetica (){
        ArrayList <Aluno> ordemAlfabetica;
        for(int i=0;i<this.listAlunos.size();i++){
            for(int j=0;j<this.listAlunos.size();i++){
                if(this.listAlunos.get(i).getnome()>this.listAlunos.get(i+1).getnome()){
                String temp = this.listAlunos.get(i).getnome();
                this.listAlunos.get(i).getnome()=
                }
            }
        }
        return ordemAlfabetica;
    }
    
    
    */

}