
package wordle_poo_1182701;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;

public class Tecla extends JFrame  {
    
    private int posicionX;
    private int posicionY;
    private int estado;
    private String letra;
    
    
    public Tecla(int posicionX, int posicionY, String letra) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.letra = letra;
        estado=0;
    }
    
    public void dibujarTecla(Canvas canva)
    {
    canva.setForegroundColor(Color.black);
    canva.fillRectangle(posicionX, posicionY, 50, 50);
    if(estado==0)
    {
    canva.setForegroundColor(Color.white);
    }
     if(estado==1)
    {
    canva.setForegroundColor(Color.green);
    }
     if(estado==2)
    {
    canva.setForegroundColor(Color.yellow);
    }
     if(estado==3)
    {
    canva.setForegroundColor(Color.gray);
    }
    canva.fillRectangle(posicionX+5, posicionY+5, 40, 40);
    canva.setForegroundColor(Color.black);
    Font f = new Font("Arial", Font.BOLD, 20);
    canva.setFont(f);
    canva.drawString(letra.toUpperCase(), posicionX+15, posicionY+30);
    } 
    
    public void setEstado(int estado)
    {
        this.estado=estado;
    }
    
    public String getLetra()
    {
        return letra;
    }

}
