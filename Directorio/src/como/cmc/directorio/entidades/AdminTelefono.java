package como.cmc.directorio.entidades;

public class AdminTelefono 
{
	public void activarMensajeria(Telefono telf)
	{
		if(telf.getOperadora()== "movi")
		{
			telf.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovil(Telefono telf, Telefono telf1, Telefono telf2)
	{
		int opMovil = 0;
		if(telf.getOperadora()== "movi")
		{
			opMovil++;
		}
		if(telf1.getOperadora()== "movi")
		{
			opMovil++;
		}
		if(telf2.getOperadora()== "movi")
		{
			opMovil++;
		}
		return opMovil;
	}
	
	public int contarClaro(Telefono telf, Telefono telf1, Telefono telf2, Telefono telf3)
	{
		int opClaro = 0;
		if(telf.getOperadora()== "claro")
		{
			opClaro++;
		}
		if(telf1.getOperadora()== "claro")
		{
			opClaro++;
		}
		if(telf2.getOperadora()== "claro")
		{
			opClaro++;
		}
		if(telf3.getOperadora()== "claro")
		{
			opClaro++;
		}
		return opClaro;
	}
}
