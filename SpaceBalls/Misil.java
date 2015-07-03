import greenfoot.*;

/**
 * Write a description of class Misil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misil extends Play
{
    /**
     * Act - do whatever the Misil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(EnemyF1.class)||isAtEdge())
           getWorld().removeObject(this);
        move(3);
    }    
}
