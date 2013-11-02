package compound.combining.ducks;

/**
 * 可被监听接口:如果想具备被监听的能力，
 * 实现Quackable接口的具体类也得实现
 * 这个“可被监听接口”,
 * */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
