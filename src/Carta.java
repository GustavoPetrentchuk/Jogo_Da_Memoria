public class Carta {
     private String caracter;
     private boolean descoberta;
     private boolean visivel;

     public Carta(String caracter) {
          this.caracter = caracter;
          this.descoberta = false;
          this.visivel = false;
     }

     public void setDescoberta(boolean descoberta) {
          this.descoberta = descoberta;
     }

     public void setVisivel(boolean visivel) {
          this.visivel = visivel;
     }

     public boolean isDescoberta() {
          return descoberta;
     }

     public boolean isVisivel() {
          return visivel;
     }

     public String getCaracter() {
          return caracter;
     }

     //Permite printar o caracter armazenado no objeto carta
     @Override
     public String toString() {
          return caracter;
     }
}
