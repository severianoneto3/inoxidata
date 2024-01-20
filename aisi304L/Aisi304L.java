package aisi304L;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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

import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi304L extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi304L() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi304L = new JLabel("AISI 304L");
		lblAisi304L.setBounds(336, 10, 114, 46);
		lblAisi304L.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi304L);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDeSelecao telaDeSelecao = new TelaDeSelecao();
				telaDeSelecao.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JTextPane txtAisi304L = new JTextPane();
		txtAisi304L.setEditable(false);
		txtAisi304L.setBackground(SystemColor.menu);
		txtAisi304L.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi304L.setText(
				"\tO a\u00E7o AISI 304L \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico derivado do AISI 304, com um teor muito baixo de carbono (por isso o L, demonstrando Low carbon). Tem como seu prop\u00F3sito principal evitar a precipita\u00E7\u00E3o de carbonetos, al\u00E9m de apresentar excelentes propriedades de soldagem e uma boa resist\u00EAncia \u00E0 corros\u00E3o, ainda melhor que a do AISI 304. Pode ser endurecido por trabalho a frio.\r\n\r\n\tEsse a\u00E7o pode ser encontrado em diversas aplica\u00E7\u00F5es na ind\u00FAstria, entre elas: equipamentos de processamento de alimentos (em especial para fermenta\u00E7\u00E3o de cerveja e processamento de leite), equipamentos para filtragem de \u00E1gua, trocadores de calor, tanques de armazenamento, v\u00E1lvulas, entre outras. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 304L.");
		txtAisi304L.setBounds(18, 133, 749, 202);
		contentPane.add(txtAisi304L);

		JButton btnAisi304LComposicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi304LComposicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi304LComposicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao,"composicao304L.png");
				}
			}
		});
		btnAisi304LComposicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi304LComposicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi304LComposicao.setBackground(Color.LIGHT_GRAY);
		btnAisi304LComposicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi304LComposicao);

		JButton btnAisi304LDiagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi304LDiagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi304LDiagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama,"diagrama304L.png");
				}
			}
		});
		btnAisi304LDiagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi304LDiagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi304LDiagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi304LDiagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi304LDiagrama);

		JButton btnFadiga304L = new JButton("FADIGA");
		btnFadiga304L.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga304L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304LFadiga fadiga304L = new Aisi304LFadiga();
				fadiga304L.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga304L.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga304L.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga304L.setBackground(Color.LIGHT_GRAY);
		btnFadiga304L.setBounds(31, 490, 220, 40);
		contentPane.add(btnFadiga304L);

		JButton btnCorrosaoFadiga304L = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga304L.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga304L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304LCorrosaoFadiga corrosaoFadiga304L = new Aisi304LCorrosaoFadiga();
				corrosaoFadiga304L.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga304L.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga304L.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga304L.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga304L.setBounds(282, 490, 220, 40);
		contentPane.add(btnCorrosaoFadiga304L);

		JButton btnCorrosaoSobTensao304L = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao304L.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao304L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304LSCC scc304L = new Aisi304LSCC();
				scc304L.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao304L.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao304L.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao304L.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao304L.setBounds(533, 490, 220, 40);
		contentPane.add(btnCorrosaoSobTensao304L);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 350, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7900", "193", "17,0", "17,2", "18,2", "16,3", "21,5", "500", "720");

		JTextPane txtProximo_1_1 = new JTextPane();
		txtProximo_1_1.setText("*Fonte: Atlas Steels Technical Handbook of Stainless Steels (2021)");
		txtProximo_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		txtProximo_1_1.setFocusable(false);
		txtProximo_1_1.setEditable(false);
		txtProximo_1_1.setBackground(SystemColor.menu);
		txtProximo_1_1.setBounds(41, 535, 401, 32);
		contentPane.add(txtProximo_1_1);
		
	}

	public void adicionarImagem(JFrame frameImagem, String imagem) {
		JLabel label = new JLabel();
		frameImagem.setResizable(false);
		label.setIcon(new ImageIcon(getClass().getResource(imagem)));
		Dimension size = label.getPreferredSize();
		frameImagem.setSize(size.width + 10, (size.height + 30));
		frameImagem.getContentPane().add(label);
		frameImagem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameImagem.setVisible(true);
	}

}
