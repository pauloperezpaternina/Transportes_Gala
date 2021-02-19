
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Adsistemas
 */
public class ChoferesDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    //Carros c = new Carros();
    
    public List listar() {
        List<Choferes> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from choferes");
            rs = ps.executeQuery();
            while (rs.next()) {
                Choferes ch = new Choferes();
                
                ch.setIdchofer(rs.getInt(1));
                ch.setCc(rs.getString(2));
                ch.setNombre(rs.getString(3));
                ch.setApellido(rs.getString(4));
                ch.setGenero(rs.getString(5));
                ch.setFechanacimiento(rs.getString(6));
                ch.setEmail(rs.getString(7));
                ch.setTelefono(rs.getString(8));
                ch.setPassword(rs.getString(9));
                
                datos.add(ch);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
    public int agregar(Choferes c){
        int r=0;
        String sql="insert into choferes(cc,nombre,apellido,genero,fechanacimiento,email,telefono,password)alues(?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setString(1,c.getCc());
            ps.setString(2,c.getNombre());
            ps.setString(3,c.getApellido());
            ps.setString(4,c.getGenero());
            ps.setString(5,c.getFechanacimiento());
            ps.setString(6,c.getEmail());
            ps.setString(7,c.getTelefono());
            ps.setString(8,c.getPassword());
           
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r; 
    }
    
    public int Actualizar(Choferes c) {  
        int r=0;
        String sql="update choferes set cc=?,nombre=?,apellido=?,genero=?,fechanacimiento=?,email=?,telefono=?,password=? where idchofer=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);  
            
            ps.setString(1,c.getCc());
            ps.setString(2,c.getNombre());
            ps.setString(3,c.getApellido());
            ps.setString(4,c.getGenero());
            ps.setString(5,c.getFechanacimiento());
            ps.setString(6,c.getEmail());
            ps.setString(7,c.getTelefono());
            ps.setString(8,c.getPassword());
            ps.setInt(9,c.getIdchofer());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
    
    public int Delete(int id){
        int r=0;
        String sql="delete from carros where idcarro="+id;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
}
