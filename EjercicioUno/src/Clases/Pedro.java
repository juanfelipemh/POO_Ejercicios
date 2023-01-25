package Clases;

public class Pedro extends Persona {

    public String tocarPiano(String cancion){
        return "Pedro esta tocando en el piano la cancion: " + cancion;
    }
    
    @Override
    public String caminar(){
        return "Pedro esta caminando muy rapido..."; // Se sobreescribe el método y se le asigna un nuevo comportamiento
    }
   
}
