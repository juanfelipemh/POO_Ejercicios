
package Clases;


public class Pepita extends Persona {
    
    public String tocarFlauta(String cancion){
        return "A pepita le gusta tocar con la flauta la cancion: " + cancion;
    }
    
    @Override
    public String caminar(){
        return super.caminar(); // Llama el método creado en la clase Padre
    }
}
