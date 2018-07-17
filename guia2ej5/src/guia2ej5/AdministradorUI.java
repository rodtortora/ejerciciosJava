package guia2ej5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class AdministradorUI implements IObserver {
	private Map<Pantalla, Pantalla> pantallas = new HashMap<>();
	private Pantalla pantallaDefault, pantallaActual;
	private IObservable observable;

	public AdministradorUI(IObservable observable, Pantalla pantalla) {
		setPantallaDefault(pantalla);
		setPantallaActual(pantalla);
		this.observable = observable;
		this.observable.addObserver(this);
	}
	


	public Pantalla getPantallaDefault() {
		return pantallaDefault;
	}

	public void setPantallaDefault(Pantalla pantallaDefault) {
		this.pantallaDefault = pantallaDefault;
	}
	
	public Pantalla getPantallaActual() {
		return pantallaActual;
	}

	public void setPantallaActual(Pantalla pantalla) {
		pantalla.addObserver(this);
		this.pantallaActual = pantalla;		
		this.observable = pantalla;
	}
	
	public Map<Pantalla, Pantalla> getPantallas() {
		return pantallas;
	}

	public void setPantallas(Map<Pantalla, Pantalla> pantallas) {
		this.pantallas = pantallas;
	}



	@Override
	public void update(Object nuevaPantalla) {
		pantallas.put(this.pantallaActual, (Pantalla) nuevaPantalla);
		setPantallaActual((Pantalla) nuevaPantalla);
	}
	
	@Override
	public String toString() {
		return "Pantalla actual: " + this.getPantallaActual().getTitulo();
	}

	public static void main (String[]args) {
		Pantalla pantallaBienvenida = new PantallaBienvenida("Welcome");
		Pantalla pantalla2 = new PantallaOpciones("Options");
		AdministradorUI a = new AdministradorUI(pantallaBienvenida, pantallaBienvenida);
		System.out.println(a.toString());
		pantalla2.mostrar();
		System.out.println(a.toString());
	}





}
