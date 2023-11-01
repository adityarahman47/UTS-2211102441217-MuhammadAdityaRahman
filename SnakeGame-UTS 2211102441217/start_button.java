import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start_button extends Actor
{
    /**
     * Act - do whatever the tombol_mulai wants to do. This method is called whenever
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
    
    public start_button()
    {
    GreenfootImage img = this.getImage();
    img.scale(300,300);
    this.setImage(img);
    }
}
