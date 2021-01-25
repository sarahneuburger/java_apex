package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import conexao.Conexao;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textoCodigo;
	private JTextField textoNome;
	private JTable table;
	private JLabel contador;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("436px"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("48px"),
				RowSpec.decode("45px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("139px"),}));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "2, 2, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("max(40dlu;default)"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("10dlu"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel btCodigo = new JLabel("C\u00F3digo");
		btCodigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btCodigo, "1, 1, right, default");
		
		textoCodigo = new JTextField();
		textoCodigo.setEditable(false);
		textoCodigo.setEnabled(false);
		panel.add(textoCodigo, "3, 1, fill, default");
		textoCodigo.setColumns(10);
		
		JLabel btNome = new JLabel("Nome");
		btNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btNome, "1, 3, right, default");
		
		textoNome = new JTextField();
		panel.add(textoNome, "3, 3, fill, default");
		textoNome.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "2, 3, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("50dlu"),},
			new RowSpec[] {
				RowSpec.decode("30dlu:grow"),}));
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textoNome.getText();
				if(nome.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, informe um nome válido.");
				} else {
					try {
					Conexao conexao = new Conexao();
					String sql = "insert into clientes (nome) values (?)";
					PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
					pstmt.setString(1, nome);
					pstmt.execute();
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
					} catch (Exception erro) {
						JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente.");
						System.out.println(erro.getMessage());
					}
					textoNome.setText("");
					table.setModel(listarDados());
					
				}
			}
		});
		panel_1.add(btCadastrar, "2, 1");
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja alterar os dados?");
				String novoNome = textoNome.getText();
				if(opcao == JOptionPane.YES_OPTION) { 
				 	try {
					Conexao conexao = new Conexao();
					String sql = "update clientes set nome = ? where codigo = ?";
					PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
					pstmt.setString(1, novoNome);
					pstmt.setInt(2, Integer.parseInt(textoCodigo.getText()));
					pstmt.execute();
					JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso.");
						} catch (Exception erro) {
							JOptionPane.showMessageDialog(null, "Alteração não realizada");
							System.out.println(erro.getMessage());
						} 
						
				}
					textoNome.setText("");
					table.setModel(listarDados());
				}
		});
		panel_1.add(btAlterar, "4, 1");
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir os dados?");
				if(opcao == JOptionPane.YES_OPTION) { 
				 	try {
					Conexao conexao = new Conexao();
					String sql = "delete from clientes where codigo = ?";
					PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
					pstmt.setInt(1, Integer.parseInt(textoCodigo.getText()));
					pstmt.execute();
					JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
						} catch (Exception erro) {
							JOptionPane.showMessageDialog(null, "Exclusão não realizada");
							System.out.println(erro.getMessage());
						} 
						
				}
					textoNome.setText("");
					table.setModel(listarDados());
			}
		});
		panel_1.add(btExcluir, "6, 1");
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btCadastrar.setEnabled(true);
				btAlterar.setEnabled(false);
				btExcluir.setEnabled(false);
				int linhaSelecionada = table.getSelectedRow();
				table.getSelectionModel().removeSelectionInterval(linhaSelecionada, 0);
				contador.setText("(0/0)");
				textoCodigo.setText("");
				textoNome.setText("");				
				
			}
		});
		panel_1.add(btCancelar, "8, 1");
		
		btCadastrar.setEnabled(true);
		btAlterar.setEnabled(false);
		btExcluir.setEnabled(false);
		btCancelar.setEnabled(false);
		
		contador = new JLabel("(0/0)");
		contador.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(contador, "2, 5");
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "2, 7, fill, fill");
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("default:grow"),}));
		
		JScrollPane tabela = new JScrollPane();
		tabela.addMouseListener(new MouseAdapter() {

		});
		panel_2.add(tabela, "1, 1, fill, fill");
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			
			// Realizar ação ao clicar na tabela
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linhaSelecionada = table.getSelectedRow();
				// essa tabela começa em 0
				// tabela aceita somente string, sempre é necessário converter
				textoCodigo.setText(table.getValueAt(linhaSelecionada, 0).toString());
				textoNome.setText(table.getValueAt(linhaSelecionada, 1).toString());
				contador.setText("(" + (linhaSelecionada + 1) + "/" + table.getRowCount() + ")");
				btCadastrar.setEnabled(false);
				btAlterar.setEnabled(true);
				btExcluir.setEnabled(true);
				btCancelar.setEnabled(true);
				
			}
		});
		table.setModel(listarDados());
//		table.setRowSelectionInterval(0, 0);
//		int linhaSelecionada = table.getSelectedRow();
//		contador.setText("(" + (linhaSelecionada + 1) + "/" + table.getRowCount() + ")");
		tabela.setViewportView(table);
	}
	
	// vinculando dados na tabela
	private static DefaultTableModel listarDados() {
		
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Código");
		dados.addColumn("Nome");
		
		try {
			Conexao conexao = new Conexao();
			String sql = "select * from clientes";
			
			Statement stmt = conexao.conectar().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dados.addRow(new Object[] {rs.getInt(1), rs.getString(2)});
			}
			
			
			} catch (Exception erro) { 
				JOptionPane.showMessageDialog(null, "Não foi possível carregar os dados da tabela.");
			}
		
		return dados;
	}

	
	
	}
