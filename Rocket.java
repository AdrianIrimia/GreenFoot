import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover();
        shooter();
        dead();
    }  
    public void mover() {
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY() -50);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY() +50);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX() - 50,getY());
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX() + 50,getY());
        }
    }
    
    public void shooter() {
    World w = getWorld();
    if (Greenfoot.isKeyDown("space"))
        {
            w.addObject(new Shots(),getX()+60, getY());
        }
    
    }
    
    public void dead()
    {
        World w = getWorld();
        if (isTouching(SpaceObject.class))
        {
            w.removeObject(this);
        }
    
    }
}
    
        
        
        
    

