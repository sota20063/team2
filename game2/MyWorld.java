
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    

        super(600, 300, 1);
        if(home.counter==1)
        {
            addObject( new musi_001(), 300, 200); 
        }
        if(home.counter==2)
        {
            addObject( new musi_002(), 300, 200); 
        }
        if(home.counter==3)
        {
            addObject( new musi_003(), 300, 200); 
        }

        
        for(int i=0;i<5;i++){
           int A = 50;
           int B = 800;
           int x = A + (int)(Math.random()*((B-A)+1));
           A=0;
           B=450;
           int y = A + (int)(Math.random()*((B-A)+1));
           addObject(new money(), x,y);
        }

        for(int i=0;i<5;i++){
            int A = 50;
            int B = 800;
            int x = A + (int)(Math.random()*((B-A)+1));
            A=0;
            B=450;
            int y = A + (int)(Math.random()*((B-A)+1));
            addObject(new heart(), x,y);
        }
    }
    
}
