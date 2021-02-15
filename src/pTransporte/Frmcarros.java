package pTransporte;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Frmcarros extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtplaca;
	private JTextField txtmarca;
	private JTextField txtversion;
	private JTextField txtmodelo;
	private JTextField txtcolor;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmcarros frame = new Frmcarros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frmcarros() {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Carros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	      int height = pantalla.height;
	      int width = pantalla.width;
		setBounds((width-734)/2, (height-492)/2, 734, 492);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btncerarcarros = new JButton("Cerrar");
		btncerarcarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btncerarcarros.setBounds(405, 172, 89, 23);
		contentPane.add(btncerarcarros);
		
		JLabel lblNewLabel = new JLabel("Id Carro:");
		lblNewLabel.setBounds(37, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carros");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(332, 0, 63, 23);
		contentPane.add(lblNewLabel_1);
		
		txtid = new JTextField();
		txtid.setEditable(false);
		txtid.setBounds(123, 30, 86, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(37, 61, 46, 14);
		contentPane.add(lblPlaca);
		
		txtplaca = new JTextField();
		txtplaca.setColumns(10);
		txtplaca.setBounds(123, 58, 86, 20);
		contentPane.add(txtplaca);
		
		JLabel lblPlaca_1 = new JLabel("Marca:");
		lblPlaca_1.setBounds(37, 89, 46, 14);
		contentPane.add(lblPlaca_1);
		
		txtmarca = new JTextField();
		txtmarca.setColumns(10);
		txtmarca.setBounds(123, 86, 86, 20);
		contentPane.add(txtmarca);
		
		JLabel lblPlaca_1_1 = new JLabel("Versi\u00F3n:");
		lblPlaca_1_1.setBounds(37, 117, 46, 14);
		contentPane.add(lblPlaca_1_1);
		
		txtversion = new JTextField();
		txtversion.setColumns(10);
		txtversion.setBounds(123, 114, 86, 20);
		contentPane.add(txtversion);
		
		JLabel lblPlaca_1_2 = new JLabel("Modelo:");
		lblPlaca_1_2.setBounds(37, 145, 46, 14);
		contentPane.add(lblPlaca_1_2);
		
		txtmodelo = new JTextField();
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(123, 145, 86, 20);
		contentPane.add(txtmodelo);
		
		JLabel lblPlaca_1_3 = new JLabel("Color:");
		lblPlaca_1_3.setBounds(67, 170, 46, 14);
		contentPane.add(lblPlaca_1_3);
		
		txtcolor = new JTextField();
		txtcolor.setColumns(10);
		txtcolor.setBounds(123, 170, 86, 20);
		contentPane.add(txtcolor);
		
		JLabel lblPlaca_1_3_1 = new JLabel("No. Puertas:");
		lblPlaca_1_3_1.setBounds(246, 30, 63, 14);
		contentPane.add(lblPlaca_1_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(309, 30, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblPlaca_1_3_2 = new JLabel("Tipo Combustible:");
		lblPlaca_1_3_2.setBounds(223, 61, 86, 14);
		contentPane.add(lblPlaca_1_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(309, 58, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblPlaca_1_3_3 = new JLabel("Cilidraje:");
		lblPlaca_1_3_3.setBounds(263, 86, 46, 14);
		contentPane.add(lblPlaca_1_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(309, 83, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(309, 111, 86, 20);
		contentPane.add(textField_9);
		
		JLabel lblPlaca_1_3_3_1 = new JLabel("No. Puestos:");
		lblPlaca_1_3_3_1.setBounds(246, 115, 63, 14);
		contentPane.add(lblPlaca_1_3_3_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(309, 142, 86, 20);
		contentPane.add(textField_10);
		
		JLabel lblPlaca_1_3_3_1_1 = new JLabel("Valor:");
		lblPlaca_1_3_3_1_1.setBounds(256, 145, 40, 10);
		contentPane.add(lblPlaca_1_3_3_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(309, 173, 86, 20);
		contentPane.add(textField_11);
		
		JLabel lblPlaca_1_3_3_1_2 = new JLabel("Id. Chofer");
		lblPlaca_1_3_3_1_2.setBounds(246, 179, 86, 14);
		contentPane.add(lblPlaca_1_3_3_1_2);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(309, 204, 189, 20);
		contentPane.add(textField_12);
		
		JLabel lblPlaca_1_3_3_1_2_1 = new JLabel("Nombre Chofer:");
		lblPlaca_1_3_3_1_2_1.setBounds(223, 207, 86, 14);
		contentPane.add(lblPlaca_1_3_3_1_2_1);
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.setBounds(405, 29, 89, 23);
		contentPane.add(btnguardar);
		
		JButton btneditar = new JButton("Editar");
		btneditar.setBounds(405, 57, 89, 23);
		contentPane.add(btneditar);
		
		JButton btnlistar = new JButton("Listar");
		btnlistar.setBounds(405, 85, 89, 23);
		contentPane.add(btnlistar);
		
		JButton btneliminar = new JButton("Eliminar");
		btneliminar.setBounds(405, 113, 89, 23);
		contentPane.add(btneliminar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID_CHOFER", "VALOR", "PUESTOS", "CILINDRAJE", "COMBUSTIBLE", "PUERTAS", "COLOR", "MODELO", "VERSION", "MARCA", "PLACA", "ID"
			}
		));
		table.setBounds(37, 256, 571, 160);
		contentPane.add(table);
	}
}
