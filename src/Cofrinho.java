import java.util.ArrayList;
public class Cofrinho {

    //cria uma lista flexivel que vai guardar todas as moedas
    private ArrayList<Moeda> listaMoedas;
    //ele constroi a lista vazia na mémoria assim que o cofrinho for criado
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }
    //coloca uma moeda nova dentro da lista
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }
    //ele procura e tira a moeda da lista
    public void remover(Moeda moeda) {
        this.listaMoedas.remove(moeda);
    }
    //método que mostra no console todas as moedas que estão guardadas
    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;// sai do método e não executa o código de baixo
        }
        //laço de repetição, passa por cada moeda da lista e pede para ela exibir suas informações
        for (Moeda moeda : this.listaMoedas){
            moeda.info();
        }
    }
    //método que calcula quanto dinehro temos no total, convertendo tudo para a moeda padrão
    public double totalConvertido() {
         // se não tiver moedas na lista, o total convertido é zero
        if (this.listaMoedas.isEmpty()) {
                return 0;
            }
            //variável que guarda para ir somando um por um
            double valorTotalAcumulado = 0;

            //passa por cada moeda, converte o valor para real e soma no acumulador
            for (Moeda moeda : this.listaMoedas) {
                valorTotalAcumulado += moeda.converter();
            }
           // devolve o valor final da soma de todas as moedas convertidas
            return valorTotalAcumulado;
    }
}
