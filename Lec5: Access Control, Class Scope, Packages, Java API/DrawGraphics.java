package Draw; // just for fun   not designed carefully

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	ArrayList<BouncingBox> box;
	
	/** Initializes this class for drawing. */
	public DrawGraphics() {
		box = new ArrayList<BouncingBox>();
		
		box.add(new BouncingBox(200, 50, Color.red));
		box.add(new BouncingBox(200, 200, Color.blue));
		box.add(new BouncingBox(50, 50, Color.green));
		box.add(new BouncingBox(50, 200, Color.yellow));
		
		box.get(0).setMovementVector(0, 2);
		box.get(1).setMovementVector(-2, 0);
		box.get(2).setMovementVector(2, 0);
		box.get(3).setMovementVector(0, -2);
	}
	
	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		//surface.drawLine(200, 200, 250, 250);
		//surface.drawRoundRect(50, 50, 70, 30, 15, 15);
		//surface.drawOval(50, 150, 30, 100);
		//box.draw(surface);
		
		for (BouncingBox b: box) {
			b.draw(surface);
		}
	}
}