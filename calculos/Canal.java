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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Canal extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField txtB;
	private JTextField txtH;
	private JTextField txtT;
	private JTextField txtX;
	private int eixo = 0;

	public Canal() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(450, 120, 550, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtCanal = new JTextPane();
		txtCanal.setText("VIGA EM C");
		txtCanal.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		txtCanal.setFocusable(false);
		txtCanal.setEditable(false);
		txtCanal.setBackground(SystemColor.menu);
		txtCanal.setBounds(215, 10, 106, 31);
		contentPane.add(txtCanal);

		JPanel panelCanal = new JPanel();
		panelCanal.setBounds(20, 51, 180, 180);
		contentPane.add(panelCanal);

		adicionarImagem(panelCanal, "canal180.png");

		JTextPane txtCalculo = new JTextPane();
		txtCalculo = new JTextPane();
		txtCalculo.setText(
				"\tC\u00E1lculo da \u00E1rea (A\u2089\u2085):\r\n\r\nCaso a carga seja na dire\u00E7\u00E3o do eixo 1-1:\r\n\r\nA\u2089\u2085\u208D\u2081\u208B\u2081\u208E = 0,05*b*h | (t > 0,025*b)\r\n\r\nCaso a carga seja na dire\u00E7\u00E3o do eixo 2-2:\r\n\r\nA\u2089\u2085\u208D\u2082\u208B\u2082\u208E = 0,05*b*x + t(h-x)");
		txtCalculo.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtCalculo.setFocusable(false);
		txtCalculo.setEditable(false);
		txtCalculo.setBackground(SystemColor.menu);
		txtCalculo.setBounds(211, 51, 321, 204);
		contentPane.add(txtCalculo);

		JLabel lblBase = new JLabel("Base (b):");
		lblBase.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblBase.setBounds(189, 386, 64, 32);
		contentPane.add(lblBase);

		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtB.setFont(new Font("Arial", Font.PLAIN, 18));
		txtB.setColumns(10);
		txtB.setBounds(270, 386, 156, 30);
		contentPane.add(txtB);

		JLabel lblAlturah = new JLabel("Altura (h):");
		lblAlturah.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblAlturah.setBounds(179, 426, 74, 32);
		contentPane.add(lblAlturah);

		txtH = new JTextField();
		txtH.setHorizontalAlignment(SwingConstants.RIGHT);
		txtH.setFont(new Font("Arial", Font.PLAIN, 18));
		txtH.setColumns(10);
		txtH.setBounds(270, 426, 156, 30);
		contentPane.add(txtH);

		JLabel lblInforme = new JLabel("Informe os seguintes valores (em mm):");
		lblInforme.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblInforme.setBounds(124, 348, 287, 32);
		contentPane.add(lblInforme);

		JTextPane txtpnClculoDarea = new JTextPane();
		txtpnClculoDarea.setText("C\u00E1lculo da \u00E1rea (A\u2089\u2085):\r\n\r\nA\u2089\u2085 = 0,05 * b * h");
		txtpnClculoDarea.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnClculoDarea.setFocusable(false);
		txtpnClculoDarea.setEditable(false);
		txtpnClculoDarea.setBackground(SystemColor.menu);
		txtpnClculoDarea.setBounds(231, 91, 176, 81);
		contentPane.add(txtpnClculoDarea);

		txtT = new JTextField();
		txtT.setHorizontalAlignment(SwingConstants.RIGHT);
		txtT.setFont(new Font("Arial", Font.PLAIN, 18));
		txtT.setColumns(10);
		txtT.setBounds(270, 466, 156, 30);
		contentPane.add(txtT);

		JLabel lblBanzo = new JLabel("Espessura da aba (t):");
		lblBanzo.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblBanzo.setBounds(97, 466, 156, 32);
		contentPane.add(lblBanzo);

		txtX = new JTextField();
		txtX.setHorizontalAlignment(SwingConstants.RIGHT);
		txtX.setFont(new Font("Arial", Font.PLAIN, 18));
		txtX.setColumns(10);
		txtX.setBounds(270, 506, 156, 30);
		contentPane.add(txtX);

		JLabel lblEspessuraDaAlma = new JLabel("Espessura da alma (x):");
		lblEspessuraDaAlma.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblEspessuraDaAlma.setBounds(85, 508, 171, 32);
		contentPane.add(lblEspessuraDaAlma);

		JButton btnOk = new JButton("OK");
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularArea();
				if (Calculos.getTamanho() != 0) {
					frame.dispose();
				}
			}
		});
		btnOk.setFont(new Font("Arial", Font.BOLD, 15));
		btnOk.setBounds(296, 556, 106, 30);
		btnOk.setFocusable(false);
		btnOk.setBackground(new Color(52, 81, 160));
		btnOk.setForeground(new Color(255, 255, 255));
		btnOk.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnOk);

		JLabel lblInformeOEixo = new JLabel("Informe o eixo de aplica\u00E7\u00E3o da carga:");
		lblInformeOEixo.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblInformeOEixo.setBounds(124, 265, 287, 32);
		contentPane.add(lblInformeOEixo);
		
		final JLabel lblEixo = new JLabel("?");
		lblEixo.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblEixo.setBounds(140, 565, 115, 32);
		contentPane.add(lblEixo);

		JButton btnVertical = new JButton("1-1");
		btnVertical.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVertical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setEixo(1);
				lblEixo.setText("VERTICAL");
			}
		});
		btnVertical.setFont(new Font("Arial", Font.BOLD, 15));
		btnVertical.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnVertical.setBackground(Color.LIGHT_GRAY);
		btnVertical.setBounds(85, 305, 140, 30);
		contentPane.add(btnVertical);

		JButton btnHorizontal = new JButton("2-2");
		btnHorizontal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHorizontal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setEixo(2);
				lblEixo.setText("HORIZONTAL");
			}
		});
		btnHorizontal.setFont(new Font("Arial", Font.BOLD, 15));
		btnHorizontal.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnHorizontal.setBackground(Color.LIGHT_GRAY);
		btnHorizontal.setBounds(310, 305, 140, 30);
		contentPane.add(btnHorizontal);
		
		JLabel lblEixoEscolhido = new JLabel("Eixo escolhido:");
		lblEixoEscolhido.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblEixoEscolhido.setBounds(25, 565, 115, 32);
		contentPane.add(lblEixoEscolhido);
		
		
	}

	public void adicionarImagem(JPanel panel, String imagem) {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource(imagem)));
		panel.add(label);
	}

	private void calcularArea() {
		try {

			DecimalFormat df = new DecimalFormat("0.00");
			DecimalFormat df2 = new DecimalFormat("0.000");
			String textoDigitadoBase = txtB.getText().replace(",", ".");
			String textoDigitadoAltura = txtH.getText().replace(",", ".");
			String textoDigitadoAba = txtT.getText().replace(",", ".");
			String textoDigitadoAlma = txtX.getText().replace(",", ".");

			double valorBase = Double.parseDouble(textoDigitadoBase);
			double valorAltura = Double.parseDouble(textoDigitadoAltura);
			double valorAba = Double.parseDouble(textoDigitadoAba);
			double valorAlma = Double.parseDouble(textoDigitadoAlma);
			
			if (valorBase < 0 || valorAltura < 0 || valorAba < 0 || valorAlma < 0) {
				JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
			} else {
				
				if (getEixo() == 1) {
					
					if (valorAba > (0.025 * valorBase)) {
						Calculos.setAreaBH(valorBase, valorAltura);
						Calculos.setDiametroArea();
						Calculos.setTamanho();

						AreaSecaoTransversal.setLabelAreaText(df.format(Calculos.getArea()) + " mm²");
						AreaSecaoTransversal.setLabelDiametroText(df.format(Calculos.getDiametro()) + " mm²");
						Tamanho.setLabelTamanhoText(df2.format(Calculos.getTamanho()));
					} else {
						JOptionPane.showMessageDialog(frame, "O valor da aba deve ser superior a 0,025 * b para o eixo vertical!", "Erro", 1);
					}
					
				} else if (getEixo() == 2) {
					Calculos.setAreaBX(valorBase, valorAltura, valorAba, valorAlma);
					Calculos.setDiametroArea();
					Calculos.setTamanho();

					AreaSecaoTransversal.setLabelAreaText(df.format(Calculos.getArea()) + " mm²");
					AreaSecaoTransversal.setLabelDiametroText(df.format(Calculos.getDiametro()) + " mm²");
					Tamanho.setLabelTamanhoText(df2.format(Calculos.getTamanho()));
				} else {
					JOptionPane.showMessageDialog(frame, "Informe o eixo de aplicação da carga!", "Erro", 1);
				}
				
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
		}
	}

	private int getEixo() {
		return eixo;
	}

	private void setEixo(int eixo) {
		this.eixo = eixo;
	}
}
