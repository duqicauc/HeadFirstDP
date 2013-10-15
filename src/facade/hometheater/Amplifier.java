package facade.hometheater;

public class Amplifier {
	private String description;
	private Tuner tuner;	//调谐器
	private DvdPlayer dvd;	//Dvd播放器
	private CdPlayer cd;	//Cd播放器
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
	
	/**
	 * 设置立体声
	 * */
	public void setStereoSound() {
		System.out.println(description + " stereo mode on");
	}
	/**
	 * 设置环绕声
	 * */
	public void setSurroundSound() {
		System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " setting volume to " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " setting tuner to " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + " setting DVD player to " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		System.out.println(description + " setting CD player to " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}
