import java.awt.*;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //cria o nosso objeto cofrinho que vai guardar a lista de moedas
        Cofrinho cofrinho = new Cofrinho();

        //variável para guardar o número que o usuário digitar no menu
        int opcao = -1;

        //o laço vai repetir o menu sem parar, até a pessoa digitar o 0
        while (opcao != 0) {
            System.out.println("\nPágina inical do Cofrinho:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular o Total Convertido para Real");
            System.out.println("0 - Encerrar conversa");
            System.out.println("Escolha uma opção: ");

            //lê a opção escolhida no menu
            opcao = teclado.nextInt();

            //opção 1: serve pra adicionar uma nova moeda
            if (opcao == 1) {
                System.out.println("Escolha a Moeda:");
                System.out.println("1 - Real");
                System.out.println("2 - Dolar");
                System.out.println("3 - Euro");
                int tipoMoeda = teclado.nextInt();

                System.out.print("Digite o valor: ");
                //lê o valor da moeda
                double valor = teclado.nextDouble();

                Moeda moeda = null;
                //verifica qual foi a moeda escolhida e cria ela com o valor digitado
                if (tipoMoeda == 1) {
                    moeda = new Real(valor);
                }   else if (tipoMoeda == 2){
                    moeda = new Dolar(valor);
                }   else if (tipoMoeda == 3){
                    moeda = new Euro(valor);
                } else {
                   //se digitar 4,5, etc, da erro e volta pro começo do menu
                    System.out.println("Moeda inválida!");
                    continue;
                }
                //pega a moeda que acabou de ser criada e joga dentro do cofre
                cofrinho.adicionar(moeda);
                System.out.println("Moeda adicionada com sucesso!");
            //opção 2: tirar uma moeda do cofre
            } else if (opcao == 2) {
                System.out.println("Escolha a Moeda para remover:");
                System.out.println("1 - Real");
                System.out.println("2 - Dolar");
                System.out.println("3 - Euro");
                //fala exatamente qual moeda procurar para remover
                int tipoMoeda = teclado.nextInt();
                System.out.println("Digite o valor: ");
                double valor = teclado.nextDouble();

                Moeda moeda = null;
                //cria uma moeda "falsa" só para o cofrinho procura uma igual e deletar
                if (tipoMoeda == 1){
                    moeda = new Real(valor);
                } else if (tipoMoeda == 2){
                   moeda = new Dolar(valor);
                } else if (tipoMoeda == 3){
                    moeda = new Euro(valor);
                } else {
                    System.out.println("Moeda inválida!");
                    continue;
                }

                //manda o cofrinho procurar essa moeda e excluir ela
                cofrinho.remover(moeda);
                System.out.println("Moeda removida");

            //opção 3: mostrar tudo que tem no cofre
            } else if (opcao == 3) {
                cofrinho.listagemMoedas();

            //opção 4: ver o dinhero total em reias
            }else if (opcao == 4) {
                //puxa o cálculo do total e guarda na variável
                double total = cofrinho.totalConvertido();
                System.out.println("O valor total convertido para real é: R$" + total);

            //se a opção não for nenhuma das opções avisa que está errado
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        System.out.println("Programa encerrado. Até!");
        //fecha o teclado no final para não gastar recursos do computador
        teclado.close();
    }
}