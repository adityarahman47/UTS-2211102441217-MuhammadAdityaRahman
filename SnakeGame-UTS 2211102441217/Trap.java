import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trap extends Actor
{
    /**
     * Act - do whatever the Trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-8);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
    
    public Trap()
    {
        GreenfootImage img = this.getImage();
        img.scale(30,30);
        this.setImage(img);
    }
}