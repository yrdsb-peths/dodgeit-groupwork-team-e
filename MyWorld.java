import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(600, 400, 1); 
        bomb bomb = new bomb();
        addObject(bomb, 600, 100);
        bomb2 bomb2 = new bomb2();
        addObject(bomb2, 0, 100);
        Hero hero = new Hero();
        addObject(hero,300,100);
    }
}
