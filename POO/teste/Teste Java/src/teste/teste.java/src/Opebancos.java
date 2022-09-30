
import java.text.Format;
import java.util.Scanner;
import teste.teste.java.src.Banco;
import teste.teste.java.src.Conta;
import java.util.Arrays;
public class Opebancos {
    public static void main (String args[]){
        //Ex1
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Informe o nome do banco");
        String nomeBanco = teclado1.next();
        System.out.println("Informe a quantidade de contas que o Banco pode suportar");
        int quantDeContas = teclado1.nextInt();
        Banco Bank = new Banco(nomeBanco,quantDeContas);
        int verificador = 1;
        while (verificador != -1){
            System.out.println("Bem-vindo ao Banco " + Bank.getNome());
            Scanner teclado = new Scanner(System.in);
            System.out.println("Voce deseja: (Digite -1 para sair) ");
            System.out.println("1.Criar e adicionar uma conta ");
            System.out.println("2.Sacar ");
            System.out.println("3.Depositar");
            System.out.println("4.Alterar Dados de uma conta:");
            System.out.println("5.Transferir: ");
            verificador=teclado.nextInt();
            if(verificador==1){
                System.out.println("Digite o titular da Conta");
                String titular = teclado.next();
                System.out.println("Digite o numero da Conta:");
                double numeroConta= teclado.nextDouble();
                System.out.println("Digite o saldo da Conta:");
                double saldoConta= teclado.nextDouble();
                Conta a1 = new Conta(titular,numeroConta,saldoConta);
                Bank.adicionarConta(a1);
                
            }
            if(verificador==2){
                System.out.println("Informe a conta atraves de seu numero");
                double numConta = teclado.nextDouble();
                Conta contaSacar = Bank.procurarConta(numConta);
                int posicao = Bank.posicaoConta(numConta);
                Conta[] listaNova = Bank.getContas();
                if(contaSacar!=null){
                    System.out.println("Informe o valor que sera sacado");
                    double valor = teclado.nextDouble();
                    if(contaSacar.getSaldo()>=valor){
                        contaSacar.sacar(valor);
                        System.out.println("Saque realizado, sua conta agora possui um saldo de: " + contaSacar.getSaldo());
                        listaNova[posicao] = contaSacar;
                        Bank.setContas(listaNova);
                    }else{
                        System.out.println("Saldo Insuficiente, seu saldo e de: " + contaSacar.getSaldo());
                    }
                }else{
                    System.out.println("Infelizmente sua conta nao se encontra em nosso banco de dados");
                }
            }
            if(verificador==3){
                System.out.println("Informe a conta atraves de seu numero");
                double numConta = teclado.nextDouble();
                Conta contaDepositar = Bank.procurarConta(numConta);
                Conta[] listaNova = Bank.getContas();
                int posicao = Bank.posicaoConta(numConta);
                if(contaDepositar!=null){
                    System.out.println("Informe o valor que sera depositado");
                    double deposito = teclado.nextDouble();
                    contaDepositar.depositar(deposito);
                    System.out.println("Deposito realizado com sucesso, seu saldo agora e: " + contaDepositar.getSaldo());
                    listaNova[posicao]=contaDepositar;
                    Bank.setContas(listaNova);
                }else{
                    System.out.println("Infelizmente sua conta nao se encontra em nosso banco de dados");
                }
            }
            if(verificador==4){
                int opcao = 0;
                System.out.println("Informe a conta que deve ser alterada pelo numero");
                double numConta = teclado.nextDouble();
                Conta alterarConta = Bank.procurarConta(numConta);
                Conta[] listaNova = Bank.getContas();
                int posicao = Bank.posicaoConta(numConta);
                if(alterarConta!=null){
                    System.out.println("O que voce deseja alterar na conta:");
                    System.out.println("1.Titular");
                    System.out.println("2.Numero da Conta");
                    System.out.println("3.Valor informado do saldo:");
                    opcao=teclado.nextInt();
                    if(opcao==1){
                        System.out.println("Digite o novo titular:");
                        String newTitular=teclado.next();
                        alterarConta.setTitular(newTitular);
                    }
                    if(opcao==2){
                        System.out.println("Digite o novo numero da Conta");
                        double newNumber=teclado.nextDouble();
                        alterarConta.setNumero(newNumber);
                    }
                    if(opcao==3){
                        System.out.println("Digite o novo saldo");
                        double newSaldo = teclado.nextDouble();
                        alterarConta.setsaldo(newSaldo);
                    }
                    listaNova[posicao]=alterarConta;
                    Bank.setContas(listaNova);

                }
                else{
                    System.out.println("Infelizmente, sua conta nao foi encontrada em nosso banco de dadoss");
                }
            }
            if (verificador==5){
                System.out.println("Informe a conta (pelo seu numero) que recebera a transferencia");
                double numConta = teclado.nextDouble();
                Conta contaRecebe = Bank.procurarConta(numConta);
                System.out.println("Informe a conta (pelo seu numero) que ira seder saldo para transferencia");
                double numConta2 = teclado.nextDouble();
                Conta contaSede = Bank.procurarConta(numConta2);
                Conta[] listaNova = Bank.getContas();
                int posicao = Bank.posicaoConta(numConta);
                int posicao2 = Bank.posicaoConta(numConta2);
                if(contaRecebe!=null && contaSede!=null){
                    System.out.println("Informe o valor da transferencia");
                    double transferencia = teclado.nextDouble();
                    if(contaSede.getSaldo()>=transferencia){
                        contaSede.transferir(transferencia, contaRecebe);
                        System.out.println("Transferencia completa, o saldo da conta que sedeu e de: " + contaSede.getSaldo());
                        listaNova[posicao]= contaRecebe;
                        listaNova[posicao2]=contaSede;
                        Bank.setContas(listaNova);
                    }else{
                        System.out.println("Saldo Insuficiente, seu saldo e: " + contaSede.getSaldo());
                    }
                }else{
                    System.out.println("Infelizmente pelo menos uma conta nao foi encontrada em nosso banco de dados");
                }
            }
        }
        //Bank.mostrarDados(Bank);
    }   
}
