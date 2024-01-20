package aisi436;

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

public class Aisi436 extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi436() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi436 = new JLabel("AISI 436");
		lblAisi436.setBounds(344, 10, 98, 46);
		lblAisi436.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi436);

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

		JTextPane txtAisi436 = new JTextPane();
		txtAisi436.setEditable(false);
		txtAisi436.setBackground(SystemColor.menu);
		txtAisi436.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi436.setText(
				"\tO AISI 436 \u00E9 um a\u00E7o inoxid\u00E1vel ferr\u00EDtico, sendo uma modifica\u00E7\u00E3o do AISI 430 com adi\u00E7\u00E3o de elementos como o molibd\u00EAnio, aprimorando sua resist\u00EAncia \u00E0 corros\u00E3o e soldabilidade. Apresenta tamb\u00E9m alta resist\u00EAncia \u00E0 tra\u00E7\u00E3o, ao desgaste e abras\u00E3o devido ao maior n\u00EDvel de dureza apresentado em rela\u00E7\u00E3o a outros a\u00E7os inoxid\u00E1veis. Pode ser exposto a ambientes corrosivos a exemplo de \u00E1gua salgada, e suas propriedades mec\u00E2nicas o qualificam para uso com altas cargas.\r\n\r\n\tEsse material geralmente \u00E9 encontrado na ind\u00FAstria compondo exaustores e acabamentos automotivos, sendo utilizado tamb\u00E9m na ind\u00FAstria aliment\u00EDcia e para aplica\u00E7\u00F5es em aeronaves. Abaixo, est\u00E3o dispostas algumas propriedades* e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 436.");
		txtAisi436.setBounds(22, 133, 742, 198);
		contentPane.add(txtAisi436);

		JButton btnAisi436Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi436Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi436Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao436.png");
				}
			}
		});
		btnAisi436Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi436Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi436Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi436Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi436Composicao);

		JButton btnAisi436Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi436Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi436Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama436.png");
				}
			}
		});
		btnAisi436Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi436Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi436Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi436Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi436Diagrama);

		JButton btnFadiga436 = new JButton("FADIGA");
		btnFadiga436.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga436.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi436Fadiga fadiga436 = new Aisi436Fadiga();
				fadiga436.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga436.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga436.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga436.setBackground(Color.LIGHT_GRAY);
		btnFadiga436.setBounds(31, 495, 220, 40);
		contentPane.add(btnFadiga436);

		JButton btnCorrosaoFadiga436 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga436.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga436.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi436CorrosaoFadiga corrosaoFadiga436 = new Aisi436CorrosaoFadiga();
				corrosaoFadiga436.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga436.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga436.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga436.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga436.setBounds(282, 495, 220, 40);
		contentPane.add(btnCorrosaoFadiga436);

		JButton btnCorrosaoSobTensao436 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao436.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao436.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi436SCC scc436 = new Aisi436SCC();
				scc436.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao436.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao436.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao436.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao436.setBounds(533, 495, 220, 40);
		contentPane.add(btnCorrosaoSobTensao436);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7700", "200", "9,3", "-", "-", "23,9", "26,0", "460", "600");
	
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
