package Clases;

public class ModeloPersona {
        private String colorPelo;
        private int edad;
        private String nombre;  

        public ModeloPersona(String colorPelo, int edad, String nombre) {
            this.colorPelo = colorPelo;
            this.edad = edad;
            this.nombre = nombre;
        }

        public void ModeloPersona(){};

        public String getColorPelo() {
            return colorPelo;
        }

        public void setColorPelo(String colorPelo) {
            this.colorPelo = colorPelo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    

    
}
