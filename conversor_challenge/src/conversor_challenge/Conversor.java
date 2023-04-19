package conversor_challenge;

public class Conversor {
	private int cantidad=20;
	private int radioDeCambio = 20;
	
	public Conversor() {
	}
	
	//Agregar otras clases que sean las que hagan la funcion convertir, ver de clases pasadas la clase Administrador como refencia
	public int convertirMexExt() {
		int convertir = this.cantidad / this.radioDeCambio;
		return convertir;
	}
	
	public int convertirExtMex() {
		int convertir = this.cantidad * this.radioDeCambio;
		return convertir;
	}
}

