package Jogador;

public class ContaBancaria {

	private double saldo;
	
	public ContaBancaria() {
	}

	public void depositar(double valor) {
		if(valor>0) {
			this.saldo = saldo + valor;
		}
	}

	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			this.saldo = saldo - valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}
