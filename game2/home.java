import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends World
{
    static public int counter = 0;
public void act()
{
    if( Greenfoot.isKeyDown( "1" ) ){
        counter = 1;
        World game = new MyWorld();
        Greenfoot.setWorld( game );
    }
    if( Greenfoot.isKeyDown( "2" ) ){
        counter = 2;
        World game = new MyWorld();
        Greenfoot.setWorld( game );
    }
    if( Greenfoot.isKeyDown( "3" ) ){
        counter = 3;
        World game = new MyWorld();
        Greenfoot.setWorld( game );
    }
}
    /**
     * Constructor for objects of class home.
     * 
     */
    public home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText( "press to 1 or 2 or 3", 100, 50 );
    }
}

