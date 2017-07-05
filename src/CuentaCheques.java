
public class CuentaCheques extends Cuenta {
	
	public CuentaCheques(double initBalance){
		super(initBalance);
	}
	public boolean retiroA(double rt){
		boolean rst=false;
		if(balance>5000){
			balance=balance-rt;
			rst=true;
		}
		return rst;	
	}
	

}
