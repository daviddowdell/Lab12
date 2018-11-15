
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author David Dowdell
 * @version 2018-11-15
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    private static RightTriangle pl1 = new RightTriangle(new Point(100, 100), 50, -50, Color.BLACK, true);
    private static Point pl1UL = new Point(100, 50);
    private static Point pl1LL = new Point(100, 100);
    private static Point pl1UR = new Point(150, 100);
    private static Point pl1LR = new Point(150, 100);
    private static RightTriangle pl2 = new RightTriangle(new Point(100, 100), -25, 25, Color.CYAN, false);
    private static Point pl2UL = new Point(100, 125);
    private static Point pl2LL = new Point(100, 100);
    private static Point pl2UR = new Point(75, 100);
    private static Point pl2LR = new Point(75, 100);

    /**
     * plectangle construction
     */
    @Test
    public void testRightTriangleConstructorPointsArrayLength()
    {
        Point[] pts = pl1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    /**
     * plectangle construction: points
     */
    @Test
    public void testRightTriangleConstructorCalculatedPoints()
    {
        Point[] pts1 = pl1.getLocation();
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UL));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LL));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LR));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UR));
        
        Point[] pts2 = pl2.getLocation();
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UL));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LL));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LR));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the base line "
                + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UR));
    }
    
    /**
     * Unfilled constructor
     */
    @Test
    public void testRightTriangleConstructorUnfilled()
    {
        Assert.assertFalse("RightTriangle fill incorrect.", pl2.isFilled());
    }
    
    /**
     * Filled constructor
     */
    @Test
    public void testRightTriangleConstructorFilled()
    {
        Assert.assertTrue("RightTriangle fill incorrect.", pl1.isFilled());
    }
    
    /**
     * Color constructor
     */
    @Test
    public void testRightTriangleConstructorColor()
    {
        Color clr1 = pl1.getColor();
        Color clr2 = pl2.getColor();
        Assert.assertEquals("RightTriangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("RightTriangle color incorrect.", Color.CYAN, clr2);
    }
}
