import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		
		Scanner entra=new Scanner(System.in);
		System.out.print("Dame tu nombre:");
		String nombre=entra.next();
		System.out.print("Dame tu apellido:");
		String apellido=entra.next();
		
		System.out.print("Balance actual: ");
		double balanceAct=entra.nextDouble();
		System.out.print("Cantidad del deposito: ");
		double depositoAct=entra.nextDouble();
		System.out.print("Cantidad de retiro: ");
		double retiroAct=entra.nextDouble();
	
         CuentaAhorro ca=new CuentaAhorro(500);
         ca.getBalance();
         System.out.println();
		
		
		Cliente cl=new Cliente(new Cuenta());
		
		cl.getCuenta().setBalance(balanceAct);
		//System.out.println("El balance incial es de: " + c.getBalance());
		cl.getCuenta().deposito(depositoAct);
		//System.out.println("Balance con deposito: "+c.getBalance());
		cl.getCuenta().retiro(retiroAct);
		//System.out.println("Balance con retiro: "+c.getBalance());
		
		cl.setNombre(nombre);
		cl.setApellido(apellido);
		System.out.println("Cliente: "+cl.getNombre()+" "+cl.getApellido()+" Balance final: "+cl.getCuenta().getBalance());
		
		
		
   /*
		Scanner en=new Scanner(System.in);
		System.out.print("Cantidad de retiro: ");
		double retiroAct=en.nextDouble();

		
		CuentaAhorro ca=new CuentaAhorro();
		ca.setBalance(6000);
		if(ca.getBalance()>5000){
			ca.retiro(retiroAct);
			System.out.println("Balance con retiro: "+ca.getBalance());
			
		}else{
			System.out.print("No se puede realizar retiro");
		}
	*/
		
	
	}

}
