package template.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	String messageString;
	
	public void init(){
		messageString = "Hello World, I'm alive.";
		repaint();
	}
	
	public void start(){
		messageString = "Now I'm starting up...";
		repaint();
	}
	
	public void stop() {
		messageString = "Oh, now I'm being stopped...";
		repaint();
	}
	
	public void destroy(){
		// applet is going away...
	}
	
	public void paint(Graphics graphics) {
		graphics.drawString(messageString, 5, 15);
	}
}
