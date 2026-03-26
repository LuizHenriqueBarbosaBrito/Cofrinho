// A classe Real também herda as regras e características da classe mãe
public class Real extends Moeda{
    //ele é um construtor que recebe o valor digitado no menu e repassa para a classe principal
    public Real(double valor) {
        super(valor);// esse comando envia esse valor para a classe Moeda guarda
    }
    // A classe Real também herda as regras e características da classe mãe
    @Override
    public void info() {
        System.out.println("Real - Valor: R$" + this.valor);
    }
    // Sobrescreve o método converter()
    @Override
    public double converter(){
        return this.valor; // Como a moeda já é o próprio Real, não precisamos aplicar nenhuma cotação, basta retornar o próprio valor exato que foi guardado!
    }
}
