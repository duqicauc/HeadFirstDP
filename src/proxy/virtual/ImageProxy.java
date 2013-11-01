package proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 * ImageIcon的代理类：ImageProxy
 * 两者都实现了Icon接口
 * */
public class ImageProxy implements Icon {
	private ImageIcon imageIcon; // 真正的对象
	private URL imageUrl;
	private Thread retrivelThread;
	private boolean retrieving = false;
	
	public ImageProxy(URL url) {
		this.imageUrl = url;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;
				retrivelThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							imageIcon = new ImageIcon(imageUrl, "CD Cover");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrivelThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		} else {
			return 600;
		}
	}

}
