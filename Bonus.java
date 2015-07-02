import greenfoot.*;

/**
 * Write a description of class Bonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonus extends Object
{
    
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
    }
    
    public void muevete(){
      int y=getY();
      int cX=Greenfoot.getRandomNumber(700);
       
      if(getY()<460)
      //    y++;
         
          move(1);
          
      if(isAtEdge())
         turn(Greenfoot.getRandomNumber(90));
      setLocation(getX(),getY());
       move(1);
    }
}
