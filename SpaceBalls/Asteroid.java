import greenfoot.*;

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Object
{
    private int band=0;
    private int contador=0;
    private int intervalo=(20);
    
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        muevete();
    }
    
    public void muevete(){
      int y=getY();
      int cX=Greenfoot.getRandomNumber(700);
      contador++;
          
      if(getY()>30&&band==0)
         y++;
    
      if(getY()<=30){
         band=1;
      }
      if(band==1)
         y--;
      if(getY()==100){
         band=0;
      } 
      setLocation(getX(),y);
        
      if(isAtEdge()){
         getWorld().addObject(new Asteroid(),Greenfoot.getRandomNumber(660)+50,50);
         getWorld().removeObject(this);
        
        }
      move(-1);
    } 
}
