import greenfoot.*;  

public class Food extends Actor
{
    public void addedToWorld(World Latar)
    {
        setGambar(10);
    }
    
    private void setGambar(int d)
    {
        GreenfootImage img = this.getImage();
        img.scale(30,30);
        this.setImage(img);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
