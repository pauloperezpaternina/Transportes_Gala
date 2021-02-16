
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
public class CarrosDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    //Carros c = new Carros();
    
    public List listar() {
        List<Carros> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from carros");
            rs = ps.executeQuery();
            while (rs.next()) {
                Carros c = new Carros();
                
                c.setIdcarro(rs.getInt(1));
                c.setPlaca(rs.getString(2));
                c.setMarca(rs.getString(3));
                c.setVersion(rs.getString(4));
                c.setModelo(rs.getString(5));
                c.setColor(rs.getString(6));
                c.setNumpuertas(rs.getInt(7));
                c.setTipocombustible(rs.getString(8));
                c.setCilindraje(rs.getInt(9));
                c.setPuestos(rs.getInt(10));
                c.setValor(rs.getFloat(11));
                c.setIdchofer(rs.getInt(12));
                
                datos.add(c);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
    public int agregar(Carros c){
        int r=0;
        String sql="insert into carros(placa,marca,version,modelo,color,numpuertas,tipocombustible,cilindraje,puestos,valor,idchofer)values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setString(1,c.getPlaca());
            ps.setString(2,c.getMarca());
            ps.setString(3,c.getVersion());
            ps.setString(4,c.getModelo());
            ps.setString(5,c.getColor());
            ps.setInt(6,c.getNumpuertas());
            ps.setString(7,c.getTipocombustible());
            ps.setInt(8,c.getCilindraje());
            ps.setInt(9,c.getPuestos());
            ps.setFloat(10,c.getValor());
            ps.setInt(11,c.getIdchofer());
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
    
    public int Actualizar(Carros c) {  
        int r=0;
        String sql="update carrros set placa=?,marca=?,version=?,modelo=?,color=?,numpuertas=?,tipocombustible=?,cilindraje=?,puestos=?,valor=?,idchofer=? where idcarro=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);  
            
            ps.setString(1,c.getPlaca());
            ps.setString(2,c.getMarca());
            ps.setString(3,c.getVersion());
            ps.setString(4,c.getModelo());
            ps.setString(5,c.getColor());
            ps.setInt(6,c.getNumpuertas());
            ps.setString(7,c.getTipocombustible());
            ps.setInt(8,c.getCilindraje());
            ps.setInt(9,c.getPuestos());
            ps.setFloat(10,c.getValor());
            ps.setInt(11,c.getIdchofer());
            ps.setInt(12,c.getIdcarro());
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
    
}
