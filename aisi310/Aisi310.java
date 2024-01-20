package aisi310;

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

public class Aisi310 extends JFrame {

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi310() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi310 = new JLabel("AISI 310");
		lblAisi310.setBounds(344, 10, 98, 46);
		lblAisi310.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi310);

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

		JTextPane txtAisi310 = new JTextPane();
		txtAisi310.setEditable(false);
		txtAisi310.setBackground(SystemColor.menu);
		txtAisi310.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi310.setText(
				"\tO a\u00E7o AISI 310 \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico com alto teor de carbono e de n\u00EDquel, n\u00E3o podendo ser endurecido por tratamento t\u00E9rmico. Possui \u00F3timas propriedades mec\u00E2nicas, alta resist\u00EAncia \u00E0 oxida\u00E7\u00E3o e calor, e tendo varia\u00E7\u00F5es como o 310S, 310H e 310Cb. Tem desempenho muito bom em temperaturas altas e em ambientes sulf\u00FAricos, com temperatura de recozimento recomendada em 1040\u00BA C.\r\n\t\r\n\t\u00C9 utilizado em diversos setores industriais, incluindo em pe\u00E7as e tubos para opera\u00E7\u00E3o em extra\u00E7\u00E3o de petr\u00F3leo, c\u00E2maras de combust\u00E3o, na ind\u00FAstria aliment\u00EDcia para equipamentos de processamento, n\u00E3o tendo seu uso recomendado para temperamento frequente, pois sofre de choque t\u00E9rmico. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 310.");
		txtAisi310.setBounds(22, 133, 741, 199);
		contentPane.add(txtAisi310);

		JButton btnAisi310Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi310Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi310Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao310.png");
				}
			}
		});
		btnAisi310Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi310Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi310Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi310Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi310Composicao);

		JButton btnAisi310Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi310Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi310Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama310.png");
				}
			}
		});
		btnAisi310Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi310Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi310Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi310Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi310Diagrama);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7900", "200", "15,9", "16,2", "17,0", "14,2", "18,7", "500", "720");
		
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
