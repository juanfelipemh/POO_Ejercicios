package clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Calculadora {
    
    final String patronSplit = "\\+|-|\\*|/";
    
    public String datoOperacion;
    
    public List<String> historial = new ArrayList<>();
    
    public List<String> getHistorial(){
        return historial;
    }
    
    public List<Double> calcular() {
        List<Double> numeros = new ArrayList<>();
        String datosOperando;
        String[] datosSeparados;
        datosOperando = JOptionPane.showInputDialog("Ingrese los números: ");
        datoOperacion = datosOperando;
        datosSeparados = datosOperando.split(patronSplit);
        for (String numero : datosSeparados) {
            numeros.add(Double.valueOf(numero));          
        }
        return numeros;
    }
    
    public double suma(List<Double> numeros) {
        double num = 0;
        for (double i : numeros) {
            num += i;   
        }
        historial.add("Resultado de la suma " + datoOperacion + " es " + num);
        return num;
    }

    public double resta(List<Double> numeros) {
        double num = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            num -= numeros.get(i);
        }
        historial.add("Resultado de la resta " + datoOperacion + " es " + num);
        return num;
    }

    public double multiplicacion(List<Double> numeros) {
        double num = 1;
        for (double i : numeros) {
            num *= i;
        }
        historial.add("Resultado de la multiplicacion " + datoOperacion + " es " + num);
        return num;
    }

    public double division(List<Double> numeros) {
        double num = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            num = num / numeros.get(i);
        }
        historial.add("Resultado de la division " + datoOperacion + " es " + num);
        return num;
    }
    
    public void operarCalculadora() {
    }  
}
