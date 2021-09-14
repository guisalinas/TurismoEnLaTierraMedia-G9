package turismo;

import java.util.Collections;
import java.util.LinkedList;

public class Turismo {

	public static void main(String[] args) {
		
		String respuesta;
		
		LinkedList<Usuario> usuarios = Archivos.leerArchivoUsuario("usuarios.txt");
		LinkedList<Atraccion> atracciones = Archivos.leerArchivoAtracion("atracciones.txt");
		
		Collections.sort(atracciones);
		
		String sugerenciasUsuario[] = Sugerencias.getSugerencia(usuarios);
		
		for (Usuario indiceUsuarios : usuarios) {
			
			System.out.println("Bienvenido" + indiceUsuarios.getNombre());
			System.out.println(indiceUsuarios.getPresupuesto());
			System.out.println(indiceUsuarios.getTiempoDisponible());
			System.out.println(indiceUsuarios.getPreferencias());
			
			System.out.println("Podemos ofrecerte las siguientes atraccciones y promociones: ");
			
			
			for (String indiceSugerencias : sugerenciasUsuario){
				
				System.out.println("Desea comprarlo? (S/N)");
				if (respuesta == "S") {
					indiceUsuarios.aceptaSugerencia();
					System.out.println("Compra exitosa.");
					System.out.println("Saldo disponible: " + indiceUsuarios.getPresupuesto());
					System.out.println("Tiempo disponible: " + indiceUsuarios.getTiempoDisponible());
				}
			}
		}
		
	}

}
