package guia2ej2;

public class Empleado extends Persona {
	private float sueldo;
	
	public Empleado(String nombre, String fechaNac, float sueldo, String tipo) {
		super(nombre, fechaNac, tipo);
		this.setSueldo(sueldo);
		
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Sueldo: " + this.getSueldo();
	}

}
