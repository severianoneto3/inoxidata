package aisi430;

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

public class Aisi430 extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi430() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi430 = new JLabel("AISI 430");
		lblAisi430.setBounds(344, 10, 98, 46);
		lblAisi430.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi430);

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

		JTextPane txtAisi430 = new JTextPane();
		txtAisi430.setEditable(false);
		txtAisi430.setBackground(SystemColor.menu);
		txtAisi430.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi430.setText(
				"\tO AISI 430 \u00E9 um a\u00E7o inoxid\u00E1vel ferr\u00EDtico bem utilizado convencionalmente. Apresenta propriedades magn\u00E9ticas e boa conformabilidade, al\u00E9m de boa resist\u00EAncia \u00E0 corros\u00E3o em atmosferas amenas e levemente \u00E1cidas. \u00C9 menos d\u00FActil do que os austen\u00EDticos, logo, a forma\u00E7\u00E3o de trincas na soldagem \u00E9 prov\u00E1vel de ocorrer, al\u00E9m de que a sensibilidade \u00E9 aumentada devido a forma\u00E7\u00E3o da martensita. \u00C9 recomendado um pr\u00E9-aquecimento para minimizar esses efeitos.\r\n\r\n\tEsse tipo de a\u00E7o tem seu uso recomendado para atmosferas pouco \u00E1cidas, de forma que tem seu uso limitado em meios contendo \u00E1cido sulf\u00FArico. \u00C9 encontrado na ind\u00FAstria em filtros de ar, flanges, parafusos, utens\u00EDlios de cozinha, grelhas para churrasco, entre outros. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 430.");
		txtAisi430.setBounds(16, 133, 754, 201);
		contentPane.add(txtAisi430);

		JButton btnAisi430Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi430Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi430Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao430.png");
				}
			}
		});
		btnAisi430Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi430Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi430Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi430Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi430Composicao);

		JButton btnAisi430Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi430Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi430Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama430.png");
				}
			}
		});
		btnAisi430Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi430Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi430Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi430Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi430Diagrama);

		JButton btnFadiga430 = new JButton("FADIGA");
		btnFadiga430.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi430Fadiga fadiga430 = new Aisi430Fadiga();
				fadiga430.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga430.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga430.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga430.setBackground(Color.LIGHT_GRAY);
		btnFadiga430.setBounds(31, 495, 220, 40);
		contentPane.add(btnFadiga430);

		JButton btnCorrosaoFadiga430 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga430.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi430CorrosaoFadiga corrosaoFadiga430 = new Aisi430CorrosaoFadiga();
				corrosaoFadiga430.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga430.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga430.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga430.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga430.setBounds(282, 495, 220, 40);
		contentPane.add(btnCorrosaoFadiga430);

		JButton btnCorrosaoSobTensao430 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao430.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi430SCC scc430 = new Aisi430SCC();
				scc430.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao430.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao430.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao430.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao430.setBounds(533, 495, 220, 40);
		contentPane.add(btnCorrosaoSobTensao430);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7700", "200", "10,4", "11,0", "11,4", "23,9", "26,0", "460", "600");
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
