import java.util.Scanner;

public class Pessoa extends Jogador {
     Scanner scanner = new Scanner(System.in);

     public Pessoa(int jogador) {
          super(jogador);
          this.jogador = jogador;
     }

     public Carta jogar(Tabuleiro tabuleiro){
          System.out.println("Digite uma linha para jogada: ");
          jogada[0] = scanner.nextInt();
          System.out.println("Digite uma coluna para jogada: ");
          jogada[1] = scanner.nextInt();

          if (tabuleiro.getPosicao(jogada).isVisivel()==false){
                    tabuleiro.getPosicao(jogada).setVisivel(true);
          }//Torna a carta vísivel durante a jogada.

          return tabuleiro.getPosicao(jogada);
     }

}
