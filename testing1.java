import static org.junit.Assert.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;


import org.junit.Test;

public class testing1 {
	 PaintPanel pp = new PaintPanel();

	@Test // checks to see if our demo object is not null
	public void test1() {
		PaintDemo pd = new PaintDemo();
		pd.main(null);
		assertNotNull(pp);
	}
	
	@Test // check oval button is pressed
	public void test2() {
        Panel theApplet = new PaintDemo();
        
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
    
        // window.getContentPane()-- gets paint demo 
        // window.getContentPane().getComponent(i)-- will return either the button panel or paint panel depending on whether i = 0 or i = 1
        // window.getContentPane().getComponent(0).getAccessibleContext()-- gives us access to shape panel and  color panel 
        // window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(i)-- returns shape panel or color panel depending on value of i 
        // window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(i)-- returns (red, green, blue) or (oval, rectangle, line) depending on what panel was chosen 
        // System.out.println(window.getContentPane().getClass());
        
     // get the oval button
        JRadioButton myButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        //click oval button
        myButton.doClick();
        // assert that our oval button was selected 
        assertTrue(myButton.isSelected());
        
	}
	
	@Test // check recatngle button is pressed
	public void test3() {
        Panel theApplet = new PaintDemo();
        
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get rectangle button 
        JRadioButton myButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(1);
        // click rectangle button
        myButton.doClick();
        // assert that our rectangle vutton was selected 
        assertTrue(myButton.isSelected());
        
	}
	
	@Test // check line button is pressed
	public void test4() {
        Panel theApplet = new PaintDemo();
        
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get line button 
        JRadioButton myButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(2);
        // click line button
        myButton.doClick();
        // assert that line shape was chosen
        assertTrue(myButton.isSelected());
        
	}
	
	@Test // check red button is pressed
	public void test5() {
        Panel theApplet = new PaintDemo();
        
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get red color button 
        JRadioButton myButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(0);
        // click red color button
        myButton.doClick();
        // assert that red button was selected
        assertTrue(myButton.isSelected());
        
	}
	
	@Test // check green button is pressed
	public void test6() {
        Panel theApplet = new PaintDemo();
        
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get green color button 
        JRadioButton myButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click green color button
        myButton.doClick();
        assertTrue(myButton.isSelected());
        
	}
	
	@Test // check blue button is pressed
	public void test7() {
        Panel theApplet = new PaintDemo();
        
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get blue color button 
        JRadioButton myButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(2);
        // click blue color button
        myButton.doClick();
        assertTrue(myButton.isSelected());
        
	}
	
	@Test // check if pixel is correct color
	public void test8() throws AWTException {
        Panel theApplet = new PaintDemo();
        Robot robot = new Robot();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get blue color button 
        JRadioButton blueButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(2);
        // click blue color button
        blueButton.doClick();
        // get rectangle button
        JRadioButton recButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(1);
        // click rectangle button
        recButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        // create mouse at position 10, 10
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 10, 10, 0, false);
        // click on paint panel to begin drawing 
		test.mousePressed(myMouse);
		
		// move our mouse coordinates
		myMouse.translatePoint(50, 50);
		
		// drag our mouse 
		test.mouseDragged(myMouse);
		//System.out.println(test.isPaintingTile());
		
		// release the mouse button
		test.mouseReleased(myMouse);
		
		//make image that will hold a picture of what we've drawn on the canvas 
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		
		// Now we paint the image with the contents of our canvas
		test.paint(g2);
		//System.out.println(image.);
		
		// get the color at coordinate 10, 10
		Color c = new Color(image.getRGB(10, 10));
		System.out.println(c);
		
		// assert that the point in the image is blue
		assertEquals(c, Color.BLUE);
        
	}
	
	@Test // check if pixel is correct color
	public void test9(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get blue color button 
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click blue color button
        greenButton.doClick();
        // get rectangle button
        JRadioButton recButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(1);
        // click rectangle button
        recButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 25, 25, 0, false);
		test.mousePressed(myMouse);
		myMouse.translatePoint(125, 125);
		test.mouseDragged(myMouse);
		//System.out.println(test.isPaintingTile());
		test.mouseReleased(myMouse);
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		test.paint(g2);
		//System.out.println(image.);
		Color c = new Color(image.getRGB(47, 39));
		
		Color expected = Color.GREEN;
		System.out.println(c);
		assertEquals(c, expected);
        
	}
	
	@Test // check if pixel is correct color
	public void test10(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get blue color button 
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click blue color button
        greenButton.doClick();
        // get rectangle button
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        // click rectangle button
        ovalButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 1, 1, 0, false);
		test.mousePressed(myMouse);
		myMouse.translatePoint(200, 125);
		test.mouseDragged(myMouse);
		//System.out.println(test.isPaintingTile());
		test.mouseReleased(myMouse);
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		test.paint(g2);
		//System.out.println(image.);
		Color c = new Color(image.getRGB(28, 100));
		//System.out.println(c);
		
		assertEquals(c, Color.GREEN);
        
	}
	
	
	@Test // check if pixel is correct color
	public void test11(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get blue color button 
        JRadioButton redButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(0);
        // click blue color button
        redButton.doClick();
        // get rectangle button
        JRadioButton lineButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(2);
        // click rectangle button
        lineButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 20, 20, 0, false);
		test.mousePressed(myMouse);
		myMouse.translatePoint(0, 125);
		test.mouseDragged(myMouse);
		//System.out.println(test.isPaintingTile());
		test.mouseReleased(myMouse);
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		test.paint(g2);
		//System.out.println(image.);
		Color c = new Color(image.getRGB(20, 20));
		//System.out.println(c);
		
		Color expected = Color.RED;
		assertEquals(c, expected);
	
        
	}
	
	
	@Test // try to unselect all color buttons
	public void test12(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
 
        JRadioButton redButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(0);
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        JRadioButton blueButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(2);
  
        redButton.setSelected(false);
        redButton.setEnabled(false);
        System.out.println(redButton.isSelected());
        greenButton.setSelected(false);
        greenButton.setEnabled(false);
        System.out.println(greenButton.isSelected());
        blueButton.setSelected(false);
        blueButton.setEnabled(false);
        assertFalse(greenButton.isSelected());
        assertFalse(blueButton.isSelected());
        assertFalse(redButton.isSelected());
       
	}
	
	
	@Test // try to unselect all shape buttons
	public void test13(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        
        JRadioButton redButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(0);
        redButton.doClick();
        
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        JRadioButton recButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(1);
        JRadioButton lineButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(2);
        
        ovalButton.setSelected(false);
        ovalButton.setEnabled(false);
        recButton.setSelected(false);
        recButton.setEnabled(false);
        lineButton.setSelected(false);
        lineButton.setEnabled(false);
        
        
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 1, 1, 0, false);
		test.mousePressed(myMouse);
		myMouse.translatePoint(200, 125);
		test.mouseDragged(myMouse);
		test.mouseReleased(myMouse);
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		test.paint(g2);
		
		Color c = new Color(image.getRGB(20, 20));
       assertEquals(c, Color.WHITE);
	}
	
	
	@Test // check if pixel is correct color
	public void test14(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true); 
        // get blue color button 
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click blue color button
        greenButton.doClick();
        // get rectangle button
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        // click rectangle button
        ovalButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 1, 1, 0, false);
		test.mousePressed(myMouse);
		myMouse.translatePoint(100, 100);
		test.mouseDragged(myMouse);
		test.mouseReleased(myMouse);
		
		JRadioButton redButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(0);
        redButton.doClick();
		
		myMouse.translatePoint(-90, -90);
		test.mousePressed(myMouse);
		myMouse.translatePoint(50, 50);
		test.mouseDragged(myMouse);
		test.mouseReleased(myMouse);
		
		
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		test.paint(g2);
		Color c = new Color(image.getRGB(25, 25));
		System.out.println("test");
		System.out.println(c);
		assertEquals(c, Color.RED);

	}
	

	@Test // check dragging works correctly 
	public void test15(){
        Panel theApplet = new PaintDemo();
        //... Create a window (JFrame) and make panel the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        window.setVisible(true); 
        // get green color button 
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click green color button
        greenButton.doClick();
        // get oval button
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        // click rectangle button
        ovalButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        // create a mouse event at position (1, 1)
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 1, 1, 0, false);
		test.mousePressed(myMouse);
		// move mouse coordinate to position 101, 101
		myMouse.translatePoint(100, 100);
		// begin to drag mouse 
		test.mouseDragged(myMouse);
		// reposition the mouse coordinate to increase branch coverage
		myMouse.translatePoint(100, 100);
	
		BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = image.createGraphics();
		test.paint(g2);
		Color c = new Color(image.getRGB(25, 25));
		
		assertEquals(c, Color.GREEN);
		
	
	}
	
	
	@Test // check if mouse is at correct position
	public void test16(){
        Panel theApplet = new PaintDemo();
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        window.setVisible(true); 
        // get green color button 
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click green color button
        greenButton.doClick();
        // get oval button
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        // click rectangle button
        ovalButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        // create a mouse event at position (1, 1)
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 1, 1, 0, false);
		test.mousePressed(myMouse);
		myMouse.translatePoint(100, 100);
		assertEquals(myMouse.getX(), 101);
	
	}
	
	@Test // check if mouse is at correct position
	public void test17(){
        Panel theApplet = new PaintDemo();
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        window.setVisible(true); 
        // get green color button 
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // click green color button
        greenButton.doClick();
        // get oval button
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        // click rectangle button
        ovalButton.doClick();
        // get the paint panel
        PaintPanel test =  (PaintPanel) window.getContentPane().getComponent(1);
        // create a mouse event at position (1, 1)
        MouseEvent myMouse = new MouseEvent(test, 0, 0, 0, 1, 1, 0, false);
		test.mousePressed(myMouse);
		// move mouse coordinate to position 101, 101
		myMouse.translatePoint(100, 100);
		assertEquals(myMouse.getY(), 101);
	
	}
	
	
	@Test // check oval button is unselected 
	public void test18() {
        Panel theApplet = new PaintDemo();
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        window.setVisible(true); 
        //get oval button
        JRadioButton ovalButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(0);
        // select it 
        ovalButton.doClick();
        //get rec button
        JRadioButton recButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(0).getAccessibleContext().getAccessibleChild(1);
        recButton.doClick();
        assertFalse(ovalButton.isSelected());
	}
	
	@Test // check red button is unselected 
	public void test19() {
        Panel theApplet = new PaintDemo();
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        window.setVisible(true); 
        // get the red button
        JRadioButton redButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(0);
        // select it 
        redButton.doClick();
        // get the green button
        JRadioButton greenButton = (JRadioButton) window.getContentPane().getComponent(0).getAccessibleContext().getAccessibleChild(1).getAccessibleContext().getAccessibleChild(1);
        // select it 
        greenButton.doClick();
        // make sure the red button is no longer the active button 
        assertFalse(redButton.isSelected());
        
	}
	
	@Test 
	public void test20() {
        pp.mouseMoved(null);
        pp.mouseClicked(null);
	}
	
	
	
}
