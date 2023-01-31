package clases;

import interfaces.Muerte;

public class Colibri extends Ave implements Muerte {
    
    @Override
    public String alimentarse(){
        return "Esta comiendo gusanos";
    }
       
    @Override
    public void morir(int anoNacimiento, int anoFallecimiento, String causaMuerte) {
        int edad;
        edad = anoFallecimiento - anoNacimiento;
        System.out.println("La fecha de su muerte es " + anoFallecimiento +", vivio " + edad + " anios y murio por " + causaMuerte);                           
    }

    @Override
    public String reencarnar(String dato) {
        
       return dato;
    }
    
    /**
     * Se crea constructor que NO recibe parámetros, pero dentro se llena la información de Colibri desde el ModeloAnimal
     */
    public Colibri(){
        ModeloAnimal datosColibri = new ModeloAnimal("Pepita", "Azul", 15, "Carnivora", 1);
        llenarInformacionAnimal(datosColibri);      
    }
    
    /**
    * Sobrecarga de constructor pero que recibe un parámetro. 
    * @param datosColibri Este recibe el dato enviado a la variable global
    */
    public Colibri(ModeloAnimal datosColibri){
        llenarInformacionAnimal(datosColibri);      
    }
}
