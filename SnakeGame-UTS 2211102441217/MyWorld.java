import greenfoot.*; 

public class MyWorld extends World
{
    public boolean GAMEOVER=false;
    private int mscore=0;
    private Score score;
    public MyWorld()
    {    
        super(600, 400, 1,false); 

        //addObject(new PapanNama(),170,(int)(getHeight()-50));

        Head head=new Head();
        addObject(head,100,200);

        Ular ular=new Ular();
        addObject(ular,head.getX()-Ular.delta,head.getY());
        ular.ular= head;

        addFood();
        //addTrap();

        score=new Score();
        score.setScore(mscore);
        addObject(score,getWidth()-50,25);
        prepare();
    }

    public void addFood()
    {
        addObject(new Food(),Greenfoot.getRandomNumber(getWidth()/Ular.delta)
        *Ular.delta,Greenfoot.getRandomNumber(getHeight()/Ular.delta)*Ular.delta);
    }
    
    public void act() {
    if (!GAMEOVER) {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Trap(), getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));
            Greenfoot.delay(2);
        }
    }   
    }


    public void setScore(int a)
    {
        mscore+=a;
        score.setScore(mscore);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
