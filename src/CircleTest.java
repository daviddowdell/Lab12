import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Test;
/**
 * Test cases for the Circle
 * 
 * @author David Dowdell
 * @version 2018-11-15
 * Lab 11
 */
public class CircleTest
{

    @Test
    public final void testCircle()
    {
        Point p = new Point(100,100);
        Circle c = new Circle(p, 100, Color.BLACK, true);
        assertEquals(100, c.getDiameter(), 0.001);
    }

    @Test
    public final void testGetDiameter()
    {
        Point p = new Point(100,100);
        Circle c = new Circle(p, 100, Color.BLACK, true);
        assertEquals(100, c.getDiameter(), 0.001);
    }

}
