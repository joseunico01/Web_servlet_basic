package ejer1.bean;

import ejer1.model.Persona;
import java.util.ArrayList;

public class PersonaBean {
        
        private ArrayList<Persona> lista=new ArrayList<>();

        public PersonaBean(){
                lista.add(new Persona("1","Juan",20));
                lista.add(new Persona("2","Carlos",20));
                lista.add(new Persona("3","Tomas",20));
                lista.add(new Persona("4","Maria",20));
                lista.add(new Persona("5","Claudia",20));
        }
        public ArrayList<Persona> getLista(){
                return lista;
        }
}
