import java.util.ArrayList;
import java.util.Arrays;

public class Tabuleiro {
     private Carta[][] tabuleiro;
     private ArrayList cartas;

     public Tabuleiro() {
          tabuleiro = new Carta[4][4];
          cartas = new ArrayList<String>(Arrays.asList("!","@","#","$","%","*","~","?"));
          preencheTabuleiro();
     }

     //Adiciona os caracteres do array dentro da matriz tabuleiro
     private void preencheTabuleiro() {
          for (int l = 0; l < tabuleiro.length; l++){
               for (int c = 0; c < tabuleiro[l].length;){
                    String aux = (String) cartas.get((int) (Math.random()*cartas.size())); //atribui um caracter aleatorio do array a variavel aux
                    if (this.verificaCartas(aux) < 2){ //adiciona 2x o caracter de aux na matriz tabela
                         tabuleiro[l][c] = new Carta(aux);
                         c++;
                    }
                    else{
                        cartas.remove(aux);
                    }
               }
          }
     }

     //Garante que as cartas se repetem em pares
     private int verificaCartas(String caracter){
          int contagem = 0;
          for (int l = 0; l < tabuleiro.length; l++){
               for (int c = 0; c < tabuleiro[l].length; c++){
                    if (tabuleiro[l][c] != null){
                         if (tabuleiro[l][c].getCaracter() == caracter){
                              contagem ++;
                         }
                    }
               }
          }
          return contagem;
     }

     //Printa o tabuleiro vazio ou com peças descobertas.
     public void printTabuleiro(){
          for (int l = 0; l < tabuleiro.length; l++){
               for (int c = 0; c < tabuleiro[l].length;c++){
                    if (tabuleiro[l][c].isDescoberta() || tabuleiro[l][c].isVisivel()){
                         System.out.print(" [" + tabuleiro[l][c] + "] ");
                    }
                    else {
                         System.out.print(" [ ] ");
                    }
               }
               System.out.println("");
          }
     }

     //printa o tabuleiro completo.
     public void mostraTabuleiro(){
          for (int l = 0; l < tabuleiro.length; l++) {
               for (int c = 0; c < tabuleiro[l].length;c++) {
                    System.out.print(" [" + tabuleiro[l][c].getCaracter() + "] ");
               }
               System.out.println("");
          }
     }

     //Retorna uma posição do tabuleiro, com base no vetor passado para a função
     public Carta getPosicao(int [] posicao){
          return tabuleiro[posicao[0]][ posicao[1]];
     }


     //Deveria limpar o console/cmd durante a execução, porém não funciona. Não funciona com console da IDEA também.
     public static void clearConsole(){
          try{
               final String os = System.getProperty("os.name");

               if (os.contains("Windows"))
               {
                    Runtime.getRuntime().exec("cls");
               }
               else
               {
                    Runtime.getRuntime().exec("clear");
               }
          }
          catch (final Exception e){

          }
     }
}
