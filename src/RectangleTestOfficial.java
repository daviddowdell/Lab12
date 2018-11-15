import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author David Dowdell
 * @version 2018-11-15
 * Lab 11
 */
public class RectangleTestOfficial
{
    private static Rectangle pl1 = new Rectangle(new Point(125, 125), 50, 50, Color.BLACK, true);
    private static Point pl1UL = new Point(100, 100);
    private static Point pl1LL = new Point(100, 150);
    private static Point pl1UR = new Point(150, 100);
    private static Point pl1LR = new Point(150, 150);
    private static Rectangle pl2 = new Rectangle(new Point(100, 100), -40,-20, Color.CYAN, false);
    private static Point pl2UL = new Point(120, 110);
    private static Point pl2LL = new Point(120, 90);
    private static Point pl2UR = new Point(80, 110);
    private static Point pl2LR = new Point(80, 90);

    /**
     * rectangle construction
     */
    @Test
    public void testRectangleConstructorPointsArrayLength()
    {
        Point[] pts = pl1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    /**
     * plectangle construction: points
     */
    @Test
    public void testRectangleConstructorCalculatedPoints()
    {
        Point[] pts1 = pl1.getLocation();
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LR));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UR));
        
        Point[] pts2 = pl2.getLocation();
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LR));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UR));
    }
    
    /**
     * Unfilled constructor
     */
    @Test
    public void testRectangleConstructorUnfilled()
    {
        Assert.assertFalse("Rectangle fill incorrect.", pl2.isFilled());
    }
    
    /**
     * Filled constructor
     */
    @Test
    public void testRectangleConstructorFilled()
    {
        Assert.assertTrue("Rectangle fill incorrect.", pl1.isFilled());
    }
    
    /**
     * Color constructor
     */
    @Test
    public void testRectangleConstructorColor()
    {
        Color clr1 = pl1.getColor();
        Color clr2 = pl2.getColor();
        Assert.assertEquals("Rectangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Rectangle color incorrect.", Color.CYAN, clr2);
    }
}
