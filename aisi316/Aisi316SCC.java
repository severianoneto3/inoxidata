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

public class Aisi316SCC extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi316SCC() {
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
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi316SCC = new JLabel("AISI 316 - Corros\u00E3o Sob Tens\u00E3o");
		lblAisi316SCC.setBounds(205, 10, 375, 46);
		lblAisi316SCC.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi316SCC);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 196);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"159,8", "0,001M LiOH + 0,01M H₃BO₃", "75% TG", "60", "350ºC", "https://www.sciencedirect.com/science/article/pii/002231159290375U?ref=pdf_download&fr=RR-2&rr=809e75ce6ef1a4b1"},
				{"486", "Água PWR simulada", "TG", "-", "300ºC", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X1630628X?via%3Dihub"},
				{"116", "HCl (0,82 kmol/m³)", "TG", "27,7", "80ºC", "https://www.sciencedirect.com/science/article/pii/S0010938X03002312"},
				{"455", "HCl (0,82 kmol/m³)", "TG", "5000s", "80ºC", "https://www.sciencedirect.com/science/article/pii/S0010938X03002312"},
				{"300", "MgCl₂", "IG e TG", "27,7", "135ºC", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X06000643"},
				{"212,7", "MgCl₂", "TG", "1000s", "135ºC", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X06000643"},
			},
			new String[] {
				"Tens\u00E3o (MPa)", "Meio", "Tipo de Falha", "Tempo at\u00E9 a falha (h)", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(1).setMinWidth(140);
		table.getColumnModel().getColumn(3).setMinWidth(115);
		table.getColumnModel().getColumn(4).setPreferredWidth(70);
		table.getColumnModel().getColumn(5).setPreferredWidth(45);
		table.setRowHeight(25);
		
		JTextPane txtpnTgFalha = new JTextPane();
		txtpnTgFalha.setText("* TG: Falha Transgranular / IG: Falha Intergranular");
		txtpnTgFalha.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnTgFalha.setEditable(false);
		txtpnTgFalha.setBackground(SystemColor.menu);
		txtpnTgFalha.setAlignmentX(1.0f);
		txtpnTgFalha.setBounds(32, 295, 390, 32);
		contentPane.add(txtpnTgFalha);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);
		
		for (int i = 0; i <= 0; i++) {
			table.setRowHeight(i, 45);
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
		
		for (int i = 5; i <= 5; i++) {
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
