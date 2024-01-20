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
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import principal.TelaPrincipal;

public class FinalCalculos extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;

	public FinalCalculos() {
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
				Confiabilidade confiabilidade = new Confiabilidade();
				confiabilidade.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblFinalCalculos = new JLabel("C\u00E1lculo do Limite de Fadiga Corrigido\r\n");
		lblFinalCalculos.setBounds(153, 10, 483, 46);
		lblFinalCalculos.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblFinalCalculos);
		
		DecimalFormat df = new DecimalFormat("0");
		DecimalFormat df2 = new DecimalFormat("0.00");
		DecimalFormat df3 = new DecimalFormat("0.000");
		
		final JLabel lblValorLimiteFinal = new JLabel("?");
		if (Calculos.getLimiteFinal() != 0) {
			lblValorLimiteFinal.setText(df.format(Calculos.getLimiteFinal()) + " MPa");
		}
		lblValorLimiteFinal.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorLimiteFinal.setBounds(440, 435, 162, 34);
		contentPane.add(lblValorLimiteFinal);

		JTextPane txtFinalCalculos = new JTextPane();
		txtFinalCalculos.setFocusable(false);
		txtFinalCalculos.setEditable(false);
		txtFinalCalculos.setBackground(SystemColor.menu);
		txtFinalCalculos.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtFinalCalculos.setText(
				"\tAgora, com todos os fatores de redu\u00E7\u00E3o de resist\u00EAncia obtidos, \u00E9 poss\u00EDvel realizar o c\u00E1lculo do limite de fadiga corrigido (S\u1D49) a partir da f\u00F3rmula apresentada abaixo. Os valores dos fatores calculados s\u00E3o:\r\n\r\n\t- Fator devido aos efeitos da solicita\u00E7\u00E3o (C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D): " + df2.format(Calculos.getCarregamento()) + "\r\n\t- Fator devido aos efeitos do tamanho (C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52): " + df3.format(Calculos.getTamanho()) + "\r\n\t- Fator devido aos efeitos da superf\u00EDcie (C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0): " + df2.format(Calculos.getSuperficie()) + "\r\n\t- Fator devido \u00E0 temperatura (C\u1D57\u1D49\u1D50\u1D56): " + df3.format(Calculos.getTemperatura()) + "\r\n\t- Fator devido \u00E0 confiabilidade (C\u1D9C\u1D52\u207F\u1DA0): " + df3.format(Calculos.getConfiabilidade()) + "\r\n\t- Estimativa te\u00F3rica do limite (S\u1D49'): " + df.format(Calculos.getLimiteTeorico()) + " MPa");
		txtFinalCalculos.setBounds(30, 65, 726, 229);
		contentPane.add(txtFinalCalculos);
		
		JButton btnCalcularLimite = new JButton("CALCULAR LIMITE DE FADIGA CORRIGIDO");
		btnCalcularLimite.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcularLimite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(lblValorLimiteFinal);
			}
		});
		btnCalcularLimite.setFont(new Font("Arial", Font.BOLD, 15));
		btnCalcularLimite.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCalcularLimite.setBackground(Color.LIGHT_GRAY);
		btnCalcularLimite.setBounds(209, 385, 367, 34);
		contentPane.add(btnCalcularLimite);
		
		JLabel lblFormula = new JLabel("S\u1D49 = C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D * C\u1D57\u1D43\u1D50\u1D43\u207F\u02B0\u1D52 * C\u02E2\u1D58\u1D56\u1D49\u02B3\u1DA0 * C\u1D57\u1D49\u1D50\u1D56 * C\u1D9C\u1D52\u207F\u1DA0 * S\u1D49' ");
		lblFormula.setFont(new Font("Arial", Font.PLAIN, 25));
		lblFormula.setBounds(124, 290, 538, 46);
		contentPane.add(lblFormula);
		
		JTextPane txtClique = new JTextPane();
		txtClique.setText("\tClique no bot\u00E3o abaixo para obter o seu limite de fadiga corrigido:");
		txtClique.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtClique.setFocusable(false);
		txtClique.setEditable(false);
		txtClique.setBackground(SystemColor.menu);
		txtClique.setBounds(30, 342, 726, 39);
		contentPane.add(txtClique);
		
		JTextPane txtValorLimite = new JTextPane();
		txtValorLimite.setText("\tO valor do limite de fadiga corrigido (S\u1D49) \u00E9:");
		txtValorLimite.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtValorLimite.setFocusable(false);
		txtValorLimite.setEditable(false);
		txtValorLimite.setBackground(SystemColor.menu);
		txtValorLimite.setBounds(33, 435, 538, 46);
		contentPane.add(txtValorLimite);
		
		JButton btnRetornarAoMenu = new JButton("RETORNAR AO MENU PRINCIPAL");
		btnRetornarAoMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRetornarAoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnRetornarAoMenu.setFont(new Font("Arial", Font.BOLD, 15));
		btnRetornarAoMenu.setBounds(458, 496, 295, 34);
		btnRetornarAoMenu.setFocusable(false);
		btnRetornarAoMenu.setBackground(new Color(52,81,160));
		btnRetornarAoMenu.setForeground(new Color(255, 255, 255));
		btnRetornarAoMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnRetornarAoMenu);
		
	}
	
	private void calcularFator(JLabel label) {
		DecimalFormat df = new DecimalFormat("0");
		Calculos.setLimiteFinal();
		label.setText(df.format(Calculos.getLimiteFinal()) + " MPa");
	}

}
