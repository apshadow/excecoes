package br.com.fiap.shift.testes;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {

		byte churros = 0;

		do {
			try {
				churros = Byte.parseByte(JOptionPane.showInputDialog("Digite um valor"));
				System.out.println("Valor digitado: " + churros);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número Inválido");
			}
		} while (churros <= 0);
	}

}
