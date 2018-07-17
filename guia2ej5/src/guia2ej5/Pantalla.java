package guia2ej5;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Pantalla implements IObservable {
	private String titulo;
	private List<IObserver> observers = new ArrayList<>();
	
	public Pantalla(String titulo) {
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void mostrar() {
		for (IObserver o : observers) {
			System.out.println(this.toString());
			o.update(this);
		}
	}
	
	
	@Override
	public String toString() {
		return this.getTitulo();
	}

	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
		
	}

}
