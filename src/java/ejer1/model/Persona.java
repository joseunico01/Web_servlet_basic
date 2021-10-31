package ejer1.model;

public class Persona {

        private String rut;
        private String nombre;
        private int edad;
        
        //Para elimninar con este atributo
        private boolean selected; 
                
        public Persona(){
        }

        public Persona(String rut, String nombre, int edad) {
                this.rut = rut;
                this.nombre = nombre;
                this.edad = edad;
        }

        public String getRut() {
                return rut;
        }

        public void setRut(String rut) {
                this.rut = rut;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        //creamos estas, para acompañar a nuestro boolean
        public boolean isSelected() {
                return selected;
        }

        public void setSelected(boolean selected) {
                this.selected = selected;
        }
        
        
}
