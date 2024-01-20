package calculos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import principal.TelaPrincipal;

public class InicioCalculos extends JFrame {

	public JFrame frame = new JFrame();
	
	private JPanel contentPane;

	public InicioCalculos() {
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
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblInicioCalculos = new JLabel("C\u00E1lculo da Estimativa do Limite de Fadiga");
		lblInicioCalculos.setBounds(127, 10, 531, 46);
		lblInicioCalculos.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblInicioCalculos);

		JTextPane txtInicioCalculos = new JTextPane();
		txtInicioCalculos.setFocusable(false);
		txtInicioCalculos.setEditable(false);
		txtInicioCalculos.setBackground(SystemColor.menu);
		txtInicioCalculos.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtInicioCalculos.setText(
				"\tEm caso da impossibilidade da realiza\u00E7\u00E3o de testes e/ou ensaios com montagens reais, com os prot\u00F3tipos das pe\u00E7as e com corpos de prova do material a ser analisado, al\u00E9m da aus\u00EAncia de dados dispon\u00EDveis na literatura ou em manuais de fabricantes/fornecedores, faz-se necess\u00E1rio a realiza\u00E7\u00E3o de uma estimativa do limite de fadiga do material baseado nos dados dispon\u00EDveis de ensaios est\u00E1ticos.\r\n\r\n\tPara isso, esses dados devem ser modificados para considerar, em seus valores finais, as diferen\u00E7as f\u00EDsicas entre os corpos de prova e a pe\u00E7a real que est\u00E1 sendo projetada. Ser\u00E3o obtidos e aplicados um conjunto de fatores de redu\u00E7\u00E3o da resist\u00EAncia que s\u00E3o, depois, multiplicados pela estimativa te\u00F3rica para se obter o limite de fadiga corrigido para uma aplica\u00E7\u00E3o em particular.\r\n\r\n\tA equa\u00E7\u00E3o para obter a resist\u00EAncia/limite de fadiga corrigido (S\u1D49) \u00E9:");
		txtInicioCalculos.setBounds(24, 60, 737, 255);
		contentPane.add(txtInicioCalculos);

		JLabel lblS = new JLabel(
				"S\u1D49 = C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D * C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52 * C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0 * C\u1D57\u1D49\u1D50\u1D56 * C\u1D9C\u1D52\u207F\u1DA0 * S\u1D49' ");
		lblS.setFont(new Font("Arial", Font.PLAIN, 25));
		lblS.setBounds(124, 305, 538, 46);
		contentPane.add(lblS);

		JTextPane txtpnEmCasoDa = new JTextPane();
		txtpnEmCasoDa.setFocusable(false);
		txtpnEmCasoDa.setText(
				"\tDessa forma, os fatores de redu\u00E7\u00E3o da resist\u00EAncia s\u00E3o: efeitos da solicita\u00E7\u00E3o (C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D), efeitos do tamanho (C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52), efeitos da superf\u00EDcie (C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0), temperatura (C\u1D57\u1D49\u1D50\u1D56) e confiabilidade (C\u1D9C\u1D52\u207F\u1DA0), al\u00E9m da estimativa te\u00F3rica (S\u1D49'). Todos esses valores obtidos s\u00E3o multiplicados a fim de obter a estimativa do limite de fadiga do material.");
		txtpnEmCasoDa.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnEmCasoDa.setEditable(false);
		txtpnEmCasoDa.setBackground(SystemColor.menu);
		txtpnEmCasoDa.setBounds(39, 350, 707, 95);
		contentPane.add(txtpnEmCasoDa);

		JTextPane txtpnCalculeOLimite = new JTextPane();
		txtpnCalculeOLimite.setFocusable(false);
		txtpnCalculeOLimite.setText(
				"\tCalcule o limite de fadiga do a\u00E7o inoxid\u00E1vel que voc\u00EA deseja! Clique no bot\u00E3o ao lado e siga os passos indicados para obter o limite do a\u00E7o desejado.");
		txtpnCalculeOLimite.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnCalculeOLimite.setEditable(false);
		txtpnCalculeOLimite.setBackground(SystemColor.menu);
		txtpnCalculeOLimite.setBounds(39, 450, 446, 79);
		contentPane.add(txtpnCalculeOLimite);

		JButton btnInicioCalculos = new JButton("INICIAR");
		btnInicioCalculos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInicioCalculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimiteTeorico limiteTeorico = new LimiteTeorico();
				limiteTeorico.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnInicioCalculos.setFont(new Font("Arial", Font.BOLD, 28));
		btnInicioCalculos.setBounds(495, 447, 230, 70);
		btnInicioCalculos.setFocusable(false);
		btnInicioCalculos.setBackground(new Color(52,81,160));
		btnInicioCalculos.setForeground(new Color(255, 255, 255));
		btnInicioCalculos.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		contentPane.add(btnInicioCalculos);

	}

}
