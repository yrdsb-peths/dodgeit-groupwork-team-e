import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(600, 400, 1); 
        bomb b1 = new bomb();
        addObject(b1, 600, 100);
        
        bomb b2 = new bomb();
        b2.moveSpeed = 5;
        addObject(b2, 0, 100);
        Hero hero = new Hero();
        addObject(hero,300,100);
    }
}
