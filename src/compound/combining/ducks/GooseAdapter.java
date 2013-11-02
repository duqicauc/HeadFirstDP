package compound.combining.ducks;

/**
 * Goose适配器，实现Quackable接口
 * 使得Goose像Duck一样能够quack。
 * */
public class GooseAdapter implements Quackable {
	private Goose goose;

	/**
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}


	@Override
	public void quack() {
		goose.honk();
	}


	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
