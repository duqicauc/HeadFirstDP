package facade.hometheater;

/**
 * 家庭影院外观模式类：简化接口
 * @author 杜少
 * */
public class HomeTheaterFacade {
	private Amplifier amplifier;	//放大器
	private Tuner tuner;			//调谐器
	private DvdPlayer dvdPlayer;	//Dvd播放器
	private CdPlayer cdPlayer;		//Cd播放器
	private Projector projector;	//投影仪
	private TheaterLights lights;	//灯光
	private Screen screen;			//屏幕
	private PopcornPopper popper;	//爆米花机
	
	/**
	 * @param amplifier
	 * @param tuner
	 * @param dvdPlayer
	 * @param cdPlayer
	 * @param projector
	 * @param lights
	 * @param screen
	 * @param popper
	 */
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
			DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
			TheaterLights lights, Screen screen, PopcornPopper popper) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
	
	
}
