package calculos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AreaSecaoTransversal extends JFrame {

	public JFrame frame = new JFrame();
	Retangulo retangulo = new Retangulo();
	Canal canal = new Canal();
	Viga viga = new Viga();

	private JPanel contentPane;
	private static JLabel lblValorArea;
	private static JLabel lblValorDiametro;

	public AreaSecaoTransversal() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(700, 150, 690, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtTamanho = new JTextPane();
		txtTamanho.setText(
				"\tPara pe\u00E7as com formatos n\u00E3o-circulares, deve-se usar a \u00E1rea (A\u2089\u2085) da se\u00E7\u00E3o transversal de uma pe\u00E7a que se encontra sujeita a uma tens\u00E3o superior a 95% da tens\u00E3o m\u00E1xima da se\u00E7\u00E3o, igualando-a \u00E0 \u00E1rea de um corpo de prova cil\u00EDndrico da viga rotativa sujeito a tens\u00F5es similares para fornecer o di\u00E2metro equivalente (d). Escolha uma das pe\u00E7as abaixo e clique no bot\u00E3o para realizar o c\u00E1lculo de A\u2089\u2085:");
		txtTamanho.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtTamanho.setFocusable(false);
		txtTamanho.setEditable(false);
		txtTamanho.setBackground(SystemColor.menu);
		txtTamanho.setBounds(13, 7, 656, 117);
		contentPane.add(txtTamanho);

		lblValorArea = new JLabel("?");
		lblValorArea.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorArea.setBounds(330, 266, 217, 34);
		contentPane.add(lblValorArea);

		lblValorDiametro = new JLabel("?");
		lblValorDiametro.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorDiametro.setBounds(452, 391, 182, 34);
		contentPane.add(lblValorDiametro);

		JPanel panelRetangulo = new JPanel();
		panelRetangulo.setBounds(85, 125, 95, 95);
		contentPane.add(panelRetangulo);

		JPanel panelCanal = new JPanel();
		panelCanal.setBounds(287, 125, 95, 95);
		contentPane.add(panelCanal);

		JPanel panelViga = new JPanel();
		panelViga.setBounds(493, 125, 95, 95);
		contentPane.add(panelViga);

		adicionarImagem(panelRetangulo, "retangulo95.png");
		adicionarImagem(panelCanal, "canal95.png");
		adicionarImagem(panelViga, "viga95.png");

		JButton btnRetangulo = new JButton("RETANGULAR");
		btnRetangulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRetangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!retangulo.frame.isVisible()) {
					retangulo.frame.setVisible(true);
				}
			}
		});
		btnRetangulo.setFont(new Font("Arial", Font.BOLD, 15));
		btnRetangulo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnRetangulo.setBackground(Color.LIGHT_GRAY);
		btnRetangulo.setBounds(59, 228, 145, 27);
		contentPane.add(btnRetangulo);

		JButton btnViga = new JButton("VIGA EM I");
		btnViga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnViga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!viga.frame.isVisible()) {
					viga.frame.setVisible(true);
				}
			}
		});
		btnViga.setFont(new Font("Arial", Font.BOLD, 15));
		btnViga.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnViga.setBackground(Color.LIGHT_GRAY);
		btnViga.setBounds(467, 228, 145, 27);
		contentPane.add(btnViga);

		JButton btnCanal = new JButton("VIGA EM C");
		btnCanal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!canal.frame.isVisible()) {
					canal.frame.setVisible(true);
				}
			}
		});
		btnCanal.setFont(new Font("Arial", Font.BOLD, 15));
		btnCanal.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCanal.setBackground(Color.LIGHT_GRAY);
		btnCanal.setBounds(263, 228, 145, 27);
		contentPane.add(btnCanal);

		JLabel lblNewLabel = new JLabel("__________");
		lblNewLabel.setFocusable(false);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(143, 347, 145, 21);
		contentPane.add(lblNewLabel);

		JTextPane txtTamanho_1 = new JTextPane();
		txtTamanho_1.setText(
				"\tO c\u00E1lculo do di\u00E2metro equivalente (d) pode ser definido a partir da seguinte equa\u00E7\u00E3o:\r\n\r\n\t- d = \u221A(A\u2089\u2085/0,0766)");
		txtTamanho_1.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtTamanho_1.setFocusable(false);
		txtTamanho_1.setEditable(false);
		txtTamanho_1.setBackground(SystemColor.menu);
		txtTamanho_1.setBounds(20, 298, 638, 95);
		contentPane.add(txtTamanho_1);

		JTextPane txtEfeitoTamanho = new JTextPane();
		txtEfeitoTamanho.setText("\tDessa forma, o valor de A\u2089\u2085 \u00E9:");
		txtEfeitoTamanho.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtEfeitoTamanho.setFocusable(false);
		txtEfeitoTamanho.setEditable(false);
		txtEfeitoTamanho.setBackground(SystemColor.menu);
		txtEfeitoTamanho.setBounds(20, 266, 477, 34);
		contentPane.add(txtEfeitoTamanho);

		JTextPane txtEfeitoTamanho_1 = new JTextPane();
		txtEfeitoTamanho_1.setText("\tDessa forma, o valor do di\u00E2metro equivalente \u00E9:");
		txtEfeitoTamanho_1.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtEfeitoTamanho_1.setFocusable(false);
		txtEfeitoTamanho_1.setEditable(false);
		txtEfeitoTamanho_1.setBackground(SystemColor.menu);
		txtEfeitoTamanho_1.setBounds(20, 392, 477, 27);
		contentPane.add(txtEfeitoTamanho_1);

		JButton btnRetornar = new JButton("\u00AB RETORNAR");
		btnRetornar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnRetornar.setFont(new Font("Arial", Font.BOLD, 15));
		btnRetornar.setBounds(507, 425, 132, 30);
		btnRetornar.setFocusable(false);
		btnRetornar.setBackground(new Color(52,81,160));
		btnRetornar.setForeground(new Color(255, 255, 255));
		btnRetornar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnRetornar);

	}

	public void adicionarImagem(JPanel panel, String imagem) {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource(imagem)));
		panel.add(label);
	}
	
	public JLabel getLabelArea() {
		return lblValorArea;
	}
	
	public static void setLabelAreaText(String texto) {
		lblValorArea.setText(texto);
	}
	
	public JLabel getLabelDiametro() {
		return lblValorDiametro;
	}
	
	public static void setLabelDiametroText(String texto) {
		lblValorDiametro.setText(texto);
	}
}
