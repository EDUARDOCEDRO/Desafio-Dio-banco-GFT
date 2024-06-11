package entities;

public class Main {

	public static void main(String[] args) {
		cliente eduardo = new cliente();
		eduardo.setNome("Eduardo");
		Conta cc = new conta_corrente(eduardo); 
		Conta cp = new conta_poupanca(eduardo); 
		
		
		
		
		
		cc.depositar(100);
		cc.transferir(100, cp); 
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
		
		
		
        

}
