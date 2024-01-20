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

public class CorrosaoSobTensao extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame esquematicaSCC = new JFrame();
	JFrame porcentagemNiquel = new JFrame();
	JFrame cloroAcidez = new JFrame();
	JFrame ligasMeioCloridrico = new JFrame();
	JFrame ligasMgCl = new JFrame();

	private JPanel contentPane;

	public CorrosaoSobTensao() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloCorrosaoSobTensao = new JLabel("Corros\u00E3o Sob Tens\u00E3o em A\u00E7os Inoxid\u00E1veis");
		lblTituloCorrosaoSobTensao.setBounds(136, 10, 514, 46);
		lblTituloCorrosaoSobTensao.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblTituloCorrosaoSobTensao);

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

		JTextPane txtSCC = new JTextPane();
		txtSCC.setFocusable(false);
		txtSCC.setEditable(false);
		txtSCC.setBackground(SystemColor.menu);
		txtSCC.setAlignmentX(RIGHT_ALIGNMENT);
		txtSCC.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtSCC.setText(
				"\tA corros\u00E3o sob tens\u00E3o (CST) ou stress corrosion cracking (SCC) acontece nos a\u00E7os inoxid\u00E1veis a partir de tr\u00EAs condi\u00E7\u00F5es simult\u00E2neas: uma composi\u00E7\u00E3o espec\u00EDfica da liga, um ambiente corrosivo espec\u00EDfico e uma tens\u00E3o mec\u00E2nica maior do que a especificada. Al\u00E9m disso, para que a degrada\u00E7\u00E3o se desenvolva, a temperatura deve ser superior \u00E0 temperatura ambiente: as formas mais comuns de CST dos a\u00E7\u00F5s inoxid\u00E1veis ocorrem em temperaturas de 45-50\u00BAC. O bot\u00E3o abaixo ilustra a esquem\u00E1tica do fen\u00F4meno de corros\u00E3o sob tens\u00E3o.");
		txtSCC.setBounds(23, 57, 753, 143);
		contentPane.add(txtSCC);

		JButton btnEsquematicaSCC = new JButton("ESQUEM\u00C1TICA DA CORROS\u00C3O SOB TENS\u00C3O");
		btnEsquematicaSCC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEsquematicaSCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!esquematicaSCC.isVisible()) {
					adicionarImagem(esquematicaSCC, "esquematicaSCC.jpg");
				}
			}
		});
		btnEsquematicaSCC.setFont(new Font("Arial", Font.BOLD, 15));
		btnEsquematicaSCC.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEsquematicaSCC.setBackground(Color.LIGHT_GRAY);
		btnEsquematicaSCC.setBounds(148, 201, 490, 35);
		contentPane.add(btnEsquematicaSCC);

		JButton btnNiquelSCC = new JButton("% DE N\u00CDQUEL E TEMPO DE FRATURA");
		btnNiquelSCC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNiquelSCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!porcentagemNiquel.isVisible()) {
					adicionarImagem(porcentagemNiquel, "porcentagemNiquel.jpg");
				}
			}
		});
		btnNiquelSCC.setFont(new Font("Arial", Font.BOLD, 15));
		btnNiquelSCC.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNiquelSCC.setBackground(Color.LIGHT_GRAY);
		btnNiquelSCC.setBounds(28, 455, 350, 35);
		contentPane.add(btnNiquelSCC);

		JButton btnCloroAcidez = new JButton("CLORO E ACIDEZ EM CST PARA O AISI 304");
		btnCloroAcidez.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCloroAcidez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!cloroAcidez.isVisible()) {
					adicionarImagem(cloroAcidez, "cloroAcidez.png");
				}
			}
		});
		btnCloroAcidez.setFont(new Font("Arial", Font.BOLD, 15));
		btnCloroAcidez.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCloroAcidez.setBackground(Color.LIGHT_GRAY);
		btnCloroAcidez.setBounds(406, 455, 350, 35);
		contentPane.add(btnCloroAcidez);
		
		JTextPane txtpnACst = new JTextPane();
		txtpnACst.setFocusable(false);
		txtpnACst.setText("\tA CST \u00E9 respons\u00E1vel pela forma\u00E7\u00E3o de trincas, podendo ser propagadas de forma intergranular ou transgranular. Os casos mais comuns de corros\u00E3o sob tens\u00E3o s\u00E3o com a\u00E7os inoxid\u00E1veis austen\u00EDticos em \u00E1gua do mar ou em solu\u00E7\u00F5es clor\u00EDdricas. A\u00E7os inoxid\u00E1veis duplex s\u00E3o boas alternativas em meios oce\u00E2nicos.\r\n\r\n\tA CST nos a\u00E7os inoxid\u00E1veis austen\u00EDticos em ambientes com cloro \u00E9 dependente do teor de n\u00EDquel da liga, em 8-10% de Ni permitem condi\u00E7\u00F5es bem cr\u00EDticas. Se esse teor for superior a 40% ou pr\u00F3ximo a zero, o a\u00E7o ser\u00E1 muito menos sens\u00EDvel \u00E0 corros\u00E3o sob tens\u00E3o. A seguir est\u00E3o expostos dados relacionais sobre os a\u00E7os inoxid\u00E1veis:");
		txtpnACst.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtpnACst.setEditable(false);
		txtpnACst.setBackground(SystemColor.menu);
		txtpnACst.setAlignmentX(1.0f);
		txtpnACst.setBounds(23, 248, 753, 202);
		contentPane.add(txtpnACst);
		
		JButton btnCST = new JButton("CST PARA O AISI 304 E AISI 316");
		btnCST.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ligasMeioCloridrico.isVisible()) {
					adicionarImagem(ligasMeioCloridrico, "ligasMeioCloridrico.png");
				}
			}
		});
		btnCST.setFont(new Font("Arial", Font.BOLD, 15));
		btnCST.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCST.setBackground(Color.LIGHT_GRAY);
		btnCST.setBounds(28, 503, 350, 35);
		contentPane.add(btnCST);
		
		JButton btnCSTMgCl = new JButton("CST PARA LIGAS EM MEIO CLOR\u00CDDRICO");
		btnCSTMgCl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCSTMgCl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ligasMgCl.isVisible()) {
					adicionarImagem(ligasMgCl, "ligasMgCl.png");
				}
			}
		});
		btnCSTMgCl.setFont(new Font("Arial", Font.BOLD, 15));
		btnCSTMgCl.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCSTMgCl.setBackground(Color.LIGHT_GRAY);
		btnCSTMgCl.setBounds(406, 503, 350, 35);
		contentPane.add(btnCSTMgCl);
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
