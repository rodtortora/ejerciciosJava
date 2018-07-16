package guia2ej4;

public class Atleta {
	private String nombre;
	private char categoria;
	

	public Atleta(String nombre, char categoria) {
		this.setCategoria(categoria);
		this.setNombre(nombre);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public char getCategoria() {
		return categoria;
	}


	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public void correr() {
		System.out.println("Atleta corriendo");
	}

}
