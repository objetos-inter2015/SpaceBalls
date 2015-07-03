import greenfoot.*;

/**
 * Write a description of class ShotEnemyF1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotEnemyF1 extends Ene
{
    /**
     * Act - do whatever the ShotEnemyF1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-3);
        if(isAtEdge())
           getWorld().removeObject(this);
    }    
}
