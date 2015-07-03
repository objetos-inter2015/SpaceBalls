import greenfoot.*;

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemy
{ 
   private int contadorCiclos;
   private int intervalo;
   private int eliminado=10;
   private int band=0;
   private int band2=0;
   private int band3=0;
   private int contador=0;
   private int toc=0;
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      int band=0;
       muevete();
       dispara();
       imprime();
       if(toc==1)
          toc=0;
       if(eliminado==1){
         
          eliminado=0;
        }
      
      if(isTouching(ShotPlayer.class)){
          eliminado=1;
          removeTouching(ShotPlayer.class);
          getWorld().addObject(new Bonus(),getX(),getY());
      }
      if(isAtEdge())
         toc=1;
     }
    public int tocado(){
        return toc;
    }
    public void imprime(){
       String n="";
       n=String.valueOf(eliminado);
       getWorld().showText(n,600,15);
    }
       
   public void muevete(){
    
       move(-1);
    }
   public int dispara(){
       contadorCiclos=0;
       int band=0;
       intervalo=Greenfoot.getRandomNumber(50);
       if(contadorCiclos==intervalo){
          getWorld().addObject(new ShotEnemy3(),getX(),getY()-20);
          getWorld().addObject(new ShotEnemy3(),getX(),getY()+20);
          contadorCiclos=0;
          band=1;
       }
       return band;
    }
    public int destruido(){
       return eliminado;
   }     
}
