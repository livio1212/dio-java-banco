package desafioDio;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	
		public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		} 
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
	
		
	}
	@Override
	public void depositar(double valor) {
		
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
	
	}
	
	
}
