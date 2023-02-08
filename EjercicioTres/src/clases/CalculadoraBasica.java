package clases;

import java.util.List;
import javax.swing.JOptionPane;

public class CalculadoraBasica extends Calculadora {

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
                            CALCULADORA BASICA\n
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
                    total = suma(numerosSuma);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma " + dato + " es: " + total);
                }
                case 2 -> {
                    double total;
                    List<Double> numerosResta = calcular();
                    total = resta(numerosResta);
                    JOptionPane.showMessageDialog(null, "El resultado de la resta " + dato + " es: " + total);
                }
                case 3 -> {
                    double total;
                    List<Double> numerosMultiplicacion = calcular();
                    total = multiplicacion(numerosMultiplicacion);
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion " + dato + " es: " + total);
                }
                case 4 -> {
                    double total;
                    List<Double> numerosDivision = calcular();
                    total = division(numerosDivision);
                    JOptionPane.showMessageDialog(null, "El resultado de la division " + dato + " es: " + total);
                }
                case 5 -> {
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Opcion " + opcion + " incorrecta");
            }
        } while (opcion != 5);
    }
}
