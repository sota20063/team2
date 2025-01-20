import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heart extends Actor
{
    private Counter counter;
    /**
     * Act - do whatever the heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public heart(Counter counter)
    {
        this.counter = counter;
        getImage().scale( 50, 50);
    }
    public void act() 
    {
        Actor actor1 = getOneIntersectingObject( musi_001.class );
        Actor actor2 = getOneIntersectingObject( musi_002.class );
        Actor actor3 = getOneIntersectingObject( musi_003.class );
        
        
        getImage().scale( 100, 100 );
        int A = 0;
        int B = 360;
        int C = A + (int)(Math.random()*((B-A)+1));
 
        setRotation(C);
        move(6);
        

       
        if( isAtEdge() ){
            getWorld().removeObject( this );
       }
       if(getWorld() != null){
            int x = getX();
            int y = getY();
        if(isTouching(A.class)|| isTouching(A2.class) || isTouching(A3.class))
        {
            if(counter != null){
            counter.addValue(10);
            getWorld().removeObject(this);
            }
        }

       } 
       
       
        /**if( actor1 != null ){

        
        if( actor1 != null ){

            getWorld().removeObject( this );
        }      
       
        if( actor2 != null ){
            getWorld().removeObject( this );
        } 
        
        if( actor3 != null ){
            getWorld().removeObject( this );

        }**/ 
       
      }   
    

     } 
        



