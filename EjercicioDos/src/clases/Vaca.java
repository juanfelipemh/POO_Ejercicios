package clases;

import interfaces.Muerte;

public class Vaca extends Mamifero implements Muerte{

    @Override
    public String agruparManda(int cantidad) {
        return super.agruparManda(cantidad); 
    }
    
    @Override
    public String morir(int anoNacimiento, int anoFallecimiento, String causaMuerte) {
        int edad;
        float valor;
        edad = (anoFallecimiento - anoNacimiento);
        valor = edad * 2;
        return "La fecha de su muerte " + anoFallecimiento + ", el numero es " + (valor % 2 == 0 ? "par" : "impar") + " y vivio " + edad + " anios y murio por " + causaMuerte;
    }

    @Override
    public String reencarnar(String dato) {
        return dato + ", tu puedes hacerlo!";
    }
    
    /*
    * Igual que en el Modelo Colibri
    */
    public Vaca(){
        ModeloAnimal datosVaca = new ModeloAnimal("Lola", "blanco y negro", 150, "Hervibora", 250);
        llenarInformacionAnimal(datosVaca);
    }
}
