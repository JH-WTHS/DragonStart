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
    private int size;
    private Color c;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.GREEN; // INS comment here.
    }
    public Dragon(int x,int y, int size, Color c){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; // You saw nothing.
    }
        
    
    /**
     * Overloaded Constructors go here
     */

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
        g.fillRect(x+size * 25, y + size*25, size *60, size * 50); //Draw Body
        g.fillRect(x+size * 25, (y + size*25) + size * 50, size * 10, size * 50); //Draw Leg #1
        
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}
