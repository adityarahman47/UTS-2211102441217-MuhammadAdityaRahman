import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{
//GreenfootSound music = new GreenfootSound("intro.wav");
    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start_button start_button = new start_button();
        addObject(start_button,151,251);
        start_button.setLocation(155,237);
        start_button.setLocation(155,247);
        start_button.setLocation(175,256);
        start_button.setLocation(155,252);
        start_button.setLocation(151,247);
    }
    
}
