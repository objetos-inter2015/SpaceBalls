import greenfoot.*;

/**
 * Write a description of class ShotEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotEnemy extends Ene
{
    /**
     * Act - do whatever the ShotEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){ 
        
       if(isAtEdge()||isTouching(Player.class))
          destruyete();
       muevete();
    } 
    
    public void destruyete(){      
        getWorld().removeObject(this);
    }  
      public void muevete(){
         move(-4);
    }
    
}
