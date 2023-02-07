package clases;

import java.util.List;

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
            System.out.println("\nCalculadora Infantil");
            System.out.println("""
                            Ingrese una opcion:
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Salir""");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1 -> {
                    double total;
                    List<Double> numerosSuma = calcular();
                    if(numerosSuma.size() > 2){
                        System.out.println("Unicamente ingrese 2 numeros");
                    } else {
                        total = suma(numerosSuma);
                        System.out.println("El resultado de la suma es: " + total);
                    }
                }
                case 2 -> {
                    double total;
                    List<Double> numerosResta = calcular();
                    if(numerosResta.size() > 2){
                        System.out.println("Unicamente ingrese 2 numeros");
                    } else {
                        total = resta(numerosResta);
                        System.out.println("El resultado de la resta es: " + total);
                    }
                }
                case 3 -> {
                    double total;
                    List<Double> numerosMultiplicacion = calcular();                  
                    if(numerosMultiplicacion.size() > 2){
                        System.out.println("Unicamente ingrese 2 numeros");
                    } else {
                        total = multiplicacion(numerosMultiplicacion);
                        System.out.println("El resultado de la multiplicacion es: " + total);
                    }
                }
                case 4 -> {
                    double total;
                    List<Double> numerosDivision = calcular();
                    if(numerosDivision.size() > 2){
                        System.out.println("Unicamente ingrese 2 numeros");
                    } else {
                        total = division(numerosDivision);
                        System.out.println("El resultado de la division es: " + total);
                    }
                }
                case 5 -> {
                }
                default -> System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);
    }
    
}
