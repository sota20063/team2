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

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 7207174e1589868633208809fc8cdb83018aada3
        getImage().scale( 50, 100 );

<<<<<<< HEAD
=======

>>>>>>> 5ceacb2d20ad3987123e5e59592b227a1808a124
>>>>>>> 3f33797ddb8af1e943fe6431dd249f55e9acd88a
>>>>>>> 7207174e1589868633208809fc8cdb83018aada3
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation( x,y-4 );
<<<<<<< HEAD
=======
<<<<<<< HEAD

 
=======
<<<<<<< HEAD
=======


>>>>>>> 5ceacb2d20ad3987123e5e59592b227a1808a124
>>>>>>> 3f33797ddb8af1e943fe6431dd249f55e9acd88a
>>>>>>> 7207174e1589868633208809fc8cdb83018aada3
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

