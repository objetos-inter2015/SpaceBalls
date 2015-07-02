import greenfoot.*;

/**
 * Write a description of class ShotPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotPlayer extends Play
{
    /**
     * Act - do whatever the ShotPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
      if(isAtEdge()||isTouching(Enemy1.class)||isTouching(Enemy2.class))
         destruyete();
      muevete();
    }  
    
    public void muevete(){
        move(3);
    }
    
    public void destruyete(){
        getWorld().removeObject(this);
    }
    
}    
