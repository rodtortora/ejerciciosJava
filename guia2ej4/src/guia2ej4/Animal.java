package guia2ej4;

public class Animal {
	private String especie;
	private char grupo;

	public Animal(String especie, char grupo) {
		this.setEspecie(especie);
		this.setGrupo(grupo);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

}
