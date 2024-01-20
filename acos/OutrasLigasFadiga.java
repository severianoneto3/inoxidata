package acos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
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

public class OutrasLigasFadiga extends JFrame {

	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public OutrasLigasFadiga() {
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

		JLabel lblAisi304Fadiga = new JLabel("Outras Ligas - Fadiga");
		lblAisi304Fadiga.setBounds(257, 10, 280, 46);
		lblAisi304Fadiga.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblAisi304Fadiga);

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
				{"AISI 301", "241", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente", "https://dl.asminternational.org/handbooks/edited-volume/34/Fatigue-and-Fracture"},
				{"AISI 301", "255 - 265", "30", "-", "10\u2077", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/abs/pii/0025541676901580?via%3Dihub"},
				{"AISI 301*", "465 - 475", "30", "-", "10\u2077", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/abs/pii/0025541676901580?via%3Dihub"},
				{"AISI 310", "~ 550", "20.000", "-1", "10\u2076", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/abs/pii/S0142112313001151"},
				{"AISI 310", "~ 550", "20.000", "-1", "10\u2079", "Ar", "Ambiente", "https://www.sciencedirect.com/science/article/abs/pii/S0142112313001151"},
				{"AISI 310", "310", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente", "https://dl.asminternational.org/handbooks/edited-volume/34/Fatigue-and-Fracture"},
				{"AISI 321", "262", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente", "https://dl.asminternational.org/handbooks/edited-volume/34/Fatigue-and-Fracture"},
				{"AISI 321", "155", "-", "-1", "10\u2077", "Ar", "360\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0142112316302134"},
				{"AISI 321", "395", "50", "-1", "10\u2077", "Ar", "-", "https://www.sciencedirect.com/science/article/abs/pii/S0921509312016747"},
				{"AISI 321**", "456", "50", "-1", "10\u2077", "Ar", "-", "https://www.sciencedirect.com/science/article/abs/pii/S0921509312016747"},
				{"AISI 416", "275", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente", "https://dl.asminternational.org/handbooks/edited-volume/34/Fatigue-and-Fracture"},
				{"AISI 420", "~ 375", "-", "-", "10\u2077", "Ar", "Ambiente", "https://www.thaiscience.info/Journals/Article/SONG/10993198.pdf"},
				{"AISI 420***", "500", "-", "-", "10\u2077", "Ar", "Ambiente", "https://www.thaiscience.info/Journals/Article/SONG/10993198.pdf"},
				{"AISI 420C", "285", "29,2 - 31,9", "-1", "10\u2077", "Ar", "-", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X12005471?via%3Dihub"},
				{"AISI 440C", "358", "-", "-", "10\u2076 - 10\u2078", "Ar", "Ambiente", "https://dl.asminternational.org/handbooks/edited-volume/34/Fatigue-and-Fracture"},
				{"AISI 440C****", "550", "-", "-1", "10\u2077", "Ar", "Ambiente", "https://www.aseestant.ceon.rs/index.php/jmm/article/view/11431"},
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
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(0).setMinWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(105);
		table.getColumnModel().getColumn(3).setMinWidth(105);
		table.getColumnModel().getColumn(4).setPreferredWidth(85);
		table.getColumnModel().getColumn(5).setPreferredWidth(65);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setMinWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(65);
		table.setRowHeight(25);
		
		JTextPane txtpnTrabalhadoA = new JTextPane();
		txtpnTrabalhadoA.setText("* Trabalhado a frio 50%\r\n** Com nitretação a 420ºC por 4h\r\n*** Trabalhado a frio, recozido e com alívio de tensões\r\n**** Duplo temperado e revenido");
		txtpnTrabalhadoA.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnTrabalhadoA.setEditable(false);
		txtpnTrabalhadoA.setBackground(SystemColor.menu);
		txtpnTrabalhadoA.setAlignmentX(1.0f);
		txtpnTrabalhadoA.setBounds(32, 459, 435, 94);
		contentPane.add(txtpnTrabalhadoA);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i <= 6; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			table.getColumnModel().getColumn(i).setResizable(false);
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

		for (int i = 7; i <= 7; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new ButtonRenderer());
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
