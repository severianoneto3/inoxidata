package aisi316;

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

public class Aisi316 extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi316() {
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

		JLabel lblAisi316 = new JLabel("AISI 316");
		lblAisi316.setBounds(344, 10, 98, 46);
		lblAisi316.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi316);

		JTextPane txtAisi316 = new JTextPane();
		txtAisi316.setEditable(false);
		txtAisi316.setBackground(SystemColor.menu);
		txtAisi316.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi316.setText(
				"\tO AISI 316 \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico, sendo o segundo mais utilizado da fam\u00EDlia dos austen\u00EDticos, atr\u00E1s do AISI 304. Devido a adi\u00E7\u00E3o de molibd\u00EAnio, possui uma maior resist\u00EAncia \u00E0 corros\u00E3o e \u00E0 tra\u00E7\u00E3o operando em altas temperaturas em compara\u00E7\u00E3o ao AISI 304, podendo desempenhar bem em um grande intervalo de temperaturas. N\u00E3o \u00E9 magn\u00E9tico, possui boa soldabilidade e n\u00E3o requere pr\u00E9-aquecimento, por\u00E9m, para maior ductibilidade e resist\u00EAncia \u00E0 corros\u00E3o, pode requerer um recozimento ap\u00F3s a soldagem, pois o carboneto de cromo \u00E9 dissolvido por corros\u00E3o intragranular durante o processo.\r\n\r\n\tSuas aplica\u00E7\u00F5es principais s\u00E3o em trocadores de calor para equipamentos da ind\u00FAstria do papel e da celulose, al\u00E9m de tubos, v\u00E1lvulas de solenoide, esferas, flanges, equipamentos m\u00E9dicos, ind\u00FAstria aliment\u00EDcia, ind\u00FAstria t\u00EAxtil, porcas e parafusos, entre outros. Abaixo, est\u00E3o dispostas as propriedades f\u00EDsicas e informa\u00E7\u00F5es sobre fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 316.");
		txtAisi316.setBounds(18, 133, 749, 217);
		contentPane.add(txtAisi316);

		JButton btnAisi316Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi316Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi316Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao316.png");
				}
			}
		});
		btnAisi316Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi316Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi316Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi316Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi316Composicao);

		JButton btnAisi316Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi316Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi316Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama316.png");
				}
			}
		});
		btnAisi316Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi316Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi316Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi316Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi316Diagrama);

		JButton btnFadiga316 = new JButton("FADIGA");
		btnFadiga316.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga316.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi316Fadiga fadiga316 = new Aisi316Fadiga();
				fadiga316.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga316.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga316.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga316.setBackground(Color.LIGHT_GRAY);
		btnFadiga316.setBounds(31, 495, 220, 40);
		contentPane.add(btnFadiga316);

		JButton btnCorrosaoFadiga316 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga316.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga316.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi316CorrosaoFadiga corrosaoFadiga316 = new Aisi316CorrosaoFadiga();
				corrosaoFadiga316.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga316.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga316.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga316.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga316.setBounds(282, 495, 220, 40);
		contentPane.add(btnCorrosaoFadiga316);

		JButton btnCorrosaoSobTensao316 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao316.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao316.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi316SCC scc316 = new Aisi316SCC();
				scc316.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao316.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao316.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao316.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao316.setBounds(533, 495, 220, 40);
		contentPane.add(btnCorrosaoSobTensao316);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "8000", "193", "15,9", "16,2", "17,5", "16,3", "21,5", "500", "740");
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
