import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musi_002 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musi_002 extends Actor
{
    /**
     * Act - do whatever the musi_002 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("w")) 
        {
            setRotation(270);
            move(6);
        }
        if (Greenfoot.isKeyDown( "a" ))
        {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown( "s"))
        {
            setRotation(90);
            move(6);
        }
        if (Greenfoot.isKeyDown( "d")) 
        {
            setRotation(0);
            move(4);
        }// Add your action code// Add your action code here.
    }    
}
