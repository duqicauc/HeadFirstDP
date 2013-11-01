package proxy.virtual;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
	ImageComponent imageComponent; // 负责显示图片的模块
	JFrame frame = new JFrame("CD Cover Viewer"); // 初始化框架对象，title为"CD Cover Viewer"
	JMenuBar menuBar; // 菜单条
	JMenu menu; // 菜单
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main(String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception {
		/* 存放图片的url地址到cds哈希表中 */
		cds.put("Ambient: Music for Airports",
				"http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
		cds.put("Buddha Bar",
				"http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		cds.put("Ima",
				"http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
		cds.put("Karma",
				"http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
		cds.put("MCMXC A.D.",
				"http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
		cds.put("Northern Exposure",
				"http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
		cds.put("Selected Ambient Works, Vol. 2",
				"http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

		URL initialURL = new URL(
				(String) cds.get("Selected Ambient Works, Vol. 2"));

		/* 构建菜单条、菜单和菜单项之间的关系 */
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration e = cds.keys(); e.hasMoreElements();) {
			String name = (String) e.nextElement();
			JMenuItem menuItem = new JMenuItem(name); // 菜单项
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					// 当用户选择一个新的菜单项，那么监听器监听到事件，就执行actionPerformed中的动作
					// 即新建一个ImageProxy代理
					Icon icon = new ImageProxy(getCDUrl(event.getActionCommand()));
					imageComponent.setIcon(icon);
					frame.repaint(); // 重绘显示区
				}
			});
		}

		// 初始化，set up frame and menus
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);//将代理ImageProxy添加给frame框架
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);

	}
	
	/**
	 * 根据CD名字取出相应的URL地址
	 * */
	URL getCDUrl(String name) {
		try {
			return new URL((String) cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
