package Objetos;

public class principal {

	public static void main(String[] args) {
		System.out.println("Hola MUndo");
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Mario");
		cliente1.setApellido("Perez");
		cliente1.setCorreo("mperez@uisrael.edu.ec");
		
		Cliente cliente2= new Cliente("Diana");
		cliente2.setPassword("123");
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		ICliente acciones = new ClienteImpl();
		acciones.comprar(cliente2);
		acciones.comprar(cliente1);
	}

}
