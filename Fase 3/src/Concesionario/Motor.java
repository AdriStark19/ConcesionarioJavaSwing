package Concesionario;

public class Motor {
	private String nombre;
	private double precio;
	@Override
	public String toString() {
		return "Motor [nombre=" + nombre + ", precio=" + precio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	
	public Motor(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
}