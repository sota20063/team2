import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A2 extends Actor
{
    /**
     * Act - do whatever the A2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale( 10, 10 );
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation( x,y-6 );
        }
        if( Greenfoot.isKeyDown( "a" ) ){
            setLocation( x-2,y );
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            setLocation( x,y+6 );
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setLocation( x+2,y );
        }
    }    
}