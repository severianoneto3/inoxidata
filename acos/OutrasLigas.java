package acos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import aisi301.Aisi301;
import aisi310.Aisi310;
import aisi321.Aisi321;
import aisi416.Aisi416;
import aisi420.Aisi420;
import aisi444.Aisi444;

public class OutrasLigas extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;

	public OutrasLigas() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecionarAco = new JLabel("Selecione o A\u00E7o Inoxid\u00E1vel");
		lblSelecionarAco.setBounds(230, 10, 326, 46);
		lblSelecionarAco.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblSelecionarAco);
		
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
		
		JButton btnAisi444 = new JButton("AISI 444");
		btnAisi444.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi444.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi444 aisi444 = new Aisi444();
				aisi444.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi444.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi444.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi444.setBackground(Color.LIGHT_GRAY);
		btnAisi444.setBounds(542, 250, 190, 46);
		contentPane.add(btnAisi444);
		
		JButton btnAisi310 = new JButton("AISI 310");
		btnAisi310.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi310.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi310 aisi310 = new Aisi310();
				aisi310.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi310.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi310.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi310.setBackground(Color.LIGHT_GRAY);
		btnAisi310.setBounds(54, 170, 190, 46);
		contentPane.add(btnAisi310);
		
		JButton btnAisi420 = new JButton("AISI 420");
		btnAisi420.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi420.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi420 aisi420 = new Aisi420();
				aisi420.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi420.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi420.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi420.setBackground(Color.LIGHT_GRAY);
		btnAisi420.setBounds(542, 170, 190, 46);
		contentPane.add(btnAisi420);
		
		JButton btnAisi321 = new JButton("AISI 321");
		btnAisi321.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi321.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi321 aisi321 = new Aisi321();
				aisi321.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi321.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi321.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi321.setBackground(Color.LIGHT_GRAY);
		btnAisi321.setBounds(298, 170, 190, 46);
		contentPane.add(btnAisi321);
		
		JButton btnAisi416 = new JButton("AISI 416");
		btnAisi416.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi416.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi416 aisi416 = new Aisi416();
				aisi416.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi416.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi416.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi416.setBackground(Color.LIGHT_GRAY);
		btnAisi416.setBounds(298, 250, 190, 46);
		contentPane.add(btnAisi416);
		
		JButton btnAisi301 = new JButton("AISI 301");
		btnAisi301.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi301.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi301 aisi301 = new Aisi301();
				aisi301.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi301.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi301.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi301.setBackground(Color.LIGHT_GRAY);
		btnAisi301.setBounds(54, 250, 190, 46);
		contentPane.add(btnAisi301);
		
		JTextPane txtInicio = new JTextPane();
		txtInicio.setFocusable(false);
		txtInicio.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtInicio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtInicio.setText("Conhe\u00E7a uma das ligas abaixo:");
		txtInicio.setEditable(false);
		txtInicio.setBackground(SystemColor.menu);
		txtInicio.setBounds(248, 90, 290, 46);
		txtInicio.setHighlighter(null);
		StyledDocument documentStyle = txtInicio.getStyledDocument();
		SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
		StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
		documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false);
		frame.getContentPane().add(txtInicio);
		
		JTextPane txtpnOuNaveguePelas = new JTextPane();
		txtpnOuNaveguePelas.setText("Ou navegue pelas solicita\u00E7\u00F5es:");
		txtpnOuNaveguePelas.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtpnOuNaveguePelas.setFocusable(false);
		txtpnOuNaveguePelas.setEditable(false);
		txtpnOuNaveguePelas.setBackground(SystemColor.menu);
		txtpnOuNaveguePelas.setBounds(248, 385, 290, 46);
		contentPane.add(txtpnOuNaveguePelas);
		
		JButton btnFadigaOL = new JButton("FADIGA");
		btnFadigaOL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFadigaOL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutrasLigasFadiga outrasLigasFadiga = new OutrasLigasFadiga();
				outrasLigasFadiga.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFadigaOL.setFont(new Font("Arial", Font.BOLD, 15));
		btnFadigaOL.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFadigaOL.setBackground(Color.LIGHT_GRAY);
		btnFadigaOL.setBounds(31, 475, 220, 40);
		contentPane.add(btnFadigaOL);
		
		JButton btnCorrosaoFadigaOL = new JButton("CORROS\u00C3O-FADIGA");
		btnCorrosaoFadigaOL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoFadigaOL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutrasLigasCF outrasLigasCF = new OutrasLigasCF();
				outrasLigasCF.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoFadigaOL.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoFadigaOL.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoFadigaOL.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoFadigaOL.setBounds(282, 475, 220, 40);
		contentPane.add(btnCorrosaoFadigaOL);
		
		JButton btnCorrosaoSobTensaoOL = new JButton("CORROS\u00C3O SOB TENS\u00C3O");
		btnCorrosaoSobTensaoOL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCorrosaoSobTensaoOL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutrasLigasSCC outrasLigasSCC = new OutrasLigasSCC();
				outrasLigasSCC.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCorrosaoSobTensaoOL.setFont(new Font("Arial", Font.BOLD, 15));
		btnCorrosaoSobTensaoOL.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCorrosaoSobTensaoOL.setBackground(Color.LIGHT_GRAY);
		btnCorrosaoSobTensaoOL.setBounds(533, 475, 220, 40);
		contentPane.add(btnCorrosaoSobTensaoOL);
	}
}
