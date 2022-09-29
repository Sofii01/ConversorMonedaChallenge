package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
    public void ConvertirCelsuisAFahrenheit(double valor) {
        double grados = (valor * 1.8) + 32;
        grados = (double) Math.round(grados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + grados + "° F ");
    }

    public void ConvertirCelsuisAKelvin(double valor) {
        double grados = valor + 273.15;
        grados = (double) Math.round(grados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + grados + "° K ");
    }

    public void ConvertirFahrenheitACelsuis(double valor) {
        double grados = (valor - 32) / 1.800;
        grados = (double) Math.round(grados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + grados + "° C ");
    }

    // FahrenheitAKelvin
    public void ConvertirFahrenheitAKelvin(double valor) {
        double grados = ((valor - 32) / 1.800) + 273.15;
        grados = (double) Math.round(grados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + grados + "° K ");
    }

    public void ConvertirKelvinACelsuis(double valor) {
        double grados = valor - 273.15;
        grados = (double) Math.round(grados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + grados + "° C ");
    }

    // (K - 273.15)* 1.8000+ 32
    public void ConvertirKelvinAFahrenheit(double valor) {
        double grados = ((valor - 273.15) / 1.800) + 32;
        grados = (double) Math.round(grados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + grados + "° F ");
    }
}
