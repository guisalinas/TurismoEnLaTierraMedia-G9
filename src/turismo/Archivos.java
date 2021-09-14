package turismo;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Archivos {

	public static LinkedList<Usuario> leerArchivoUsuario(String usuariosTxt){
		LinkedList<Usuario> usuarios = new LinkedList<Usuario>();

		Scanner sc = null;
		
		try {
			sc = new Scanner (new File(usuariosTxt));
			
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String datos[] = linea.split(" ");
				String nombre = datos[0];
				int tiempo = Integer.parseInt(datos[1]);
				int presupuesto = Integer.parseInt(datos[2]);
				String gusto = datos[3];
				
				Usuario usuario = new Usuario (nombre, tiempo, presupuesto, gusto);
				
				if (!usuarios.contains(usuario)) {
					usuarios.add(usuario);
				}
			}
		}

		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		sc.close();
		
		return usuarios;
	}
		
	public static LinkedList<Atraccion> leerArchivoAtracion(String atraccionTxt){
		LinkedList<Atraccion> atracciones = new LinkedList<Atraccion>();

		Scanner sc = null;
		
		try {
			sc = new Scanner (new File(atraccionTxt));
			
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String datos[] = linea.split(" ");
				String nombre = datos[0];
				int costo = Integer.parseInt(datos[1]);
				int tiempo = Integer.parseInt(datos[2]);
				int cupo = Integer.parseInt(datos[3]);
				String gusto = datos[4];
				
				Atraccion atraccion = new Atraccion (nombre, costo, tiempo, cupo, gusto);
				
				if (!atracciones.contains(atraccion)) {
					atracciones.add(atraccion);
				}
			}
		}

		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		sc.close();
		
		return atracciones;
	}
		
}


