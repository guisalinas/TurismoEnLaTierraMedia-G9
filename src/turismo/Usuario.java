package turismo;

public class Usuario {

	private String nombre ;
	private int tiempoDisponible ;
	private int presupuesto ;
	private String preferencias ;
    private String promocionesAdquiridas ;
	
    public Usuario(String nombre , int tiempoDisponible , int presupuesto , String preferencias ) {
    	this.nombre= nombre;
    	this.tiempoDisponible= tiempoDisponible;
    	this.presupuesto = presupuesto ;
    	this.preferencias= preferencias ;
    }
    
   /* public void aceptarSugerencia (sugerencia){
    	this.tiempoDisponible = this.tiempoDisponible - sugerencia.tiempoRequerido;
    	this.presupuesto = this.presupuesto - sugerencia.precio;
    	
    }*/
    
    
    public String getNombre() {
		return nombre;
	}
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPresupuesto() {
		return presupuesto;
	}
	
	public void setPresupuesto(int presupuesto) {
		if (validarDato(presupuesto)) {
			this.presupuesto = presupuesto;			
		}
	}
	
	public int getTiempoDisponible() {
		return tiempoDisponible;
	}
	
	public void setTiempoDisponible(int tiempoDisponible) {
		if (validarDato(tiempoDisponible)) {
			this.tiempoDisponible = tiempoDisponible;
		}
	}
	
	public String getPreferencias() {
		return preferencias;
	}
	
	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}
	
	public String getPromocionesAdquiridas() {
		return promocionesAdquiridas;
	}
	
	public void setPromocionesAdquiridas(String promocionesAdquiridas) {
		this.promocionesAdquiridas = promocionesAdquiridas;
	}
	
	private boolean validarDato(int dato) {
		return dato>0;
	}

	public void aceptaSugerencia() {
		this.presupuesto -= Sugerencias.getPrecioSugerencia();
		this.tiempoDisponible -= Sugerencias.getTiempoSugerencia();
		
	}
	
	
	
	
}
