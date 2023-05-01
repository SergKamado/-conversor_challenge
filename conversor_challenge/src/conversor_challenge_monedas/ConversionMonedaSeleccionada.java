package conversor_challenge_monedas;

import javax.swing.JOptionPane;

import conversor_challenge.ConversorMoneda;

public class ConversionMonedaSeleccionada {
	double resultado=0;
	String tipoMoneda="";
	String conversionMoneda;
	double cantidad;
	String titulo;
	MetodosConversionMonedaSeleccionada metodoMoneda;
	
	public ConversionMonedaSeleccionada(String conversionMoneda, double cantidad, String titulo) {
		super();
		this.conversionMoneda = conversionMoneda;
		this.cantidad = cantidad;
		this.titulo = titulo;
		this.metodoMoneda = new MetodosConversionMonedaSeleccionada();
		
	}	
	
	public void actualizarDatos (ConversorMoneda x, String tipoMoneda, String Uni) {
		metodoMoneda.metodoMonedaDatos(x, tipoMoneda, Uni);
		this.resultado = this.metodoMoneda.getResultado();
		this.tipoMoneda = this.metodoMoneda.getTipoMoneda();
	}
	
	public String elegirTipoCambio() {
		if (this.conversionMoneda == "Peso a Dólar") {
			return "dolares";
		}  else if (conversionMoneda == "Dólar a peso") {
			return "pesos";
		} else if (this.conversionMoneda == "Peso a Euro") {
			return "euros";
		}  else if (conversionMoneda == "Euro a peso") {
			return "pesos";
		}else if (this.conversionMoneda == "Libras a peso") {
			return "libras";
		}  else if (conversionMoneda == "Dólar a peso") {
			return "pesos";
		}
		return conversionMoneda;
	}
	
	public void metodoDeConversiónElegida() {
		
		if (conversionMoneda == "Peso a Dólar" || conversionMoneda == "Dólar a peso") {
			ConversorMoneda x= new ConversorPesoDolar(cantidad);		
			
			if (conversionMoneda == "Peso a Dólar") {				 
				actualizarDatos(x, "dolares", "dolar");
			} else if (conversionMoneda == "Dólar a peso") {
				actualizarDatos(x, "pesos", "peso");
			}
		}
		
		 else if (conversionMoneda == "Peso a Euro" || conversionMoneda == "Euro a peso") {
			ConversorMoneda x= new ConversorPesoDolar(cantidad);
			
			if (conversionMoneda == "Peso a Dólar") {
				 resultado = x.convertirRAS();
				 tipoMoneda = " dolares";
				 if (resultado == 1) {
				 tipoMoneda = " dolar";
				 };	 	
			} else if (conversionMoneda == "Peso a Dólar") {
				 resultado = x.convertirRAS();
				 tipoMoneda = " pesos";
				 if (resultado == 1) {
				 tipoMoneda = " peso";
				 }
			}

	
		}
		JOptionPane.showMessageDialog(null,"Son " + resultado + tipoMoneda,
				titulo , JOptionPane.INFORMATION_MESSAGE);;
	}
}
