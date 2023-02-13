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
                    List<Double> numerosSuma = calcular();
                    JOptionPane.showMessageDialog(null, "El resultado de la suma " + datoOperacion + " es: " + suma(numerosSuma));
                }
                case 2 -> {
                    List<Double> numerosResta = calcular();
                    JOptionPane.showMessageDialog(null, "El resultado de la resta " + datoOperacion + " es: " + resta(numerosResta));
                }
                case 3 -> {
                    List<Double> numerosMultiplicacion = calcular();
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion " + datoOperacion + " es: " + multiplicacion(numerosMultiplicacion));
                }
                case 4 -> {
                    List<Double> numerosDivision = calcular();
                    JOptionPane.showMessageDialog(null, "El resultado de la division " + datoOperacion + " es: " + division(numerosDivision));
                }
                case 5 -> {
                    List<Double> numerosPotencia = calcular();
                    JOptionPane.showMessageDialog(null, "El resultado de la potencia " + datoOperacion + " es: " + potencia(numerosPotencia));
                }
                case 6 -> {
                    List<Double> numerosRaiz = calcular();
                    JOptionPane.showMessageDialog(null, "El resultado de la raiz " + datoOperacion + " es: " + raiz(numerosRaiz));
                }                
                case 7 -> {}
                default -> JOptionPane.showMessageDialog(null, "Opcion " + opcion + " incorrecta");
            }
        } while (opcion != 7);
    }    
}
