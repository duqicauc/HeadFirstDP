package compound.djView;

/**
 * Controller 接口
 * */
public interface ControllerInterface {
	public void start(); 	// 开机
	public void stop();
	public void increaseBPM(); // 增加Beat per mintue
	public void decreaseBPM();
	public void setBPM(int bpm);
}
