import greenfoot.*;

/**
 * Write a description of class MisilEne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MisilEne extends Ene
{
    /**
     * Act - do whatever the MisilEne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge())
           getWorld().removeObject(this);
        move(-4);
    }    
}
