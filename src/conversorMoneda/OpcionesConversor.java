package conversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversor {
    //llamo a la clase convertir monedas
    ConvertirMoneda moneda = new ConvertirMoneda();

    // /**
    //  * @param option
    //  */
    // public void ValidarOption(double option) {
    //     if (){
    //         JOptionPane.showMessageDialog(null, "Valor no Valido!");
    //     }
    // }
    public boolean Confirmar(boolean comienzo) {
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
        if (JOptionPane.OK_OPTION == respuesta) {
            System.out.println("Selecciona opcion afirmativa");
            comienzo = true;
        }else{
            JOptionPane.showMessageDialog(null, "Programa Terminado");
            comienzo = false;
        }
        return comienzo;
    }

    public void ConvertirMonedas(double valor){
        String option = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos argentinos a Dolar", "De Pesos argentinos a Euro", "De Pesos argentinos a Libras", "De Pesos argentinos a Yen", "De Pesos argentinos a Won Coreano", "De Dolar a Pesos argentinos", "De Euro a Pesos argentinos", "De Libras a Pesos argentinos"}, "Elegir")).toString();

        switch (option) {
            case "De Pesos argentinos a Dolar":
                moneda.ConvertirPesoArgADolares(valor);
                break;
            case "De Pesos argentinos a Euro":
                moneda.ConvertirPesoArgAEuro(valor);
                break;
            case "De Pesos argentinos a Libras":
                moneda.ConvertirPesoArgALibras(valor);
                break;
            case "De Pesos argentinos a Yen":
                moneda.ConvertirPesoArgAYen(valor);
                break;
            case "De Pesos argentinos a Won Coreano":
                moneda.ConvertirPesoArgAWon(valor);
                break;
            case "De Dolar a Pesos argentinos":
                moneda.ConvertirDolaresAPesoArg(valor);
                break;
            case  "De Euro a Pesos argentinos":
                moneda.ConvertirEuroAPesoArg(valor);
                break;
            case "De Libras a Pesos argentinos":
                moneda.ConvertirLibrasAPesoArg(valor);
                break;
            default:
                break;
        }

    }




}

