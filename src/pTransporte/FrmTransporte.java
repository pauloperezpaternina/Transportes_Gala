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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		lblNewLabel.setIcon(new ImageIcon(FrmTransporte.class.getResource("/imagenes/proyecto-carros-800x400.jpeg")));
		lblNewLabel.setBounds(12, -12, 710, 340);
		contentPane.add(lblNewLabel);
		
		JButton btnCarros = new JButton("Carros");
		btnCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frmcarros oncarros = new Frmcarros();
				oncarros.setVisible(true);
						
			}
		});
		btnCarros.setBounds(168, 366, 117, 25);
		contentPane.add(btnCarros);
		
		JButton btnNewButton = new JButton("Choferes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frmchoferes onchoferes=new Frmchoferes();
				onchoferes.setVisible(true);
			}
		});
		btnNewButton.setBounds(472, 366, 117, 25);
		contentPane.add(btnNewButton);
	}
}
