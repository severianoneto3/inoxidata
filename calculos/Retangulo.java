package calculos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

public class Retangulo extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField txtB;
	private JTextField txtH;

	public Retangulo() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(450, 170, 450, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtSecaoRetangulo = new JTextPane();
		txtSecaoRetangulo.setText("SE\u00C7\u00C3O RETANGULAR MACI\u00C7A");
		txtSecaoRetangulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		txtSecaoRetangulo.setFocusable(false);
		txtSecaoRetangulo.setEditable(false);
		txtSecaoRetangulo.setBackground(SystemColor.menu);
		txtSecaoRetangulo.setBounds(74, 10, 287, 31);
		contentPane.add(txtSecaoRetangulo);

		JPanel panelRetangulo = new JPanel();
		panelRetangulo.setBounds(20, 51, 180, 180);
		contentPane.add(panelRetangulo);

		adicionarImagem(panelRetangulo, "retangulo180.png");

		JLabel lblBase = new JLabel("Base (b):");
		lblBase.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblBase.setBounds(105, 288, 92, 32);
		contentPane.add(lblBase);

		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtB.setFont(new Font("Arial", Font.PLAIN, 18));
		txtB.setColumns(10);
		txtB.setBounds(201, 286, 127, 30);
		contentPane.add(txtB);

		JLabel lblAlturah = new JLabel("Altura (h):");
		lblAlturah.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblAlturah.setBounds(105, 328, 92, 32);
		contentPane.add(lblAlturah);

		txtH = new JTextField();
		txtH.setHorizontalAlignment(SwingConstants.RIGHT);
		txtH.setFont(new Font("Arial", Font.PLAIN, 18));
		txtH.setColumns(10);
		txtH.setBounds(201, 328, 127, 30);
		contentPane.add(txtH);

		JLabel lblInforme = new JLabel("Informe os seguintes valores (em mm):");
		lblInforme.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblInforme.setBounds(74, 244, 287, 32);
		contentPane.add(lblInforme);

		JTextPane txtpnClculoDarea = new JTextPane();
		txtpnClculoDarea.setText("C\u00E1lculo da \u00E1rea (A\u2089\u2085):\r\n\r\nA\u2089\u2085 = 0,05 * b * h");
		txtpnClculoDarea.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtpnClculoDarea.setFocusable(false);
		txtpnClculoDarea.setEditable(false);
		txtpnClculoDarea.setBackground(SystemColor.menu);
		txtpnClculoDarea.setBounds(231, 91, 176, 81);
		contentPane.add(txtpnClculoDarea);

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
		btnOk.setFocusable(false);
		btnOk.setBackground(new Color(52, 81, 160));
		btnOk.setForeground(new Color(255, 255, 255));
		btnOk.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOk.setBounds(210, 377, 106, 30);
		contentPane.add(btnOk);
	}

	private void calcularArea() {
		try {

			DecimalFormat df = new DecimalFormat("0.00");
			DecimalFormat df2 = new DecimalFormat("0.000");
			String textoDigitadoBase = txtB.getText().replace(",", ".");
			String textoDigitadoAltura = txtH.getText().replace(",", ".");

			double valorBase = Double.parseDouble(textoDigitadoBase);
			double valorAltura = Double.parseDouble(textoDigitadoAltura);

			if (valorBase < 0 || valorAltura < 0) {
				JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
			} else {
				Calculos.setAreaBH(valorBase, valorAltura);
				Calculos.setDiametroArea();
				Calculos.setTamanho();
				AreaSecaoTransversal.setLabelAreaText(df.format(Calculos.getArea()) + " mm²");
				AreaSecaoTransversal.setLabelDiametroText(df.format(Calculos.getDiametro()) + " mm²");
				Tamanho.setLabelTamanhoText(df2.format(Calculos.getTamanho()));
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", 1);
		}
	}

	public void adicionarImagem(JPanel panel, String imagem) {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource(imagem)));
		panel.add(label);
	}
}
