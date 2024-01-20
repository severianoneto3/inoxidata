package aisi304;

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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Aisi304CorrosaoFadiga extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public Aisi304CorrosaoFadiga() {
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
				Aisi304 aisi304 = new Aisi304();
				aisi304.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52,81,160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblAisi304CorrosaoFadiga = new JLabel("AISI 304 - Corros\u00E3o-Fadiga");
		lblAisi304CorrosaoFadiga.setBounds(230, 10, 325, 46);
		lblAisi304CorrosaoFadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi304CorrosaoFadiga);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 125);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{240, 60, "-1", "10⁷", "3% NaCl", "25\u00BA C", "https://www.sciencedirect.com/science/article/pii/S0921509315300265"},
				{245, 20, "-1", "10⁹", "3% NaCl", "-", "https://www.sciencedirect.com/science/article/pii/S2452321616300671"},
				{100, "0,1", "0,25", "3 * 10³", "MgCl₂", "-", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X11000254"},
				{390, 15, "-1", "10⁷", "5% NaCl", "Ambiente", "https://kobra.uni-kassel.de/handle/123456789/11422"},
			},
			new String[] {
				"Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o (R) de carga", "Num. de ciclos", "Meio", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Object.class, Double.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
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
	        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
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
