import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Shots extends Actor
{
    /**
     * Act - do whatever the Shots wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(70);
        
        World w = getWorld();
        if (isAtEdge())
        {
            w.removeObject(this);
        }
        else
          if (isTouching(SpaceObject.class))
            removeTouching(SpaceObject.class);
           
    }
}
        
        
        
        
        

        
        
        

