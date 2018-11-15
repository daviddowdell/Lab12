
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        Point center = new Point (400,300);
        
        // Base head:
        Circle base = new Circle(center, 320, Color.ORANGE, true);
        
        
        
        // Ears:
        RightTriangle l1 = new RightTriangle(new Point(280, 200),
                50, -120, Color.LIGHT_GRAY, true);
        RightTriangle r1 = new RightTriangle(new Point(520, 200),
                -50, -120, Color.LIGHT_GRAY, true);
        RightTriangle l2 = new RightTriangle(new Point(290, 200),
                30, -80, Color.PINK, true);
        RightTriangle r2 = new RightTriangle(new Point(510, 200),
                -30, -80, Color.PINK, true);
        
        // Eyes:
        Oval erb = new Oval(new Point(340, 240), 25, 60, Color.BLACK, true);
        Oval elb = new Oval(new Point(460, 240), 25, 60, Color.BLACK, true);
        Oval erw = new Oval(new Point(340, 240), 35,70, Color.WHITE, true);
        Oval elw = new Oval(new Point(460, 240), 35,70, Color.WHITE, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(center, 40, Color.BLACK, true);
        
        //Mouth
        Point ctrTop = new Point (400, 350);
        Point left = new Point (300, 300);
        Point right = new Point (500, 300);
        PolyLine mouthL = new PolyLine(left, ctrTop, 50, Color.BLACK, true);
        PolyLine mouthR = new PolyLine(ctrTop, right, 50, Color.BLACK, true);
        
        
        
        // Collar:
        Point cp = new Point(400,450);
        Oval collar = new Oval(cp, 300, 30, Color.RED, true);
        Circle button = new Circle(cp, 60, Color.BLUE, true);
        Circle stitches = new Circle(cp, 40, Color.BLACK, false);
        
        // Square around the dog:
        Circle outline = new Circle(center, 580, Color.BLACK, false);
        Square box = new Square(center, 410, Color.MAGENTA, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outline);
        drawPanel.addShape(box);
        drawPanel.addShape(collar);
        drawPanel.addShape(button);
        drawPanel.addShape(stitches);
        drawPanel.addShape(nose);
        drawPanel.addShape(erw);
        drawPanel.addShape(elw); 
        drawPanel.addShape(erb);
        drawPanel.addShape(elb);
        drawPanel.addShape(l1);
        drawPanel.addShape(r1);
        drawPanel.addShape(l2);
        drawPanel.addShape(r2);
        drawPanel.addShape(mouthL);
        drawPanel.addShape(mouthR);
        
        
       
        // set background color
        drawPanel.setBackground(Color.WHITE);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
