package wordle_poo_1182701;

import java.util.ArrayList;


public class Teclado {
private ArrayList<String> linea1=new ArrayList<String>();
private ArrayList<String> linea2=new ArrayList<String>();
private ArrayList<String> linea3=new ArrayList<String>();

public Teclado()
{
linea1.add("q");
linea1.add("w");
linea1.add("e");
linea1.add("r");
linea1.add("t");
linea1.add("y");
linea1.add("u");
linea1.add("i");
linea1.add("o");
linea1.add("p");

linea2.add("a");
linea2.add("s");
linea2.add("d");
linea2.add("f");
linea2.add("g");
linea2.add("h");
linea2.add("j");
linea2.add("k");
linea2.add("l");

linea3.add("z");
linea3.add("x");
linea3.add("c");
linea3.add("v");
linea3.add("b");
linea3.add("n");
linea3.add("m");

}

public void imprimirTeclado()
{
    System.out.print("\t");
    for(int i=0;i<linea1.size();i++)
    {
        
        System.out.print("["+linea1.get(i)+"]  ");    
    }
    System.out.println("");
    System.out.print("\t   ");
     for(int i=0;i<linea2.size();i++)
    {
        System.out.print("["+linea2.get(i)+"]  ");    
    }
         System.out.println("");
System.out.print("\t      ");
     for(int i=0;i<linea3.size();i++)
    {
        
        System.out.print("["+linea3.get(i)+"]  ");    
    }
         System.out.println("");

}

public void eliminarLetrasteclado(String letra)
{
    if(linea1.contains(letra)==true)
    {
     linea1.remove(linea1.indexOf(letra));
    }
    
    if(linea2.contains(letra)==true)
    {
     linea2.remove(linea2.indexOf(letra));
    }
    
    if(linea3.contains(letra)==true)
    {
     linea3.remove(linea3.indexOf(letra));
    }
}

}
