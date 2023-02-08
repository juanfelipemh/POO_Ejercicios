package ejercicio;

import clases.CalculadoraAvanzada;
import clases.CalculadoraBasica;
import clases.CalculadoraInfantil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        
        List<String> historialGeneral = new ArrayList<>();
 
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                CALCULADORA\n
                                                Ingrese una opcion: 
                                                1. Calculadora Basica
                                                2. Calculadora Avanzada 
                                                3. Calculadora Infantil
                                                4. Resultados
                                                5. Cerrar aplicacion"""));          
            switch (opcion) {
                case 1 -> {
                    CalculadoraBasica calculadoraBasica = new CalculadoraBasica();
                    calculadoraBasica.operarCalculadora();
                    historialGeneral.addAll(calculadoraBasica.getHistorial());
                }
                case 2 -> {
                    CalculadoraAvanzada calculadoraAvanzada = new CalculadoraAvanzada();
                    calculadoraAvanzada.operarCalculadora();
                    historialGeneral.addAll(calculadoraAvanzada.getHistorial());
                }
                case 3 -> {
                    CalculadoraInfantil calculadoraInfantil = new CalculadoraInfantil();
                    calculadoraInfantil.operarCalculadora();
                    historialGeneral.addAll(calculadoraInfantil.getHistorial());
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null,  "Ver consola con los resultados" );
                    for(String i : historialGeneral){
                        System.out.println(i);
                    }
                }   
                case 5 ->
                    JOptionPane.showMessageDialog(null, "Gracias por su visita!");
                default ->
                    JOptionPane.showMessageDialog(null, "Opcion " + opcion + " errada");
            }
        } while (opcion != 5);
    }
}
