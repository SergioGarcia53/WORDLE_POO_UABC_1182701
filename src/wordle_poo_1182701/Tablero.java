
package wordle_poo_1182701;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Tablero {
   private int x;
   private Teclado teclado=new Teclado();
   private ArrayList<String> letrasAEliminar=new ArrayList<String>();
   private ArrayList<Tecla> tableroGrafico=new ArrayList<Tecla>();
           
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
    
    public void dibujarTableroGrafico(Canvas canva)
    {
        int y=200;
       for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=4;j++)
            {
                int x=250+(j*60);
                Tecla cuadro=new Tecla(x,y,"");
                cuadro.dibujarTecla( canva);
            }
            y=y+60;
        } 
    }
     public void dibujarTecladoGrafico(Canvas canva)
     {
         teclado.dibujarTecladoGrafico(canva);
         
     }
     
     public Teclado getTeclado()
     {
         return teclado;
     }
}
