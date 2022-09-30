
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int verificador=0;
        Scanner teclado = new Scanner(System.in);
        while (verificador!=-1){
            System.out.println("Quais das opcoes voce deseja (Digite -1 para sair): ");
            System.out.println("1.Adicionar contato ");
            System.out.println("2.Procurar contato (por nome)");
            System.out.println("3.Alterar telefone");
            System.out.println("4.Remover contato");
            System.out.println("5.Enviar mensagem");
            verificador=teclado.nextInt();
            if(verificador==1){
                System.out.println("Insira o nome do contato");
                String nome = teclado.next();
                System.out.println("Insira o numero do contato (nao digite outros caracteres tem ser apenas numero inteiros)");
                int telefone = teclado.nextInt();
                Pessoa contato= new Pessoa(nome,telefone);
                if(agenda.procurarPessoa(nome)!=null){
                    System.out.println("Contato ja existente");
                    System.out.println("Deseja substituir o contato? (1 para sim, 2 para nao)");
                    int escolha = teclado.nextInt();
                    if(escolha==1){
                        System.out.println("Insira o novo nome do contato");
                        String nomeNovo = teclado.next();
                        System.out.println("Insira o novo numero do contato (nao digite outros caracteres tem ser apenas numero inteiros)");
                        int numeroNovo = teclado.nextInt();
                        Pessoa contatoNovo = new Pessoa(nomeNovo,numeroNovo);
                        int posicao = agenda.posicaoPessoa(nome);
                        agenda.getPessoas().set(posicao,contatoNovo);
                    }
                    if(escolha==2){
                        continue;
                    }
                }
                if(agenda.procurarPessoa(nome)==null){
                    agenda.adicionarPessoa(contato);
                }
            }
            if(verificador==2){
                System.out.println("Insira o nome do contato que sera procurado");
                String nome = teclado.next();
                Pessoa contato = agenda.procurarPessoa(nome);
                if(contato!=null){
                    System.out.println("Contato achado");
                    contato.mostrarDados(contato);
                }
                if(contato==null){
                    System.out.println("Contato nao encontrado");
                }
            }
            if(verificador==3){
                System.out.println("Insira o nome do contato que tera o numero alterado");
                String nome = teclado.next();
                Pessoa contato = agenda.procurarPessoa(nome);
                if(contato!=null){
                    System.out.println("Contato achado");
                    System.out.println("Digite o numero novo");
                    int numeroNovo = teclado.nextInt();
                    Pessoa contatoNovo = new Pessoa(nome,numeroNovo);
                    int posicao = agenda.posicaoPessoa(nome);
                    agenda.getPessoas().set(posicao,contatoNovo);
                }else{
                    System.out.println("Contato nao encontrado");
                }
            }
            if(verificador==4){
                System.out.println("Insira o nome do contato que sera removido");
                String nome = teclado.next();
                agenda.removerPessoa(nome);
            }
            if(verificador==5){
                System.out.println("Diga o numero do contato que queira enviar a mensagem");
                int numeroContato = teclado.nextInt();
                System.out.println("Diga a mensagem que sera enviada");
                String mensagem = teclado.next();
                agenda.enviarMensagem(numeroContato, mensagem);
            }
            //mostrar todos contatos
            agenda.mostrarLista();
            //mostrar todas mensagens
            agenda.mostrarMensagens();
            //precisa da data (comandos que nao sei, e comando para ver a quais e quantas mensagens voce enviou para uma unica pessoas)
        }
    }
    
}
