package conversor_challenge_monedas;

import conversor_challenge.ConversorMoneda;

public class MetodosConversionMonedaSeleccionada {
	private double resultado;
	private String tipoMoneda;
	String conversionMoneda;
	double cantidad;
	ConversorMoneda x;
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	
	
	public void metodoMonedaDatos(	ConversorMoneda x, String tipoMoneda, String tipoMonedaUnitaria) {
		if (tipoMoneda == "pesos") {
			 this.resultado = x.convertirSAR();
			 } else {
				 this.resultado = x.convertirRAS();
			 };
		if (this.resultado == 1) {
			 this.tipoMoneda = tipoMonedaUnitaria;
		 } else {this.tipoMoneda = tipoMoneda;}
		
	 
}
	}
