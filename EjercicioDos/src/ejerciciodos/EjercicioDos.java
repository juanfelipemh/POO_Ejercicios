package ejerciciodos;

import clases.Colibri;
import clases.Vaca;

public class EjercicioDos {

    public static void main(String[] args) {
        
        Colibri colibri = new Colibri();
        System.out.println(colibri.morir(2005, 2015, "chocarse contra un avion"));
        System.out.println(colibri.reencarnar("Reencarno en una papa"));
        System.out.println(colibri.alimentarse());
        System.out.println(colibri.crearNido(false));
        
        System.out.println("\n---------------------------------\n");
        
        Vaca vaca = new Vaca();
        System.out.println(vaca.morir(2012, 2022, "le dio covid a la pobre"));
        System.out.println(vaca.reencarnar("Vamos lola "));
        System.out.println(vaca.dormir());
        System.out.println(vaca.agruparManda(10));
        
        System.out.println("\n---------------------------------\n");
        
        System.out.println(colibri.imprimirInformacionAnimal());
        System.out.println("-------------------------------------");
        System.out.println(vaca.imprimirInformacionAnimal());  
    } 
}