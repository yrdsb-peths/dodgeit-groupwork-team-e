import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Actor
{
    public void act()
    {
        checkCollision();
    }
    
    public void checkCollision()
    {
        Hero hero = (Hero) getOneIntersectingObject(Hero.class);
        
        if (hero != null) // if bomb hit hero
        {
            // show cry face
            GreenfootImage sadFace = new GreenfootImage("sad_face.png");  // upload image
            getWorld().getBackground().drawImage(sadFace, getX(), getY());

            getWorld().showText("You lose", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            
            Greenfoot.stop();
        }
    }
}
