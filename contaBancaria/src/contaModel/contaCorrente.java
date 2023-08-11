package contaModel;

public class contaCorrente extends Conta {
	
	public contaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
	}

	private float limite;
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
    
}
