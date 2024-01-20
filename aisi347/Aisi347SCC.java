package aisi347;

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

public class Aisi347SCC extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi347SCC() {
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
				Aisi347 aisi347 = new Aisi347();
				aisi347.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi347SCC = new JLabel("AISI 347 - Corros\u00E3o Sob Tens\u00E3o");
		lblAisi347SCC.setBounds(205, 10, 375, 46);
		lblAisi347SCC.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi347SCC);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 376);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"137", "\u00C1gua + Cl 100ppm e O\u2082 50ppm", "Superf\u00EDcie polida pH 6,5", "-", "1500", "300\u00BAC", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
				{"137", "\u00C1gua + Cl 100ppm e O\u2082 50ppm", "Superf\u00EDcie usinada pH 6,5", "-", "2000", "300\u00BAC", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
				{"275", "\u00C1gua + Cl 100ppm e O\u2082 50ppm", "Superf\u00EDcie polida pH 6,5", "-", "1600", "300\u00BAC", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
				{"275", "\u00C1gua + Cl 100ppm e O\u2082 50ppm", "Superf\u00EDcie usinada pH 6,5", "-", "1800", "300\u00BAC", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
				{"275", "\u00C1gua + Cl 100ppm e O\u2082 50ppm", "Superf\u00EDcie polida pH 6,5", "-", "2500", "300\u00BAC", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
				{"103", "46% MgCl\u2082 em ebuli\u00E7\u00E3o", "Como usinado", "-", "125", "-", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
				{"206", "46% MgCl\u2082 em ebuli\u00E7\u00E3o", "Como usinado", "-", "100", "-", "https://meridian.allenpress.com/corrosion/article-abstract/19/10/345t/156790/Stress-Corrosion-Cracking-of-Type-347-Stainless"},
			},
			new String[] {
				"Limite (MPa)", "Meio", "Condi\u00E7\u00E3o", "Tipo de Falha", "Tempo sem falha (h)", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(65);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setMinWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(4).setMinWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(65);
		table.getColumnModel().getColumn(5).setMinWidth(65);
		table.getColumnModel().getColumn(6).setPreferredWidth(45);
		table.getColumnModel().getColumn(6).setMinWidth(45);
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);
		
		for (int i = 0; i <= 6; i++) {
			table.setRowHeight(i, 50);
		}

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
