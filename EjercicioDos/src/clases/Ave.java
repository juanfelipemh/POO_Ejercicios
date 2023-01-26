package clases;

public class Ave extends Animal {
    
    public String crearNido(boolean tieneNido){
         if(tieneNido){
            return "Tiene nido";
         } else {
             return "No tiene nido";
         }     
    }   

    @Override
    public String desplazarse() {
        return "Volando hacia otro lugar...";
    }
    
    
}    

