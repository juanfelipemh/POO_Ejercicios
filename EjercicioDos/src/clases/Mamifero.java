package clases;

public class Mamifero extends Animal {
    
    public String agruparManda(int cantidad){
        if(cantidad == 1){
            return "El animal esta solo...";
        } if (cantidad <= 0) {
            return "0 animales no es correcto";
        }
        return "La manada se agrupa y en total hay " + cantidad + " animales";
    }
}
