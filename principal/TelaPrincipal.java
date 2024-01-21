// Importação das classes necessárias
package principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import acos.TelaDeSelecao; // Importação da classe TelaDeSelecao do pacote acos
import calculos.InicioCalculos; // Importação da classe InicioCalculos do pacote calculos
import propriedades.Propriedades; // Importação da classe Propriedades do pacote propriedades

// Classe TelaPrincipal que estende JFrame
public class TelaPrincipal extends JFrame {

	// Número de série da classe para serialização
	private static final long serialVersionUID = 1L;

	// JFrame principal
	public JFrame frame = new JFrame();

	// Construtor da classe TelaPrincipal
	public TelaPrincipal() {
		// Configuração do JFrame principal
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(226, 226, 226));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);

		// Configuração do JLabel para exibir uma imagem
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("ss1.png")));
		lblNewLabel.setBounds(0, 0, 301, 700);

		// Configuração do JLabel para exibir o título
		JLabel lblTitulo = new JLabel("InoxiData");
		lblTitulo.setBounds(380, 41, 345, 64);
		lblTitulo.setFont(new Font("Rockwell", Font.BOLD, 70));

		// Configuração do JButton para selecionar a liga
		JButton btnSelecionarLiga = new JButton("SELECIONAR LIGA");
		btnSelecionarLiga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSelecionarLiga.addActionListener(new ActionListener() {
			// Implementação do método actionPerformed para lidar com eventos do botão
			public void actionPerformed(ActionEvent e) {
				TelaDeSelecao telaDeSelecao = new TelaDeSelecao();
				telaDeSelecao.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSelecionarLiga.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnSelecionarLiga.setBackground(new Color(192, 192, 192));
		btnSelecionarLiga.setBounds(370, 470, 360, 64);
		btnSelecionarLiga.setFont(new Font("Arial", Font.BOLD, 20));

		// Adição dos componentes ao content pane do JFrame
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblTitulo);
		frame.getContentPane().add(btnSelecionarLiga);

		// Configuração do JButton para as propriedades gerais
		JButton btnPropriedadesGerais = new JButton("PROPRIEDADES GERAIS");
		btnPropriedadesGerais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPropriedadesGerais.addActionListener(new ActionListener() {
			// Implementação do método actionPerformed para lidar com eventos do botão
			public void actionPerformed(ActionEvent e) {
				Propriedades propriedades = new Propriedades();
				propriedades.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnPropriedadesGerais.setFont(new Font("Arial", Font.BOLD, 20));
		btnPropriedadesGerais.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnPropriedadesGerais.setBackground(Color.LIGHT_GRAY);
		btnPropriedadesGerais.setBounds(370, 300, 360, 64);
		frame.getContentPane().add(btnPropriedadesGerais);

		// Configuração do JButton para o cálculo de limite de fadiga
		JButton btnCalculo = new JButton("CALCULAR LIMITE DE FADIGA");
		btnCalculo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculo.addActionListener(new ActionListener() {
			// Implementação do método actionPerformed para lidar com eventos do botão
			public void actionPerformed(ActionEvent e) {
				InicioCalculos inicioCalculos = new InicioCalculos();
				inicioCalculos.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCalculo.setFont(new Font("Arial", Font.BOLD, 20));
		btnCalculo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCalculo.setBackground(Color.LIGHT_GRAY);
		btnCalculo.setBounds(370, 385, 360, 64);
		frame.getContentPane().add(btnCalculo);

		// Configuração do JTextPane para exibir o texto inicial
		JTextPane txtInicio = new JTextPane();
		txtInicio.setFocusable(false);
		txtInicio.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtInicio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtInicio.setText("Seja bem-vindo ao software que auxilia a sele\u00E7\u00E3o de a\u00E7os inoxid\u00E1veis para Fadiga, Corros\u00E3o-Fadiga e Corros\u00E3o Sob Tens\u00E3o.\r\n\r\nSelecione um dos menus abaixo para:");
		txtInicio.setEditable(false);
		txtInicio.setBackground(SystemColor.controlHighlight);
		txtInicio.setBounds(347, 130, 417, 152);
		txtInicio.setHighlighter(null);

		// Configuração da formatação do JTextPane
		StyledDocument documentStyle = txtInicio.getStyledDocument();
		SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
		StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
		documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false);

		// Adição do JTextPane ao content pane do JFrame
		frame.getContentPane().add(txtInicio);
	}
}
