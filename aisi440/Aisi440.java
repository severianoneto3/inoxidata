package aisi440;

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

import acos.OutrasLigas;
import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi440 extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi440() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi440 = new JLabel("AISI 440");
		lblAisi440.setBounds(344, 10, 98, 46);
		lblAisi440.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi440);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutrasLigas outrasLigas = new OutrasLigas();
				outrasLigas.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JTextPane txtAisi440 = new JTextPane();
		txtAisi440.setEditable(false);
		txtAisi440.setBackground(SystemColor.menu);
		txtAisi440.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi440.setText(
				"\tO AISI 440 \u00E9 um a\u00E7o inoxid\u00E1vel martens\u00EDtico com alto teor de carbono e alto teor de cromo, podendo ser encontrado em varia\u00E7\u00F5es 440A, 440B e 440C, com teores de carbono diferentes. Apresenta boa resist\u00EAncia \u00E0 corros\u00E3o, dureza e desgaste. Disp\u00F5e de boa resist\u00EAncia \u00E0 oxida\u00E7\u00E3o em uso intermitente a temperaturas menores que 815\u00BAC e uso cont\u00EDnuo a 760\u00BAC no ar. Sua soldagem n\u00E3o \u00E9 recomend\u00E1vel por conta do alto teor de carbono.\r\n\r\n\tPode ser aplicado na ind\u00FAstria para a fabrica\u00E7\u00E3o de rolamentos trabalhando em ambientes corrosivos, al\u00E9m de instrumentos para cirurgia m\u00E9dica e equipamentos de odontologia, tamb\u00E9m molas e v\u00E1lvulas. Abaixo, est\u00E3o dispostas algumas propriedades* e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 440.");
		txtAisi440.setBounds(22, 133, 741, 201);
		contentPane.add(txtAisi440);

		JButton btnAisi440Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi440Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi440Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao440.png");
				}
			}
		});
		btnAisi440Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi440Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi440Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi440Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi440Composicao);

		JButton btnAisi440Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi440Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi440Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama440.png");
				}
			}
		});
		btnAisi440Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi440Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi440Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi440Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi440Diagrama);

		JButton btnFadiga440 = new JButton("FADIGA");
		btnFadiga440.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga440.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi440Fadiga fadiga440 = new Aisi440Fadiga();
				fadiga440.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga440.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga440.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga440.setBackground(Color.LIGHT_GRAY);
		btnFadiga440.setBounds(31, 495, 220, 40);
		contentPane.add(btnFadiga440);

		JButton btnCorrosaoFadiga440 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga440.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga440.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi440CorrosaoFadiga corrosaoFadiga440 = new Aisi440CorrosaoFadiga();
				corrosaoFadiga440.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga440.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga440.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga440.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga440.setBounds(282, 495, 220, 40);
		contentPane.add(btnCorrosaoFadiga440);

		JButton btnCorrosaoSobTensao440 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao440.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao440.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi440SCC scc440 = new Aisi440SCC();
				scc440.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao440.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao440.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao440.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao440.setBounds(533, 495, 220, 40);
		contentPane.add(btnCorrosaoSobTensao440);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7650", "200", "10,1", "10,3", "11,7", "24,2", "-", "460", "600");
	
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
