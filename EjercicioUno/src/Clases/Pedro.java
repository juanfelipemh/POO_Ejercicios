package Clases;

public class Pedro extends Persona {

    public String tocarPiano(String cancion){
        return "Pedro esta tocando en el piano la cancion: " + cancion;
    }
    
    @Override
    public String caminar(){
        return "Pedro esta caminando muy rapido..."; // Se le asigna el nuevo atributo a caminar 
    }
   
}
