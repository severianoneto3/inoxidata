package acos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TabelaPropriedades extends JFrame {
	public TabelaPropriedades() {
	}

	public void adicionarTabela(JScrollPane scrollPane, JTable table, String densidade, String moduloElasticidade,
			String cte1, String cte2, String cte3, String condTermica1, String condTermica2, String calorEspecifico,
			String resistividade) {
		table = new JTable();
		table.setRowHeight(22);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] { { densidade, moduloElasticidade, cte1, cte2, cte3, condTermica1, condTermica2,
						calorEspecifico, resistividade }, },
				new String[] { "Densidade@(kg/m\u00B3)", "M\u00F3dulo de@Elasticidade@(GPa)",
						"Coeficiente@de Expans\u00E3o@T\u00E9rmica@0-100\u00BAC@(\u03BCm/m/\u00B0C)",
						"Coeficiente@de Expans\u00E3o@T\u00E9rmica@0-315\u00BAC@(\u03BCm/m/\u00B0C)",
						"Coeficiente@de Expans\u00E3o@T\u00E9rmica@0-538\u00BAC@(\u03BCm/m/\u00B0C)",
						"Condutividade@t\u00E9rmica a 100\u00BAC@(W/m*K)",
						"Condutividade@t\u00E9rmica a 500\u00BAC@(W/m*K)",
						"Calor espec\u00EDfico@0-100\u00BAC@(J/kg*K)", "Resistividade@el\u00E9trica@(n\u03A9.m)" }) {

			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(5).setPreferredWidth(70);
		table.getColumnModel().getColumn(7).setPreferredWidth(60);
		table.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		table.getTableHeader().setReorderingAllowed(false);

		class MultiLineHeaderRenderer extends DefaultTableCellRenderer {

			public MultiLineHeaderRenderer() {
				setHorizontalAlignment(CENTER); // Center-align the text
				setForeground(new Color(255, 255, 255));
				setBackground(new Color(52, 81, 160));
				setPreferredSize(new Dimension(50, 95));
			}

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				String wrappedText = "<html><div style='text-align: center; font-family: Bahnschrift;'>"
						+ value.toString().replace("@", "<br>") + "</div></html>";
				return super.getTableCellRendererComponent(table, wrappedText, isSelected, hasFocus, row, column);
			}
		}

		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setHeaderRenderer(new MultiLineHeaderRenderer());
		}

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		centerRenderer.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			table.getColumnModel().getColumn(i).setResizable(false);
		}
	}

}
