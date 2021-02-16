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

public class Controlador implements ActionListener {
    CarrosDAO dao = new CarrosDAO();
    Carros c = new Carros();
    carros vista = new carros();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(carros v) {
        this.vista=v;
        this.vista.btnlistar.addActionListener(this);
        this.vista.btnguardar.addActionListener(this);
        this.vista.btneditar.addActionListener(this);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnlistar){
            listar(vista.tabla);
        }
        if(e.getSource()==vista.btnguardar){
            agregar();
            listar(vista.tabla);
        }
        
        if (e.getSource() == vista.btneditar) {
            int fila = vista.tabla.getSelectedRow();
             JOptionPane.showMessageDialog(vista, fila);
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
                /*vista.txtNom.setText(nom);
                vista.txtCorreo.setText(correo);
                vista.txtTel.setText(tel);*/
            }
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
        //limpiarTabla();
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
    
}
