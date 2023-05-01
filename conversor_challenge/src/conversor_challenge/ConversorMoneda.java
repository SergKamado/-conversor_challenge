package conversor_challenge;

public class ConversorMoneda extends Conversor{
	
	public ConversorMoneda(Double cantidad) {
		super.setCantidad(cantidad);
	}
	//Agregar otras clases que sean las que hagan la funcion convertir, ver de clases pasadas la clase Administrador como refencia

	@Override
	public double convertirRAS() {
		double convertir = super.getCantidad() / super.getRadioDeCambio();
		return convertir;
	}

	@Override
	public double convertirSAR() {
		double convertir = super.getCantidad() * super.getRadioDeCambio();
		return convertir;
	}

}
