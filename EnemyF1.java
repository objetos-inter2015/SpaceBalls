import greenfoot.*;

/**
 * Write a description of class EnemyF1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyF1 extends Enemy
{
    private int intervalo;
    private int contador=0;
    private int band=0;
    private int tocado=0;
    /**
     * Act - do whatever the EnemyF1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       muevete();
       ataca();
       if(tocado==1)
          tocado=0;
       if(isTouching(Misil.class))
          tocado=1;
    }  
    
    public void ataca(){
       contador=0;
       intervalo=Greenfoot.getRandomNumber(60);
       if(contador==intervalo){
          getWorld().addObject(new ShotEnemyF1(),getX(),getY()-50);
          contador=0;
       }
    }
    
    public void muevete(){
        int y=getY();
        if(isAtEdge())
           band=1;
        if(getY()<340&&band==0)
           y++;
        if(getY()>339)
            band=1;
      
        if(band==1)
           y--;
        if(getY()<120&&band==1)
           band=0;
         
        setLocation(600,y);
        move(1);
    }
    
    public int tocado(){
        return tocado;
    }
}
