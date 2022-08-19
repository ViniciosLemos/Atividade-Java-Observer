import java.util.Observable;

class Main {
  public static void main(String[] args) {
    //Observador
    CarroPolicia carroPolicia = new CarroPolicia();
    CarroPolicia carroPolicia2 = new CarroPolicia();
    
    //Observado
    CarroRoubado carroRoubado = new CarroRoubado();
      
    //Ligação entre observador e observado
    carroRoubado.addObserver(carroPolicia);
    carroRoubado.addObserver(carroPolicia2);
   
    carroRoubado.direita();
    carroRoubado.esquerda();
    carroRoubado.para();
    
    
    }
}