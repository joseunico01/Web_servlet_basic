package mito.BBDD;

import mito.interfaces.DAOPersona;
import mito.interfaces.DAOPersonaImpl;

public class ConexionBBDD {

public static void main(String[] args){
     Persona per=new Persona();

     /*
     //registrar
     per.setNombre("MI CODE");

        try {
             DAOPersona dao=new DAOPersonaImpl();
             dao.registrar(per);

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
*/
     /*
     //modificar
     per.setId(2);
     per.setNombre("JAIME");
        try {
             DAOPersona dao=new DAOPersonaImpl();
             dao.modificar(per);

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
*/
     /*
     //eliminar
     per.setId(2);
     per.setNombre("JAIME");
        try {
             DAOPersona dao=new DAOPersonaImpl();
             dao.eliminar(per);

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
     
*/
        //listar
     per.setId(2);
     per.setNombre("JAIME");
        try {
             DAOPersona dao=new DAOPersonaImpl();
             for(Persona p:dao.listar()){
                     System.out.println(p.getNombre());
             }

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        
}
}
/*
MitoCode
Tutorial Java SE - 52 Patrón DAO
*/
