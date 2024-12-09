import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musi_001 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musi_001 extends Actor
{
    /**
     * Act - do whatever the musi_001 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation( x,y-4 );
=======

        if(Greenfoot.isKeyDown("w")) 
        {
            setRotation(270);
            move(4);
>>>>>>> 8d575da3d1a0475cec9cebe8ee231ad44345c69e
        }
        if( Greenfoot.isKeyDown( "a" ) ){
            setLocation( x-4,y );
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            setLocation( x,y+4 );
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setLocation( x+4,y );
        }// Add your action code here.

    }    
}
