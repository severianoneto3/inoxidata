package aisi301;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import acos.OutrasLigas;
import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi301 extends JFrame {

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi301() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi301 = new JLabel("AISI 301");
		lblAisi301.setBounds(344, 10, 98, 46);
		lblAisi301.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi301);

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

		JTextPane txtAisi301 = new JTextPane();
		txtAisi301.setEditable(false);
		txtAisi301.setBackground(SystemColor.menu);
		txtAisi301.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi301.setText(
				"\tO a\u00E7o AISI 301 \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico, sendo o mais suscet\u00EDvel entre os convencionais a endurecimento por deforma\u00E7\u00E3o a frio. Sua taxa de encruamento \u00E9 muito alta, logo, quanto maior for o trabalho a frio desse material, maior ser\u00E1 a resist\u00EAncia \u00E0 tra\u00E7\u00E3o e o limite de escoamento. Apresenta boa resist\u00EAncia \u00E0 corros\u00E3o em condi\u00E7\u00F5es atmosf\u00E9ricas, contudo tem essa resist\u00EAncia baixa em meios como \u00E1cidos e sais, n\u00E3o tendo seu uso recomendado em ambientes corrosivos.\r\n\r\n\t\u00C9 geralmente aplicado no estado de trabalho a frio para suportar cargas mais altas, podendo ser encontrado na ind\u00FAstria aliment\u00EDcia na forma de talheres como colheres e garfos. Tamb\u00E9m \u00E9 utilizado em molas, elementos de fixa\u00E7\u00E3o, partes estruturais para aeronaves, entre outros. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 301.");
		txtAisi301.setBounds(15, 133, 756, 198);
		contentPane.add(txtAisi301);

		JButton btnAisi301Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi301Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi301Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao301.png");
				}
			}
		});
		btnAisi301Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi301Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi301Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi301Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi301Composicao);

		JButton btnAisi301Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi301Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi301Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama301.png");
				}
			}
		});
		btnAisi301Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi301Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi301Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi301Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi301Diagrama);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 746, 120);
		contentPane.add(scrollPane);
		TabelaPropriedades tabela = new TabelaPropriedades();
		tabela.adicionarTabela(scrollPane, table, "7900", "193", "17,0", "17,2", "18,2", "16,3", "21,5", "500", "720");
	
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
