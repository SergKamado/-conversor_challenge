package conversor_challenge_monedas;

import conversor_challenge.ConversorMoneda;

public class ConversorPesoEuro extends ConversorMoneda{
	private double radioDeCambio = 19.82; // Última actualización: 1 may 2023, 0:41 UTC
	public ConversorPesoEuro(Double cantidad) {
		super(cantidad);
		super.setRadioDeCambio(radioDeCambio);
	}
	
	
	
}
