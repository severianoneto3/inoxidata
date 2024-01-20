package calculos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Tamanho extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	AreaSecaoTransversal areaSecaoTransversal = new AreaSecaoTransversal();

	private JPanel contentPane;
	private JTextField textFieldDiametro;
	private static JLabel lblValorTamanho;

	public Tamanho() {
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
				Solicitacao solicitacao = new Solicitacao();
				solicitacao.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52, 81, 160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblTamanho = new JLabel("C\u00E1lculo do Fator dos Efeitos do Tamanho\r\n");
		lblTamanho.setBounds(138, 10, 510, 46);
		lblTamanho.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblTamanho);

		JTextPane txtTamanho = new JTextPane();
		txtTamanho.setFocusable(false);
		txtTamanho.setEditable(false);
		txtTamanho.setBackground(SystemColor.menu);
		txtTamanho.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtTamanho.setText(
				"\tO fator de tamanho (C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52), que reduz a resist\u00EAncia, \u00E9 obtido para pe\u00E7as circulares a partir do di\u00E2metro (d) da seguinte forma:\r\n\r\n\t- Para d \u2264 8mm: C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52 = 1\r\n\t- Para 8mm < d \u2264 250mm: C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52 = 1,189*(d\u207B\u00BA\u0387\u00BA\u2079\u2077)\r\n\t- Para d > 250mm: C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52 = 0,6\r\n\r\n\tInforme o valor (em mm) do di\u00E2metro (d) da pe\u00E7a desejada:");
		txtTamanho.setBounds(25, 65, 736, 188);
		contentPane.add(txtTamanho);

		DecimalFormat df = new DecimalFormat("0.000");
		lblValorTamanho = new JLabel("?");
		if (Calculos.getTamanho() != 0) {
			lblValorTamanho.setText(df.format(Calculos.getTamanho()));
		}
		lblValorTamanho.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorTamanho.setBounds(539, 398, 162, 34);
		contentPane.add(lblValorTamanho);

		textFieldDiametro = new JTextField();
		textFieldDiametro.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldDiametro.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldDiametro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorTamanho);
			}
		});
		textFieldDiametro.setBounds(188, 255, 127, 30);
		contentPane.add(textFieldDiametro);
		textFieldDiametro.setColumns(10);

		JLabel lblDiametro = new JLabel("Di\u00E2metro:");
		lblDiametro.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblDiametro.setBounds(102, 255, 92, 32);
		contentPane.add(lblDiametro);

		JButton btnOk = new JButton("OK");
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorTamanho);
			}
		});
		btnOk.setFont(new Font("Arial", Font.BOLD, 15));
		btnOk.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setBounds(330, 255, 84, 30);
		contentPane.add(btnOk);

		JTextPane txtEfeitoTamanho = new JTextPane();
		txtEfeitoTamanho.setText("Dessa forma, o valor do fator dos efeitos de tamanho \u00E9:");
		txtEfeitoTamanho.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtEfeitoTamanho.setFocusable(false);
		txtEfeitoTamanho.setEditable(false);
		txtEfeitoTamanho.setBackground(SystemColor.menu);
		txtEfeitoTamanho.setBounds(101, 398, 477, 34);
		contentPane.add(txtEfeitoTamanho);

		JTextPane txtProximo = new JTextPane();
		txtProximo.setText(
				"Com isso, seguimos para o c\u00E1lculo do fator devido aos efeitos da superf\u00EDcie. Clique no bot\u00E3o ao lado para seguir:");
		txtProximo.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo.setFocusable(false);
		txtProximo.setEditable(false);
		txtProximo.setBackground(SystemColor.menu);
		txtProximo.setBounds(101, 440, 490, 66);
		contentPane.add(txtProximo);

		JButton btnProximo = new JButton("PR\u00D3XIMO \u00BB");
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Superficie superficie = new Superficie();
				superficie.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 15));
		btnProximo.setFocusable(false);
		btnProximo.setBackground(new Color(52, 81, 160));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnProximo.setBounds(605, 488, 132, 34);
		contentPane.add(btnProximo);

		JTextPane txtpnOFatorDe = new JTextPane();
		txtpnOFatorDe
				.setText("\tPara pe\u00E7as com formatos n\u00E3o-circulares, clique no bot\u00E3o abaixo:\r\n\r\n");
		txtpnOFatorDe.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtpnOFatorDe.setFocusable(false);
		txtpnOFatorDe.setEditable(false);
		txtpnOFatorDe.setBackground(SystemColor.menu);
		txtpnOFatorDe.setBounds(27, 300, 736, 46);
		contentPane.add(txtpnOFatorDe);

		JButton btnDiametroEquivalente = new JButton("DI\u00C2METRO EQUIVALENTE PARA PE\u00C7AS N\u00C3O-CIRCULARES");
		btnDiametroEquivalente.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDiametroEquivalente.setForeground(new Color(0, 0, 128));
		btnDiametroEquivalente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDiametroEquivalente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!areaSecaoTransversal.frame.isVisible()) {
					areaSecaoTransversal.frame.setVisible(true);
				}
			}
		});
		btnDiametroEquivalente.setFont(new Font("Arial", Font.BOLD, 15));
		btnDiametroEquivalente.setBounds(154, 348, 478, 30);
		btnDiametroEquivalente.setFocusable(false);
		btnDiametroEquivalente.setBackground(Color.LIGHT_GRAY);
		btnDiametroEquivalente.setForeground(Color.BLACK);
		btnDiametroEquivalente.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnDiametroEquivalente);

	}

	public JLabel getLabelTamanho() {
		return lblValorTamanho;
	}

	public static void setLabelTamanhoText(String texto) {
		lblValorTamanho.setText(texto);
	}

	private void calcularFator(JLabel label) {
		try {

			DecimalFormat df = new DecimalFormat("0.000");
			String textoDigitadoDiametro = textFieldDiametro.getText().replace(",", ".");
			double valorDiametro = Double.parseDouble(textoDigitadoDiametro);

			if (valorDiametro < 0) {
				JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
			} else {
				Calculos.setDiametro(valorDiametro);
				Calculos.setTamanho();
				label.setText(df.format(Calculos.getTamanho()));
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
		}
	}
}
