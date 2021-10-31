package mito.interfaces;

import mito.DAO.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import mito.BBDD.Persona;

public class DAOPersonaImpl extends Conexion implements DAOPersona{

@Override
public void registrar(Persona per) throws Exception {
        try {
                this.conectar();
                PreparedStatement st=this.conexion.prepareStatement("insert into persona(nombre) values(?)");
                st.setString(1, per.getNombre());
                st.executeUpdate();
                
        } catch (Exception e) {
                throw e;
        }finally{
                this.cerrar();
        }
}

@Override
public void modificar(Persona per) throws Exception {
        try {
        this.conectar();
        PreparedStatement st=this.conexion.prepareStatement("update persona set nombre=? where id=?");
        st.setString(1, per.getNombre());
        st.setInt(2, per.getId());
        st.executeUpdate();
        
} catch (Exception e) {
        throw e;
}finally{
        this.cerrar();
}
}

@Override
public void eliminar(Persona per) throws Exception {
        try {
        this.conectar();
        PreparedStatement st=this.conexion.prepareStatement("delete from persona where id=?");
        st.setInt(1, per.getId());
        st.executeUpdate();
        
} catch (Exception e) {
        throw e;
}finally{
        this.cerrar();
}
}

@Override
public List<Persona> listar() throws Exception {
        List<Persona> lista=null;
        try {
        this.conectar();
        PreparedStatement st=this.conexion.prepareStatement("select * from persona");
        lista=new ArrayList();
        ResultSet rs=st.executeQuery();
        while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                lista.add(per);
        }
        
} catch (Exception e) {
        throw e;
}finally{
        this.cerrar();
}
        return lista;
}

}
