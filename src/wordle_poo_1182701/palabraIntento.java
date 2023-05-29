
package wordle_poo_1182701;

import java.util.ArrayList;

public class palabraIntento {
   private  ArrayList<String> palabraIntento=new ArrayList<String>(); 
   private  ArrayList<String> resultados=new ArrayList<String>();  
    private ArrayList<String> letrasAEliminar=new ArrayList<String>();
    private ArrayList<Tecla> intentoGrafico=new ArrayList<Tecla>();
    private Teclado teclasResultado=new Teclado();
  private String result;
    public palabraIntento() {
        
    }
        public void agregarPalabra(String intento)
        {
           palabraIntento.add(intento); 
        }
    

    public void imprimirIntento() {
        String intento;
         
         for(int i=0;i<palabraIntento.size();i++)
         {
             intento=palabraIntento.get(i);
         
             System.out.println("\t\t["+intento.charAt(0)+"]\t"+"["+intento.charAt(1)+"]\t"+"["+intento.charAt(2)+"]\t"+"["+intento.charAt(3)+"]\t"+"["+intento.charAt(4)+"] ");
         if(i<1){
             System.out.print("\t\t "+resultados.get(i)+"\t "+resultados.get(i+1)+"\t "+resultados.get(i+2)+"\t "+resultados.get(i+3)+"\t "+resultados.get(i+4)+"   \n");
         }
            else
            {
            System.out.print("\t\t "+resultados.get(0+(i*5))+"\t "+resultados.get(1+(i*5))+"\t "+resultados.get(2+(i*5))+"\t "+resultados.get(3+(i*5))+"\t "+resultados.get(4+(i*5))+"   \n");

             }
         }
        }
   
    public void getResultado(String intento,String objetivo)
    {
        
        int i=0,j=0;
     for(i=0;i<=4;i++)
     {
        for(j=0;j<=4;j++)
       {
            
            if(intento.charAt(i)==objetivo.charAt(j)) 
             {
                result="!"; 
               
             }    
            
                if(intento.charAt(i)==objetivo.charAt(i)) 
                {
                result="=";
      
                } 
                if((intento.charAt(i)!=objetivo.charAt(0))&&(intento.charAt(i)!=objetivo.charAt(1))&&(intento.charAt(i)!=objetivo.charAt(2))&&(intento.charAt(i)!=objetivo.charAt(3))&&(intento.charAt(i)!=objetivo.charAt(4)))
                {
                 result="X"; 
                 String letra;
                 letra=Character.toString(intento.charAt(i));
                 letrasAEliminar.add(letra);
                 
                }  
       }   
                 resultados.add(result);

     }
      
    }
    
    public String getLetraAEliminar(int i)
    {
     return letrasAEliminar.get(i);
    }
   
    public int getSizeLetrasEliminar()
    {
        return letrasAEliminar.size();
    }
    
      public void dibujarPalabraIntento(Canvas canva, int numintento,String intento,Teclado teclado)
    {
        for (int i = 0; i < intento.length(); i++) 
        {
            int x=60;
            String letra;
            char letra1;
            letra1=intento.charAt(i);
            letra=Character.toString(letra1);
         Tecla teclaIntento=new Tecla(190+x+(i*60),140+(numintento*60),letra); 
         
            if(resultados.get(i)=="!")
            {
                teclaIntento.setEstado(2);
                 teclado.actualizarTecladoGrafico(letra,2);
                 
            }
            if(resultados.get(i)=="=")
            {
                teclaIntento.setEstado(1);
                 teclado.actualizarTecladoGrafico(letra,1);
                 
            }
            if(resultados.get(i)=="X")
            {
                teclaIntento.setEstado(3);
                 teclado.actualizarTecladoGrafico(letra,3);
                 
            }
            if(numintento>1)
            {
                if(resultados.get(i+((numintento-1)*5))=="!")
                {
                    teclaIntento.setEstado(2);
                    teclado.actualizarTecladoGrafico(letra,2);
                }
                if(resultados.get(i+((numintento-1)*5))=="=")
                {
                    teclaIntento.setEstado(1);
                    teclado.actualizarTecladoGrafico(letra,1);
                }
                if(resultados.get(i+((numintento-1)*5))=="X")
                {
                    teclaIntento.setEstado(3);
                    teclado.actualizarTecladoGrafico(letra,3);
                } 
            }
          teclaIntento.dibujarTecla(canva);  
         }
         
        }
       
    
}
