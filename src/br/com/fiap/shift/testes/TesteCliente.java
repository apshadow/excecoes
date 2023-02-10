package br.com.fiap.shift.testes;

import javax.swing.JOptionPane;
import br.com.fiap.shift.excecoes.Excecoes;
import br.com.fiap.shift.model.Cliente;

public class TesteCliente {

	public static void main(String[] args) throws Excecoes {

		try {
			Cliente objCliente = new Cliente();
			objCliente.setCodigo(Long.parseLong(JOptionPane.showInputDialog("Digite o código")));
		} catch (Exception e) {
			throw new Excecoes("Ocorreu uma falha.", e);
		}

	}

}
