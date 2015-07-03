import greenfoot.*;

/**
 * Write a description of class WorldSpace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldSpace3 extends Mundo
{
       private int dead=0;
       private int dead2=0;
       private int dead3=0;
       private int deadP=20;
       private int bf1=0;
       private int bandf=0;
       private int puntos=200;
       Player navePlayer=new Player();
       Enemy1 naveEnemy1=new Enemy1();
       Enemy2 naveEnemy2=new Enemy2();
       Enemy3 naveEnemy3=new Enemy3();
       Bonus b=new Bonus();
       Asteroid aster=new Asteroid();
       Asteroid aster1=new Asteroid();
       Asteroid aster2=new Asteroid();
       Asteroid aster3=new Asteroid();
       Asteroid aster4=new Asteroid();
       EnemyF3 eF3=new EnemyF3();
      
    /**
     * Constructor for objects of class WorldSpace.
     * 
     */
    public WorldSpace3()
    {    
      
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      
       //*addObject(aster,660,50);
       //addObject(aster1,300,50);
       addObject(aster2,550,420);
       addObject(aster3,300,420);
       addObject(aster4,450,300);
       addObject(navePlayer,100,250);
       addObject(naveEnemy1,650,150);
       addObject(naveEnemy2,650,350);
       addObject(naveEnemy3,650,250);
    
       showText("Puntos:",100,15);
       showText("Vidas:",200,15);
       showText("Eliminados:",320,15);
       showText("Nivel: 3",450,15);
    }
  
    public void act(){
      
       //int f1=dead+dead2;
       int f1=10;
       imprime();
       if(puntos()==1)
          puntos+=10;
       if(eliminado()==1&&dead<5){
           dead++;
           create();
        }
       if(eliminado2()==1&&dead2<5){
           dead2++;
           create2();
        }
       if(eliminado3()==1&&dead3<5){
           dead3++;
           create3();
        }
       if(eliminadoPlayer()==1&&deadP>1){
           deadP--;
           createPlayer();
        }
       if(deadP==1){
          Greenfoot.setWorld(new GameOver());
       }
       if(bf1==5){
          removeObject(eF3); 
          bandf=1;
        }
       if(f1==10&&bandf==0)
          addObject(eF3,600,250);
       
       if(tocadoF3()==1)
          bf1++;
       if(bandf==1)
          Greenfoot.setWorld(new Winner());
    }
    
    public int eliminado(){
        int band=0;
        int d=naveEnemy1.destruido();
        int t=naveEnemy1.tocado();
        dead-=t;
        if(d==1||t==1){
           band=1;
           removeObject(naveEnemy1); 
        }
        return band;
    }
    public int eliminado2(){
        int band=0;
        int d=naveEnemy2.destruido();
        int t=naveEnemy2.tocado();
        dead-=t;
        if(d==1||t==1){
           band=1;
           removeObject(naveEnemy2); 
        }
        return band;
    }
     public int eliminado3(){
        int band=0;
        int d=naveEnemy3.destruido();
        int t=naveEnemy3.tocado();
        dead-=t;
        if(d==1||t==1){
           band=1;
           removeObject(naveEnemy3); 
        }
        return band;
    }
    public void create(){
        int y=Greenfoot.getRandomNumber(400)+50;
        addObject(naveEnemy1,650,y);
    }
     public void create2(){
        int y=Greenfoot.getRandomNumber(400)+50;
        addObject(naveEnemy2,650,y);
    }
    public void create3(){
        int y=Greenfoot.getRandomNumber(400)+50;
        addObject(naveEnemy3,650,y);
    }
    
    public int eliminadoPlayer(){
        int band=0;
        int p=navePlayer.destruido();
        
        if(p==1){
            band=1;
            removeObject(navePlayer);
        }
       return band;
    }
    public void createPlayer(){
        int y=Greenfoot.getRandomNumber(400)+50;
        addObject(navePlayer,50,y);
    }
    public int tocadoF3(){
        int band=0;
        int f1=eF3.tocado();
        if(f1==1)
           band=1;
        return band;
    }
    public int nivel(){
        return bandf;
    }
    public int puntos(){
        int p=navePlayer.puntos();
        int band=0;
        if(p==1)
           band=1;
        return band;
           
    }
    public void imprime(){
       String s="",v="",p="";
       s=String.valueOf(dead+dead2);
       showText(s,380,15);
       v=String.valueOf(deadP);
       showText(v,240,15);
       String f="";
       f=String.valueOf(bf1);
       showText(f,600,15);
       p=String.valueOf(puntos);
       showText(p,150,15);
    }
 
}
