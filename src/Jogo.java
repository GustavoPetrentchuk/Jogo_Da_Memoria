import java.io.IOException;

public class Jogo {
     public static void main(String[] args) throws InterruptedException, IOException {
          Pessoa x = new Pessoa(1);
          Tabuleiro tabuleiro = new Tabuleiro();
          while(true){
               tabuleiro.printTabuleiro();
               Carta c1 = x.jogar(tabuleiro);
               Tabuleiro.clearConsole();// Não funciona ???
               tabuleiro.printTabuleiro();
               Carta c2 = x.jogar(tabuleiro);
               tabuleiro.printTabuleiro();
               Thread.sleep(3000);
               if (c1.getCaracter() == c2.getCaracter()){
                    c1.setDescoberta(true);
                    c2.setDescoberta(true);
               }else {
                    c1.setVisivel(false);
                    c2.setVisivel(false);
               }
          }
     }
}
