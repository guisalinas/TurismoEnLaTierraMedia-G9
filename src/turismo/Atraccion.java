package turismo;

public class Atraccion {

	private String nombre ;
	private int costo;
	private int tiempo;
	private int cupo;
        private Tipo tipo;
	
    public Atraccion (String nombre, int costo, int tiempo, int cupo, Tipo tipo){

        this.nombre = nombre;
        this.costo = costo;
        this.tiempo = tiempo;
        this.cupo = cupo;
        this.tipo = tipo;
 
     }
