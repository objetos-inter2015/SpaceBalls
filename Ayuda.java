import greenfoot.*;

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{

    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 450, 1); 
    }
    public void act (){
         if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Menu());
    }
}
