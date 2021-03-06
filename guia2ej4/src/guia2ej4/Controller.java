package guia2ej4;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private static List<Atleta> atletas = new ArrayList<>();
	private static List<Nadador> nadadores = new ArrayList<>();

	public static void main (String[]args) {
		Nadador delfin1 = new Delfin("Delfin Negro",'B');
		Nadador triatleta1 = new Triatleta("Juan",'A');
		Nadador triatleta2 = new Triatleta("Arturo",'B');
		
		Atleta atleta1 = new Triatleta("Alberto",'C');
		Atleta atleta2 = new Atleta("Marcelo",'A');
		Atleta atleta3 = new Triatleta("Rodrigo",'D');
		Atleta atleta4 = new Triatleta("Pedro",'A');
		
		agregar(delfin1);
		agregar(triatleta1);
		agregar(triatleta2);
		agregar(atleta1);
		agregar(atleta2);
		agregar(atleta3);
		agregar(atleta4);
		mostrarInfoNadadores();
		mostrarNombreAtletas();
		
	}
	
	public static void agregar(Atleta atleta) {
		atletas.add(atleta);
	}
	
	public static void agregar(Nadador nadador) {
		nadadores.add(nadador);
	}
	
	public static void mostrarInfoNadadores() {		
		
		for (Nadador e : nadadores) {
			e.nadar();
		}
	}
	
	public static void mostrarNombreAtletas() {
		for (Atleta e : atletas) {
			System.out.println(e.getNombre());
		}
	}

}
