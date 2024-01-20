package aisi301;

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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Aisi301SCC extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi301SCC() {
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
				Aisi301 aisi301 = new Aisi301();
				aisi301.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52, 81, 160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi301SCC = new JLabel("AISI 301 - Corros\u00E3o Sob Tens\u00E3o");
		lblAisi301SCC.setBounds(205, 10, 375, 46);
		lblAisi301SCC.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi301SCC);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 205);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"392,3", "35% MgCl2 fervente", "Recozido", "-", "1", "https://www.jstage.jst.go.jp/article/jcorr1974/27/2/27_2_63/_pdf/-char/ja"},
				{"196,1", "35% MgCl2 fervente", "Recozido", "-", "3,3", "https://www.jstage.jst.go.jp/article/jcorr1974/27/2/27_2_63/_pdf/-char/ja"},
				{"147,1", "35% MgCl2 fervente", "Recozido", "-", "16,7", "https://www.jstage.jst.go.jp/article/jcorr1974/27/2/27_2_63/_pdf/-char/ja"},
				{"98", "35% MgCl2 fervente", "Recozido", "-", "166,7", "https://www.jstage.jst.go.jp/article/jcorr1974/27/2/27_2_63/_pdf/-char/ja"},
			},
			new String[] {
				"Tens\u00E3o (MPa)", "Meio", "Condi\u00E7\u00E3o", "Tipo de Falha", "Tempo at\u00E9 a falha (h)", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, String.class, Object.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setMinWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(4).setMinWidth(115);
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);
		
		for (int i = 0; i <= 3; i++) {
			table.setRowHeight(i, 45);
		}

		DefaultTableCellRenderer rendererLink = new DefaultTableCellRenderer();
		rendererLink.setHorizontalAlignment(JLabel.CENTER);
		rendererLink.setForeground(new Color(52,81,160));
		for (int i = 5; i <= 5; i++) {
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
		
		for (int i = 0; i <= 4; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new MultiLineHeaderRenderer());
			table.getColumnModel().getColumn(i).setResizable(false);
		}

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());

				if (col == 5 && row >= 0) { // Check if it's the URL column
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
