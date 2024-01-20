package calculos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

public class Superficie extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Superficie() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tamanho tamanho = new Tamanho();
				tamanho.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblSuperficie = new JLabel("C\u00E1lculo do Fator dos Efeitos da Superf\u00EDcie\r\n");
		lblSuperficie.setBounds(135, 10, 516, 46);
		lblSuperficie.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblSuperficie);
		
		JTextPane txtSuperficie = new JTextPane();
		txtSuperficie.setFocusable(false);
		txtSuperficie.setEditable(false);
		txtSuperficie.setBackground(SystemColor.menu);
		txtSuperficie.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtSuperficie.setText(
				"\tO fator de superf\u00EDcie de redu\u00E7\u00E3o da resist\u00EAncia (C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0) pode ser obtido a partir do tipo de acabamento superficial da pe\u00E7a, que define um coeficiente A e um expoente b, al\u00E9m da influ\u00EAncia do limite de resist\u00EAncia \u00E0 tra\u00E7\u00E3o (S\u1D58\u1D57). \u00C9 utilizada a seguinte equa\u00E7\u00E3o:\r\n\r\n\t- C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0 \u2248 A * (S\u1D58\u1D57) \u1D47\t(Caso C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0 > 1, ser\u00E1 considerado C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0 = 1)\r\n\r\n\tOs coeficientes podem ser definidos a partir da tabela abaixo (para S\u1D58\u1D57 em MPa):");
		txtSuperficie.setBounds(26, 60, 733, 164);
		contentPane.add(txtSuperficie);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(231, 226, 324, 115);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(22);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Retificado", new Double(1.58), new Double(-0.085)},
				{"Usinado ou estirado a frio", new Double(4.51), new Double(-0.265)},
				{"Laminado a quente", new Double(57.7), new Double(-0.718)},
				{"Forjado", new Integer(272), new Double(-0.995)},
			},
			new String[] {
				"Acabamento superficial", "A", "b"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.BOLD, 14));
		table.getTableHeader().setBackground(new Color(52,81,160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		centerRenderer.setVerticalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}
		
		DecimalFormat df = new DecimalFormat("0");
		JTextPane txtAcabamento = new JTextPane();
		txtAcabamento.setText("\tSelecione o acabamento superficial a ser aplicado:\t(S\u1D58\u1D57 informado = " + df.format(Calculos.getResistenciaTracao()) + " MPa)");
		txtAcabamento.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtAcabamento.setFocusable(false);
		txtAcabamento.setEditable(false);
		txtAcabamento.setBackground(SystemColor.menu);
		txtAcabamento.setBounds(26, 351, 733, 34);
		contentPane.add(txtAcabamento);
		
		DecimalFormat df2 = new DecimalFormat("0.00");
		final JLabel lblValorSuperficie = new JLabel("?");
		if (Calculos.getSuperficie() != 0) {
			lblValorSuperficie.setText(df2.format(Calculos.getSuperficie()));
		}
		lblValorSuperficie.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorSuperficie.setBounds(560, 438, 162, 34);
		contentPane.add(lblValorSuperficie);
		
		JButton btnRetificado = new JButton("RETIFICADO");
		btnRetificado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRetificado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(1.58, -0.085, lblValorSuperficie);
			}
		});
		btnRetificado.setFont(new Font("Arial", Font.BOLD, 15));
		btnRetificado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnRetificado.setBackground(Color.LIGHT_GRAY);
		btnRetificado.setBounds(25, 390, 126, 34);
		contentPane.add(btnRetificado);
		
		JButton btnUsinado = new JButton("USINADO OU EST. A FRIO");
		btnUsinado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsinado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(4.51, -0.265, lblValorSuperficie);
			}
		});
		btnUsinado.setFont(new Font("Arial", Font.BOLD, 15));
		btnUsinado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnUsinado.setBackground(Color.LIGHT_GRAY);
		btnUsinado.setBounds(176, 390, 219, 34);
		contentPane.add(btnUsinado);
		
		JButton btnLaminado = new JButton("LAMINADO A QUENTE");
		btnLaminado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLaminado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(57.7, -0.718, lblValorSuperficie);
			}
		});
		btnLaminado.setFont(new Font("Arial", Font.BOLD, 15));
		btnLaminado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLaminado.setBackground(Color.LIGHT_GRAY);
		btnLaminado.setBounds(420, 390, 191, 34);
		contentPane.add(btnLaminado);
		
		JButton btnForjado = new JButton("FORJADO");
		btnForjado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnForjado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(272, -0.995, lblValorSuperficie);
			}
		});
		btnForjado.setFont(new Font("Arial", Font.BOLD, 15));
		btnForjado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnForjado.setBackground(Color.LIGHT_GRAY);
		btnForjado.setBounds(636, 390, 121, 34);
		contentPane.add(btnForjado);
		
		JTextPane txtValorSuperficie = new JTextPane();
		txtValorSuperficie.setText("Dessa forma, o valor do fator dos efeitos de superf\u00EDcie \u00E9:");
		txtValorSuperficie.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtValorSuperficie.setFocusable(false);
		txtValorSuperficie.setEditable(false);
		txtValorSuperficie.setBackground(SystemColor.menu);
		txtValorSuperficie.setBounds(116, 438, 477, 34);
		contentPane.add(txtValorSuperficie);
		
		JTextPane txtValorSuperficie_1 = new JTextPane();
		txtValorSuperficie_1.setText("Com isso, seguimos para o c\u00E1lculo do fator devido aos efeitos da temperatura. Clique no bot\u00E3o ao lado para seguir:");
		txtValorSuperficie_1.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtValorSuperficie_1.setFocusable(false);
		txtValorSuperficie_1.setEditable(false);
		txtValorSuperficie_1.setBackground(SystemColor.menu);
		txtValorSuperficie_1.setBounds(116, 478, 467, 64);
		contentPane.add(txtValorSuperficie_1);
		
		JButton btnProximo = new JButton("PR\u00D3XIMO \u00BB");
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura temperatura = new Temperatura();
				temperatura.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 15));
		btnProximo.setFocusable(false);
		btnProximo.setBackground(new Color(52,81,160));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnProximo.setBounds(610, 486, 132, 34);
		contentPane.add(btnProximo);
		
		JTextPane txtProximo_1_1 = new JTextPane();
		txtProximo_1_1.setText("Fonte: Projeto de M\u00E1quinas, Robert L. Norton (2011)");
		txtProximo_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		txtProximo_1_1.setFocusable(false);
		txtProximo_1_1.setEditable(false);
		txtProximo_1_1.setBackground(SystemColor.menu);
		txtProximo_1_1.setBounds(565, 265, 195, 57);
		contentPane.add(txtProximo_1_1);
		
	}
	
	private void calcularFator(double a, double b, JLabel label) {
		DecimalFormat df = new DecimalFormat("0.00");
		Calculos.setSuperficie(a, b);
		label.setText(df.format(Calculos.getSuperficie()));
	}
}
