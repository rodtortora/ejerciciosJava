package guia2ej2;

public class Persona {
	private String nombre, fechaNac, tipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Persona(String nombre, String fechaNac, String tipo) {
		this.setNombre(nombre);
		this.setFechaNac(fechaNac);
		this.setTipo(tipo);
	}
	
	@Override
	public String toString() {
		return "Tipo " + this.getTipo() + " Nombre: " + this.getNombre() + " Fecha nac: " + this.getFechaNac() + "\n";
	}



}
