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


        getImage().scale( 50, 100 );


        getImage().scale( 50, 100 );

        
=======
        getImage().scale( 50, 100 );

        getImage().scale( 50, 100 );

        getImage().scale( 50, 100 );

        getImage().scale( 50, 100 );

>>>>>>> f3511e1b04601a9f1988f0256a4cd48577aed815
        int x = getX();
        int y = getY();
        
        
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation( x,y-4 );
<<<<<<< HEAD

=======
>>>>>>> f3511e1b04601a9f1988f0256a4cd48577aed815
        }
        if( Greenfoot.isKeyDown( "a" ) ){
            setLocation( x-4,y );
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            setLocation( x,y+4 );
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setLocation( x+4,y );
        }
    }    
}


