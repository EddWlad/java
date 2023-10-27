package Objetos;

public class ClienteImpl implements ICliente {

	@Override
	public void comprar(Cliente cliente) {

		System.out.println("Estoy comprando "+ cliente.getNombre());

	}

}
