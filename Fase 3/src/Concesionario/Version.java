package Concesionario;
public class Version {
	private String nombre;
	private double precio;
	@Override
	public String toString() {
		return "Version [nombre=" + nombre + ", precio=" + precio + "]";
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


	
	public Version(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
}
