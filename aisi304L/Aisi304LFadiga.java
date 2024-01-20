package aisi304L;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import aisi304.Aisi304;

public class Aisi304LFadiga extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi304LFadiga() {
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
				Aisi304L aisi304L = new Aisi304L();
				aisi304L.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi304LFadiga = new JLabel("AISI 304L - Fadiga");
		lblAisi304LFadiga.setBounds(283, 10, 220, 46);
		lblAisi304LFadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi304LFadiga);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 177);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"~ 210", "5-8", "-1", "10^5", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/pii/S0142112311003069"},
				{"~ 190", "5-8", "-1", "3 * 10^5", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/pii/S0142112311003069"},
				{"~ 185", "5-8", "-1", "10^7", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/pii/S0142112311003069"},
				{"~ 167", "0,125", "-", "~ 1,3 * 10^4", "Ar", "300", "https://asmedigitalcollection.asme.org/materialstechnology/article-abstract/132/2/021008/461081/Fatigue-Behavior-of-Stainless-Steel-304L-Including?redirectedFrom=fulltext"},
				{"~ 158", "0,125", "-", "~ 3 * 10^4", "Ar", "300", "https://asmedigitalcollection.asme.org/materialstechnology/article-abstract/132/2/021008/461081/Fatigue-Behavior-of-Stainless-Steel-304L-Including?redirectedFrom=fulltext"},
				{"~ 150", "0,125", "-", "~1,3 * 10^5", "Ar", "300", "https://asmedigitalcollection.asme.org/materialstechnology/article-abstract/132/2/021008/461081/Fatigue-Behavior-of-Stainless-Steel-304L-Including?redirectedFrom=fulltext"},
			},
			new String[] {
				"Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o de fadiga", "Num. de ciclos", "Meio", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(4).setMinWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(65);
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52,81,160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);

		DefaultTableCellRenderer rendererLink = new DefaultTableCellRenderer();
		rendererLink.setHorizontalAlignment(JLabel.CENTER);
		rendererLink.setForeground(new Color(52,81,160));
		for (int i = 6; i <= 6; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(rendererLink);
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
				String wrappedText = "<html><div style='text-align: center; font-family: Bahnschrift;'>"
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
