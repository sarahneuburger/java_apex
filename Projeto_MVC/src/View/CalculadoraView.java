package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CalculadoraView extends JFrame {

	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;
	private JButton btnCalcular;
	
	public int getNumero1() {
		return Integer.parseInt(numero1.getText());
	}


	public int getNumero2() {
		return Integer.parseInt(numero2.getText());
	}

	public int getResultado() {
		return Integer.parseInt(resultado.getText());
	}

	public void setResultado(int resultado) {
		this.resultado.setText(Integer.toString(resultado));
	}

	// Recebendo o que criamos no controller
	public void CalculadoraListener(ActionListener eventoBotaoCalcular) {
		btnCalcular.addActionListener(eventoBotaoCalcular);
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraView frame = new CalculadoraView();
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
	public CalculadoraView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); // para desenhar a mão livre
		setContentPane(contentPane);
		
		numero1 = new JTextField();
		numero1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numero1.setBounds(22, 109, 86, 44);
		contentPane.add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numero2.setColumns(10);
		numero2.setBounds(189, 109, 86, 44);
		contentPane.add(numero2);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(118, 122, 46, 14);
		contentPane.add(lblNewLabel);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		resultado.setColumns(10);
		resultado.setBounds(352, 109, 86, 44);
		contentPane.add(resultado);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(296, 125, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(186, 187, 89, 35);
		contentPane.add(btnCalcular);
	}
}
