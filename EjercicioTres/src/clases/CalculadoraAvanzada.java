package clases;

import java.util.List;

public class CalculadoraAvanzada extends Calculadora {

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
    
    public double potencia(List<Double> numeros) {        
        double num = 0;
        for(double numero : numeros){
            num = Math.pow(numero, 2);
        }
        historial.add("Resultado de la potencia es " + num);
        return num;
    }
    
    public double raiz(List<Double> numeros) {        
        double num = 0;
        for(double numero: numeros){
            num = Math.sqrt(numero);
        }
        historial.add("Resultado de la raiz es " + num);
        return num;
    }
        
    @Override
    public void operarCalculadora() {
        int opcion;
        do {
            System.out.println("\nCalculadora Avanzada");
            System.out.println("""
                            Ingrese una opcion:
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Potencia a la 2
                            6. Raiz Cuadrada  
                            7. Salir""");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1 -> {
                    double total;
                    List<Double> numerosSuma = calcular();
                    total = suma(numerosSuma);
                    System.out.println("El resultado de la suma es: " + total);
                }
                case 2 -> {
                    double total;
                    List<Double> numerosResta = calcular();
                    total = resta(numerosResta);
                    System.out.println("El resultado de la resta es: " + total);
                }
                case 3 -> {
                    double total;
                    List<Double> numerosMultiplicacion = calcular();
                    total = multiplicacion(numerosMultiplicacion);
                    System.out.println("El resultado de la multiplicacion es: " + total);
                }
                case 4 -> {
                    double total;
                    List<Double> numerosDivision = calcular();
                    total = division(numerosDivision);
                    System.out.println("El resultado de la division es: " + total);
                }
                case 5 -> {
                    double total;
                    List<Double> numerosPotencia = calcular();
                    total = potencia(numerosPotencia);
                    System.out.println("El resultado de la potencia es: " + total);
                }
                case 6 -> {
                    double total;
                    List<Double> numerosRaiz = calcular();
                    total = raiz(numerosRaiz);
                    System.out.println("El resultado de la raiz es: " + total);
                }
                case 7 -> {
                }
                default -> System.out.println("Opcion incorrecta");
            }
        } while (opcion != 7);
    }    
}
