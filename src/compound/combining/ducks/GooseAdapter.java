package compound.combining.ducks;

/**
 * Goose适配器，实现Quackable接口
 * 使得Goose像Duck一样能够quack。
 * */
public class GooseAdapter implements Quackable {
	private Goose goose;
	private Observable observable;

	/**
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}


	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}


	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}


	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	public String toString(){
		return "Goose pretending a Duck";
	}
}
