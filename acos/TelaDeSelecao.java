package acos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import aisi301.Aisi301;
import aisi304.Aisi304;
import aisi304L.Aisi304L;
import aisi310.Aisi310;
import aisi316.Aisi316;
import aisi321.Aisi321;
import aisi347.Aisi347;
import aisi409.Aisi409;
import aisi410.Aisi410;
import aisi416.Aisi416;
import aisi420.Aisi420;
import aisi430.Aisi430;
import aisi436.Aisi436;
import aisi440.Aisi440;
import aisi444.Aisi444;
import principal.TelaPrincipal;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class TelaDeSelecao extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();

	private JPanel contentPane;

	public TelaDeSelecao() {
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
		
		JButton btnAisi304 = new JButton("AISI 304");
		btnAisi304.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi304.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi304 aisi304 = new Aisi304();
				aisi304.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi304.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi304.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi304.setBackground(Color.LIGHT_GRAY);
		btnAisi304.setBounds(160, 200, 190, 46);
		contentPane.add(btnAisi304);
		
		JButton btnAisi316 = new JButton("AISI 316");
		btnAisi316.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi316.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi316 aisi316 = new Aisi316();
				aisi316.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi316.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi316.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi316.setBackground(Color.LIGHT_GRAY);
		btnAisi316.setBounds(435, 200, 190, 46);
		contentPane.add(btnAisi316);
		
		JButton btnAisi410 = new JButton("AISI 410");
		btnAisi410.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi410.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi410 aisi410 = new Aisi410();
				aisi410.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi410.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi410.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi410.setBackground(Color.LIGHT_GRAY);
		btnAisi410.setBounds(160, 400, 190, 46);
		contentPane.add(btnAisi410);
		
		JButton btnOutrasLigas = new JButton("OUTRAS LIGAS");
		btnOutrasLigas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOutrasLigas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutrasLigas outrasLigas = new OutrasLigas();
				outrasLigas.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnOutrasLigas.setFont(new Font("Arial", Font.BOLD, 15));
		btnOutrasLigas.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOutrasLigas.setBackground(Color.LIGHT_GRAY);
		btnOutrasLigas.setBounds(435, 400, 190, 46);
		contentPane.add(btnOutrasLigas);
		
//		JButton btnAisi310 = new JButton("AISI 310");
//		btnAisi310.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi310.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi310 aisi310 = new Aisi310();
//				aisi310.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi310.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi310.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi310.setBackground(Color.LIGHT_GRAY);
//		btnAisi310.setBounds(54, 310, 190, 46);
//		contentPane.add(btnAisi310);
		
		JButton btnAisi347 = new JButton("AISI 347");
		btnAisi347.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi347.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi347 aisi347 = new Aisi347();
				aisi347.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi347.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi347.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi347.setBackground(Color.LIGHT_GRAY);
		btnAisi347.setBounds(160, 300, 190, 46);
		contentPane.add(btnAisi347);
		
//		JButton btnAisi321 = new JButton("AISI 321");
//		btnAisi321.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi321.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi321 aisi321 = new Aisi321();
//				aisi321.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi321.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi321.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi321.setBackground(Color.LIGHT_GRAY);
//		btnAisi321.setBounds(298, 310, 190, 46);
//		contentPane.add(btnAisi321);
//		
//		JButton btnAisi416 = new JButton("AISI 416");
//		btnAisi416.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi416.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi416 aisi416 = new Aisi416();
//				aisi416.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi416.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi416.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi416.setBackground(Color.LIGHT_GRAY);
//		btnAisi416.setBounds(298, 390, 190, 46);
//		contentPane.add(btnAisi416);
//		
//		JButton btnAisi301 = new JButton("AISI 301");
//		btnAisi301.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi301.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi301 aisi301 = new Aisi301();
//				aisi301.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi301.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi301.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi301.setBackground(Color.LIGHT_GRAY);
//		btnAisi301.setBounds(54, 390, 190, 46);
//		contentPane.add(btnAisi301);
//		
//		JButton btnAisi304L = new JButton("AISI 304L");
//		btnAisi304L.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi304L.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi304L aisi304L = new Aisi304L();
//				aisi304L.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi304L.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi304L.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi304L.setBackground(Color.LIGHT_GRAY);
//		btnAisi304L.setBounds(54, 470, 190, 46);
//		contentPane.add(btnAisi304L);
		
		JButton btnAisi430 = new JButton("AISI 430");
		btnAisi430.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAisi430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi430 aisi430 = new Aisi430();
				aisi430.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAisi430.setFont(new Font("Arial", Font.BOLD, 15));
		btnAisi430.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAisi430.setBackground(Color.LIGHT_GRAY);
		btnAisi430.setBounds(435, 300, 190, 46);
		contentPane.add(btnAisi430);
		
//		JButton btnAisi440 = new JButton("AISI 440");
//		btnAisi440.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi440.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi440 aisi440 = new Aisi440();
//				aisi440.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi440.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi440.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi440.setBackground(Color.LIGHT_GRAY);
//		btnAisi440.setBounds(298, 470, 190, 46);
//		contentPane.add(btnAisi440);
//		
//		JButton btnAisi409 = new JButton("AISI 409");
//		btnAisi409.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi409.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi409 aisi409 = new Aisi409();
//				aisi409.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi409.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi409.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi409.setBackground(Color.LIGHT_GRAY);
//		btnAisi409.setBounds(542, 230, 190, 46);
//		contentPane.add(btnAisi409);
//		
//		JButton btnAisi420 = new JButton("AISI 420");
//		btnAisi420.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi420.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi420 aisi420 = new Aisi420();
//				aisi420.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi420.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi420.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi420.setBackground(Color.LIGHT_GRAY);
//		btnAisi420.setBounds(542, 310, 190, 46);
//		contentPane.add(btnAisi420);
//		
//		JButton btnAisi444 = new JButton("AISI 444");
//		btnAisi444.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi444.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi444 aisi444 = new Aisi444();
//				aisi444.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi444.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi444.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi444.setBackground(Color.LIGHT_GRAY);
//		btnAisi444.setBounds(542, 390, 190, 46);
//		contentPane.add(btnAisi444);
//		
//		JButton btnAisi436 = new JButton("AISI 436");
//		btnAisi436.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnAisi436.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Aisi436 aisi436 = new Aisi436();
//				aisi436.frame.setVisible(true);
//				frame.dispose();
//			}
//		});
//		btnAisi436.setFont(new Font("Arial", Font.BOLD, 15));
//		btnAisi436.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		btnAisi436.setBackground(Color.LIGHT_GRAY);
//		btnAisi436.setBounds(542, 470, 190, 46);
//		contentPane.add(btnAisi436);
		
		JTextPane txtInicio = new JTextPane();
		txtInicio.setFocusable(false);
		txtInicio.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		txtInicio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtInicio.setText("Conhe\u00E7a uma das ligas abaixo e acesse dados para fadiga, corros\u00E3o-fadiga e corros\u00E3o sob tens\u00E3o.");
		txtInicio.setEditable(false);
		txtInicio.setBackground(SystemColor.menu);
		txtInicio.setBounds(155, 85, 505, 66);
		txtInicio.setHighlighter(null);
		StyledDocument documentStyle = txtInicio.getStyledDocument();
		SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
		StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
		documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false);
		frame.getContentPane().add(txtInicio);
	}
}
