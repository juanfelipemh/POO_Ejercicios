package ejercicio;

import clases.CalculadoraAvanzada;
import clases.CalculadoraBasica;
import clases.CalculadoraInfantil;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Ejercicio {
    static Scanner entrada = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        List<String> historialGeneral = new ArrayList<>();
 
        int opcion;
        do {
            System.out.println("CALCULADORA");
            System.out.println();
            System.out.println("""
                           Ingrese una opcion: 
                           1. Calculadora Basica
                           2. Calculadora Avanzada 
                           3. Calculadora Infantil
                           4. Resultados
                           5. Cerrar aplicacion""");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());

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
                    System.out.println("Resultados");
                    for(String i : historialGeneral){
                        System.out.println(i);
                    }
                }   
                case 5 ->
                    System.out.println("Gracias por su visita!");
                default ->
                    System.out.println("Opcion errada");
            }
        } while (opcion != 5);
    }
}
