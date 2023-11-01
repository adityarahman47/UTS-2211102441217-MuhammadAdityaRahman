import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_over extends World
{

    /**
     * Constructor for objects of class game_over.
     * 
     */
    public game_over()
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
        try_again try_again = new try_again();
        addObject(try_again,159,232);
        try_again.setLocation(161,224);
        try_again.setLocation(161,239);
        try_again.setLocation(144,243);
        try_again.setLocation(162,236);
        try_again.setLocation(161,236);
        try_again.setLocation(167,245);
        try_again.setLocation(135,216);
        try_again.setLocation(185,228);
        try_again.setLocation(160,204);
        try_again.setLocation(148,247);

        try_again.setLocation(159,146);
    
        
        try_again.setLocation(162,177);
        try_again.setLocation(148,247);

        try_again.setLocation(163,185);
        try_again.setLocation(148,247);
        showText("Klik Untuk Memulai Ulang" , 150, 300);
    }
    
}
