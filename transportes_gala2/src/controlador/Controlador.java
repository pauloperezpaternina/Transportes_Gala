package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.CarrosDAO;
import modelo.Carros;
import vista.carros;

import vista.choferes;
import modelo.ChoferesDAO;
import modelo.Choferes;
import vista.principal;

import controlador.Controlador;

public class Controlador implements ActionListener {
    CarrosDAO dao = new CarrosDAO();
    Carros c = new Carros();
    
    ChoferesDAO chdao = new ChoferesDAO();
    Choferes ch = new Choferes();
    
    principal p= new principal();
    
    carros vista = new carros();
    choferes vistach = new choferes();
    DefaultTableModel modelo = new DefaultTableModel();
    

    public Controlador(carros v) {
        this.vista=v;
       // this.vistach=vv;
        
        this.vista.btnlistar.addActionListener(this);
        this.vista.btnguardar.addActionListener(this);
        this.vista.btneditar.addActionListener(this);
        this.vista.btnactualizar.addActionListener(this);            
        this.vista.btneliminar.addActionListener(this);
        this.vista.btnnuevo.addActionListener(this); 
        
        this.vistach.btnlistar.addActionListener(this);
        this.vistach.btnguardar.addActionListener(this);
        this.vistach.btneditar.addActionListener(this);
        this.vistach.btnactualizar.addActionListener(this);            
        this.vistach.btneliminar.addActionListener(this);
        this.vistach.btnnuevo.addActionListener(this); 
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnlistar){
            limpiarTabla();
            listar(vista.tabla);
            nuevo();
        }
        if(e.getSource()==vista.btnguardar){
            agregar();
            limpiarTabla();
            listar(vista.tabla);
            nuevo();
        }
        
        if(e.getSource()==vista.btnactualizar){
            Actualizar();
            limpiarTabla();
            listar(vista.tabla);
            nuevo();
        }
        
        if (e.getSource() == vista.btneditar) {
            int fila = vista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debee Seleccionar Una fila..!!");
            } else {
                int idcarro = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
                String placa = (String) vista.tabla.getValueAt(fila, 1);
                String marca = (String) vista.tabla.getValueAt(fila, 2);
                String version = (String) vista.tabla.getValueAt(fila, 3);
                String modelo = (String) vista.tabla.getValueAt(fila, 4);
                String color = (String) vista.tabla.getValueAt(fila, 5);
                int numpuertas = Integer.parseInt((String) vista.tabla.getValueAt(fila, 6).toString());
                String tipocombustible = (String) vista.tabla.getValueAt(fila, 7);
                int cilindraje = Integer.parseInt((String) vista.tabla.getValueAt(fila, 8).toString());
                int puestos = Integer.parseInt((String) vista.tabla.getValueAt(fila, 9).toString());
                float valor = Float.parseFloat((String) vista.tabla.getValueAt(fila, 10).toString());
                int idchofer = Integer.parseInt((String) vista.tabla.getValueAt(fila, 11).toString());
               
                vista.txtidcarro.setText("" + idcarro);
                vista.txtplaca.setText(placa);
                vista.txtmarca.setText(marca);
                vista.txtversion.setText(version);
                vista.txtmodelo.setText(modelo);
                vista.txtcolor.setText(color);
                vista.txtnumpuertas.setText("" + numpuertas);
                vista.txttipocombustible.setText(tipocombustible);
                vista.txtcilindraje.setText("" + cilindraje);
                vista.txtpuestos.setText("" + puestos);
                vista.txtvalor.setText("" + valor);
                vista.txtidchofer.setText("" + idchofer);
            }
        }
        
        if (e.getSource() == vista.btneliminar) {
            delete();
            listar(vista.tabla);
            nuevo();
        }
        
        if (e.getSource() == vista.btnnuevo) {
            nuevo();
        }
    }
    
    public void agregar() {
        String placa = vista.txtplaca.getText();
        String marca = vista.txtmarca.getText();
        String version = vista.txtversion.getText();
        String modelo = vista.txtmodelo.getText();
        String color = vista.txtcolor.getText();
        Integer numpuertas = Integer.parseInt(vista.txtnumpuertas.getText());
        String tipocombustible = vista.txttipocombustible.getText();
        Integer cilindraje = Integer.parseInt(vista.txtcilindraje.getText());
        int puestos = Integer.parseInt(vista.txtpuestos.getText());
        float valor = Float.parseFloat(vista.txtvalor.getText());
        int idchofer = Integer.parseInt(vista.txtidchofer.getText());
        
        c.setPlaca(placa);
        c.setMarca(marca);
        c.setVersion(version);
        c.setModelo(modelo);
        c.setColor(color);
        c.setNumpuertas(numpuertas);
        c.setTipocombustible(tipocombustible);
        c.setCilindraje(cilindraje);
        c.setPuestos(puestos);
        c.setValor(valor);
        c.setIdchofer(idchofer);
        
        int r = dao.agregar(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Carro Agregado con Exito.");
        } else {
            JOptionPane.showMessageDialog(vista, "Error");
        }
        limpiarTabla();
    }
    
    public void Actualizar(){
        int idcarro = Integer.parseInt(vista.txtidcarro.getText());
        String placa = vista.txtplaca.getText();
        String marca = vista.txtmarca.getText();
        String version = vista.txtversion.getText();
        String modelo = vista.txtmodelo.getText();
        String color = vista.txtcolor.getText();
        Integer numpuertas = Integer.parseInt(vista.txtnumpuertas.getText());
        String tipocombustible = vista.txttipocombustible.getText();
        Integer cilindraje = Integer.parseInt(vista.txtcilindraje.getText());
        int puestos = Integer.parseInt(vista.txtpuestos.getText());
        float valor = Float.parseFloat(vista.txtvalor.getText());
        int idchofer = Integer.parseInt(vista.txtidchofer.getText());
        
        c.setPlaca(placa);
        c.setMarca(marca);
        c.setVersion(version);
        c.setModelo(modelo);
        c.setColor(color);
        c.setNumpuertas(numpuertas);
        c.setTipocombustible(tipocombustible);
        c.setCilindraje(cilindraje);
        c.setPuestos(puestos);
        c.setValor(valor);
        c.setIdchofer(idchofer);
        c.setIdcarro(idcarro);
        
        int r=dao.Actualizar(c);
        
        if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Carro Actualizado con Exito.");
        }else {
                JOptionPane.showMessageDialog(vista, "Error en actualizar");
        }
        limpiarTabla();
        listar(vista.tabla);
    }
    
    public void delete() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe Seleccionar una Fila...!!!");
        } else {
            int idcarro = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
            dao.Delete(idcarro);
            System.out.println("El Resultado es" + idcarro);
            JOptionPane.showMessageDialog(vista, "Usuario Eliminado...!!!");
        }
        limpiarTabla();
    }
    
    public void nuevo() {
        vista.txtidcarro.setText("");
        vista.txtplaca.setText("");
        vista.txtmarca.setText("");
        vista.txtversion.setText("");
        vista.txtmodelo.setText("");
        vista.txtcolor.setText("");
        vista.txtnumpuertas.setText("");
        vista.txttipocombustible.setText("");
        vista.txtcilindraje.setText("");
        vista.txtpuestos.setText("");
        vista.txtvalor.setText("");
        vista.txtidchofer.setText("");
        vista.txtplaca.requestFocus();
    }

    public void listar(JTable tabla) {
        //centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Carros> lista =dao.listar();
        Object[] objeto = new Object[12];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdcarro();
            objeto[1] = lista.get(i).getPlaca();
            objeto[2] = lista.get(i).getMarca();
            objeto[3] = lista.get(i).getVersion();
            objeto[4] = lista.get(i).getModelo();
            objeto[5] = lista.get(i).getColor();
            objeto[6] = lista.get(i).getNumpuertas();
            objeto[7] = lista.get(i).getTipocombustible();
            objeto[8] = lista.get(i).getCilindraje();
            objeto[9] = lista.get(i).getPuestos();
            objeto[10] = lista.get(i).getValor();
            objeto[11] = lista.get(i).getIdchofer();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    
    void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
}
