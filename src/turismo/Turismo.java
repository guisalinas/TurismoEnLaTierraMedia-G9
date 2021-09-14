package turismo;

public class Turismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prueba commit.
		// inicializar array con atracciones, usuarios y promociones
		
		String respuesta;
		
		Usuario usuarios[] = Archivos.leerArchivo(usuarios.txt);
		String sugerenciasUsuario[] = Sugerencias.getSugerencia(usuarios);;
		
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
