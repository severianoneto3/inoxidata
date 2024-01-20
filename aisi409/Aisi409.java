package aisi409;

import java.awt.Color;
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

import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi409 extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi409() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi409 = new JLabel("AISI 409");
		lblAisi409.setBounds(344, 10, 98, 46);
		lblAisi409.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi409);

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

		JTextPane txtAisi409 = new JTextPane();
		txtAisi409.setEditable(false);
		txtAisi409.setBackground(SystemColor.menu);
		txtAisi409.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi409.setText(
				"\tO a\u00E7o AISI 409 \u00E9 um a\u00E7o inoxid\u00E1vel ferr\u00EDtico que oferece boas propriedades mec\u00E2nicas e resist\u00EAncia \u00E0 corros\u00E3o operando em altas temperaturas. Oferece resist\u00EAncia a temperaturas at\u00E9 675\u00BAC em uso cont\u00EDnuo e at\u00E9 815\u00BAC em uso intermitente em determinados ambientes. Apresenta tamb\u00E9m formas estabilizadas, possibilitadas pela presen\u00E7a do tit\u00E2nio na composi\u00E7\u00E3o do material. Deve ser pr\u00E9-aquecido para a soldagem, necessitando aten\u00E7\u00E3o na temperatura usada no processo, a fim de mitigar o crescimento dos gr\u00E3os.\r\n\r\n\tA aplica\u00E7\u00E3o deste a\u00E7o \u00E9 geralmente em tubos de exaust\u00E3o de autom\u00F3veis e amortecedores, geralmente sendo aplicado em meios n\u00E3o-corrosivos. Abaixo, est\u00E3o dispostas algumas propriedades* e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 409.");
		txtAisi409.setBounds(22, 133, 741, 202);
		contentPane.add(txtAisi409);

		JButton btnAisi409Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi409Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi409Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao409.png");
				}
			}
		});
		btnAisi409Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi409Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi409Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi409Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi409Composicao);

		JButton btnAisi409Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi409Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi409Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama409.png");
				}
			}
		});
		btnAisi409Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi409Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi409Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi409Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi409Diagrama);

		JButton btnFadiga409 = new JButton("FADIGA");
		btnFadiga409.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga409.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi409Fadiga fadiga409 = new Aisi409Fadiga();
				fadiga409.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga409.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga409.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga409.setBackground(Color.LIGHT_GRAY);
		btnFadiga409.setBounds(31, 495, 220, 40);
		contentPane.add(btnFadiga409);

		JButton btnCorrosaoFadiga409 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga409.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga409.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi409CorrosaoFadiga corrosaoFadiga409 = new Aisi409CorrosaoFadiga();
				corrosaoFadiga409.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga409.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga409.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga409.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga409.setBounds(282, 495, 220, 40);
		contentPane.add(btnCorrosaoFadiga409);

		JButton btnCorrosaoSobTensao409 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao409.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao409.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi409SCC scc409 = new Aisi409SCC();
				scc409.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao409.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao409.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao409.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao409.setBounds(533, 495, 220, 40);
		contentPane.add(btnCorrosaoSobTensao409);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7700", "208", "11,0", "11,7", "12,4", "25,8", "27,5", "460", "600");
	
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
