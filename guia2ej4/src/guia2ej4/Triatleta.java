package guia2ej4;

public class Triatleta extends Atleta implements Nadador, Ciclista {

	public Triatleta(String nombre, char categoria) {
		super(nombre, categoria);
		
	}

	@Override
	public void pedalear() {
		System.out.println("Triatleta pedaleando");

	}

	@Override
	public void nadar() {
		System.out.println("Triatleta nadando");

	}

}
