package compound.djView;

/**
 * Model Interface
 * */
public interface BeatModelInterface {
	public void initialize();		
	public void on();			// 开机
	public void off();			// 关机
	public void setBPM(int bpm);
	public int getBPM();
	public void registerObserver(BeatObserver o); 
	public void removeObserver(BeatObserver o);
	public void registerObserver(BPMObserver o);
	public void removeObserver(BPMObserver o);
}
