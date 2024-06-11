package entities;

public class conta_poupanca extends Conta {
	
	public conta_poupanca(cliente cli) {
		super(cli);
	}
	
	
	public void imprimirExtrato() {
		System.out.println(" ***** Extrato Conta Poupanca *****");
		super.imprimirIfosComuns();
	}
	

}
