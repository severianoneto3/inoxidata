package aisi304;

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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi304 extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi304() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi304 = new JLabel("AISI 304");
		lblAisi304.setBounds(344, 10, 98, 46);
		lblAisi304.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi304);

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

		JTextPane txtAisi304 = new JTextPane();
		txtAisi304.setEditable(false);
		txtAisi304.setBackground(SystemColor.menu);
		txtAisi304.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi304.setText(
				"\tO a\u00E7o AISI 304 \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico e n\u00E3o-magn\u00E9tico em condi\u00E7\u00F5es de recozimento, possuindo diversas varia\u00E7\u00F5es que s\u00E3o realizadas por altera\u00E7\u00F5es na sua composi\u00E7\u00E3o, a exemplo do 304L e do 304H. N\u00E3o pode ser endurecido por tratamento t\u00E9rmico, apenas por trabalho a frio, transformando parte da austenita em martensita, aumentando sua resist\u00EAncia e diminuindo sua plasticidade.\r\n\r\n\tPossui \u00F3tima resist\u00EAncia \u00E0 corros\u00E3o na atmosfera e em solu\u00E7\u00F5es aquosas, por\u00E9m n\u00E3o apresenta boa resist\u00EAncia a meios clor\u00EDdricos, por exemplo. Disp\u00F5e de boa soldabilidade e n\u00E3o requere pr\u00E9-aquecimento. \u00C9 o tipo de a\u00E7o inoxid\u00E1vel mais utilizado no mercado, com suas aplica\u00E7\u00F5es na ind\u00FAstria aliment\u00EDcia, em eletr\u00F4nicos, equipamentos m\u00E9dicos, ind\u00FAstria petroqu\u00EDmica, entre outros. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 304.");
		txtAisi304.setBounds(15, 133, 756, 197);
		contentPane.add(txtAisi304);

		JButton btnAisi304Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi304Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi304Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao,"composicao304.png");
				}
			}
		});
		btnAisi304Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi304Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi304Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi304Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi304Composicao);

		JButton btnAisi304Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi304Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi304Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama,"diagrama304.png");
				}
			}
		});
		btnAisi304Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi304Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi304Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi304Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi304Diagrama);

		JButton btnFadiga304 = new JButton("FADIGA");
		btnFadiga304.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga304.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304Fadiga fadiga304 = new Aisi304Fadiga();
				fadiga304.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga304.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga304.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga304.setBackground(Color.LIGHT_GRAY);
		btnFadiga304.setBounds(31, 490, 220, 40);
		contentPane.add(btnFadiga304);

		JButton btnCorrosaoFadiga304 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga304.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga304.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304CorrosaoFadiga corrosaoFadiga304 = new Aisi304CorrosaoFadiga();
				corrosaoFadiga304.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga304.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga304.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga304.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga304.setBounds(282, 490, 220, 40);
		contentPane.add(btnCorrosaoFadiga304);

		JButton btnCorrosaoSobTensao304 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao304.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao304.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304SCC scc304 = new Aisi304SCC();
				scc304.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao304.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao304.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao304.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao304.setBounds(533, 490, 220, 40);
		contentPane.add(btnCorrosaoSobTensao304);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 350, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7900", "193", "17,2", "17,8", "18,4", "16,3", "21,5", "500", "720");
		
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
