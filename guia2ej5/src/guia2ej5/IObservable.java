package guia2ej5;

public interface IObservable {
	
	void addObserver(IObserver observer);
	void removeObserver(IObserver observer);

}
