package como.cmc.directorio.entidades;

public class AdminContactos 
{
	public Contacto buscarMasPesado(Contacto contacto1,Contacto contacto2)
	{
		if(contacto1.getPeso()>contacto2.getPeso())
		{
			return contacto1;
		}
		else if(contacto1.getPeso()<contacto2.getPeso())
		{
			return contacto2;
		}
		else
		{
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto contacto1,Contacto contacto2)
	{
		if(contacto1.getTelefono().getOperadora()== contacto2.getTelefono().getOperadora())
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public void activarUsuario(Contacto contacto)
	{
		if (contacto.getTelefono().isTieneWhatsapp()== true)
		{
			contacto.setActivo(true);
		}
	}
	
}
