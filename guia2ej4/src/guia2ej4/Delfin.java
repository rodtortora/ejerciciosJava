package guia2ej4;

public class Delfin extends Animal implements Nadador {

	public Delfin(String especie, char grupo) {
		super(especie, grupo);
	}

	@Override
	public void nadar() {
		System.out.println("Delfin nadando");

	}

}
