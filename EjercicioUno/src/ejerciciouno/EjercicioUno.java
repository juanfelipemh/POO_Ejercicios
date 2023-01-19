package ejerciciouno;

import Clases.ModeloPersona;
import Clases.Pedro;
import Clases.Pepita;
import Clases.Persona;

/* 
Main debe:

Instanciar pedro
Crear el modelo persona de pedro
en pedro Llamar llenar informacion y enviar el modelo de pedro
en pedro Llamar tocar piano
en pedro llamar caminar
Crear un mensaje con la informacion de pedro, que se almaceno en la variable global del padre que diga “Pedro tiene pelo de color{ColorPelo} de nombre {Nombre } y Edad {edad}
Instanciar pepita
Crear modelo persona de pepita
En pepita llamar llenar informacion y enviar el modelo de pepita
En pepita llamar caminar
En pepita llamar tocar flauta e imprimir el mensaje en consola

*/

public class EjercicioUno {

    public static void main(String[] args) {

        Pedro pedro = new Pedro(); 
        ModeloPersona datosPedro = new ModeloPersona("Negro", 29, "Pedro");
        pedro.llenarInformacionPersona(datosPedro);
        System.out.println(pedro.tocarPiano("The river flows in you"));
        System.out.println(pedro.caminar());
        System.out.println("Pedro tiene el pelo de color " + pedro.crearPersona.getColorPelo() + " de nombre " + pedro.crearPersona.getNombre() + " y su edad es " + pedro.crearPersona.getEdad());
        
        System.out.println("\n--------------------------------\n");

        Pepita pepita = new Pepita();
        ModeloPersona datosPepita = new ModeloPersona("Rojo", 25, "Pepita");
        pepita.llenarInformacionPersona(datosPepita);
        System.out.println(pepita.caminar());
        System.out.println(pepita.tocarFlauta("Los pollitos dice..."));
        System.out.println("Pepita tiene el pelo de color " + pedro.crearPersona.getColorPelo() + " de nombre " + pedro.crearPersona.getNombre() + " y su edad es " + pedro.crearPersona.getEdad());
        
        Persona datos = new Persona();
        System.out.println(datos);
        
    }
}
