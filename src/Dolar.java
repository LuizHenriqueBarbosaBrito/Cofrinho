// A classe Dolar também herda as características e regras da classe mãe
public class Dolar extends Moeda {
    //é um construtor ele pega o valor digitado no menu e envia para o construtor principal
    public Dolar(double valor) {
        //o comando Super repassa esse valor para a classe Moeda guardar na memória
        super(valor);
    }
    // Sobrescreve o método info() para exibir o texto formatado com o símbolo do Dólar    @Override
    public void info(){
        System.out.println("Dolar - Valor: $" + this.valor);
    }
    // Sobrescreve o método converter() com o cálculo de câmbio específico do Dólar
    @Override
    public double converter() {
        // Multiplica o valor em Dólar pela cotação para achar o valor em Real
        return this.valor * 5.0;
    }
}
