package aisi416;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import acos.OutrasLigas;
import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi416 extends JFrame {

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi416() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi416 = new JLabel("AISI 416");
		lblAisi416.setBounds(344, 10, 98, 46);
		lblAisi416.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi416);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutrasLigas outrasLigas = new OutrasLigas();
				outrasLigas.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JTextPane txtAisi416 = new JTextPane();
		txtAisi416.setEditable(false);
		txtAisi416.setBackground(SystemColor.menu);
		txtAisi416.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi416.setText(
				"\tO AISI 416 \u00E9 um a\u00E7o inoxid\u00E1vel martens\u00EDtico e magn\u00E9tico. Possui uma composi\u00E7\u00E3o bem similar ao AISI 410, por\u00E9m com aproximadamente 0,3% de enxofre adicionado para prover uma \u00F3tima maquinabilidade, dispondo de uma varia\u00E7\u00E3o grande de propriedades mec\u00E2nicas obtidas por tratamento t\u00E9rmico. Possui uma resist\u00EAncia \u00E0 corros\u00E3o muito boa em condi\u00E7\u00F5es atmosf\u00E9ricas ou solu\u00E7\u00F5es \u00E1cido-aquosas. O processo de endurecimento e polimento aumenta corros\u00E3o ao n\u00EDvel m\u00E1ximo.\r\n\r\n\t\u00C9 utilizado na ind\u00FAstria para aplica\u00E7\u00F5es que requerem uso extensivo ou em alta velocidade de equipamentos, como em porcas, pe\u00E7as para bombas, parafusos, entre outros. \u00C9 utilizado devido a suas propriedades de excelente maquinabilidade e resist\u00EAncia \u00E0 corros\u00E3o. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 416.");
		txtAisi416.setBounds(22, 133, 741, 199);
		contentPane.add(txtAisi416);

		JButton btnAisi416Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi416Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi416Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao416.png");
				}
			}
		});
		btnAisi416Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi416Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi416Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi416Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi416Composicao);

		JButton btnAisi416Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi416Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi416Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama416.png");
				}
			}
		});
		btnAisi416Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi416Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi416Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi416Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi416Diagrama);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7700", "200", "9,9", "11,0", "11,6", "24,9", "28,7", "460", "570");
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
