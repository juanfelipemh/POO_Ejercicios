package Clases;

import Interface.AccionPersona;

public class Persona implements AccionPersona { // Implementa la interface creada para sobreescribir sus métodos en Persona
    
     // Se crea una variable global de tipo ModeloPersona
    public ModeloPersona crearPersona;
    
    // Método recibe como parámetro los datos de la Clase Padre enviados a través de la variable global y recibe como parámetro los datos de la instancia en main ModeloPersona
    public void llenarInformacionPersona(ModeloPersona datosPersona){
        crearPersona = datosPersona;
    }
    
    // Retorna los valores almacenados en la variable global, y se llama en la instancia del main de las clases hijas "Pedro" y "Pepita"
    public String imprimirInformaciónPersona(){
        return crearPersona.getNombre() + " tiene el cabello de color " + crearPersona.getColorPelo() + " y su edad es " + crearPersona.getEdad();
    }
    
    // Otro método que recibe parámetros para imprimir el Objeto ModeloPersona, que se llama al instanciar modelo Pedro y Pepita
    public String llenarDatos(String colorPelo, int edad, String nombre){
        ModeloPersona persona = new ModeloPersona(colorPelo, edad, nombre);
        return "Color pelo: " + persona.getColorPelo()+ "\nEdad: " + persona.getEdad() + "\nNombre: " + persona.getNombre();
    }
    
    @Override
    public String caminar() {
        return "Caminando..."; 
    }

    @Override
    public String saltar() {
        return "Saltando..."; 
    }

    @Override
    public String gritar() {
        return "Gritando..."; 
    }
    
    
}
