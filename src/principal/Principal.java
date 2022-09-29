package principal;
import javax.swing.JOptionPane;


import conversorMoneda.OpcionesConversor;

public class Principal {
    public static void main(String[] args) {
        
        OpcionesConversor conversiones = new OpcionesConversor();
        //bandera de corte del ciclo
        boolean comienzo = true;
        
        while(comienzo){
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion, ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de moneda", "Conversor de temperatura"}, "Elegir").toString();

            switch(opciones){
                case "Conversor de moneda":
                    String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
                    double valorRecibido = Double.parseDouble(input);
                    // options.ValidarOption(valorRecibido);
                    conversiones.ConvertirMonedas(valorRecibido);
                    comienzo = conversiones.Confirmar(comienzo);
                    break;
                case "Conversor de temperatura":
                    break;
            }
        }
    }
}
