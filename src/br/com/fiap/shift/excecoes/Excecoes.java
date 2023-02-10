package br.com.fiap.shift.excecoes;

@SuppressWarnings("serial")
public class Excecoes extends Exception {

	public Excecoes(String mensagem, Exception e) {
		super(mensagem, e);
		this.print();
		e.printStackTrace();
	}

	public Excecoes(String mensagem) {
		super(mensagem);
	}

	public void print() {
		System.out.println("========== Tratando Erro ==========" + "\n" + getMessage() + "\n"
				+ "===================================" + "\n" + "PrintStackTrace:  ");
		// System.out.println("========== Tratando Erro ==========");
		// System.out.println(getMessage());
		// System.out.println("===================================");
		// System.out.println("PrintStackTrace: ");
	}

}
