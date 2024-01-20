package aisi430;

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

public class Aisi430CorrosaoFadiga extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi430CorrosaoFadiga() {
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
				Aisi430 aisi430 = new Aisi430();
				aisi430.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi430CorrosaoFadiga = new JLabel("AISI 430 - Corros\u00E3o-Fadiga");
		lblAisi430CorrosaoFadiga.setBounds(230, 10, 325, 46);
		lblAisi430CorrosaoFadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi430CorrosaoFadiga);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 295);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"~ 135*", "-", "-", "~ 3,2 * 10\u2074", "30% HCl + 10% HNO\u2083 + 30% H\u2082O", "AISI 430 soldado a laser ao AISI 1010 2500W", "https://www.researchgate.net/publication/320419567_FATIGUE_BEHAVIOR_OF_AISI_430-AISI_1010_STEELS_WELDED_BY_LASER_BEAM_WELDING"},
				{"~ 135*", "5", "0,1", "~ 10\u2074", "30% HCl + 10% HNO\u2083 + 30% H\u2082O", "AISI 430 soldado a laser ao AISI 1010 2250W", "https://www.researchgate.net/publication/320419567_FATIGUE_BEHAVIOR_OF_AISI_430-AISI_1010_STEELS_WELDED_BY_LASER_BEAM_WELDING"},
				{"~ 135*", "5", "0,1", "9 * 10\u00B3", "30% HCl + 10% HNO\u2083 + 30% H\u2082O", "AISI 430 soldado a laser ao AISI 1010 2000W", "https://www.researchgate.net/publication/320419567_FATIGUE_BEHAVIOR_OF_AISI_430-AISI_1010_STEELS_WELDED_BY_LASER_BEAM_WELDING"},
			},
			new String[] {
				"Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o (R) de carga", "Num. de ciclos", "Meio", "Condi\u00E7\u00E3o", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class
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
		table.getColumnModel().getColumn(2).setPreferredWidth(110);
		table.getColumnModel().getColumn(2).setMinWidth(110);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setMinWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(105);
		table.getColumnModel().getColumn(5).setMinWidth(105);
		table.getColumnModel().getColumn(6).setPreferredWidth(55);
		table.setRowHeight(25);
		
		JTextPane txtpnMelhorResultado = new JTextPane();
		txtpnMelhorResultado.setText("* Melhor resultado");
		txtpnMelhorResultado.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnMelhorResultado.setEditable(false);
		txtpnMelhorResultado.setBackground(SystemColor.menu);
		txtpnMelhorResultado.setAlignmentX(1.0f);
		txtpnMelhorResultado.setBounds(32, 394, 185, 32);
		contentPane.add(txtpnMelhorResultado);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52,81,160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		
		for (int i = 0; i <= 2; i++) {
			table.setRowHeight(i, 90);
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
