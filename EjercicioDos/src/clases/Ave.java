package clases;

public class Ave extends Animal {
    
    public String crearNido(boolean tieneNido){
        return (tieneNido == true ? "Tiene nido" : "No tiene nido");
    }   

    @Override
    public String desplazarse() {
        return "Volando hacia otro lugar...";
    } 
}    

