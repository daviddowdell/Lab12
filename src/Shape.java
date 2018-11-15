import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
/**
 * This class maintains information for drawing a shape
 * @author David Dowdell
 * @version 2018-11-15
 * Lab 11
 */
public abstract class Shape implements Drawable
{
    /**
     * The location of the shape
     */
    protected Point[] location;
    
    /**
     * The color of the shape
     */
    private Color color;
    
    /**
     * Wheter the color fills the shape or just the outline
     */
    private boolean filled;
    /**
     * Constructor for the shape class
     * @param color  its color
     * @param filled  whether it's filled or just an outline
     */
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * Returns the color
     * @return the color
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * Tells whether is filled
     * @return true if filled, false elsewise
     */
    public boolean isFilled()
    {
        return filled;
    }
    
    /**
     * Tells the location
     * @return point array of the location
     */
    public Point[] getLocation()
    {
        return location;
    }

    

}
