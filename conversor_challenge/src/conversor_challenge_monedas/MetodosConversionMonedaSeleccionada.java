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
	
	public void llamada(String tipoMoneda, String tipoMonedaUno) {
		if (tipoMoneda == "dolares") {
			 if (this.resultado == 1) {
				 this.tipoMoneda = " " + tipoMonedaUno;
			 }}
	}
	
	public void metodoMonedaDatos(	ConversorMoneda x, String tipoMoneda, String tipoMonedaUno) {
	 this.resultado = x.convertirRAS();
	 this.tipoMoneda = " " + tipoMoneda;
	 if (tipoMoneda == "dolares") {
		 if (this.resultado == 1) {
			 this.tipoMoneda = " " + tipoMonedaUno;
		 } else if (tipoMoneda == "pesos") {
		 this.resultado = x.convertirSAR();
		 if (this.resultado == 1) {
			 this.tipoMoneda = " peso";
		 } 
	 
	}
}
	}}
