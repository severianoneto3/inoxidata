package calculos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DadosResistenciaTracao extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public DadosResistenciaTracao() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(900, 100, 247, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		scrollPane.setBounds(0, 0, 233, 563);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setRowHeight(25);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Austen\u00EDticos", null},
				{"AISI 201", "655"},
				{"AISI 202", "612"},
				{"AISI 205", "831"},
				{"AISI 301", "758"},
				{"AISI 302", "612"},
				{"AISI 302B", "655"},
				{"AISI 303", "621"},
				{"AISI 303Se", "621"},
				{"AISI 304", "579"},
				{"AISI 304L", "558"},
				{"AISI 304N", "621"},
				{"AISI 305", "586"},
				{"AISI 308", "793"},
				{"AISI 309", "621"},
				{"AISI 309S", "621"},
				{"AISI 310", "655"},
				{"AISI 310S", "655"},
				{"AISI 314", "689"},
				{"AISI 316", "579"},
				{"AISI 316F", "586"},
				{"AISI 316L", "558"},
				{"AISI 316N", "621"},
				{"AISI 317", "621"},
				{"AISI 317L", "593"},
				{"AISI 317LMN", "662"},
				{"AISI 321", "621"},
				{"AISI 330", "552"},
				{"AISI 347", "655"},
				{"AISI 348", "655"},
				{"AISI 384", "517"},
				{"AISI 303", "621"},
				{"Ferr\u00EDticos", null},
				{"AISI 405", "448"},
				{"AISI 409", "448"},
				{"AISI 429", "483"},
				{"AISI 430", "517"},
				{"AISI 430F", "655"},
				{"AISI 434", "531"},
				{"AISI 436", "531"},
				{"AISI 442", "552"},
				{"AISI 446", "552"},
				{"Martensíticos", null},
				{"AISI 403", "483"},
				{"AISI 410", "483"},
				{"AISI 414", "827"},
				{"AISI 416", "517"},
				{"AISI 420", "655"},
				{"AISI 431", "655"},
				{"AISI 440A", "724"},
				{"AISI 440B", "738"},
				{"AISI 440C", "758"},
			},
			new String[] {
				"Tipo do a\u00E7o", "S\u1D58\u1D57 (MPa)"
			}
		) {

			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			
			@Override
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(124);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
		table.getTableHeader().setBackground(new Color(52,81,160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setPreferredSize(new Dimension(table.getWidth(),30));

		class CustomTableRenderer extends DefaultTableCellRenderer {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				
				String versionVal = table.getModel().getValueAt(row, 0).toString();

				if (versionVal.contains("Austeníticos") || versionVal.contains("Ferríticos") || versionVal.contains("Martensíticos")) {
					c.setForeground(new Color(52,81,160));
				} else {
	                c.setForeground(Color.BLACK);
	            }
				
				((DefaultTableCellRenderer)c).setHorizontalAlignment(SwingConstants.CENTER);
				
				return c;
			}

		}

		table.setDefaultRenderer(String.class, new CustomTableRenderer());
		scrollPane.setViewportView(table);

	}

}
