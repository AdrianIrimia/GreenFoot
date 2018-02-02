import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SpaceObject extends Actor
{
    /**
     * Act - do whatever the SpaceObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-16);
        
        
        if (isAtEdge())
        {
           setLocation(700,getY());
        }
        
        if (isTouching(Shots.class))
        {
            getWorld().addObject(new SpaceObject(), 500,Greenfoot.getRandomNumber(400));
        }
        
    }    
    
}
