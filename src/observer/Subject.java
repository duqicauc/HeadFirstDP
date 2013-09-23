/**
 * 
 */
package observer;

/**
 * @author Administrator
 *
 */
public interface Subject {
	public void registObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
