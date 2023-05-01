package conversor_challenge_monedas;

import conversor_challenge.ConversorMoneda;

public class ConversorPesoDolar extends ConversorMoneda{
	//Tipo de cambio sacado de https://www.xe.com/
	private double radioDeCambio = 18.01; // Última actualización: 1 may 2023, 0:40 UTC
	public ConversorPesoDolar(Double cantidad) {
		super(cantidad);
		super.setRadioDeCambio(radioDeCambio);
	}
	
	
	
}
