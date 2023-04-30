
package wordle_poo_1182701;

import java.util.ArrayList;


public class Tablero {
   private int x;
   private Teclado teclado=new Teclado();
   private ArrayList<String> letrasAEliminar=new ArrayList<String>();
           
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Tablero(int x) {
        this.x = x;
    }
   
    public Tablero() {
        this.x = 0;
    }
    public void desplegarTablero(int numIntentos)
    {
        
        for(int i=1;i<=numIntentos;i++)
        {
        System.out.println("\t\t[ ]\t[ ]\t[ ]\t[ ]\t[ ]");
        }
    }
    
    public void desplegarTeclado()
    {
        teclado.imprimirTeclado();
    }
    
    public void eliminarLetras()
    {
        for(int i=0;i<letrasAEliminar.size();i++)
        {
          teclado.eliminarLetrasteclado(letrasAEliminar.get(i));
        }
    }
    
    public void agregarLetraAEliminar(String letra)
    {
        letrasAEliminar.add(letra);
    }
    
    
    
}
