package principal;
import javax.swing.JOptionPane;

import ConversorTemperatura.OpcionesConversorTemp;
import conversorMoneda.OpcionesConversor;

public class Principal {
    public static void main(String[] args) {
        
        OpcionesConversor conversionesMonedas = new OpcionesConversor();
        OpcionesConversorTemp conversionesTemperatura = new OpcionesConversorTemp();
        //bandera de corte del ciclo
        boolean comienzo = true;
        
        while(comienzo){
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion, ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de moneda", "Conversor de temperatura"}, "Elegir").toString();

            switch(opciones){
                case "Conversor de moneda":
                    String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
                    double valorRecibido = Double.parseDouble(input);
                    // options.ValidarOption(valorRecibido);
                    conversionesMonedas.ConvertirMonedas(valorRecibido);
                    comienzo = conversionesMonedas.Confirmar(comienzo);
                    break;
                case "Conversor de temperatura":
                    String inputTemp = JOptionPane.showInputDialog(null, "Ingrese un valor");
                    double valorTemp = Double.parseDouble(inputTemp);
                    conversionesTemperatura.ConvertirTemperatura(valorTemp);
                    comienzo = conversionesMonedas.Confirmar(comienzo);
                    break;
            }
        }
    }
}
