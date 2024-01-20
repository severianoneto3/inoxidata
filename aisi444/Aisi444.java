package aisi444;

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

public class Aisi444 extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi444() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi444 = new JLabel("AISI 444");
		lblAisi444.setBounds(344, 10, 98, 46);
		lblAisi444.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi444);

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

		JTextPane txtAisi444 = new JTextPane();
		txtAisi444.setEditable(false);
		txtAisi444.setBackground(SystemColor.menu);
		txtAisi444.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi444.setText(
				"\tO AISI 444 \u00E9 um a\u00E7o inoxid\u00E1vel ferr\u00EDtico com baixo teor de carbono e contendo molibd\u00EAnio, apresenta boa ductilidade e resist\u00EAncia \u00E0 degrada\u00E7\u00E3o por pites e boa resist\u00EAncia \u00E0 corros\u00E3o e oxida\u00E7\u00E3o num geral. N\u00E3o endurece muito durante o trabalho a frio. \u00C9 imune \u00E0 corros\u00E3o por \u00EDons clor\u00EDdricos, mantendo alta resist\u00EAncia mesmo operando em altas temperaturas. Tamb\u00E9m apresenta boa resist\u00EAncia \u00E0 meios oce\u00E2nicos tanto em condi\u00E7\u00F5es cont\u00EDnuas ou est\u00E1ticas, al\u00E9m de ter boa resist\u00EAncia ao calor.\r\n\r\n\tNormalmente tem sua aplica\u00E7\u00E3o na ind\u00FAstria em engenharia naval, turbinas e fornos a g\u00E1s, processamentos qu\u00EDmicos, ind\u00FAstria nuclear, entre outros. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 444.");
		txtAisi444.setBounds(22, 133, 741, 182);
		contentPane.add(txtAisi444);

		JButton btnAisi444Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi444Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi444Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao444.png");
				}
			}
		});
		btnAisi444Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi444Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi444Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi444Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi444Composicao);

		JButton btnAisi444Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi444Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi444Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama444.png");
				}
			}
		});
		btnAisi444Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi444Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi444Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi444Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi444Diagrama);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7750", "200", "11,0", "10,6", "11,4", "26,8", "-", "420", "620");
	
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
