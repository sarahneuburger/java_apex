package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

// Interface visual
// Other - windowbuilder - swing - jframe
// já diversos parâmetros, herança e imports

public class Teste extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
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
	// Criou uma tela crua, em branco
	public Teste() {
		setTitle("Formul\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "1, 1, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Nome:");
		panel.add(lblNewLabel, "1, 1, right, default");
		
		textField = new JTextField();
		panel.add(textField, "2, 1, fill, default");
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		panel.add(btnNewButton, "3, 1");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "1, 2, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1, "1, 1");
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3, "4, 1");
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_1.add(btnNewButton_9, "7, 1");
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_1.add(btnNewButton_7, "10, 1");
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_1.add(btnNewButton_10, "13, 1");
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_1.add(btnNewButton_8, "16, 1");
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2, "18, 1");
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4, "19, 1");
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5, "20, 1");
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_1.add(btnNewButton_6, "21, 1");
	}

}
