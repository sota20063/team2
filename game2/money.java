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
        Actor actor1 = getOneIntersectingObject( musi_001.class );
        Actor actor2 = getOneIntersectingObject( musi_002.class );
        Actor actor3 = getOneIntersectingObject( musi_003.class );
        getImage().scale( 50,50);
        int A = 0;
        int B = 360;
        int C = A + (int)(Math.random()*((B-A)+1));
        setRotation(C);
        move(5);// Add your action code here.
        if(isTouching(A.class)|| isTouching(A2.class) || isTouching(A3.class))
        {
            getWorld().showText( "game over ", 300, 250 );
            Greenfoot.stop();
        }
    }    
}
