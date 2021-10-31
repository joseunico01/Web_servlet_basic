package mito.interfaces;

import java.util.List;
import mito.BBDD.Persona;

public interface DAOPersona {
        
        public void registrar(Persona per) throws Exception;
        public void modificar(Persona per) throws Exception;
        public void eliminar(Persona per) throws Exception;
        public List<Persona> listar() throws Exception;
        
        
}
