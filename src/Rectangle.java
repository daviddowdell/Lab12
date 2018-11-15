import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen, David Dowdell
 * @version 2018-11-15
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        super(color, filled);
        super.location = new Point[4];
        int w = width / 2;
        int h = height / 2;
        location[0] = new Point(center.x-w, center.y-h);
        location[1] = new Point(center.x+w, center.y-h);
        location[2] = new Point(center.x+w, center.y+h);
        location[3] = new Point(center.x-w, center.y+h);
    }
}