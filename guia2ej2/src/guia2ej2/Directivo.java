package guia2ej2;
import java.util.ArrayList;
import java.util.Collection;

public class Directivo extends Empleado {
	private String areaCargo;
	private Collection<Empleado> empleados = new ArrayList<>(); 
	
	public Directivo(String nombre, String fechaNac, float sueldo, String areaCargo, String tipo) {
		super(nombre, fechaNac, sueldo, tipo);
		this.setAreaCargo(areaCargo);
	}

	public String getAreaCargo() {
		return areaCargo;
	}

	public void setAreaCargo(String areaCargo) {
		this.areaCargo = areaCargo;
	}
	
	public void agregarEmpleadoACargo(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public String getEmpleadosACargo() {
		String infoEmpleados = "";
		for (Empleado empleado : empleados) {
			infoEmpleados = infoEmpleados + empleado.getNombre() + "; ";
		}
		return infoEmpleados;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " Area: " + this.getAreaCargo() + " Empleados a cargo: " + getEmpleadosACargo();
	}

}