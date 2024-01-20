package acos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
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
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class OutrasLigasCF extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public OutrasLigasCF() {
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
				OutrasLigas outrasLigas = new OutrasLigas();
				outrasLigas.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBackground(new Color(52, 81, 160));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(btnVoltar);

		JLabel lblOutrasLigasCF = new JLabel("Outras Ligas - Corrosão-Fadiga");
		lblOutrasLigasCF.setBounds(197, 10, 400, 46);
		lblOutrasLigasCF.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblOutrasLigasCF);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		scrollPane.setBounds(32, 89, 721, 360);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 15));
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"AISI 403", "448", "1,5", "-1", "10\u2074", "0,01M NaCl", "100\u00BAC", "https://www.osti.gov/biblio/6348601"},
				{"AISI 420C", "173", "29,2 - 31,9", "-1", "10\u2077", "\u00C1gua salina@de aqu\u00EDfero sintetizada, saturada de CO\u2082", "60\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X12005471?via%3Dihub"},
				{"AISI 440C", "~ 1000", "20", "-1", "10⁷", "Gasolina comum", "10±5ºC", "https://www.jstage.jst.go.jp/article/jsmemm/2017/0/2017_OS1212/_article/-char/ja"},
				{"AISI 440C", "~ 800", "20", "-1", "10⁷", "Gasolina inferior: 15% metanol e vestígios de outros produtos químicos", "10±5ºC", "https://www.jstage.jst.go.jp/article/jsmemm/2017/0/2017_OS1212/_article/-char/ja"},
				{"F-138", "205", "25", "0,1", "10⁸", "0,9% NaCl", "-", "http://biblioteca.posgraduacaoredentor.com.br/link/?id=25886073"},
				{"17-7PH", "265", "47,5", "-", "10⁶", "Água do mar ou 4% NaCl", "Ambiente", "https://onlinelibrary.wiley.com/doi/abs/10.1111/j.1460-2695.1989.tb00557.x"},
			},
			new String[] {
				"A\u00E7o", "Limite (MPa)", "Frequ\u00EAncia (Hz)", "Raz\u00E3o (R) de carga", "Num. de ciclos", "Meio", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, String.class, String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(0).setMinWidth(85);
		table.getColumnModel().getColumn(1).setMinWidth(75);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setMinWidth(85);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(3).setMinWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		table.getColumnModel().getColumn(4).setMinWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);
		table.getColumnModel().getColumn(5).setMinWidth(120);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setMinWidth(100);
		table.getColumnModel().getColumn(7).setMinWidth(60);
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(1, 100);
		table.setRowHeight(3, 155);
		table.setRowHeight(5, 50);

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

		for (int i = 7; i <= 7; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new ButtonRenderer());
			table.getColumnModel().getColumn(i).setResizable(false);
		}
		
		class CenterRenderer extends DefaultTableCellRenderer {

			public CenterRenderer() {
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
		
		for (int i = 0; i <= 6; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new CenterRenderer());
			table.getColumnModel().getColumn(i).setResizable(false);
		}
		
		class MultiLineHeaderRenderer extends DefaultTableCellRenderer {

			public MultiLineHeaderRenderer() {
				setHorizontalAlignment(CENTER); // Center-align the text
				setVerticalAlignment(TOP);
				setForeground(new Color(255, 255, 255));
				setBackground(new Color(52, 81, 160));
				setPreferredSize(new Dimension(50, 50));
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

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());

				if (col == 7 && row >= 0) { // Check if it's the URL column
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
