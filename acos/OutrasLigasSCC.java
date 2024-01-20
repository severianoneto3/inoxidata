package acos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
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
import java.awt.SystemColor;

public class OutrasLigasSCC extends JFrame {
	
	public JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTable table;

	public OutrasLigasSCC() {
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

		JLabel lblOutrasLigasSCC = new JLabel("Outras Ligas - Corros\u00E3o Sob Tens\u00E3o");
		lblOutrasLigasSCC.setBounds(173, 10, 450, 46);
		lblOutrasLigasSCC.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblOutrasLigasSCC);

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
				{"AISI 310", "795*", "\u00C1gua supercr\u00EDtica", "DO(ppb) \u02C2 10", "D\u00FActil + IG", "-", "600\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0022311518310420"},
				{"AISI 310", "761*", "\u00C1gua supercr\u00EDtica", "DO(ppb) = 200", "D\u00FActil + IG", "-", "600\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0022311518310420"},
				{"AISI 310", "763*", "\u00C1gua supercr\u00EDtica", "DO(ppb) = 2000", "D\u00FActil + IG", "-", "600\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0022311518310420"},
				{"AISI 310", "443*", "\u00C1gua supercr\u00EDtica", "DO(ppb) \u02C2 10", "D\u00FActil", "-", "650\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0022311518310420"},
				{"AISI 310", "300", "MgCl\u2082", "Recozido a 1100\u00BAC 60min e temperado", "TG", "100000s", "134\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X06000643"},
				{"AISI 310", "300", "MgCl\u2082", "Recozido a 1100\u00BAC 60min e temperado", "TG", "10000s", "158\u00BAC", "https://www.sciencedirect.com/science/article/abs/pii/S0010938X06000643"},
				{"AISI 310", "300", "MgCl\u2082", "Chapa laminada a frio", "TG", "~24000s", "132\u00BAC", "https://www.researchgate.net/publication/287463729_Influence_of_corrosive_solution_temperature_on_the_SCC_behavior_of_the_AISI_310_and_AISI_316_stainless_steels_rolled_plates"},
				{"AISI 310", "300", "MgCl\u2082", "Chapa laminada a frio", "TG", "~13000s", "132\u00BAC", "https://www.researchgate.net/publication/287463729_Influence_of_corrosive_solution_temperature_on_the_SCC_behavior_of_the_AISI_310_and_AISI_316_stainless_steels_rolled_plates"},
				{"AISI 410", "689", "½% HAc + H₂S + 6% NaCl", "-", "-", "6h-21h", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 410", "689", "½% HAc + H₂S", "-", "-", "3-8 dias", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 416", "689", "½% HAc + H₂S + 6% NaCl", "-", "-", "30h-46h", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 416", "689", "½% HAc + H₂S", "-", "-", "3-5 dias", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 420", "689", "½% HAc + H₂S + 6% NaCl", "-", "-", "5h", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 420", "689", "½% HAc + H₂S", "-", "-", "2-3 dias", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 420", "-", "H₂S", "20,06 ppm e pH = 4,7", "-", "14 dias", "50ºC", "https://onepetro.org/SPEOCC/proceedings-abstract/99OCS/All-99OCS/59794"},
				{"AISI 431", "689", "½% HAc + H₂S + 6% NaCl", "-", "-", "30h-46h", "Ambiente", "https://meridian.allenpress.com/corrosion/article-abstract/11/8/39/156819/Stress-Corrosion-Cracking-Of-Hardenable-Stainless"},
				{"AISI 403", "455", "1M NaCl", "-", "-", "49,2h", "100", "https://www.osti.gov/biblio/6348601"},
				{"AISI 403", "527-581", "0,5M Na₂SO₄", "-", "-", "26,8h-54h", "100", "https://www.osti.gov/biblio/6348601"},
				{"AISI 403", "420-500", "70% NaOH", "-", "-", "55,4h-58,8h", "143", "https://www.osti.gov/biblio/6348601"},
			},
			new String[] {
				"A\u00E7o", "Limite (MPa)", "Meio", "Condi\u00E7\u00E3o", "Tipo de falha", "Tempo at\u00E9 a falha", "Temperatura", "Fonte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(0).setMinWidth(85);
		table.getColumnModel().getColumn(1).setMinWidth(75);
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(2).setMinWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(95);
		table.getColumnModel().getColumn(3).setMinWidth(95);
		table.getColumnModel().getColumn(4).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setMinWidth(85);
		table.getColumnModel().getColumn(5).setPreferredWidth(95);
		table.getColumnModel().getColumn(5).setMinWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setMinWidth(100);
		table.getColumnModel().getColumn(7).setMinWidth(60);
		table.setRowHeight(25);
		
		JTextPane txtpnTesteSsrt = new JTextPane();
		txtpnTesteSsrt.setText("* Teste SSRT com a taxa de 9.26×10-7/s – DO(ppb) = concentração de oxigênio dissolvido\r\n  TG: Falha Transgranular / IG: Falha Intergranular\r\n");
		txtpnTesteSsrt.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtpnTesteSsrt.setEditable(false);
		txtpnTesteSsrt.setBackground(SystemColor.menu);
		txtpnTesteSsrt.setAlignmentX(1.0f);
		txtpnTesteSsrt.setBounds(32, 459, 721, 55);
		contentPane.add(txtpnTesteSsrt);
		table.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		table.getTableHeader().setBackground(new Color(52, 81, 160));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.getTableHeader().setReorderingAllowed(false);
		
		for (int i = 0; i <= 3; i++) {
			table.setRowHeight(i, 50);
		}
		
		for (int i = 4; i <= 5; i++) {
			table.setRowHeight(i, 100);
		}
		
		for (int i = 6; i <= 7; i++) {
			table.setRowHeight(i, 75);
		}
		
		for (int i = 8; i <= 15; i++) {
			table.setRowHeight(i, 75);
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
