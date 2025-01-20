
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Counter counter;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    

        super(600, 300, 1);
         counter = new Counter();
        addObject(counter,50,20);
        if(home.counter==1)
        {
            addObject( new musi_001(), 300, 200);
            addObject( new A(), 300, 220);
        }
        if(home.counter==2)
        {
            addObject( new musi_002(), 300, 200);
            addObject( new A2(), 300, 220);
        }
        if(home.counter==3)
        {
            addObject( new musi_003(), 300, 200);
            addObject( new A3(), 300, 220);
        }
        for(int i=0; i<5; i++){
           int A = 50;
           int B = 800;
           int x = A + (int)(Math.random()*((B-A)+1));
           A=0;
           B=450;
           int y = A + (int)(Math.random()*((B-A)+1));
           addObject(new money(), x,y);
        }
        for(int i=0;i<5;i++){


           int[] x = {50,200,300,400,500};
            int[] y = {50,250};
            
            
            int A = 0;
            int B = 4;
            int xx = A + (int)(Math.random()*((B-A)+1));
            A=0;
            B=1;
            int yy = A + (int)(Math.random()*((B-A)+1));
            
           addObject(new money(), x[xx],y[yy]);

          A = 0;
         B = 4;
         xx = A + (int)(Math.random()*((B-A)+1));

        A=0;
        B=1;
         yy = A + (int)(Math.random()*((B-A)+1));
         addObject(new heart(counter),x[xx],y[yy]);
        }
        
    }
    public Counter getCounter(){
         return counter;   
    }
}


