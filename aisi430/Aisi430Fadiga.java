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

public class Aisi430Fadiga extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi430Fadiga() {
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

		JLabel lblAisi430Fadiga = new JLabel("AISI 430 - Fadiga");
		lblAisi430Fadiga.setBounds(291, 10, 204, 46);
		lblAisi430Fadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi430Fadiga);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 176);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"275", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente", "https://www.asminternational.org/asm-handbook-volume-19-fatigue-and-fracture/results/-/journal_content/56/25656855/PUBLICATION"},
				{"~ 320", "1", "-1", "10\u2076", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/pii/S0020768312003022"},
				{"~ 265*", "1", "-1", "10\u2076", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/pii/S0020768312003022"},
				{"~ 250**", "1", "-1", "10\u2076", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/pii/S0020768312003022"},
				{"~ 180", "10", "-1", "10\u2077", "Ar", "Ambiente", "https://www.tandfonline.com/doi/full/10.1080/09507116.2017.1346860"},
				{"~ 155***", "30", "0,1", "10\u2077", "Ar", "Ambiente", "https://www.abcm.org.br/anais/cobem/2005/PDF/COBEM2005-1419.pdf"},
			},
			new String[] {
				"Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o (R) de carga", "Num. de ciclos", "Meio", "Temperatura", "Fonte"
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
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(2).setMinWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(65);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(65);
		table.setRowHeight(25);
		
		JTextPane txtpnE = new JTextPane();
		txtpnE.setText("* 5 e 8% de pré-deformação a frio\r\n** 12% de pré-deformação a frio\r\n*** AISI 430E");
		txtpnE.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnE.setEditable(false);
		txtpnE.setBackground(SystemColor.menu);
		txtpnE.setAlignmentX(1.0f);
		txtpnE.setBounds(32, 275, 267, 73);
		contentPane.add(txtpnE);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52,81,160));
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

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i <= 5; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
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
