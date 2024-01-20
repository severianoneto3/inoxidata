package aisi347;

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

import acos.TabelaPropriedades;
import acos.TelaDeSelecao;

public class Aisi347 extends JFrame {

	public JFrame frame = new JFrame();
	JFrame diagrama = new JFrame();
	JFrame composicao = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi347() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAisi347 = new JLabel("AISI 347");
		lblAisi347.setBounds(344, 10, 98, 46);
		lblAisi347.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi347);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDeSelecao telaDeSelecao = new TelaDeSelecao();
				telaDeSelecao.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JTextPane txtAisi347 = new JTextPane();
		txtAisi347.setEditable(false);
		txtAisi347.setBackground(SystemColor.menu);
		txtAisi347.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtAisi347.setText(
				"\tO AISI 347 \u00E9 um a\u00E7o inoxid\u00E1vel austen\u00EDtico e disp\u00F5e de uma boa resist\u00EAncia \u00E0 corros\u00E3o como sua principal caracter\u00EDstica. Possui altas propriedades mec\u00E2nicas, garantindo boa ductilidade, al\u00E9m de ter excelente soldabilidade e resist\u00EAncia \u00E0 altas temperaturas. Tamb\u00E9m \u00E9 conhecido por ser resistente \u00E0 corros\u00E3o intergranular devido \u00E0 estabiliza\u00E7\u00E3o com ni\u00F3bio, inibindo a forma\u00E7\u00E3o de carboneto de cromo nas fronteiras dos gr\u00E3os da liga.\r\n\r\n\t\u00C9 aplicado na ind\u00FAstria geralmente em meios corrosivos e altas temperaturas, devido a suas propriedades. \u00C9 utilizado na ind\u00FAstria aeron\u00E1utica, bem como para a confec\u00E7\u00E3o de motores para foguetes e processamentos qu\u00EDmicos a altas temperaturas. Abaixo, est\u00E3o dispostas algumas propriedades e informa\u00E7\u00F5es sobre testes de fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o do AISI 347.");
		txtAisi347.setBounds(22, 133, 741, 199);
		contentPane.add(txtAisi347);

		JButton btnAisi347Composicao = new JButton("COMPOSI\u00C7\u00C3O\r\n");
		btnAisi347Composicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi347Composicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!composicao.isVisible()) {
					adicionarImagem(composicao, "composicao347.png");
				}
			}
		});
		btnAisi347Composicao.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi347Composicao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi347Composicao.setBackground(Color.LIGHT_GRAY);
		btnAisi347Composicao.setBounds(70, 70, 288, 46);
		contentPane.add(btnAisi347Composicao);

		JButton btnAisi347Diagrama = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnAisi347Diagrama.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi347Diagrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!diagrama.isVisible()) {
					adicionarImagem(diagrama, "diagrama347.png");
				}
			}
		});
		btnAisi347Diagrama.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi347Diagrama.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi347Diagrama.setBackground(Color.LIGHT_GRAY);
		btnAisi347Diagrama.setBounds(428, 70, 288, 46);
		contentPane.add(btnAisi347Diagrama);

		JButton btnFadiga347 = new JButton("FADIGA");
		btnFadiga347.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga347.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi347Fadiga fadiga347 = new Aisi347Fadiga();
				fadiga347.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga347.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga347.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga347.setBackground(Color.LIGHT_GRAY);
		btnFadiga347.setBounds(31, 490, 220, 40);
		contentPane.add(btnFadiga347);

		JButton btnCorrosaoFadiga347 = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga347.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga347.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi347CorrosaoFadiga corrosaoFadiga347 = new Aisi347CorrosaoFadiga();
				corrosaoFadiga347.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga347.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga347.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga347.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadiga347.setBounds(282, 490, 220, 40);
		contentPane.add(btnCorrosaoFadiga347);

		JButton btnCorrosaoSobTensao347 = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao347.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao347.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi347SCC scc347 = new Aisi347SCC();
				scc347.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao347.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao347.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao347.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensao347.setBounds(533, 490, 220, 40);
		contentPane.add(btnCorrosaoSobTensao347);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 355, 746, 120);
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
