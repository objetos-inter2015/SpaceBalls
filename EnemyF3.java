import greenfoot.*;

/**
 * Write a description of class EnemyF2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyF3 extends Enemy
{
    private int intervalo;
    private int intervalo2;
    private int contador=0;
    private int contador2=0;
    private int band=0;
    private int tocado=0;
    /**
     * Act - do whatever the EnemyF2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
        ataca();
       if(tocado==1)
          tocado=0;
       if(isTouching(Misil.class)){
          removeTouching(Misil.class);
          tocado=1;
        }
        
    }  
    
    public void ataca(){
       contador=0;
       intervalo=Greenfoot.getRandomNumber(80);
       intervalo2=Greenfoot.getRandomNumber(40);
     
       if(contador==intervalo){
          getWorld().addObject(new MisilEne(),getX()-20,getY()+35);
          contador=0;
       }
       
       if(contador2==intervalo2){
          getWorld().addObject(new ShotF2(),getX()-112,getY()+5);
          contador2=0;
        }
             
       if(contador2==intervalo2){
          getWorld().addObject(new ShotF2(),getX()-90,getY()+30);
          contador2=0;
        }
    }
    
    public void muevete(){
        int y=getY();
        if(isAtEdge())
           band=1;
        if(getY()<350&&band==0)
           y++;
        if(getY()>349)
            band=1;
      
        if(band==1)
           y--;
        if(getY()<100&&band==1)
           band=0;
         
        setLocation(590,y);
        move(1);
    }
    public int tocado(){
        return tocado;
    }
}
