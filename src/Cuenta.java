
/**
 * Ejercicio de un balance
 * @author administradorcito
 *
 */

public class Cuenta {
	protected double balance;


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposito(double dep){
		balance= balance + dep;
	}
	
	public void retiro(double ret){	
		balance=balance-ret;	
	}

	public Cuenta() {
		super();
	}

	public Cuenta(double balance) {
		super();
		this.balance = balance;
	}
	
	
	}
	
