package AlunoView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AlunoController.AlunoController.AlunoListener;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class AlunoView extends JFrame {

	private JPanel contentPane;
	private JTextField primeiraNota;
	private JTextField segundaNota;
	private JTextField terceiraNota;
	private JTextField quartaNota;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField media;
	private JTextField situacao;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnCalcular;

	
	public int getNota1() {
		return Integer.parseInt(primeiraNota.getText());
	}

	public int getNota2() {
		return Integer.parseInt(segundaNota.getText());
	}

	public int getNota3() {
		return Integer.parseInt(terceiraNota.getText());
	}

	public int getNota4() {
		return Integer.parseInt(quartaNota.getText());
	}

	
	public int getMedia() {
		return Integer.parseInt(media.getText());
	}

	public void setMedia(int media) {
		this.media.setText(Integer.toString(media));
	}
	
	public String getSituacao() {
		return situacao.getText();
	}

	public void setSituacao(String situacao) {
		this.situacao.setText(situacao);
	}
	
	public void AlunoListener(ActionListener eventoBotaoCalcular) {
		btnCalcular.addActionListener(eventoBotaoCalcular);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoView frame = new AlunoView();
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
	public AlunoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		primeiraNota = new JTextField();
		primeiraNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		primeiraNota.setBounds(29, 85, 86, 39);
		contentPane.add(primeiraNota);
		primeiraNota.setColumns(10);
		
		segundaNota = new JTextField();
		segundaNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		segundaNota.setColumns(10);
		segundaNota.setBounds(161, 85, 86, 39);
		contentPane.add(segundaNota);
		
		terceiraNota = new JTextField();
		terceiraNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		terceiraNota.setColumns(10);
		terceiraNota.setBounds(313, 85, 86, 39);
		contentPane.add(terceiraNota);
		
		quartaNota = new JTextField();
		quartaNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		quartaNota.setColumns(10);
		quartaNota.setBounds(444, 85, 86, 39);
		contentPane.add(quartaNota);
		
		JLabel lblNewLabel = new JLabel("Insira as notas para calcular a m\u00E9dia:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(75, 0, 412, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1\u00AA nota");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29, 68, 86, 17);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("2\u00AA nota");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(161, 68, 86, 17);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("3\u00AA nota");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(313, 68, 86, 17);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("4\u00AA nota");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(444, 68, 86, 17);
		contentPane.add(lblNewLabel_4);
		
		media = new JTextField();
		media.setFont(new Font("Tahoma", Font.PLAIN, 14));
		media.setBounds(95, 243, 86, 39);
		contentPane.add(media);
		media.setColumns(10);
		
		situacao = new JTextField();
		situacao.setBounds(233, 243, 254, 39);
		contentPane.add(situacao);
		situacao.setColumns(10);
		
		lblNewLabel_5 = new JLabel("M\u00E9dia");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(95, 228, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(233, 228, 254, 14);
		contentPane.add(lblNewLabel_6);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBounds(174, 164, 202, 28);
		contentPane.add(btnCalcular);
	}

	public void AlunoListener(AlunoListener alunoListener) {
		// TODO Auto-generated method stub
		
	}
}
