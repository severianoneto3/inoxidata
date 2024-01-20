package propriedades;

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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class CorrosaoFadiga extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame ligasCorrosaoFadiga = new JFrame();
	JFrame ligasCloro = new JFrame();
	JFrame ph = new JFrame();

	private JPanel contentPane;

	public CorrosaoFadiga() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloCorrosaoFadiga = new JLabel("Corros\u00E3o-Fadiga em A\u00E7os Inoxid\u00E1veis");
		lblTituloCorrosaoFadiga.setBounds(159, 10, 468, 46);
		lblTituloCorrosaoFadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblTituloCorrosaoFadiga);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Propriedades propriedades = new Propriedades();
				propriedades.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JTextPane txtCorrosaoFadiga = new JTextPane();
		txtCorrosaoFadiga.setFocusable(false);
		txtCorrosaoFadiga.setEditable(false);
		txtCorrosaoFadiga.setBackground(SystemColor.menu);
		txtCorrosaoFadiga.setAlignmentX(RIGHT_ALIGNMENT);
		txtCorrosaoFadiga.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtCorrosaoFadiga.setText(
				"\tA corros\u00E3o-fadiga causa a falha no material por meio de uma carga e um meio corrosivo. A import\u00E2ncia da a\u00E7\u00E3o do meio \u00E9 refletida na sensibilidade \u00E0 frequ\u00EAncia da aplica\u00E7\u00E3o de carga. Em alguns a\u00E7os inoxid\u00E1veis, as trincas se propagam mais rapidamente em meios corrosivos em rela\u00E7\u00E3o ao ar, enquanto em outros uma quantidade necess\u00E1ria de intensidade de carga deve ser atingida at\u00E9 que a acelera\u00E7\u00E3o da propaga\u00E7\u00E3o da trinca seja notada.\r\n\r\n\tA taxa de crescimento da trinca em ciclos de carga em um ambiente corrosivo pode ser descrita como a soma das contribui\u00E7\u00F5es da fadiga mec\u00E2nica e do meio corrosivo, onde ambos os quesitos acabam apresentando um efeito sin\u00E9rgico, encurtando o tempo at\u00E9 a falha.\r\n\r\n\tA resist\u00EAncia \u00E0 corros\u00E3o-fadiga depende da quantidade de cromo contida na liga. Em ambientes corrosivos, a\u00E7os com maior teor de cromo tendem a ter uma maior resist\u00EAncia \u00E0 fadiga, enquanto a\u00E7os com teor menor de cromo tendem a ter uma menor resist\u00EAncia a inicia\u00E7\u00E3o de trincas em meios clor\u00EDdricos, por exemplo. Os bot\u00F5es abaixo representam dados de ligas de a\u00E7os inoxid\u00E1veis e seus desempenhos em diferentes meios de atua\u00E7\u00E3o.");
		txtCorrosaoFadiga.setBounds(23, 57, 739, 336);
		contentPane.add(txtCorrosaoFadiga);

		JButton btnCorrosaoFadiga = new JButton("CORROS\u00C3O-FADIGA X FREQU\u00CANCIA");
		btnCorrosaoFadiga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ligasCorrosaoFadiga.isVisible()) {
					adicionarImagem(ligasCorrosaoFadiga, "corrosaoFadigaFrequencia.png");
				}
			}
		});
		btnCorrosaoFadiga.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga.setBounds(148, 400, 490, 35);
		contentPane.add(btnCorrosaoFadiga);
		
		JButton btnPH = new JButton("RESIST\u00CANCIA \u00C0 CORROS\u00C3O-FADIGA A 10\u2077 CICLOS X PH");
		btnPH.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ph.isVisible()) {
					adicionarImagem(ph, "corrosaoFadigaPH.jpg");
				}
			}
		});
		btnPH.setFont(new Font("Arial", Font.BOLD, 15));
		btnPH.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnPH.setBackground(Color.LIGHT_GRAY);
		btnPH.setBounds(148, 500, 490, 35);
		contentPane.add(btnPH);
		
		JButton btnCorrosaoCloro = new JButton("CORROS\u00C3O-FADIGA EM MEIO CLOR\u00CDDRICO");
		btnCorrosaoCloro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoCloro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ligasCloro.isVisible()) {
					adicionarImagem(ligasCloro, "corrosaoFadigaCloro.png");
				}
			}
		});
		btnCorrosaoCloro.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoCloro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoCloro.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoCloro.setBounds(148, 450, 490, 35);
		contentPane.add(btnCorrosaoCloro);
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
