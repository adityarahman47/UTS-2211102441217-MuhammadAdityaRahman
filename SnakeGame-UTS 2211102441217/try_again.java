import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_mulai_lagi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class try_again extends Actor
{
    /**
     * Act - do whatever the tombol_mulai_lagi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),
        (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mousePressed(this)){
        Greenfoot.delay(0);
        Greenfoot.setWorld(new MyWorld());
        }
        
    }
    public try_again()
    {
    GreenfootImage img = this.getImage();
    img.scale(250,250);
    this.setImage(img);
    }
}
