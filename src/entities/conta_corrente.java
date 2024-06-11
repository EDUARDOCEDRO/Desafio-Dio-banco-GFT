package entities;

public class conta_corrente extends Conta {
	
	public conta_corrente(cliente cli) {
		super(cli);
	}
	
	public void imprimirExtrato() {
		System.out.println(" ***** Extrato Conta Corrente *****");
		super.imprimirIfosComuns();
		
	}
	
	
	
	
	
	
}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
