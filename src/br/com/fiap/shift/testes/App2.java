package br.com.fiap.shift.testes;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class App2 {

	public static void main(String[] args) {

		short[] churros = new short[2];

		try {
			churros[0] = Short.parseShort(JOptionPane.showInputDialog("Digite o valor"));
			churros[1] = Short.parseShort(JOptionPane.showInputDialog("Digite o segundo valor"));
			churros[churros.length - 1] = 4;
			System.out.println("Valores digitados: " + churros);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Número inválido " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Excedeu a quantidade de posições do vetor " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			Arrays.asList(churros).forEach(System.out::println);
			System.out.close();
		}

	}

}
