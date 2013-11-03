package compound.djView;

public class DJTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a model
		BeatModelInterface model = new BeatModel();
		// create a controller
		ControllerInterface controller = new BeatController(model);
	}

}
