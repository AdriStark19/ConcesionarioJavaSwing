package Concesionario;

public class Coche {
	private String marca;
	private String modelo;
	private double precio;
	private Motor motor;
	private ColorCoche color;
	private Version version;
	

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", motor=" + motor + ", color="
				+ color + ", version=" + version + "]";
	}
	public Coche(String marca, String modelo, double precio, Motor motor, ColorCoche color, Version version) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.motor = motor;
		this.color = color;
		this.version = version;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public ColorCoche getColor() {
		return color;
	}
	public Version getVersion() {
		return version;
	}
	public void setColor(ColorCoche color) {
		this.color = color;
	}
	public void setVersion(Version version) {
		this.version = version;
	}

}
