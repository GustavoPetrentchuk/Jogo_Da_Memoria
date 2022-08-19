public abstract class Jogador {
     protected int jogador;
     protected int [] jogada = new int[2];

     public Jogador(int jogador) {
          this.jogador = jogador;
     }

     public abstract Carta jogar(Tabuleiro tabuleiro);

}
//Classe abstrata