package conversor_challenge_monedas;

import conversor_challenge.ConversorMoneda;

public class ConversorPesoLibraEsterlina extends ConversorMoneda{
	private double radioDeCambio = 22.61; //Última actualización: 1 may 2023, 0:36 UTC
	public ConversorPesoLibraEsterlina(Double cantidad) {
		super(cantidad);
		super.setRadioDeCambio(radioDeCambio);
	}
	
	
	
}
