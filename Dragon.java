import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int bodyX;
    private int bodyY;
    private int bodyWidth;
    private int bodyHeight;
    private int size;
    private Color c;
    private int health;
    private String name;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        //Hi my name is jen
        this(50, 50, 1, Color.GREEN, "Unnamed");
        /*x = 50;
        y = 50;
        size = 1;
        c = Color.GREEN; // INS comment here.
        health = 35;
        name = "Unnamed";*/
    }
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int x,int y, int size, Color c, String n){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; // You saw nothing.
        health = 50;
        name = n;
        bodyX = x + size * 25;
        bodyY = y + size * 25;
        bodyWidth = size * 60;
        bodyHeight = size * 50;
    }
        
    
    
    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c); // Watermelon Dragon.
        g.fillRect(x, y , size * 25, size * 25); //Draw Head
        g.fillRect(bodyX, bodyY, bodyWidth, bodyHeight); //Draw Body
        g.fillRect(x+size * 25, (y + size*25) + size * 50, size * 10, size * 50); //Draw Leg #1
        g.fillRect(x+size * 25+ size*60-size*10, (y + size*25) + size * 50, size * 10, size * 50); //Draw Leg #2//Draw Health bar
        /*if(health > 30)
        {
            g.setColor(Color.YELLOW);
            g.fillRect(x, y - 50, size * 60, size*50/6);
        }*/
        
    }
    
    public int getBodyX(){
        return bodyX;
    }
    
    public int getBodyY(){
        return bodyY;
    }
    
    public int getBodyWidth(){
        return bodyWidth;
    }
    public int getBodyHeight(){
        return bodyHeight;
    }
    public void dragonSpeak(String words, Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x-60, y, 50,50);
        g.setColor(Color.WHITE);
        g.drawString(words, x - 50, y + 25);
        
    }
    public void dragonSayHello(Graphics g) {
       // g.setColor(Color.BLUE);
       //g.fillOval(x-80, y, 80,40);
        g.setColor(Color.BLACK);
        g.drawString("Hello, I am " + name, x +25, y);
        
    }
    /**
     * Mutator Methods
     */
    public void changeColor(Color c){
        this.c = c;
    }
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}
