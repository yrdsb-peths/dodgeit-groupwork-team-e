import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bomb extends Actor
{
    int moveSpeed = -5;
    public void act()
    {
        move(moveSpeed);
        if(getX() >= 590) {
            resetBomb2();
            moveSpeed += 0.25;
        }else if(getX() <= 0){
            resetBomb();
            moveSpeed -= 0.25;
        }
    }
    public void resetBomb() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(550, 100);
        }else {
            setLocation(550, 300);
        }
        
    }
    public void resetBomb2() {
        int num2 = Greenfoot.getRandomNumber(2);
        if(num2 == 0) {
            setLocation(50, 100);
        }else {
            setLocation(50, 300);
        }
        
    }
}