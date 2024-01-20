package aisi316;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;

public class Aisi316Fadiga extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi316Fadiga() {
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
				Aisi316 aisi316 = new Aisi316();
				aisi316.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52, 81, 160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi316Fadiga = new JLabel("AISI 316 - Fadiga");
		lblAisi316Fadiga.setBounds(291, 10, 204, 46);
		lblAisi316Fadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi316Fadiga);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 176);
		contentPane.add(scrollPane);
		
		JTextPane txtpnAisil = new JTextPane();
		txtpnAisil.setText("* AISI 316L");
		txtpnAisil.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnAisil.setEditable(false);
		txtpnAisil.setBackground(SystemColor.menu);
		txtpnAisil.setAlignmentX(1.0f);
		txtpnAisil.setBounds(32, 281, 83, 26);
		contentPane.add(txtpnAisil);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "300", "19", "-", "10\u2077", "Ar", "Ambiente",
						"https://www.sciencedirect.com/science/article/pii/S0142112303002482" },
				{ "244", "-", "-1", "10\u2076", "Ar", "Ambiente",
						"https://www.sciencedirect.com/science/article/pii/S0142112315002182?fr=RR-2&ref=pdf_download&rr=80d5382469982874" },
				{ "240", "0,4/s", "-1", "10\u2077", "Ar", "Ambiente",
						"https://www.sciencedirect.com/science/article/abs/pii/S014211231400317X?via%3Dihub" },
				{ "269", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente",
						"https://www.asminternational.org/asm-handbook-volume-19-fatigue-and-fracture/results/-/journal_content/56/25656855/PUBLICATION" },
				{ "250", "20", "-1", "10\u2079", "Ar", "-",
						"https://www.sciencedirect.com/science/article/pii/S245232161630067" },
				{ "250*", "20000", "-1", "10\u2079", "Ar", "25", "https://pp.bme.hu/tr/article/view/7109" }, },
				new String[] { "Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o (R) de carga", "Num. de ciclos",
						"Meio", "Temperatura", "Fonte" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, Object.class, Object.class,
					Object.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(2).setMinWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setMinWidth(75);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(65);
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);

		class ButtonRenderer extends DefaultTableCellRenderer {
			private JButton button = new JButton();

			public ButtonRenderer() {
				button.setOpaque(true);
				button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				if (isSelected) {
					button.setForeground(table.getSelectionForeground());
					button.setBackground(table.getSelectionBackground());
				} else {
					button.setForeground(table.getForeground());
					button.setBackground(UIManager.getColor("Button.background"));
				}

				button.setText("LINK");
				return button;
			}
		}

		for (int i = 6; i <= 6; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new ButtonRenderer());
			table.getColumnModel().getColumn(i).setResizable(false);
		}

		class MultiLineHeaderRenderer extends DefaultTableCellRenderer {

			public MultiLineHeaderRenderer() {
				setHorizontalAlignment(CENTER); // Center-align the text
				setVerticalAlignment(TOP);
			}

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				String wrappedText = "<html><div style='text-align: center; font-family: Segoe UI;'>"
						+ value.toString().replace("@", "<br>") + "</div></html>";
				return super.getTableCellRendererComponent(table, wrappedText, isSelected, hasFocus, row, column);
			}
		}

		for (int i = 0; i <= 5; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new MultiLineHeaderRenderer());
			table.getColumnModel().getColumn(i).setResizable(false);
		}

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());

				if (col == 6 && row >= 0) { // Check if it's the URL column
					String url = (String) table.getValueAt(row, col);
					openURL(url);
				}
			}
		});

	}

	static void openURL(String url) {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
