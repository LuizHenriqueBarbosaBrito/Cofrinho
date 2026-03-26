//a classe Euro herda todasd as regras e atributos da classe mãe
public class Euro extends Moeda{
    //recebe o valor digitado e repassa para a classe principal
    public Euro(double valor) {
        super(valor);
    }
    //sobrescreve o método info() da classe mãe para ter a suqa própia mensagem
    @Override
    public void info(){
        System.out.println("Euro - Valor: €" + this.valor);
    }
    // Sobrescreve o método converter() com a matemática específica do Euro
    @Override
    //multiplica o valor em E   uro pela cotação para tranformar em Real
    public double converter(){
        return this.valor * 5.5;
    }
}
