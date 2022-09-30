import java.util.Scanner;

public class Aula3 {
    public static void main (String args []){
        Aluno a1= new Aluno ();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome aluno1: ");
        a1.nome= teclado.next();
        System.out.println("Digite o curso aluno 1: ");
        a1.curso=teclado.next();
        System.out.println("Digite a matricula aluno1: ");
        a1.matricula=teclado.nextInt();
        System.out.println("Digite o ano de nascimento aluno1: ");
        a1.ano=teclado.nextInt();
        Aluno a2 = new Aluno();
        System.out.println("Digite o nome aluno2:");
        a2.nome=teclado.next();
        System.out.println("Digite o curso aluno2: ");
        a2.curso=teclado.next();
        System.out.println("Digite a matricula aluno2: ");
        a2.matricula=teclado.nextInt();
        System.out.println("Digite o ano de nascimento aluno2: ");
        a2.ano=teclado.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual=teclado.nextInt();
        a2.mostrarDados();
        int idade2 = a2.calcularIdade(anoAtual);
        //a1.nome = "Italo";
        //a1.curso= "Comp";
        //a1.matricula= 1234;
        //a1.ano=2004;
        a1.mostrarDados();
        int idade = a1.calcularIdade(anoAtual);
        System.out.println("Idade aluno 1 = " + idade);
        System.out.println("Idade aluno 2 = " + idade2);
        teclado.close();


    }
    
}

/*Baixo acoplamento > aumenta o reuso, posso "trocar mais facil um teclado"
 *Alta coesao > facilita o entendimento (legibilidade) e facilita a manutencao
 *Analogia biologica, pensar um objeto como uma celula, eles se juntam e formam tecidos
 *Todo objeto tem 3 caracteristicas: Identidade, um conj de caracteristicas e um conj de comportamentos que define sua acao
 Ex: Obj. Beija-flor, identidade(unico desse obj): "O beija-flor que vem no meu jardim", carac: "Tem asas, e azul com verde", Comportamento: "Voar, polinizar a flor"
 *Exercicio nos slides
 *Carro///id=Uno/fab=Fiat/qtdPortas=4/cor=branca/aro=15/cambio=manual///acelerar/freiar/passar marcha
 *Isso foi a representacao grafica, em linha ficaria assim, "///" separa as caracteristicas do obj
 *Aluno///nome=Andre/instituicao=UECE/curso=Medicina/anoNasc=1990/mat=1234///MatricularEmUmaDisc/Imprimir hist
 *CLASSE: junta um conjunto de objs com caracterisiticas identicas,mesma caracteristicas e comportamentos
 *TEMPO DE PROJETO != TEMPO DE IMPLEMENTACAO (CLASSE SO EXISTE NESSE TEMPO, AQUI EU MOLDO O OBJETO) != TEMPO DE COMPILACAO != TEMPO DE EXECUCAO (O OBJ (ou instancia) SO EXISTE EM TEMPO DE EXECUCAO)
 *Se temos dois objetos com carac(mais corretos chamar de atributos) 100% iguais, os objetos mesmo assim nao serao iguais, eles alocam espaco de memoria diferentes.
 *Estado do objeto seria uma representacao do objeto naquele momento (pode ser que algum atributo seja trocado, talvez ele mude de ESTADO)
 *o espaco de alocamento da memoria nao muda durante a execucao, so se eu desligar o programa e liga-lo novamente
 *o comportamento do objeto NAO pode ser alterado durante o tempo de execucao
 *Metodo (funcao no python)
 *
 */
