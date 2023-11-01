import greenfoot.*;

public class Head extends Ular
{    
    public void addUlar()
    {
        
    }
    
    public void act() 
    {
        Actor actor=getOneIntersectingObject(Ular.class);
        if(actor!=null){
            Greenfoot.setWorld(new game_over());
            return;
        }
        
        actor=getOneIntersectingObject(Food.class);
        if(actor!=null){
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).setScore(1);
            Ular.ADDEKOR=true;
            ((MyWorld)getWorld()).addFood();
        }
        
        actor=getOneIntersectingObject(Trap.class);
        if(actor!=null){
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).setScore(-1);
            Ular.ADDEKOR=false;
            
        }
        
        if(Greenfoot.isKeyDown("up") && arahy!=1){
            arahx=0;
            arahy=-1;
        }else if(Greenfoot.isKeyDown("down") && arahy!=-1){
            arahx=0;
            arahy=1;
        }else if(Greenfoot.isKeyDown("right") && arahx!=-1){
            arahx=1;
            arahy=0;
        }else if(Greenfoot.isKeyDown("left") && arahx!=1){
            arahx=-1;
            arahy=0;
        }
        super.act();
    }    
}
