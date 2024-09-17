import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bomb2 extends Actor
{
    int moveSpeed2 = 5;
    public void act2()
    {
        move(moveSpeed2);
        if(getX() >=600) {
            resetBomb2();
            moveSpeed2 += 0.25;
        }
//        if(isTouching(Hero.class)) {
//            getWorld().removeObject(this);
//        }
    }
    public void resetBomb2() {
        int num2 = Greenfoot.getRandomNumber(2);
        if(num2 == 0) {
            setLocation(0, 300);
        }else {
            setLocation(0, 100);
        }
        
    }
}
