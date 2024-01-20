package aisi410;

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

public class Aisi410 extends JFrame {

	// private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi410() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi410 = new JLabel("AISI 410");
		lblAisi410.setBounds(344, 10, 98, 46);
		lblAisi410.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi410);

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

		JTextPane txtAisi410 = new JTextPane();
		txtAisi410.setEditable(false);
		txtAisi410.setBackground(SystemColor.menu);
		txtAisi410.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi410.setText(
				"\tO a\u00E7o AISI 410 \u00E9 um a\u00E7o inoxid\u00E1vel martens\u00EDtico, magn\u00E9tico e pode ser endurecido por tratamento t\u00E9rmico. \u00C9 um dos a\u00E7os martens\u00EDticos mais utilizados, provendo moderada resist\u00EAncia a corros\u00E3o. No entanto, possui boa resist\u00EAncia \u00E0 tra\u00E7\u00E3o e \u00E0 fadiga e uma melhor condutividade t\u00E9rmica em rela\u00E7\u00E3o \u00E0 fam\u00EDlia dos austen\u00EDticos. Pode ser tratado termicamente por recozimento, endurecimento e t\u00EAmpera. S\u00E3o os a\u00E7os inoxid\u00E1veis mais dif\u00EDceis para a soldagem, pois sua composi\u00E7\u00E3o qu\u00EDmica o faz mais forte e menos d\u00FActil durante o tratamento, requerendo pr\u00E9-aquecimento.\r\n\r\n\t\u00C9 utilizado principalmente na ind\u00FAstria hidr\u00E1ulica, para fabrica\u00E7\u00E3o de v\u00E1lvulas, eixos de bombas, l\u00E2minas de turbina e aplica\u00E7\u00F5es gerais que requerem resist\u00EAncia \u00E0 corros\u00E3o e trabalho em temperaturas por volta de 540\u00BA C. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 410.");
		txtAisi410.setBounds(22, 133, 741, 215);
		contentPane.add(txtAisi410);

		JButton btnAisi410Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi410Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi410Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao410.png");
				}
			}
		});
		btnAisi410Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi410Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi410Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi410Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi410Composicao);

		JButton btnAisi410Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi410Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi410Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama410.png");
				}
			}
		});
		btnAisi410Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi410Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi410Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi410Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi410Diagrama);

		JButton btnFadiga410 = new JButton("FADIGA");
		btnFadiga410.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga410.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi410Fadiga fadiga410 = new Aisi410Fadiga();
				fadiga410.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga410.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga410.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga410.setBackground(Color.LIGHT_GRAY);
		btnFadiga410.setBounds(31, 495, 220, 40);
		contentPane.add(btnFadiga410);

		JButton btnCorrosaoFadiga410 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga410.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga410.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi410CorrosaoFadiga corrosaoFadiga410 = new Aisi410CorrosaoFadiga();
				corrosaoFadiga410.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga410.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga410.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga410.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga410.setBounds(282, 495, 220, 40);
		contentPane.add(btnCorrosaoFadiga410);

		JButton btnCorrosaoSobTensao410 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao410.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao410.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi410SCC scc410 = new Aisi410SCC();
				scc410.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao410.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao410.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao410.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao410.setBounds(533, 495, 220, 40);
		contentPane.add(btnCorrosaoSobTensao410);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7700", "200", "9,9", "11,4", "11,6", "24,9", "28,7", "460", "570");
	}

	public void adicionarImagem(JFrame frameImagem, String imagem) {
		JLabel label = new JLabel();
		frameImagem.setResizable(false);
		label.setIcon(new ImageIcon(getClass().getResource(imagem)));
		Dimension size = label.getPreferredSize();
		frameImagem.setSize(size.width + 20, (size.height + 30));
		frameImagem.getContentPane().add(label);
		frameImagem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameImagem.setVisible(true);
	}
}
