public abstract class Moeda {
     // guarda o valor da moeda
     protected double valor;

     // faz com que imforme um valor inicial na hora de criar a moeda
     public Moeda(double valor){
         this.valor = valor;
     }

     //serve para as classes filhas exibirem seus dados
     public abstract void info();

     // serve para as classes filhas calcularem a conversão para Real
     public abstract double converter();

     //ela compara se uma moeda é exatamente igual a outra
     @Override
     public boolean equals(Object obj) {
          if (this == obj) return true;//é a mesma moeda na memória
          if (obj == null) return false;//a outra moeda não existe
          if (this.getClass() != obj.getClass()) return false;

          //tranforma o objeto em moeda para poder comparar o valor númerico
          Moeda objetoMoeda = (Moeda) obj;
          if (this.valor != objetoMoeda.valor) return false;

          return true;// passou em todos os testes, as moedas são iguais!
     }
}

