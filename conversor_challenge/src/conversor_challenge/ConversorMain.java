package conversor_challenge;

import javax.swing.JOptionPane;

import conversor_challenge_monedas.ConversorPesoDolar;
import conversor_challenge_monedas.ConversorPesoEuro;

public class ConversorMain {

	private static String titulo ="Conversor Universal";
	public static void main(String[] args) {

		double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Escribe la cantidad",
				titulo, JOptionPane.QUESTION_MESSAGE));
		
		String[] conversionMonedaList = {"Peso a Dólar",
				"Peso a Euro",
				"Peso a Libras", 
				"Peso a Yen",
				"Peso a Won Coreano",
				"Dólar a peso",
				"Euro a peso",
				"Libras a peso",
				"Yen a peso",
				"Won Coreano a peso",};
		
		String conversionMoneda = (String) JOptionPane.showInputDialog(null, "Escoge el conversor", 
				titulo, JOptionPane.QUESTION_MESSAGE, null, conversionMonedaList, conversionMonedaList[0]);
		
		double resultado=0;
		String tipoMoneda="";
		
		if (conversionMoneda == "Peso a Dólar" || conversionMoneda == "Dólar a peso") {
			ConversorMoneda x= new ConversorPesoDolar(cantidad);
			
			if (conversionMoneda == "Peso a Dólar") {
				 resultado = x.convertirRAS();
				 tipoMoneda = " dolares";
				 if (resultado == 1) {
				 tipoMoneda = " dolar";
				 };	 	
			} else if (conversionMoneda == "Dólar a peso") {
				 resultado = x.convertirSAR();
				 tipoMoneda = " pesos";
				 if (resultado == 1) {
				 tipoMoneda = " peso";
				 }
			}
			JOptionPane.showMessageDialog(null,"Son " + resultado + tipoMoneda,
					titulo , JOptionPane.INFORMATION_MESSAGE);
			//System.out.println(cantidad);
		}
		
		
        
	}
}

