package conversor_challenge_monedas;

import conversor_challenge.ConversorMoneda;

public class ConversorPesoWon extends ConversorMoneda{
	private double radioDeCambio = 0.13; //Última actualización: 1 may 2023, 0:38 UTC
	public ConversorPesoWon(Double cantidad) {
		super(cantidad);
		super.setRadioDeCambio(radioDeCambio);
	}
	
	
	
}
