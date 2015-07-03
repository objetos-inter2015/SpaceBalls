import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Aircraft
{
    private int contadorCiclos;
    private int intervalo=10;
    private int puntos=0;
    private int eliminado=0;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
        muevete();
        dispara();
       
        
      //  if(isTouching(Asteroid.class))
          // getWorld().removeObject(this);
          if(puntos==1)
             puntos=0;
           if(isTouching(Bonus.class)){
            removeTouching(Bonus.class);
            puntos=1;;
        }
          
        if(eliminado==1)
           eliminado=0;
        if(isTouching(ShotEnemy.class)){
            removeTouching(ShotEnemy.class);
            eliminado=1;
        }
        if(isTouching(ShotEnemy3.class)){
            removeTouching(ShotEnemy3.class);
            eliminado=1;
        }
        if(isTouching(ShotEnemyF1.class)){
            removeTouching(ShotEnemyF1.class);
            eliminado=1;
        }
        if(isTouching(ShotF2.class)){
            removeTouching(ShotF2.class);
            eliminado=1;
        }
         if(isTouching(MisilEne.class)){
            removeTouching(MisilEne.class);
            eliminado=1;
        }
        if(isTouching(Asteroid.class))
           eliminado=1;
    }    
    
    public void dispara(){
        contadorCiclos++;
        
        if(Greenfoot.isKeyDown("space")&&contadorCiclos>intervalo){
           getWorld().addObject(new ShotPlayer(),getX(),getY());
         //  Greenfoot.playSound("sound1.mp3");
        }
       
        if(Greenfoot.isKeyDown("enter")&&contadorCiclos>intervalo)  
           getWorld().addObject(new Misil(),getX(),getY());
           
        if(intervalo+1==contadorCiclos)
           contadorCiclos=0;
    }
     public void muevete(){
        int y=getY();
        
        if(Greenfoot.isKeyDown("s")&&getX()<660)
           move(5);
      
        if(Greenfoot.isKeyDown("a")&&getX()>40)
           move(-5);
            
        if(Greenfoot.isKeyDown("w")&&getY()>30)
           setLocation(getX(),getY()-5);
    
        
        if(Greenfoot.isKeyDown("z")&&getY()<420)
           setLocation(getX(),getY()+5);
    }
    
    public int destruido(){ 
       return eliminado;
    }
    public int puntos(){
        return puntos;
    }
}
