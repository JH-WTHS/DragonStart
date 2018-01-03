import java.awt.*;
/**
 * Write a description of class ScaledDragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScaledDragon extends Dragon
{
    // instance variables 
    private Color scaleColor;
    /**
     * Constructor for objects of class ScaledDragon
     */
    public ScaledDragon(int x,int y, int size, Color c, String n,Color sC)
    {
        // initialise instance variables
        super(x,y,size,c,n);
        scaleColor = sC;
    }

    /**
     * drawScales
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void drawScales(Graphics g)
    {
        g.setColor(scaleColor);
        for(int y = super.getBodyY(); y < super.getBodyY() + super.getBodyHeight() - 15; y +=14){
            for(int x = super.getBodyX(); x < super.getBodyX() + super.getBodyWidth() - 15; x += 14){
                g.drawLine(x, y, x+10, y+10);
            }
        }
     
    }
    public void drawDragon(Graphics g){
        super.drawDragon(g);
        drawScales(g);
    }
    
}
