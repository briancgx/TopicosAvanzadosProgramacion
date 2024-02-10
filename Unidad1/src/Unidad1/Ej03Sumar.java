package Unidad1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej03Sumar extends JFrame {

	double num1 = 0.0, num2 = 0.0, resultado = 0.0;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej03Sumar frame = new Ej03Sumar();
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
	public Ej03Sumar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSumaDeNmeros = new JLabel("Suma de números");
		lblSumaDeNmeros.setFont(new Font("Dialog", Font.BOLD, 20));
		lblSumaDeNmeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumaDeNmeros.setBounds(64, 0, 253, 34);
		contentPane.add(lblSumaDeNmeros);
		
		txtNum1 = new JTextField();
		txtNum1.setToolTipText("Introducir Número");
		txtNum1.setBounds(203, 41, 114, 19);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Número 1");
		lblNumero1.setBounds(88, 43, 70, 15);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Número 2");
		lblNumero2.setBounds(88, 87, 70, 15);
		contentPane.add(lblNumero2);
		
		txtNum2 = new JTextField();
		txtNum2.setToolTipText("Introducir Número");
		txtNum2.setColumns(10);
		txtNum2.setBounds(203, 85, 114, 19);
		contentPane.add(txtNum2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Leer los numeros
				String sNum1 = txtNum1.getText();
				
				// Convertir a Double Con try catch
				try {
					num1 = Double.parseDouble(sNum1);
					
				} catch (NumberFormatException z) {
					// En caso de error
					num1 = 0.0;
					txtNum1.setText(""+num1);
				}
				
				num2 = Double.parseDouble(txtNum2.getText()); //Convertir a Double sin try catch
				
				
				// Sumar los dos numeros
				resultado = num1 + num2;
				
				// Mostrar resultado
				txtResultado.setText(""+resultado);
			}
		});
		btnSumar.setBounds(119, 131, 117, 25);
		contentPane.add(btnSumar);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(88, 191, 97, 15);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setToolTipText("");
		txtResultado.setColumns(10);
		txtResultado.setBounds(203, 189, 114, 19);
		contentPane.add(txtResultado);
	}
}
