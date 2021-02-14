package pTransporte;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class FrmTransporte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTransporte frame = new FrmTransporte();
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
	public FrmTransporte() {
		setResizable(false);
		setTitle("Transportes Gala");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	      int height = pantalla.height;
	      int width = pantalla.width;
		setBounds((width-734)/2, (height-492)/2, 734, 492);
		contentPane = new JPanel();
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrmTransporte.class.getResource("/imagenes/proyecto-carros-400x100.jpeg")));
		lblNewLabel.setBounds(395, -12, 327, 213);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa");
		lblNewLabel_1.setBounds(12, 12, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Placa");
		lblNewLabel_1_1.setBounds(11, 37, 70, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Placa");
		lblNewLabel_1_2.setBounds(80, 141, 70, 15);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Placa");
		lblNewLabel_1_3.setBounds(159, 162, 70, 15);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Placa");
		lblNewLabel_1_4.setBounds(11, 66, 70, 15);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Placa");
		lblNewLabel_1_5.setBounds(204, 179, 70, 15);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Placa");
		lblNewLabel_1_6.setBounds(101, 239, 70, 15);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Placa");
		lblNewLabel_1_7.setBounds(164, 233, 70, 15);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Placa");
		lblNewLabel_1_8.setBounds(229, 237, 70, 15);
		contentPane.add(lblNewLabel_1_8);
	}
}
