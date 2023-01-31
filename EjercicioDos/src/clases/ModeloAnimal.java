package clases;

public class ModeloAnimal {
    private String nombre;
    private String color;
    private int tamanoEnCms;
    private String tipoAlimentacion;
    private float peso;

    public ModeloAnimal(String nombre, String color, int tamanoEnCms, String tipoAlimentacion, float peso) {
        this.nombre = nombre;
        this.color = color;
        this.tamanoEnCms = tamanoEnCms;
        this.tipoAlimentacion = tipoAlimentacion;
        this.peso = peso;
    }
    
    public ModeloAnimal(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanoEnCms() {
        return tamanoEnCms;
    }

    public void setTamanoEnCms(int tamanoEnCms) {
        this.tamanoEnCms = tamanoEnCms;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
