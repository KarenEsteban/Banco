
public class Banco {
	
	private Cliente[] clientes = new Cliente[10];
	private int numCliente;
	
	
	public void agregarCliente(Cliente[] clientes){
		
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public Banco(int numCliente) {
		super();
		this.numCliente = numCliente;
	}

	public Banco() {
		super();
	}
		
}
