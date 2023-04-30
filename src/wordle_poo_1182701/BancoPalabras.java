
package wordle_poo_1182701;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BancoPalabras {
    
    private List<String> Diccionario = new ArrayList<>();
    
    public BancoPalabras()
    {
      Collections.addAll(Diccionario,"abeto","alado","atizo","avion","abaco","abeja","abran","abria","acojo","actas","actuo","acune","acuso","afeas","agudo","alces","aleja","alias","altos","andas","anear","anima","ayuda","aerea","bache","bacas","bajes","bebes","berto","bizco","buena","bajos","batas","bayas","baños","bebes","besos","bonos","borra","botes","bruta","cabra","cajas","calas","calco","calma","campo","cantos","caras","cargo","carro","catar","caida","celia","cepas","cerco","cerda","chile","china","ciega","cines","citas","claro","clave","colas","colon","coras","corea","cosas","coste","curdo","curar","coger","corse","cuida","cural","dagas","daños","dejar","denso","dices","dotes","dures","dubai","ellos","echas","edita","emule","error","estas","emoji","erizo","euros","falto","fetos","filas","finca","firma","focos","forma","frita","freir","fumas","gales","galas","galos","ganes","gasto","gerbo","gorda","gorra","grava","gabon","gemir","güero","halos","harta","heces","habas","hacha","hijas","huera","india","ideas","islas","islas","japon","jefes","josue","jugar","julio","jadeo","jalon","jesus","jurar","kenia","kurda","lacra","lagos","larga","lejos","lento","libia","libra","lindo","loteo","liber","malos","marca","marco","marte","marta","mario","melon","meter","molar","monte","manco","macao","mango","meaba","midas","minsk","mirar","mojar","multa","nacer","narro","naves","necia","notas","nuria","nazis","ñizca","ñoqui","ñurda","obras","ollas","onzas","otras","oirte","obras","orina","osito","palas","pelea","pelar","perro","pesos","pinto","poder","pagar","palma","parda","paseo","pecio","peres","pifia","playa","poner","punto","purga","queda","quede","quito","queso","reloj","rubia","rasca","rasta","redes","renos","rabia","rabal","ramon","raspa","recia","regia","rugir","rusia","sabia","saber","salar","selva","sopas","serio","situo","sonar","sucio","siete","sajon","salva","salud","santo","sedar","segar","siria","sobar","solar","soplo","sudan","suiza","sushi","tabla","tania","tapar","telon","tejer","terco","terso","texas","tiras","todas","tomar","tonos","tonta","torpe","talar","tarde","tenia","tocar","toser","traer","tunez","uñosa","urbes","urnas","vacas","vagas","veces","velas","vemos","verso","verde","vivir","votar","vasca","vasta","video","wikis","xolas","yates","yendo","yesca","yugos","zorra","zurdo","zarca","zegri","zejel","zocas");
    }
    
    public int getSize()
    {
        return Diccionario.size();
    }
    public String getPalabra(int n)
    {
     return Diccionario.get(n);
    }
}
