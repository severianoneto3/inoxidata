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

public class Temperatura extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField textFieldTemperatura;

	public Temperatura() {
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
				Superficie superficie = new Superficie();
				superficie.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52, 81, 160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblSuperficie = new JLabel("C\u00E1lculo do Fator da Temperatura\r\n");
		lblSuperficie.setBounds(184, 10, 418, 46);
		lblSuperficie.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblSuperficie);

		JTextPane txtSuperficie = new JTextPane();
		txtSuperficie.setFocusable(false);
		txtSuperficie.setEditable(false);
		txtSuperficie.setBackground(SystemColor.menu);
		txtSuperficie.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtSuperficie.setText(
				"\tEnsaios de fadiga s\u00E3o mais comumente realizados a temperatura ambiente. Nas temperaturas acima de aproximadamente 50% da temperatura de fus\u00E3o absoluta do material, a flu\u00EAncia passa a ser um fator significativo para o comportamento do material da pe\u00E7a e a abordagem do modelo tens\u00E3o-n\u00FAmero de ciclos n\u00E3o \u00E9 mais v\u00E1lida.\r\n\r\n\tAssim, define-se o fator de temperatura (C\u1D57\u1D49\u1D50\u1D56) para temperaturas (T) at\u00E9 550\u00BAC como:\r\n\r\n\t- Para T \u2264 450\u00BAC:\t\tC\u1D57\u1D49\u1D50\u1D56 = 1\r\n\t- Para 450\u00BAC < T \u2264 550\u00BAC:\tC\u1D57\u1D49\u1D50\u1D56 = 1 - 0,0058 * (T - 450)\r\n\r\n\tInforme o valor de temperatura (em \u00BAC) a ser utilizado:");
		txtSuperficie.setBounds(24, 65, 738, 253);
		contentPane.add(txtSuperficie);

		DecimalFormat df = new DecimalFormat("0.000");
		final JLabel lblValorSuperficie = new JLabel("?");
		if (Calculos.getTemperatura() != 0) {
			lblValorSuperficie.setText(df.format(Calculos.getTemperatura()));
		}
		lblValorSuperficie.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorSuperficie.setBounds(535, 377, 162, 34);
		contentPane.add(lblValorSuperficie);

		textFieldTemperatura = new JTextField();
		textFieldTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorSuperficie);
			}
		});
		textFieldTemperatura.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldTemperatura.setFont(new Font("Arial", Font.PLAIN, 20));
		textFieldTemperatura.setBounds(210, 325, 200, 34);
		contentPane.add(textFieldTemperatura);
		textFieldTemperatura.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorSuperficie);
			}
		});
		btnOk.setFont(new Font("Arial", Font.BOLD, 15));
		btnOk.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setBounds(450, 325, 132, 34);
		contentPane.add(btnOk);

		JTextPane txtValorSuperficie = new JTextPane();
		txtValorSuperficie.setText("Dessa forma, o valor do fator dos efeitos de superf\u00EDcie \u00E9:");
		txtValorSuperficie.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtValorSuperficie.setFocusable(false);
		txtValorSuperficie.setEditable(false);
		txtValorSuperficie.setBackground(SystemColor.menu);
		txtValorSuperficie.setBounds(95, 377, 477, 34);
		contentPane.add(txtValorSuperficie);

		JTextPane txtProximo = new JTextPane();
		txtProximo.setText(
				"Com isso, seguimos para o c\u00E1lculo do fator devido a confiabilidade. Clique no bot\u00E3o ao lado para seguir:");
		txtProximo.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo.setFocusable(false);
		txtProximo.setEditable(false);
		txtProximo.setBackground(SystemColor.menu);
		txtProximo.setBounds(95, 420, 598, 65);
		contentPane.add(txtProximo);

		JButton btnProximo = new JButton("PR\u00D3XIMO \u00BB");
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Confiabilidade confiabilidade = new Confiabilidade();
				confiabilidade.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 15));
		btnProximo.setFocusable(false);
		btnProximo.setBackground(new Color(52, 81, 160));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnProximo.setBounds(620, 493, 132, 34);
		contentPane.add(btnProximo);

	}

	private void calcularFator(JLabel label) {
		try {
			DecimalFormat df = new DecimalFormat("0.000");
			String textoDigitado = textFieldTemperatura.getText().replace(",", ".");
			double valor = Double.parseDouble(textoDigitado);

			if (valor > 550) {
				JOptionPane.showMessageDialog(frame, "Informe um valor inferior ou igual a 550ºC!", "Erro", 1);
			} else {
				if (valor < 0) {
					JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
				} else {
					Calculos.setTemperatura(valor);
					label.setText(df.format(Calculos.getTemperatura()));
				}
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
		}
	}

}
