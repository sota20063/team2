import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heart extends Actor
{
    /**
     * Act - do whatever the heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        
        /*削除のプログラム部分でnullpointerが出で来るので3回目のスプリントで追加する
        if( isAtEdge() ){
            getWorld().removeObject( this );
        }
        s
        if( actor1 != null ){
            getWorld().removeObject( this );
        }      
       
        if( actor2 != null ){
            getWorld().removeObject( this );
        } 
        
        if( actor3 != null ){
            getWorld().removeObject( this );
        } 
        */
        
        
        
        
        // Add your action code here.
    }   

}


