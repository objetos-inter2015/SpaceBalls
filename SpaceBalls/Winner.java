import greenfoot.*;

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{

    /**
     * Constructor for objects of class Winner.
     * 
     */
    public Winner()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 450, 1); 
        
        
    }
    public void act (){
         if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Menu());
    }
}
