package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversorTemp {
    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirTemperatura(double valor) {    
        String option = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit","De Celsius a Kelvin", "De Fahrenheit a Celsius","De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"}, "Elegir")).toString();
        
        switch (option) {
            case "De Celsius a Fahrenheit":
                temperatura.ConvertirCelsuisAFahrenheit(valor);
                break;
            case "De Celsius a Kelvin":
                temperatura.ConvertirCelsuisAKelvin(valor);
                break;
            case "De Fahrenheit a Celsius":
                temperatura.ConvertirFahrenheitACelsuis(valor);
                break;
            case "De Fahrenheit a Kelvin":
                temperatura.ConvertirFahrenheitAKelvin(valor);
                break;
            case "De Kelvin a Celsius":
                temperatura.ConvertirKelvinACelsuis(valor);
                break;
            case "De Kelvin a Fahrenheit":
                temperatura.ConvertirKelvinAFahrenheit(valor);
                break;
            default:
                break;
        }
    }
}
