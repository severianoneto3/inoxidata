package aisi321;

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
import aisi347.Aisi347Fadiga;
import aisi347.Aisi347SCC;

public class Aisi321 extends JFrame {

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi321() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi321 = new JLabel("AISI 321");
		lblAisi321.setBounds(344, 10, 98, 46);
		lblAisi321.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi321);

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

		JTextPane txtAisi321 = new JTextPane();
		txtAisi321.setEditable(false);
		txtAisi321.setBackground(SystemColor.menu);
		txtAisi321.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi321.setText(
				"\tO AISI 321 \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico, com sua composi\u00E7\u00E3o muito similar \u00E0 do AISI 304, por\u00E9m com a adi\u00E7\u00E3o de tit\u00E2nio. A presen\u00E7a do tit\u00E2nio estabiliza os carbonetos, prevenindo a precipita\u00E7\u00E3o intergranular de carbonetos de cromo quando o material \u00E9 aquecido a altas temperaturas. A temperatura de recozimento recomendada \u00E9 1040\u00BA C. Possui \u00F3tima soldabilidade, sem necessidade de pr\u00E9-aquecimento, al\u00E9m de apresentar boa resist\u00EAncia \u00E0 fadiga por vibra\u00E7\u00E3o.\r\n\r\n\t\u00C9 aplicado na ind\u00FAstria geralmente em aplica\u00E7\u00F5es onde o tratamento ap\u00F3s soldagem n\u00E3o \u00E9 poss\u00EDvel de ser realizado, a exemplo de tubos superaquecedores e sistemas de exaust\u00E3o em motores e turbinas de g\u00E1s, com temperaturas variando entre 425\u00BA C e 870\u00BA C. Al\u00E9m disso, \u00E9 aplicado em linhas de inje\u00E7\u00E3o de combust\u00EDvel e sistemas hidr\u00E1ulicos para aeronaves. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 321.");
		txtAisi321.setBounds(30, 133, 726, 218);
		contentPane.add(txtAisi321);

		JButton btnAisi321Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi321Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi321Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao321.png");
				}
			}
		});
		btnAisi321Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi321Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi321Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi321Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi321Composicao);

		JButton btnAisi321Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi321Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi321Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama321.png");
				}
			}
		});
		btnAisi321Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi321Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi321Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi321Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi321Diagrama);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7900", "193", "16,6", "17,2", "18,6", "16,1", "22,2", "500", "720");
		
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
