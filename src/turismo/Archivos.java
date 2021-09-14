package turismo;

import java.io.*;

public class Archivos {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
				
			try {
				fr = new FileReader ("usuarios.txt");
				br = new BufferedReader(fr);
				
				//leer
				String linea= br.readLine();
				
				while ((linea != null)) {
					String [] usuario = linea.split(" ");
					
					String nombre= usuario[0];
					int tiempoDisponible = Integer.parseInt(usuario[1]);
					int presupuesto = Integer.parseInt(usuario[2]);
					String preferencias = usuario[3]; 
					
					Usuario u = new Usuario (nombre, tiempoDisponible, presupuesto, preferencias);
									
						
					//Usuario u = new Usuario (usuario[0], usuario[1], usuario[2], usuario[3]); //para usar tiempo y dinero tendiramos que hacer Integer.parseInt? 
					
					System.out.println(u); //debe tener un metodo toString?
					//System.out.println(linea);
					linea = br.readLine(); //para avanzar una
				}
			
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			} 
			
			finally {
				//se cierra el archivo
				try {
					if (fr != null) {
						fr.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
			}
		}
	}
}

