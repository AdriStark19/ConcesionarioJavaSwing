package Concesionario;

public class ColorCoche {
	public ColorCoche(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	private String nombre;
	private double precio;
	
	
	@Override
	public String toString() {
		return "Color [nombre=" + nombre + ", precio=" + precio + "]";
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


	
	
}