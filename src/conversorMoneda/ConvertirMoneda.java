package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
    //todos los metodos de conversion

    //"De Pesos argentinos a Dolar"
    public void ConvertirPesoArgADolares(double valor){
        double monedaDolar = valor / 146.86;
        monedaDolar = (double)Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "Dolares");
    }
    //De Pesos argentinos a Euro
    public void ConvertirPesoArgAEuro(double valor) {
        //142.65
        double monedaEuro = valor / 142.65;
        monedaEuro = (double)Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro+ "Euros");
    }
    //De Pesos argentinos a Libras
    public void ConvertirPesoArgALibras(double valor) {
        //159.11
        double monedaLibra = valor /159.11;
        monedaLibra = (double)Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra+ "Libras");
    }
    //De Pesos argentinos a Yen
    public void ConvertirPesoArgAYen(double valor) {
        //1.02
        double monedaYen= valor /1.02;
        monedaYen = (double)Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen+ "Yenes");
    }
    //De Pesos argentinos a Won Coreano
    public void ConvertirPesoArgAWon(double valor) {
        //0.10
        double monedaWon= valor /0.10;
        monedaWon = (double)Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon+ "Yenes");
    }
    //De Dolar a Pesos argentinos
    public void ConvertirDolaresAPesoArg(double valor){
        double monedaPeso = valor * 146.86;
        monedaPeso = (double)Math.round(monedaPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
    }
    //De Euro a Pesos argentinos
    public void ConvertirEuroAPesoArg(double valor){
        double monedaPeso = valor * 142.65;
        monedaPeso = (double)Math.round(monedaPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
    }
    //De Libras a Pesos argentinos
    public void ConvertirLibrasAPesoArg(double valor){
        double monedaPeso = valor * 159.11;
        monedaPeso = (double)Math.round(monedaPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
    }
}
