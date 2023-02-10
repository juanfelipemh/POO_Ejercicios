package clases;

import java.util.List;
import javax.swing.JOptionPane;

public class CalculadoraAvanzada extends Calculadora {
    
    public double potencia(List<Double> numeros) {        
        double num = 0;
        for(double numero : numeros){
            num = Math.pow(numero, 2);
        }
        historial.add("Resultado de la potencia " + datoOperacion + " es " + num);
        return num;
    }
    
    public double raiz(List<Double> numeros) {        
        double num = 0;
        for(double numero: numeros){
            num = Math.sqrt(numero);
        }
        historial.add("Resultado de la raiz " + datoOperacion + " es " + num);
        return num;
    }
        
    @Override
    public void operarCalculadora() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                            CALCULADORA AVANZADA\n
                            Ingrese una opcion:
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Potencia a la 2
                            6. Raiz Cuadrada  
                            7. Salir"""));
            switch (opcion) {
                case 1 -> {
                    double total;
                    List<Double> numerosSuma = calcular();
                    total = suma(numerosSuma);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma " + datoOperacion + " es: " + total);
                }
                case 2 -> {
                    double total;
                    List<Double> numerosResta = calcular();
                    total = resta(numerosResta);
                    JOptionPane.showMessageDialog(null, "El resultado de la resta " + datoOperacion + " es: " + total);
                }
                case 3 -> {
                    double total;
                    List<Double> numerosMultiplicacion = calcular();
                    total = multiplicacion(numerosMultiplicacion);
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion " + datoOperacion + " es: " + total);
                }
                case 4 -> {
                    double total;
                    List<Double> numerosDivision = calcular();
                    total = division(numerosDivision);
                    JOptionPane.showMessageDialog(null, "El resultado de la division " + datoOperacion + " es: " + total);
                }
                case 5 -> {
                    double total;
                    List<Double> numerosPotencia = calcular();
                    total = potencia(numerosPotencia);
                    JOptionPane.showMessageDialog(null, "El resultado de la potencia " + datoOperacion + " es: " + total);
                }
                case 6 -> {
                    double total;
                    List<Double> numerosRaiz = calcular();
                    total = raiz(numerosRaiz);
                    JOptionPane.showMessageDialog(null, "El resultado de la raiz " + datoOperacion + " es: " + total);
                }
                case 7 -> {
                }
                default -> JOptionPane.showMessageDialog(null, "Opcion " + opcion + " incorrecta");
            }
        } while (opcion != 7);
    }    
}
