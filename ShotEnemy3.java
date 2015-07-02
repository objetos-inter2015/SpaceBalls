import greenfoot.*;

/**
 * Write a description of class ShotEnemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotEnemy3 extends Ene
{
    /**
     * Act - do whatever the ShotEnemy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge()||isTouching(Player.class))
           destruyete();
        move(-15);
    } 
    
    public void destruyete(){      
        getWorld().removeObject(this);
    }  
}
