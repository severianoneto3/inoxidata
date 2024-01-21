// Importação das classes necessárias
package principal;

import java.awt.EventQueue;
import javax.swing.JFrame;

// Classe principal que herda de JFrame
public class Main extends JFrame {
	
	// Construtor padrão
	public Main() {
	}

	// Método principal da aplicação
	public static void main(String[] args) {
		// Utiliza o EventQueue.invokeLater para garantir que a interface gráfica seja manipulada na thread de despacho de eventos
		EventQueue.invokeLater(new Runnable() {
			// Implementação do método run da interface Runnable
			public void run() {
				try {
					// Cria uma instância da classe TelaPrincipal
					TelaPrincipal telaPrincipal = new TelaPrincipal();
					
					// Torna a janela da TelaPrincipal visível
					telaPrincipal.frame.setVisible(true);
				} catch (Exception e) {
					// Imprime a pilha de exceções se ocorrer algum erro
					e.printStackTrace();
				}
			}
		});
	}
}
