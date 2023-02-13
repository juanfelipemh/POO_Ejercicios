package clases;

import java.util.List;
import javax.swing.JOptionPane;

public class CalculadoraInfantil extends Calculadora {

    @Override
    public void operarCalculadora() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                            CALCULADORA INFANTIL\n
                            Ingrese una opcion:
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Salir"""));
            switch (opcion) {
                case 1 -> {
                    List<Double> numerosSuma = calcular();
                    if(numerosSuma.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado de la suma " + datoOperacion + " es: " + suma(numerosSuma));
                    }
                }
                case 2 -> {
                    List<Double> numerosResta = calcular();
                    if(numerosResta.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado de la resta " + datoOperacion + " es: " + resta(numerosResta));
                    }
                }
                case 3 -> {
                    List<Double> numerosMultiplicacion = calcular();                  
                    if(numerosMultiplicacion.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion " + datoOperacion + " es: " + multiplicacion(numerosMultiplicacion));
                    }
                }
                case 4 -> {
                    List<Double> numerosDivision = calcular();
                    if(numerosDivision.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado de la division " + datoOperacion + " es: " + division(numerosDivision));
                    }
                }
                case 5 -> {}
                default -> JOptionPane.showMessageDialog(null, "Opcion " + opcion + " incorrecta");
            }
        } while (opcion != 5);
    }
}
