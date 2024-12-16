import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musi_003 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musi_003 extends Actor
{
    /**
     * Act - do whatever the musi_003 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 60, 100 );
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation( x,y-2 );
        }
        if( Greenfoot.isKeyDown( "a" ) ){
            setLocation( x-6,y );
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            setLocation( x,y+2 );
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setLocation( x+6,y );
        }
    }    
}
