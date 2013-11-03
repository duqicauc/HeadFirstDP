package compound.djView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
	private BeatModelInterface model; // Model:beat对象
	private ControllerInterface controller; // Controller: controller对象
	/* the view of controller */
	private JFrame controlFrame;
	private JPanel controlPanel;
	private JLabel bpmLabel;
	private JTextField bpmTextField;
	private JButton setBPMButton;
	private JButton increaseBPMButton;
	private JButton decreaseBPMButton;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem startMenuItem;
	private JMenuItem stopMenuItem;
	/* the view of model */
	private JFrame viewFrame; // 视窗框架
	private JPanel viewPanel; // 显示面板
	private BeatBar beatBar; // beat进度条
	private JLabel bpmOutputLabel; // 显示当前bpm值得标签

	public DJView(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver) this); // 将自己注册为model的监听者
		model.registerObserver((BPMObserver) this);
	}

	/**
	 * 创建the view of the model 即跟model打交道的视图
	 * */
	public void createView() {
		viewPanel = new JPanel(new GridLayout(1, 2));
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(new Dimension(100, 80));
		viewFrame.setLocationRelativeTo(null);
		bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		beatBar = new BeatBar();
		beatBar.setValue(0);
		JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(beatBar);
		bpmPanel.add(bpmOutputLabel);
		viewPanel.add(bpmPanel);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}

	/**
	 * the view of the controller
	 * */
	public void createControls() {
		// Create all Swing components here
		JFrame.setDefaultLookAndFeelDecorated(true);
		controlFrame = new JFrame("Control");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.setSize(new Dimension(100, 80));
		controlFrame.setLocationRelativeTo(null);
		// 处理菜单栏、菜单项的添加以及事件响应
		menuBar = new JMenuBar();
		menu = new JMenu("DJ Control");
		startMenuItem = new JMenuItem("Start");
		menu.add(startMenuItem);
		startMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.start();
			}
		});
		stopMenuItem = new JMenuItem("Stop");
		menu.add(stopMenuItem);
		stopMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.stop();
			}
		});
		JMenuItem exit = new JMenuItem("Quit");
		menu.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		menuBar.add(menu);
		controlFrame.setJMenuBar(menuBar);
		// 处理显示区以及按钮的事件响应
		bpmTextField = new JTextField(2);
		bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
		setBPMButton = new JButton("Set");
		setBPMButton.setSize(new Dimension(10, 40));
		increaseBPMButton = new JButton(">>");
		decreaseBPMButton = new JButton("<<");
		setBPMButton.addActionListener(this);
		increaseBPMButton.addActionListener(this);
		decreaseBPMButton.addActionListener(this);
		// 处理显示区各个控件的布局
		controlPanel = new JPanel(new GridLayout(1, 2));
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		buttonPanel.add(decreaseBPMButton);
		buttonPanel.add(increaseBPMButton);
		JPanel enterPanel = new JPanel(new GridLayout(1, 2));
		enterPanel.add(bpmLabel);
		enterPanel.add(bpmTextField);
		JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
		insideControlPanel.add(enterPanel);
		insideControlPanel.add(setBPMButton);
		insideControlPanel.add(buttonPanel);
		controlPanel.add(insideControlPanel);
		// 设置边框
		bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		// 处理整体框架的一些属性
		controlFrame.getRootPane().setDefaultButton(setBPMButton);
		controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
		controlFrame.pack();
		controlFrame.setVisible(true);
	}

	public void enableStopMenuItem() {
		stopMenuItem.setEnabled(true);
	}

	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}

	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}

	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}

	@Override
	/**
	 * 当modle的状态发生改变时，通知view，该函数被调用
	 * */
	public void updateBPM() {
		if (model != null) {
			int bpm = model.getBPM();
			if (bpm == 0) {
				bpmOutputLabel.setText("offline");
			} else {
				bpmOutputLabel.setText("Current BPM: " + bpm);
			}			
		}
	}

	@Override
	public void updateBeat() {
		if (beatBar != null) {
			beatBar.setValue(100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		/* 根据按钮事件的来源，让controller做出相应的动作 */
		if (event.getSource() == setBPMButton) {
			int bpm = Integer.parseInt(bpmTextField.getText());
			controller.setBPM(bpm);
		} else if (event.getSource() == increaseBPMButton) {
			controller.increaseBPM();
		} else if (event.getSource() == decreaseBPMButton) {
			controller.decreaseBPM();
		}
	}
}
