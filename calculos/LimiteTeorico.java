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
import java.awt.Component;

public class LimiteTeorico extends JFrame {

	public JFrame frame = new JFrame();
	DadosResistenciaTracao dadosRT = new DadosResistenciaTracao();

	private JPanel contentPane;
	private JTextField resistenciaTracao;

	public LimiteTeorico() {
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
				InicioCalculos inicioCalculos = new InicioCalculos();
				inicioCalculos.frame.setVisible(true);
				frame.dispose();
				
				if(dadosRT.frame.isVisible()) {
					dadosRT.frame.setVisible(false);
				}
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblLimiteTeorico = new JLabel("C\u00E1lculo da Estimativa Te\u00F3rica do Limite");
		lblLimiteTeorico.setBounds(142, 10, 501, 46);
		lblLimiteTeorico.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblLimiteTeorico);

		JTextPane txtInicioCalculos = new JTextPane();
		txtInicioCalculos.setFocusable(false);
		txtInicioCalculos.setEditable(false);
		txtInicioCalculos.setBackground(SystemColor.menu);
		txtInicioCalculos.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtInicioCalculos.setText(
				"Para os a\u00E7os, o limite te\u00F3rico (S\u1D49') \u00E9 obtido da seguinte forma:\r\n\r\n- S\u1D49' \u2248 0,5 * S\u1D58\u1D57 | para S\u1D58\u1D57 < 1400 MPa\r\n- S\u1D49' \u2248 700 MPa | para S\u1D58\u1D57 \u2265 1400 MPa\r\n\r\nClique no bot\u00E3o abaixo para consultar informa\u00E7\u00F5es de limites de resist\u00EAncia \u00E0 tra\u00E7\u00E3o de a\u00E7os inoxid\u00E1veis:");
		txtInicioCalculos.setBounds(94, 65, 610, 170);
		contentPane.add(txtInicioCalculos);

		DecimalFormat df = new DecimalFormat("0");
		final JLabel lblValorLimiteTeorico = new JLabel("?");
		if (Calculos.getLimiteTeorico() != 0) {
			lblValorLimiteTeorico.setText(df.format(Calculos.getLimiteTeorico()) + " MPa");
		}
		lblValorLimiteTeorico.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorLimiteTeorico.setBounds(412, 423, 162, 34);
		contentPane.add(lblValorLimiteTeorico);

		final JTextField txtFieldResistenciaTracao = new JTextField();
		txtFieldResistenciaTracao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFieldResistenciaTracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorLimiteTeorico, txtFieldResistenciaTracao);
			}
		});
		txtFieldResistenciaTracao.setFont(new Font("Arial", Font.PLAIN, 20));
		txtFieldResistenciaTracao.setBounds(196, 375, 211, 34);
		contentPane.add(txtFieldResistenciaTracao);
		txtFieldResistenciaTracao.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorLimiteTeorico, txtFieldResistenciaTracao);
			}
		});
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOk.setFont(new Font("Arial", Font.BOLD, 15));
		btnOk.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setBounds(448, 375, 132, 34);
		contentPane.add(btnOk);

		JTextPane txtInicioCalculos_1 = new JTextPane();
		txtInicioCalculos_1.setFocusable(false);
		txtInicioCalculos_1.setText("Dessa forma, o valor do limite te\u00F3rico \u00E9:");
		txtInicioCalculos_1.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtInicioCalculos_1.setEditable(false);
		txtInicioCalculos_1.setBackground(SystemColor.menu);
		txtInicioCalculos_1.setBounds(94, 423, 477, 46);
		contentPane.add(txtInicioCalculos_1);

		JTextPane txtProximo = new JTextPane();
		txtProximo.setText(
				"Com isso, seguimos para o c\u00E1lculo do fator devido aos efeitos de solicita\u00E7\u00E3o. Clique no bot\u00E3o ao lado para seguir:");
		txtProximo.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo.setFocusable(false);
		txtProximo.setEditable(false);
		txtProximo.setBackground(SystemColor.menu);
		txtProximo.setBounds(94, 467, 486, 71);
		contentPane.add(txtProximo);

		JButton btnProximo = new JButton("PR\u00D3XIMO \u00BB");
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solicitacao solicitacao = new Solicitacao();
				solicitacao.frame.setVisible(true);
				frame.dispose();
				
				if(dadosRT.frame.isVisible()) {
					dadosRT.frame.setVisible(false);
				}
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 15));
		btnProximo.setBounds(620, 493, 132, 34);
		btnProximo.setFocusable(false);
		btnProximo.setBackground(new Color(52,81,160));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnProximo);
		
		JTextPane txtProximo_1 = new JTextPane();
		txtProximo_1.setText("Informe o valor (em MPa) da resist\u00EAncia \u00E0 tra\u00E7\u00E3o (S\u1D58\u1D57) do material desejado:");
		txtProximo_1.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo_1.setFocusable(false);
		txtProximo_1.setEditable(false);
		txtProximo_1.setBackground(SystemColor.menu);
		txtProximo_1.setBounds(94, 325, 598, 40);
		contentPane.add(txtProximo_1);
		
		JButton btnDados = new JButton("S\u1D58\u1D57 DE A\u00C7OS INOXID\u00C1VEIS");
		btnDados.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDados.setForeground(new Color(0, 0, 128));
		btnDados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!dadosRT.frame.isVisible()) {
					dadosRT.frame.setVisible(true);
				}
			}
		});
		btnDados.setFont(new Font("Arial", Font.BOLD, 15));
		btnDados.setBounds(267, 245, 252, 34);
		btnDados.setFocusable(false);
		btnDados.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnDados.setBackground(Color.LIGHT_GRAY);
		btnDados.setForeground(Color.BLACK);
		contentPane.add(btnDados);
		
		JTextPane txtProximo_1_1 = new JTextPane();
		txtProximo_1_1.setText("Fonte: Atlas Steels Technical Handbook of Stainless Steels (2021)");
		txtProximo_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		txtProximo_1_1.setFocusable(false);
		txtProximo_1_1.setEditable(false);
		txtProximo_1_1.setBackground(SystemColor.menu);
		txtProximo_1_1.setBounds(200, 283, 385, 34);
		contentPane.add(txtProximo_1_1);
	}

	private void calcularFator(JLabel label, JTextField resistenciaTracao) {
		try {
			DecimalFormat df = new DecimalFormat("0");
			String textoDigitado = resistenciaTracao.getText().replace(",", ".");
			double valor = Double.parseDouble(textoDigitado);
			
			if (valor < 0) {
				JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
			} else {
				Calculos.setResistenciaTracao(valor);
				Calculos.setLimiteTeorico();
				label.setText(df.format(Calculos.getLimiteTeorico()) + " MPa");
			}
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
		}
	}
}
