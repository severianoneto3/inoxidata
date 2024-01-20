package propriedades;

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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import principal.TelaPrincipal;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;

public class Propriedades extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();
	JFrame arvoreDasLigas = new JFrame();
	JFrame schaeffler = new JFrame();
	JFrame mercadoAcosInoxidaveis = new JFrame();

	JPanel contentPane;

	public Propriedades() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloPropriedades = new JLabel("Propriedades Gerais dos A\u00E7os Inoxid\u00E1veis");
		lblTituloPropriedades.setBounds(131, 10, 523, 46);
		lblTituloPropriedades.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblTituloPropriedades);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		final JButton btnArvoreLigas = new JButton("DIAGRAMA DAS LIGAS");
		btnArvoreLigas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnArvoreLigas.setForeground(new Color(0, 0, 0));
		btnArvoreLigas.setBackground(new Color(192, 192, 192));
		btnArvoreLigas.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnArvoreLigas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!arvoreDasLigas.isVisible()) {
					adicionarImagem(arvoreDasLigas, "diagramaLigas.png");
				}
			}
		});
		btnArvoreLigas.setFont(new Font("Arial", Font.BOLD, 15));
		btnArvoreLigas.setBounds(104, 240, 250, 30);
		contentPane.add(btnArvoreLigas);

		JTextPane txtAcosInoxidaveis = new JTextPane();
		txtAcosInoxidaveis.setFocusable(false);
		txtAcosInoxidaveis.setEditable(false);
		txtAcosInoxidaveis.setBackground(SystemColor.menu);
		txtAcosInoxidaveis.setAlignmentX(RIGHT_ALIGNMENT);
		txtAcosInoxidaveis.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtAcosInoxidaveis.setText(
				"\tOs a\u00E7os inoxid\u00E1veis podem ser definidos como ligas baseadas em ferro com alto teor de cromo e, em muitos casos, outros elementos como n\u00EDquel e molibd\u00EAnio. S\u00E3o conhecidos pela alta resist\u00EAncia \u00E0 corros\u00E3o. A presen\u00E7a do cromo cria uma camada muito fina de \u00F3xido de cromo na superf\u00EDcie, protegendo a liga contra a\u00E7\u00F5es de corros\u00E3o, com o n\u00EDquel dando ductilidade e resist\u00EAncia.\r\n\r\n\tPode-se classificar os a\u00E7os inoxid\u00E1veis em quatro categorias, conforme a composi\u00E7\u00E3o da liga: a\u00E7os martens\u00EDticos, ferr\u00EDticos, austen\u00EDticos e duplex (austen\u00EDtico-ferr\u00EDtico), como pode ser visto no diagrama de ligas e no diagrama de Schaeffler, que ilustram a classifica\u00E7\u00E3o.");
		txtAcosInoxidaveis.setBounds(14, 57, 758, 173);
		contentPane.add(txtAcosInoxidaveis);

		JButton btnDiagramaDeSchaeffler = new JButton("DIAGRAMA DE SCHAEFFLER");
		btnDiagramaDeSchaeffler.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDiagramaDeSchaeffler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!schaeffler.isVisible()) {
					adicionarImagem(schaeffler, "diagramaSchaeffler.png");
				}
			}
		});
		btnDiagramaDeSchaeffler.setFont(new Font("Arial", Font.BOLD, 15));
		btnDiagramaDeSchaeffler.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnDiagramaDeSchaeffler.setBackground(Color.LIGHT_GRAY);
		btnDiagramaDeSchaeffler.setBounds(427, 240, 250, 30);
		contentPane.add(btnDiagramaDeSchaeffler);

		JTextPane txtMercadoAcos = new JTextPane();
		txtMercadoAcos.setEditable(false);
		txtMercadoAcos.setText(
				"\tEm rela\u00E7\u00E3o \u00E0 aplica\u00E7\u00E3o, os austen\u00EDticos s\u00E3o amplamente utilizados no mercado por ter excelente resist\u00EAncia \u00E0 corros\u00E3o, ductilidade e soldabilidade, permitindo uso vers\u00E1til. Os ferr\u00EDticos s\u00E3o recomendados para aplica\u00E7\u00F5es que envolvam varia\u00E7\u00F5es de temperatura e os martens\u00EDticos para uma alta resist\u00EAncia ao desgaste. Os a\u00E7os duplex t\u00EAm sua aplica\u00E7\u00E3o mais nichada, principalmente para a ind\u00FAstria petroqu\u00EDmica. Para informa\u00E7\u00F5es de mercado, clique no bot\u00E3o abaixo.");
		txtMercadoAcos.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtMercadoAcos.setBackground(SystemColor.menu);
		txtMercadoAcos.setAlignmentX(1.0f);
		txtMercadoAcos.setBounds(18, 285, 750, 116);
		contentPane.add(txtMercadoAcos);

		JButton btnMercado = new JButton("MERCADO");
		btnMercado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMercado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!mercadoAcosInoxidaveis.isVisible()) {
					adicionarImagem(mercadoAcosInoxidaveis, "mercado.png");
				}
			}
		});
		btnMercado.setFont(new Font("Arial", Font.BOLD, 15));
		btnMercado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnMercado.setBackground(Color.LIGHT_GRAY);
		btnMercado.setBounds(293, 405, 200, 30);
		contentPane.add(btnMercado);

		JTextPane txtEsforcos = new JTextPane();
		txtEsforcos.setEditable(false);
		txtEsforcos.setText(
				"\tEm aplica\u00E7\u00F5es de engenharia, esses materiais podem ser submetidos a esfor\u00E7os de fadiga, corros\u00E3o fadiga e corros\u00E3o sob tens\u00E3o.");
		txtEsforcos.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtEsforcos.setBackground(SystemColor.menu);
		txtEsforcos.setAlignmentX(1.0f);
		txtEsforcos.setBounds(30, 450, 725, 55);
		contentPane.add(txtEsforcos);

		JButton btnFadiga = new JButton("FADIGA");
		btnFadiga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fadiga fadiga = new Fadiga();
				fadiga.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadiga.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadiga.setFocusable(false);
		btnFadiga.setBackground(new Color(52,81,160));
		btnFadiga.setForeground(new Color(255, 255, 255));
		btnFadiga.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadiga.setBounds(31, 510, 220, 30);
		contentPane.add(btnFadiga);

		JButton btnCorrosaoFadiga = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadiga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CorrosaoFadiga corrosaoFadiga = new CorrosaoFadiga();
				corrosaoFadiga.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadiga.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadiga.setFocusable(false);
		btnCorrosaoFadiga.setBackground(new Color(52,81,160));
		btnCorrosaoFadiga.setForeground(new Color(255, 255, 255));
		btnCorrosaoFadiga.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadiga.setBounds(282, 510, 220, 30);
		contentPane.add(btnCorrosaoFadiga);

		JButton btnCorrosaoSobTensao = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CorrosaoSobTensao corrosaoSobTensao = new CorrosaoSobTensao();
				corrosaoSobTensao.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensao.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensao.setFocusable(false);
		btnCorrosaoSobTensao.setBackground(new Color(52,81,160));
		btnCorrosaoSobTensao.setForeground(new Color(255, 255, 255));
		btnCorrosaoSobTensao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensao.setBounds(533, 510, 220, 30);
		contentPane.add(btnCorrosaoSobTensao);
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
