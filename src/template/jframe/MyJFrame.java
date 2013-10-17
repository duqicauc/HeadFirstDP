package template.jframe;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	public MyJFrame(String title) {
		super(title);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		String msg = "I rule!!";
		g.drawString(msg, 100, 100);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyJFrame jFrame = new MyJFrame("head first");

	}

}
