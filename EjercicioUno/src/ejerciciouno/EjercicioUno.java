package ejerciciouno;

import Clases.ModeloPersona;
import Clases.Pedro;
import Clases.Pepita;


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

            Pedro pedro1 = new Pedro(); 
            ModeloPersona datosPedro = new ModeloPersona("Negro", 29, "Pedro");
            pedro1.llenarInformacionPersona(datosPedro);
            System.out.println(pedro1.tocarPiano("The river flows in you"));
            System.out.println(pedro1.caminar());

            // Imprimir la información de Pedro
            System.out.println("Pedro tiene el pelo de color " + pedro1.personaGlobal.getColorPelo() + " de nombre " + pedro1.personaGlobal.getNombre() + " y su edad es " + pedro1.personaGlobal.getEdad());
            System.out.println(pedro1.imprimirInformacionPersona());

            System.out.println("\n--------------------------------\n");

            Pepita pepita1 = new Pepita();
            ModeloPersona datosPepita = new ModeloPersona("Rojo", 25, "Pepita");
            pepita1.llenarInformacionPersona(datosPepita);
            System.out.println(pepita1.caminar());
            System.out.println(pepita1.tocarFlauta("Los pollitos dice..."));

            // Imprimir la información de Pepita
            System.out.println("Pepita tiene el pelo de color " + pepita1.personaGlobal.getColorPelo() + " de nombre " + pepita1.personaGlobal.getNombre() + " y su edad es " + pepita1.personaGlobal.getEdad());
            System.out.println(pepita1.imprimirInformacionPersona());

    }
}
