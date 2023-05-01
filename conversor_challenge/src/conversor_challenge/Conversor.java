package conversor_challenge;

public abstract class Conversor {
	private double cantidad;
	private double radioDeCambio; //Radio de r y s. 
	//Ej si peso=r y monedaExtranjera=s=1 radioDeCambio=r/s=r
	
	public Conversor() {
	}
	
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getRadioDeCambio() {
		return radioDeCambio;
	}

	public void setRadioDeCambio(double radioDeCambio) {
		this.radioDeCambio = radioDeCambio;
	}
	
	
	//Agregar otras clases que sean las que hagan la funcion convertir, ver de clases pasadas la clase Administrador como refencia
	public abstract double convertirRAS();
	
	public abstract double convertirSAR();

}

