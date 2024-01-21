// Importa��o das classes necess�rias
package principal;

import java.awt.EventQueue;
import javax.swing.JFrame;

// Classe principal que herda de JFrame
public class Main extends JFrame {
	
	// Construtor padr�o
	public Main() {
	}

	// M�todo principal da aplica��o
	public static void main(String[] args) {
		// Utiliza o EventQueue.invokeLater para garantir que a interface gr�fica seja manipulada na thread de despacho de eventos
		EventQueue.invokeLater(new Runnable() {
			// Implementa��o do m�todo run da interface Runnable
			public void run() {
				try {
					// Cria uma inst�ncia da classe TelaPrincipal
					TelaPrincipal telaPrincipal = new TelaPrincipal();
					
					// Torna a janela da TelaPrincipal vis�vel
					telaPrincipal.frame.setVisible(true);
				} catch (Exception e) {
					// Imprime a pilha de exce��es se ocorrer algum erro
					e.printStackTrace();
				}
			}
		});
	}
}
