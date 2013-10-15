package facade.hometheater;

public class TheaterLights {
	private String description;
	
	public TheaterLights(String description) {
		this.description = description;
	}
	
	/**
	 * 打开TheaterLights
	 * */
	public void on(){
		System.out.println(description + " is on.");
	}
	
	/**
	 * 关闭TheaterLights
	 * */
	public void off() {
		System.out.println(description + " is off.");
	}
	
	/**
	 * 将灯光亮度调到leve水平
	 * */
	public void dim(int level) {
		System.out.println(description + " dimming to " + level  + "%");
	}
   
    public String toString() {
        return description;
    }
}
