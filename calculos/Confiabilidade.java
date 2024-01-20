package calculos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Confiabilidade extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Confiabilidade() {
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
				Temperatura temperatura = new Temperatura();
				temperatura.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblConfiabilidade = new JLabel("C\u00E1lculo do Fator da Confiabilidade\r\n");
		lblConfiabilidade.setBounds(174, 10, 438, 46);
		lblConfiabilidade.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblConfiabilidade);

		JTextPane txtConfiabilidade = new JTextPane();
		txtConfiabilidade.setFocusable(false);
		txtConfiabilidade.setEditable(false);
		txtConfiabilidade.setBackground(SystemColor.menu);
		txtConfiabilidade.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtConfiabilidade.setText(
				"\tPara os a\u00E7os, os desvios-padr\u00E3o das resist\u00EAncias \u00E0 fadiga raramente excedem 8% de seus valores m\u00E9dios. Assim, define-se o fator de confiabilidade (C\u1D9C\u1D52\u207F\u1DA0) a partir da confiabilidade em % do material, ou seja, a probabilidade de uma determinada porcentagem das amostras igualarem ou superarem o valor de resist\u00EAncia assumido.\r\n\r\n\tEscolha uma % de confiabilidade a partir da tabela disposta abaixo:");
		txtConfiabilidade.setBounds(30, 60, 726, 143);
		contentPane.add(txtConfiabilidade);
		
		DecimalFormat df = new DecimalFormat("0.000");
		final JLabel lblValorConfiabilidade = new JLabel("?");
		if (Calculos.getConfiabilidade() != 0) {
			lblValorConfiabilidade.setText(df.format(Calculos.getConfiabilidade()));
		}
		lblValorConfiabilidade.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorConfiabilidade.setBounds(546, 440, 162, 34);
		contentPane.add(lblValorConfiabilidade);
		
		JButton btnEscolher = new JButton("ESCOLHER");
		btnEscolher.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(1, lblValorConfiabilidade);
			}
		});
		btnEscolher.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher.setBackground(Color.LIGHT_GRAY);
		btnEscolher.setBounds(85, 229, 110, 18);
		contentPane.add(btnEscolher);
		
		JButton btnEscolher_1 = new JButton("ESCOLHER");
		btnEscolher_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.897, lblValorConfiabilidade);
			}
		});
		btnEscolher_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_1.setBackground(Color.LIGHT_GRAY);
		btnEscolher_1.setBounds(85, 253, 110, 18);
		contentPane.add(btnEscolher_1);
		
		JButton btnEscolher_2 = new JButton("ESCOLHER");
		btnEscolher_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.868, lblValorConfiabilidade);
			}
		});
		btnEscolher_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_2.setBackground(Color.LIGHT_GRAY);
		btnEscolher_2.setBounds(85, 277, 110, 18);
		contentPane.add(btnEscolher_2);
		
		JButton btnEscolher_3 = new JButton("ESCOLHER");
		btnEscolher_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.814, lblValorConfiabilidade);
			}
		});
		btnEscolher_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_3.setBackground(Color.LIGHT_GRAY);
		btnEscolher_3.setBounds(85, 301, 110, 18);
		contentPane.add(btnEscolher_3);
		
		JButton btnEscolher_4 = new JButton("ESCOLHER");
		btnEscolher_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.753, lblValorConfiabilidade);
			}
		});
		btnEscolher_4.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_4.setBackground(Color.LIGHT_GRAY);
		btnEscolher_4.setBounds(85, 324, 110, 18);
		contentPane.add(btnEscolher_4);
		
		JButton btnEscolher_5 = new JButton("ESCOLHER");
		btnEscolher_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.702, lblValorConfiabilidade);
			}
		});
		btnEscolher_5.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_5.setBackground(Color.LIGHT_GRAY);
		btnEscolher_5.setBounds(85, 347, 110, 18);
		contentPane.add(btnEscolher_5);
		
		JButton btnEscolher_6 = new JButton("ESCOLHER");
		btnEscolher_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.659, lblValorConfiabilidade);
			}
		});
		btnEscolher_6.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_6.setBackground(Color.LIGHT_GRAY);
		btnEscolher_6.setBounds(85, 370, 110, 18);
		contentPane.add(btnEscolher_6);
		
		JButton btnEscolher_7 = new JButton("ESCOLHER");
		btnEscolher_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscolher_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.62, lblValorConfiabilidade);
			}
		});
		btnEscolher_7.setFont(new Font("Arial", Font.BOLD, 14));
		btnEscolher_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEscolher_7.setBackground(Color.LIGHT_GRAY);
		btnEscolher_7.setBounds(85, 393, 110, 19);
		contentPane.add(btnEscolher_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		scrollPane.setBounds(207, 206, 371, 211);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(23);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"50", new Integer(1)},
				{"90", new Double(0.897)},
				{"95", new Double(0.868)},
				{"99", new Double(0.814)},
				{"99.9", new Double(0.753)},
				{"99.99", new Double(0.702)},
				{"99.999", new Double(0.659)},
				{"99.9999", new Double(0.62)},
			},
			new String[] {
				"Confiabilidade, em %", "Fator de confiabilidade"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(124);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(131);
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		table.getTableHeader().setBackground(new Color(52,81,160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		centerRenderer.setVerticalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}
		
		JTextPane txtValorConfiabilidade = new JTextPane();
		txtValorConfiabilidade.setText("Dessa forma, o valor do fator dos efeitos de superf\u00EDcie \u00E9:");
		txtValorConfiabilidade.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtValorConfiabilidade.setFocusable(false);
		txtValorConfiabilidade.setEditable(false);
		txtValorConfiabilidade.setBackground(SystemColor.menu);
		txtValorConfiabilidade.setBounds(102, 440, 477, 34);
		contentPane.add(txtValorConfiabilidade);
		
		JTextPane txtProximo = new JTextPane();
		txtProximo.setText("\tCom isso, obtemos todos os fatores de redu\u00E7\u00E3o de resist\u00EAncia e podemos agora aplic\u00E1-los ao limite de fadiga. Clique no bot\u00E3o ao lado para seguir:");
		txtProximo.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo.setFocusable(false);
		txtProximo.setEditable(false);
		txtProximo.setBackground(SystemColor.menu);
		txtProximo.setBounds(30, 475, 568, 78);
		contentPane.add(txtProximo);
		
		JButton btnProximo = new JButton("PR\u00D3XIMO \u00BB");
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinalCalculos finalCalculos = new FinalCalculos();
				finalCalculos.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 15));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBounds(620, 493, 132, 34);
		btnProximo.setFocusable(false);
		btnProximo.setBackground(new Color(52,81,160));
		btnProximo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnProximo);
		
		JTextPane txtProximo_1_1 = new JTextPane();
		txtProximo_1_1.setText("Fonte: Projeto de M\u00E1quinas, Robert L. Norton (2011)");
		txtProximo_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		txtProximo_1_1.setFocusable(false);
		txtProximo_1_1.setEditable(false);
		txtProximo_1_1.setBackground(SystemColor.menu);
		txtProximo_1_1.setBounds(588, 277, 179, 57);
		contentPane.add(txtProximo_1_1);
		
	}
	
	private void calcularFator(double confiabilidade, JLabel label) {
		DecimalFormat df = new DecimalFormat("0.000");
		Calculos.setConfiabilidade(confiabilidade);
		label.setText(df.format(Calculos.getConfiabilidade()));
	}
}
