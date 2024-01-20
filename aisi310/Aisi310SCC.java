package aisi310;

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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Aisi310SCC extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi310SCC() {
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
				Aisi310 aisi310 = new Aisi310();
				aisi310.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi310SCC = new JLabel("AISI 310 - Corros\u00E3o Sob Tens\u00E3o");
		lblAisi310SCC.setBounds(205, 10, 375, 46);
		lblAisi310SCC.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi310SCC);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 176);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"816", "\u00C1gua supercr\u00EDtica", "Dúctil + IG", "600", "https://www.sciencedirect.com/science/article/pii/S0022311518310420"},
				{"795", "\u00C1gua supercr\u00EDtica", "Dúctil + IG", "600", "https://www.sciencedirect.com/science/article/pii/S0022311518310420"},
				{"761", "\u00C1gua supercr\u00EDtica", "Dúctil + IG", "600", "https://www.sciencedirect.com/science/article/pii/S0022311518310420"},
				{"763", "\u00C1gua supercr\u00EDtica", "Dúctil + IG", "600", "https://www.sciencedirect.com/science/article/pii/S0022311518310420"},
				{"489", "\u00C1gua supercr\u00EDtica", "Dúctil", "600", "https://www.sciencedirect.com/science/article/pii/S0022311518310420"},
				{"443", "\u00C1gua supercr\u00EDtica", "Dúctil", "600", "https://www.sciencedirect.com/science/article/pii/S0022311518310420"},
			},
			new String[] {
				"Tens\u00E3o (MPa)", "Meio", "Tipo de Falha", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(1).setMinWidth(140);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(45);
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);

		DefaultTableCellRenderer rendererLink = new DefaultTableCellRenderer();
		rendererLink.setHorizontalAlignment(JLabel.CENTER);
		rendererLink.setForeground(new Color(52,81,160));
		for (int i = 4; i <= 4; i++) {
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
		
		for (int i = 0; i <= 3; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new MultiLineHeaderRenderer());
			table.getColumnModel().getColumn(i).setResizable(false);
		}

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());

				if (col == 4 && row >= 0) { // Check if it's the URL column
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
