
package aulaombate07;
 public class Aulaombate07 {
   public static void main(String[] args) {
       Lutador l [] = new Lutador [6];
       l [0] = new Lutador("Cascata Boy", "Alemanha",33,1.77f,
       69.9f,11,2,1);
       l [1] = new Lutador ("Gagamel Z","Brasil",28,1.82f,
        58.8f,14,2,3); 
       l [2] = new Lutador ("Snapshado","EUA",35,1.68f,
       80.7f,14,0,3); 
       l [3] = new Lutador ("Draeed Cobdy","Australia",28,1.93f,
       81.6f,13,0,3); 
       l [4] = new Lutador ("UFOcobal","Brasil",37,1.81f,
       119.3f,5,4,3); 
       l [5] = new Lutador ("Nerdaarty","EUA",30,1.82f,
       105.7f,12,2,4); 
       
       Luta UEC01 = new Luta ();
       UEC01.marcarLuta(l[3],l[2]);
       UEC01.lutar();
       //l[3].status();
       //l[2].status();
       
    }
    
}
