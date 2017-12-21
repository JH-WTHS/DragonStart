import java.awt.*;
/**
 * Write a description of class Scene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene
{
    // instance variables - replace the example below with your own
    private int x;
    private int width;
    private int height;
    private Color horizonColor;
    private Color groundColor;
    private Color sunColor;
    
    

    /**
     * Constructor for objects of class Scene
     */
    
    /**
     * Basic Constructor which initializes
     *              horizonColor -> Color.CYAN
     *              groundColor  -> Color.GREEN
     *              sunColor     -> Color.YELLOW
     *
     * @param  width  desired width of Scene
     * @param  height desired height of Scene
     * @return    none
     */
    public Scene(int width, int height)
    {
        this.width = width;
        this.height = height;
        horizonColor = Color.CYAN;
        groundColor = Color.GREEN;
        sunColor = Color.YELLOW;
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Overloaded Constructor which initializes
     *              horizonColor -> Color.CYAN
     *              groundColor  -> Color.GREEN
     *              sunColor     -> Color.YELLOW
     *
     * @param  width  desired width of Scene
     * @param  height desired height of Scene
     * @param  hC     horizonColor
     * @param  gC     groundColor
     * @param  sC     sunColor
     * @return    none
     */
    public Scene(int width, int height, Color hC, Color gC, Color sC)
    {
        this.width = width;
        this.height = height;
        horizonColor = hC;
        groundColor = gC;
        sunColor = sC;
    }

    /**
     * Draw scene filling in the entire width and height with
     * 3 parts: Horizon, Ground and Sun using default or specified colors
     *
     * @param  g  Graphics object
     * @return    none
     */
    /*public void drawScene(Graphics g)
    {
        g.setColor(
    }*/
}
