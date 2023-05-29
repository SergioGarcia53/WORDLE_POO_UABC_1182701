
package wordle_poo_1182701;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.Scanner;


public class Wordle_POO_1182701 {

  
    public static void main(String[] args) {
        Canvas canva=new Canvas("WORDLE", 1000, 1000, Color.white);
        Font f = new Font("Arial", Font.BOLD, 70);
        canva.setFont(f);
        canva.drawString("WORDLE", 240, 170);
        
     BancoPalabras diccionario=new BancoPalabras();
     palabraObjetivo Objetivo=new palabraObjetivo();
     Scanner teclado=new Scanner(System.in);
     Random rmd=new Random();
     Tablero tablero=new Tablero();
     int n;
     palabraIntento Intentos=new palabraIntento();
     String intento;
     int numIntentos=6,ganar=0,numintento=1;
     
      n=rmd.nextInt(diccionario.getSize());
      Objetivo.setPalabraObjetivo(diccionario.getPalabra(n));
     
      
        do{           
         tablero.desplegarTablero(numIntentos);
         
            System.out.println("\n");
         tablero.desplegarTeclado();
         if(numIntentos==6)
         {
         tablero.dibujarTableroGrafico(canva);
         }
         tablero.dibujarTecladoGrafico(canva);
         
         
         
         do{
         System.out.println("Ingresa intento: ");
         intento=teclado.nextLine();
         if(intento.length()!=5)
         {
             System.out.println("PALABRA INVALIDA, INTENTE DE NUEVO");  
         }
         }while(intento.length()!=5);
         
         
         
         Intentos.agregarPalabra(intento);
         Intentos.getResultado(intento, Objetivo.getPalabraObjetivo());
         
         Intentos.imprimirIntento();
         Intentos.dibujarPalabraIntento(canva,numintento,intento,tablero.getTeclado());
         numintento++;
         if(intento.equals(Objetivo.getPalabraObjetivo()))
         {
            ganar=1; 
         }
         
         numIntentos--;
         if(ganar==1)
         {
          tablero.desplegarTablero(numIntentos);
         }
         
         for(int c=0;c<Intentos.getSizeLetrasEliminar();c++)
         {
         tablero.agregarLetraAEliminar(Intentos.getLetraAEliminar(c));
         
         tablero.eliminarLetras();
         }
         
        }while((numIntentos!=0) && (ganar!=1));
         if(ganar==1)
         {
             Font ganaste = new Font("Arial", Font.BOLD, 100);
             canva.setForegroundColor(Color.green);
        canva.setFont(ganaste);
        canva.drawString("GANASTE!!!!!", 200, 370);
        canva.drawString("GANASTE!!!!!", 200, 470);
        canva.drawString("GANASTE!!!!!", 200, 570);
             System.out.println("\n\nHAS GANADO FELICIDADES!!!!!!"); 
         }
         else
         {
              Font perdiste = new Font("Arial", Font.BOLD, 100);
             canva.setForegroundColor(Color.red);
        canva.setFont(perdiste);
        canva.drawString("PERDISTE :(", 200, 370);
        canva.drawString("PERDISTE :(", 200, 470);
        canva.drawString("PERDISTE :(", 200, 570);
             System.out.println("\n\nLA PALABRA ERA: "+Objetivo.getPalabraObjetivo());
             System.out.println("HAS PERDIDO, MEJOR SUERTE A LA PROXIMA");
         }
      
    }
    
}
