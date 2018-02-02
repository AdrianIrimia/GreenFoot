import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,89,180);
        SpaceObject spaceobject = new SpaceObject();
        addObject(spaceobject,540,125);
        SpaceObject spaceobject2 = new SpaceObject();
        addObject(spaceobject2,564,213);
        SpaceObject spaceobject3 = new SpaceObject();
        addObject(spaceobject3,544,330);
        SpaceObject spaceobject4 = new SpaceObject();
        addObject(spaceobject4,489,62);
        SpaceObject spaceobject5 = new SpaceObject();
        addObject(spaceobject5,470,255);
        Shots shots = new Shots();
        addObject(shots,286,167);
        removeObject(shots);
        SpaceObject spaceobject6 = new SpaceObject();
        addObject(spaceobject6,481,161);
        SpaceObject spaceobject7 = new SpaceObject();
        addObject(spaceobject7,577,65);
        SpaceObject spaceobject8 = new SpaceObject();
        addObject(spaceobject8,538,272);
        SpaceObject spaceobject9 = new SpaceObject();
        addObject(spaceobject9,491,341);
        SpaceObject spaceobject10 = new SpaceObject();
        addObject(spaceobject10,463,55);
        SpaceObject spaceobject11 = new SpaceObject();
        addObject(spaceobject11,531,211);
        SpaceObject spaceobject12 = new SpaceObject();
        addObject(spaceobject12,451,344);
        SpaceObject spaceobject13 = new SpaceObject();
        addObject(spaceobject13,583,341);
        SpaceObject spaceobject14 = new SpaceObject();
        addObject(spaceobject14,580,151);
        SpaceObject spaceobject15 = new SpaceObject();
        addObject(spaceobject15,514,133);
        SpaceObject spaceobject16 = new SpaceObject();
        addObject(spaceobject16,538,54);
        SpaceObject spaceobject17 = new SpaceObject();
        addObject(spaceobject17,448,152);
        SpaceObject spaceobject18 = new SpaceObject();
        addObject(spaceobject18,453,225);
        spaceobject5.setLocation(490,257);
        spaceobject18.setLocation(457,258);
        spaceobject18.setLocation(450,226);
        spaceobject17.setLocation(448,129);
        spaceobject10.setLocation(458,42);
    }
}
