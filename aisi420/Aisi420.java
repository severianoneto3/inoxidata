package aisi420;

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

public class Aisi420 extends JFrame {
	
	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi420() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi420 = new JLabel("AISI 420");
		lblAisi420.setBounds(344, 10, 98, 46);
		lblAisi420.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi420);

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

		JTextPane txtAisi420 = new JTextPane();
		txtAisi420.setEditable(false);
		txtAisi420.setBackground(SystemColor.menu);
		txtAisi420.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi420.setText(
				"\tO AISI 420 \u00E9 um a\u00E7o inoxid\u00E1vel martens\u00EDtico que pode ser endurecido por tratamento t\u00E9rmico, oferecendo boa ductilidade em seu estado recozido e excelente resist\u00EAncia \u00E0 corros\u00E3o quando o metal \u00E9 polido ou endurecido. Para o tratamento t\u00E9rmico desse material, \u00E9 necess\u00E1rio um pr\u00E9-aquecimento, limpeza, prote\u00E7\u00E3o do meio, banho de sal e fragiliza\u00E7\u00E3o por hidrog\u00EAnio. No quesito de soldagem, para obter um bom resultado, \u00E9 necess\u00E1rio um pr\u00E9 e p\u00F3s aquecimento.\r\n\r\n\t\u00C9 aplicado geralmente para fabricar pe\u00E7as resistentes \u00E0 \u00E1gua, vapor d'\u00E1gua, ar atmosf\u00E9rico e \u00E1cidos oxid\u00E1veis. \u00C9 utilizado em diversos ramos industriais, a exemplo de equipamentos el\u00E9tricos, facas, tesouras, v\u00E1lvulas e componentes, talheres, engrenagens, rolamentos, entre outras aplica\u00E7\u00F5es. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 420.");
		txtAisi420.setBounds(22, 133, 742, 213);
		contentPane.add(txtAisi420);

		JButton btnAisi420Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi420Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi420Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao420.png");
				}
			}
		});
		btnAisi420Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi420Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi420Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi420Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi420Composicao);

		JButton btnAisi420Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi420Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi420Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama420.png");
				}
			}
		});
		btnAisi420Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi420Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi420Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi420Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi420Diagrama);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7700", "200", "10,3", "10,8", "11,7", "24,9", "-", "460", "550");
		
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
