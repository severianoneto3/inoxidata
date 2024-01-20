package aisi420;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Aisi420SCC extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi420SCC() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVoltar = new JButton("\u2190 VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(10, 10, 92, 21);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aisi420 aisi420 = new Aisi420();
				aisi420.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi420SCC = new JLabel("AISI 420 - Corros\u00E3o Sob Tens\u00E3o");
		lblAisi420SCC.setBounds(205, 10, 375, 46);
		lblAisi420SCC.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi420SCC);
		
		JTextPane txtProximo_1 = new JTextPane();
		txtProximo_1.setText("Dados indispon\u00EDveis no momento, a serem disponibilizados em vers\u00F5es futuras.");
		txtProximo_1.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		txtProximo_1.setFocusable(false);
		txtProximo_1.setEditable(false);
		txtProximo_1.setBackground(SystemColor.menu);
		txtProximo_1.setBounds(82, 80, 622, 40);
		contentPane.add(txtProximo_1);

//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
//		scrollPane.setBounds(32, 89, 721, 202);
//		contentPane.add(scrollPane);
//
//		table = new JTable();
//		table.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
//		table.setAutoCreateRowSorter(true);
//		scrollPane.setViewportView(table);
//		table.setModel(new DefaultTableModel(
//				new Object[][] {
//						{ new Integer(280), new Integer(5), new Integer(-1), "10^6", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" },
//						{ new Integer(290), new Integer(5), new Integer(-1), "10^5", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" },
//						{ new Integer(320), new Integer(5), new Integer(-1), "10^4", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" },
//						{ new Integer(360), new Integer(5), new Integer(-1), "10^3", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" },
//						{ new Integer(440), new Integer(50), new Integer(-1), "10^7", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" },
//						{ new Integer(250), new Integer(60), new Integer(-1), "10^7", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" },
//						{ new Integer(280), new Integer(60), new Integer(-1), "10^7", "Ar", "25\u00BA C",
//								"https://www.sciencedirect.com/science/article/pii/S0013794417301844" }, },
//				new String[] { "Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o de fadiga", "Num. de ciclos", "Meio",
//						"Temperatura", "Fonte" }) {
//			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false };
//
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		});
//		table.getColumnModel().getColumn(0).setPreferredWidth(85);
//		table.getColumnModel().getColumn(0).setMinWidth(25);
//		table.getColumnModel().getColumn(1).setPreferredWidth(90);
//		table.getColumnModel().getColumn(2).setPreferredWidth(90);
//		table.getColumnModel().getColumn(3).setPreferredWidth(85);
//		table.getColumnModel().getColumn(4).setPreferredWidth(65);
//		table.getColumnModel().getColumn(5).setPreferredWidth(80);
//		table.getColumnModel().getColumn(6).setPreferredWidth(65);
//		table.setRowHeight(25);
//		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		table.getTableHeader().setBackground(new Color(52,81,160));
//		table.getTableHeader().setForeground(new Color(255, 255, 255));
//
//		DefaultTableCellRenderer rendererLink = new DefaultTableCellRenderer();
//		rendererLink.setHorizontalAlignment(JLabel.CENTER);
//		rendererLink.setForeground(new Color(52,81,160));
//		table.getColumnModel().getColumn(6).setCellRenderer(rendererLink);
//
//		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
//		for (int i = 0; i <= 5; i++) {
//			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
//			table.getColumnModel().getColumn(i).setResizable(false);
//		}
//
//		table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int row = table.rowAtPoint(e.getPoint());
//				int col = table.columnAtPoint(e.getPoint());
//
//				if (col == 6 && row >= 0) { // Check if it's the URL column
//					String url = (String) table.getValueAt(row, col);
//					openURL(url);
//				}
//			}
//		});
//
//	}
//
//	static void openURL(String url) {
//		try {
//			Desktop.getDesktop().browse(new URI(url));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
}
