import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Disciplina POO = new Disciplina();
        System.out.println("Bem vindo a Disciplina POO:");
        System.out.println("Primeiramente, digite a quantidade maxima de alunos que essa disciplina possui");
        int quantMax = teclado.nextInt();
        int verificador = 0;
        while(verificador!=-1){
            System.out.println("O que voce deseja fazer? (Digite -1 para sair)");
            System.out.println("1.Matricular Aluno");
            System.out.println("2.Atribuir Nota");
            System.out.println("3.Alterar Nota");
            System.out.println("4.Gerar estatisticas");
            System.out.println("5.Gerar lista em ordem alfabetica de alunos");
            verificador=teclado.nextInt();
            if(verificador==1){
                System.out.println("Insira o nome do aluno:");
                String nome = teclado.next();
                System.out.println("Insira a matricula do aluno");
                int matricula = teclado.nextInt();
                Aluno aluno = new Aluno(nome,matricula);
                POO.matricular(quantMax, aluno);
            }
            if(verificador==2){
                System.out.println("Digite o nome do aluno");
                String nome = teclado.next();
                System.out.println("Digite a primeira nota");
                double nota1= teclado.nextDouble();
                System.out.println("Digite a segunda nota");
                double nota2=teclado.nextDouble();
                POO.atribuirNotas(nome, nota1, nota2);
            }
            if(verificador==3){
                System.out.println("Digite o nome do aluno");
                String nome = teclado.next();
                System.out.println("Digite a primeira nota que sera alterada");
                double nota1= teclado.nextDouble();
                System.out.println("Digite a segunda nota que sera alterada");
                double nota2=teclado.nextDouble();
                POO.alterarNotas(nome, nota1, nota2);
            }
            if(verificador==4){
                POO.gerarEstatistica();
            }
            if(verificador==5){
                /*ArrayList <Aluno> alunos = POO.ordemCrescenteAlfabetica();
                for(int i =0;i<POO.ordemCrescenteAlfabetica().size();i++){
                    System.out.println(alunos.get(i));
                }*/
            }
        }
    }
}