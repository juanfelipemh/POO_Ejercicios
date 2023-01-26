package clases;

public class Animal {
    public ModeloAnimal variableGlobalAnimal;
    
    public void llenarInformacionAnimal(ModeloAnimal variableLocalAnimal){
         variableGlobalAnimal = variableLocalAnimal;
    }
    
    public String imprimirInformacionAnimal(){
        return """
               Datos Animales:  
               Nombre: """ + variableGlobalAnimal.getNombre() +
                "\nColor: " + variableGlobalAnimal.getColor() + 
                "\nTamano en cms: " + variableGlobalAnimal.getTamanoEnCms() + 
                "\nPeso kg: " + variableGlobalAnimal.getPeso() + 
                "\nTipo alimentacion: " + variableGlobalAnimal.getTipoAlimentacion();
    }
    
    public String alimentarse(){
        return "Comiendo...";
    }
    
    public String dormir(){
        return "Durmiendo...";
    }
    
    public String desplazarse(){
        return "Moviendose...";
    }
}
