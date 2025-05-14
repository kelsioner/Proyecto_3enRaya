import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JComboBox;

public class MainApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEdad;
	private JTextField txtApellido;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
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
	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBackground(UIManager.getColor("textHighlight"));
		btnNewButton.setBounds(10, 132, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBackground(UIManager.getColor("textHighlight"));
		btnNewButton_1.setBounds(105, 132, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txtEdad = new JTextField();
		txtEdad.setBackground(SystemColor.activeCaption);
		txtEdad.setBounds(108, 93, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBackground(SystemColor.activeCaption);
		txtApellido.setBounds(108, 60, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(SystemColor.activeCaption);
		txtNombre.setBounds(108, 29, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(24, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(24, 63, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setBounds(24, 96, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 166, 184, 84);
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Edad");
		panel.add(lblNewLabel_2_1);
		
		JButton btnNewButton_2 = new JButton("Visualizar");
		btnNewButton_2.setBackground(UIManager.getColor("textHighlight"));
		btnNewButton_2.setBounds(285, 193, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JList list = new JList();
		list.setBackground(SystemColor.activeCaption);
		list.setBounds(285, 29, 89, 123);
		contentPane.add(list);
		
	}
}