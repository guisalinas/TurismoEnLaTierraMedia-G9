package turismo;

import java.util.Arrays;

public class Atraccion extends Sugerencias implements Comparable<Atraccion>{
	
	private String nombre;
	private Integer costo;
	private Integer tiempo;
	private int cupo;
	private String gusto;

	public Atraccion(String nombre, int costo, int tiempo, int cupo, String gusto) {
		this.nombre = nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupo = cupo;
		this.gusto = gusto;				
	}
	
	public String getAtraccion() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.costo;
	}
	
	public int getTiempo() {
		return this.tiempo;
	}
	
	public int getCupo() {
		return this.cupo;
	}
	
	public String getGusto() {
		return this.gusto;
	}
	
	public void ordenarPorGusto() {
		Arrays.sort(this.gusto, new OrdenarGustos());
	}

	public void ordenarPorPrecio() {
		Arrays.sort(this.gusto, new OrdenarGustos());
	}

	public void ordenarPorTiempo() {
		Arrays.sort(this.gusto, new OrdenarGustos());
	}


	@Override
	public int compareTo(Atraccion o) {
		if (this.gusto.compareTo(o.gusto) == 0) {
			if (this.costo.compareTo(o.costo) == 0 ){
				return this.tiempo.compareTo(o.tiempo);
				
			}
			return this.costo.compareTo(o.costo);
		}
		return this.gusto.compareTo(o.gusto);
	}



}
