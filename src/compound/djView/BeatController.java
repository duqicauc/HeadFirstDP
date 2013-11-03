package compound.djView;
  
public class BeatController implements ControllerInterface {
	private BeatModelInterface model;	// Model：beat对象
	private DJView view;				// View：view对象
   
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
        view.createView();	// 创建窗口
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize(); // 初始化model
	}
  
	/**
	 * 处理用户的start菜单项动作
	 * 通知model启动；
	 * 禁用start菜单项和起用stop菜单项
	 * */
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
  	}
  
 	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
