package calculos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Solicitacao extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;

	public Solicitacao() {
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
				LimiteTeorico limiteTeorico = new LimiteTeorico();
				limiteTeorico.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);
		
		
		JLabel lblSolicitacao = new JLabel("C\u00E1lculo do Fator dos Efeitos de Solicita\u00E7\u00E3o\r\n");
		lblSolicitacao.setBounds(130, 10, 525, 46);
		lblSolicitacao.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblSolicitacao);
		
		JTextPane txtSolicitacao = new JTextPane();
		txtSolicitacao.setFocusable(false);
		txtSolicitacao.setEditable(false);
		txtSolicitacao.setBackground(SystemColor.menu);
		txtSolicitacao.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtSolicitacao.setText(
				"\tCom base nos ensaios de fadiga sob flex\u00E3o e for\u00E7a normal, pode-se definir um fator devido \u00E0 solicita\u00E7\u00E3o de redu\u00E7\u00E3o da resist\u00EAncia (C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D) como:\r\n\r\n\t- Flex\u00E3o: C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D = 1\r\n\t- Tor\u00E7\u00E3o pura: C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D = 1\r\n\t- For\u00E7a normal: C\u1D9C\u1D43\u02B3\u02B3\u1D49\u1D4D = 0,70\r\n\r\n\tClique no bot\u00E3o correspondente ao esfor\u00E7o solicitado:");
		txtSolicitacao.setBounds(34, 60, 718, 185);
		contentPane.add(txtSolicitacao);
		
		DecimalFormat df = new DecimalFormat("0.00");
		final JLabel lblValorSolicitacao = new JLabel("?");
		if (Calculos.getCarregamento() != 0) {
			lblValorSolicitacao.setText(df.format(Calculos.getCarregamento()));
		}
		lblValorSolicitacao.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblValorSolicitacao.setBounds(555, 430, 162, 34);
		contentPane.add(lblValorSolicitacao);
		
		JButton btnTorcaoPura = new JButton("TOR\u00C7\u00C3O PURA");
		btnTorcaoPura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTorcaoPura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(1, lblValorSolicitacao);
				
			}
		});
		btnTorcaoPura.setFont(new Font("Arial", Font.BOLD, 15));
		btnTorcaoPura.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnTorcaoPura.setBackground(Color.LIGHT_GRAY);
		btnTorcaoPura.setBounds(309, 375, 165, 34);
		contentPane.add(btnTorcaoPura);
		
		JButton btnForcaNormal = new JButton("FOR\u00C7A NORMAL\r\n");
		btnForcaNormal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnForcaNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(0.7, lblValorSolicitacao);
			}
		});
		btnForcaNormal.setFont(new Font("Arial", Font.BOLD, 15));
		btnForcaNormal.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnForcaNormal.setBackground(Color.LIGHT_GRAY);
		btnForcaNormal.setBounds(532, 375, 165, 34);
		contentPane.add(btnForcaNormal);
		
		JButton btnFlexao = new JButton("FLEX\u00C3O\r\n");
		btnFlexao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFlexao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularFator(1, lblValorSolicitacao);
			}
		});
		btnFlexao.setFont(new Font("Arial", Font.BOLD, 15));
		btnFlexao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFlexao.setBackground(Color.LIGHT_GRAY);
		btnFlexao.setBounds(89, 375, 165, 34);
		contentPane.add(btnFlexao);
		
		JTextPane txtInicioCalculos_1 = new JTextPane();
		txtInicioCalculos_1.setFocusable(false);
		txtInicioCalculos_1.setText("\tDessa forma, o valor do fator dos efeitos de solicita\u00E7\u00E3o \u00E9:");
		txtInicioCalculos_1.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtInicioCalculos_1.setEditable(false);
		txtInicioCalculos_1.setBackground(SystemColor.menu);
		txtInicioCalculos_1.setBounds(34, 430, 572, 40);
		contentPane.add(txtInicioCalculos_1);
		
		JTextPane txtProximo = new JTextPane();
		txtProximo.setText("Com isso, seguimos para o c\u00E1lculo do fator devido aos efeitos do tamanho. Clique no bot\u00E3o ao lado para seguir:");
		txtProximo.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo.setFocusable(false);
		txtProximo.setEditable(false);
		txtProximo.setBackground(SystemColor.menu);
		txtProximo.setBounds(105, 474, 471, 61);
		contentPane.add(txtProximo);
		
		JButton btnProximo = new JButton("PR\u00D3XIMO \u00BB");
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tamanho tamanho = new Tamanho();
				tamanho.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 15));
		btnProximo.setFocusable(false);
		btnProximo.setBackground(new Color(52,81,160));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnProximo.setBounds(610, 486, 132, 34);
		contentPane.add(btnProximo);
		
		JPanel panelFlexao = new JPanel();
		panelFlexao.setBounds(114, 247, 120, 120);
		contentPane.add(panelFlexao);
		
		JPanel panelTorcao = new JPanel();
		panelTorcao.setBounds(333, 247, 120, 120);
		contentPane.add(panelTorcao);
		
		JPanel panelNormal = new JPanel();
		panelNormal.setBounds(555, 247, 120, 120);
		contentPane.add(panelNormal);
		
		adicionarImagem(panelFlexao, "flexao.png");
		adicionarImagem(panelTorcao, "torcao.png");
		adicionarImagem(panelNormal, "normal.png");
		
	}
	
	public void adicionarImagem(JPanel panel, String imagem) {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource(imagem)));
		panel.add(label);
	}
	
	private void calcularFator(double carregamento, JLabel label) {
		DecimalFormat df = new DecimalFormat("0.00");
		Calculos.setCarregamento(carregamento);
		label.setText(df.format(Calculos.getCarregamento()));
	}
}
