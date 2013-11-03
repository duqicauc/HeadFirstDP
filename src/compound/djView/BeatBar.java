package compound.djView;

import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable {
	private JProgressBar progressBar;	//进度条对象
	private Thread thread;
	
	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);	//设置进度条的最大值为100	
		thread.start();
	}

	@Override
	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);//??
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}

}
