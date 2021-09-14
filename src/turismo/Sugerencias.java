package turismo;

import java.util.Objects;

public class Sugerencias {

	private int precioSugerencia;
	private int tiempoSugerencia;
	private String atraccionSugerencia;
	
	
    public String getSugerencia (Usuario usuario){
    	if (this.atraccionSugerencia == usuario.getPreferencias() &&
			this.precioSugerencia <= usuario.getPresupuesto() && 
			this.tiempoSugerencia <= usuario.getTiempoDisponible()){
    		
				return this.atraccionSugerencia;
    	}
		else {
			throw new Error ("No coincide ningún gusto.");
		}   	
    }
    
    public int getPrecioSugerencia() {
    	return this.precioSugerencia;
    }
    
    public int getTiempoSugerencia () {
    	return this.tiempoSugerencia;
    }
    

	@Override
	public int hashCode() {
		return Objects.hash(atraccionSugerencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sugerencias other = (Sugerencias) obj;
		return Objects.equals(atraccionSugerencia, other.atraccionSugerencia);
	}

	@Override
	public int compareTo(Usuario usuario) {
		if (this.atraccionSugerencia.compareTo(usuario.getPreferencias())== 0) {			
			return this.atraccionSugerencia.compareTo(usuario.getPreferencias());					
		}
		
		return 1;
	}

	@Override
	public int compareTo(Sugerencias o) {
		// TODO Auto-generated method stub
		return 0;
	}

    
}
   
