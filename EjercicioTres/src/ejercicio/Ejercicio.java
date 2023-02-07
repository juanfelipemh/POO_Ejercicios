package ejercicio;

import clases.Calculadora;
import clases.CalculadoraAvanzada;
import clases.CalculadoraBasica;
import clases.CalculadoraInfantil;
import java.util.List;

import java.util.Scanner;

public class Ejercicio {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
 
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
                }
                case 2 -> {
                    CalculadoraAvanzada calculadoraAvanzada = new CalculadoraAvanzada();
                    calculadoraAvanzada.operarCalculadora();
                }
                case 3 -> {
                    CalculadoraInfantil calculadoraInfantil = new CalculadoraInfantil();
                    calculadoraInfantil.operarCalculadora();
                }
                case 4 -> {
                    System.out.println("Resultados");
                    Calculadora res = new Calculadora();
                    List<String> datos = res.getHistorial();
                    System.out.println(datos.size());
                    for(String i : datos){
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
