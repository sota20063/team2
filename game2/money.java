import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class money extends Actor
{
    /**
     * Act - do whatever the money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 50,50);
        int A = 0;
        int B = 360;
        int C = A + (int)(Math.random()*((B-A)+1));
        setRotation(C);
        move(5);// Add your action code here.
    }    
}
