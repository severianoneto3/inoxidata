
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

public class Fadiga extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame fadigaLigas = new JFrame();
	JFrame fadigaTemperatura = new JFrame();
	JFrame fadigaTracao = new JFrame();
	JFrame fadigaVickers = new JFrame();

	private JPanel contentPane;

	public Fadiga() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloFadiga = new JLabel("Fadiga em A\u00E7os Inoxid\u00E1veis");
		lblTituloFadiga.setBounds(218, 10, 349, 46);
		lblTituloFadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblTituloFadiga);

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

		JTextPane txtFadiga = new JTextPane();
		txtFadiga.setFocusable(false);
		txtFadiga.setEditable(false);
		txtFadiga.setBackground(SystemColor.menu);
		txtFadiga.setAlignmentX(RIGHT_ALIGNMENT);
		txtFadiga.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtFadiga.setText(
				"\tFadiga \u00E9 um processo de falha mec\u00E2nica que resulta da aplica\u00E7\u00E3o de ciclos de carregamento repetidos e localizados que podem levar o material a ser danificado ou at\u00E9 inutilizado. Fatores como corros\u00E3o, temperatura na qual o material opera e a quantidade de carga submetida influenciam diretamente na resist\u00EAncia do mesmo \u00E0 fadiga. Os a\u00E7os inoxid\u00E1veis apresentam um limite de resist\u00EAncia \u00E0 fadiga durante ciclos de carga, dessa forma, s\u00E3o realizados testes submetendo o material a esses ciclos e documentando os resultados em um gr\u00E1fico relacionando a carga e a quantidade de ciclos submetidos.\r\n\r\n\tA seguir, s\u00E3o apresentados dados sobre testes em fadiga e associa\u00E7\u00E3o com outras propriedades como temperatura, resist\u00EAncia \u00E0 tra\u00E7\u00E3o e dureza vickers.");
		txtFadiga.setBounds(40, 57, 705, 234);
		contentPane.add(txtFadiga);

		JButton btnFadigaLigas = new JButton("LIMITES DE FADIGA DAS LIGAS DE A\u00C7O INOX");
		btnFadigaLigas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadigaLigas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!fadigaLigas.isVisible()) {
					adicionarImagem(fadigaLigas, "fadigaLigas.jpg");
				}
			}
		});
		btnFadigaLigas.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadigaLigas.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadigaLigas.setBackground(Color.LIGHT_GRAY);
		btnFadigaLigas.setBounds(148, 300, 490, 45);
		contentPane.add(btnFadigaLigas);

		JButton btnFadigaTemperatura = new JButton("LIMITES DE FADIGA E TEMPERATURA M\u00C1XIMA DE SERVI\u00C7O");
		btnFadigaTemperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadigaTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!fadigaTemperatura.isVisible()) {
					adicionarImagem(fadigaTemperatura, "fadigaTemperatura.png");
				}
			}
		});
		btnFadigaTemperatura.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadigaTemperatura.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadigaTemperatura.setBackground(Color.LIGHT_GRAY);
		btnFadigaTemperatura.setBounds(148, 360, 490, 46);
		contentPane.add(btnFadigaTemperatura);

		JButton btnFadigaTracao = new JButton("LIMITES DE FADIGA E RESIST\u00CANCIA \u00C0 TRA\u00C7\u00C3O");
		btnFadigaTracao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadigaTracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!fadigaTracao.isVisible()) {
					adicionarImagem(fadigaTracao, "fadigaTracao.png");
				}
			}
		});
		btnFadigaTracao.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadigaTracao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadigaTracao.setBackground(Color.LIGHT_GRAY);
		btnFadigaTracao.setBounds(148, 420, 490, 46);
		contentPane.add(btnFadigaTracao);

		JButton btnFadigaVickers = new JButton("LIMITES DE FADIGA E DUREZA VICKERS");
		btnFadigaVickers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadigaVickers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!fadigaVickers.isVisible()) {
					adicionarImagem(fadigaVickers, "fadigaVickers.png");
				}
			}
		});
		btnFadigaVickers.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadigaVickers.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadigaVickers.setBackground(Color.LIGHT_GRAY);
		btnFadigaVickers.setBounds(148, 480, 490, 46);
		contentPane.add(btnFadigaVickers);
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
