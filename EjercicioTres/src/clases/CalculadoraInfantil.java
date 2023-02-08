package clases;

import java.util.List;
import javax.swing.JOptionPane;

public class CalculadoraInfantil extends Calculadora {

    @Override
    public List<Double> calcular() {
        return super.calcular(); 
    }

    @Override
    public double suma(List<Double> numeros) {
        return super.suma(numeros); 
    }

    @Override
    public double resta(List<Double> numeros) {
        return super.resta(numeros); 
    }

    @Override
    public double multiplicacion(List<Double> numeros) {
        return super.multiplicacion(numeros); 
    }

    @Override
    public double division(List<Double> numeros) {
        return super.division(numeros); 
    }

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
                    double total;
                    List<Double> numerosSuma = calcular();
                    if(numerosSuma.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        total = suma(numerosSuma);
                        JOptionPane.showMessageDialog(null, "El resultado de la suma " + dato + " es: " + total);
                    }
                }
                case 2 -> {
                    double total;
                    List<Double> numerosResta = calcular();
                    if(numerosResta.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        total = resta(numerosResta);
                        JOptionPane.showMessageDialog(null, "El resultado de la resta " + dato + " es: " + total);
                    }
                }
                case 3 -> {
                    double total;
                    List<Double> numerosMultiplicacion = calcular();                  
                    if(numerosMultiplicacion.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        total = multiplicacion(numerosMultiplicacion);
                        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion " + dato + " es: " + total);
                    }
                }
                case 4 -> {
                    double total;
                    List<Double> numerosDivision = calcular();
                    if(numerosDivision.size() > 2){
                        JOptionPane.showMessageDialog(null, "Unicamente ingrese 2 numeros");
                    } else {
                        total = division(numerosDivision);
                        JOptionPane.showMessageDialog(null, "El resultado de la division " + dato + " es: " + total);
                    }
                }
                case 5 -> {
                }
                default -> JOptionPane.showMessageDialog(null, "Opcion " + opcion + " incorrecta");
            }
        } while (opcion != 5);
    }
}