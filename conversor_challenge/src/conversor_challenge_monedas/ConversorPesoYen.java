package conversor_challenge_monedas;

import conversor_challenge.ConversorMoneda;

public class ConversorPesoYen extends ConversorMoneda{
	private double radioDeCambio = 0.13; //Última actualización: 1 may 2023, 0:39 UTC
	public ConversorPesoYen(Double cantidad) {
		super(cantidad);
		super.setRadioDeCambio(radioDeCambio);
	}
	
	
	
}
