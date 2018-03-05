package Logic;

public class LiderTecnico {

	public LiderTecnico(String nombre);
	//Crea un l�der t�cnico que es gerente.  
	//El salario base de los l�deres t�cnicos es 1.3 veces que el de un t�cnico.
	//Por defecto el n�mero de dependientes es 4. 
	 
	public boolean tieneDepedientes();
	//Debe retornar �true� si el n�mero de dependientes directos que posee este l�der t�cnico
	//es menor que la cantidad que tiene asignada. 
	 
	public boolean asignardependiente(IngenieroSoftware iS);
	//Recibe una referencia a un objeto IngenieroSoftware,
	//si el l�der t�cnico tiene disponibilidad para un dependiente m�s, asigna dicho t�cnico a la lista de dependientes del mismo.
	//Si este es a�adido exitosamente como dependiente del l�der t�cnico, se retorna �true� sino �false�. 
	 
	public boolean aprobarChequeo(IngenieroSoftware iS);
	//Retorna �true� si el empleado recibido como argumento, 
	//es dependiente de este L�der T�cnico y si su c�digo de acceso es �true�, en caso contrario retorna �false�. 
	 
	public boolean requerimientoBono(Empleado e, double bonus);
	//Debe verificar si la cantidad requerida de bono puede ser aprobada por el l�der de negocios que da soporte a este l�der t�cnico. 
	//Si es as�, se asigna el bonus al empleado y se retorna �true�.  Se retorna �false� en caso contrario. 
	 
	public String getEstatusEquipo();
	//Debe retornar un String que informe sobre este gerente y todos sus dependientes directos.
	//Una combinaci�n del estatus de este l�der t�cnico seguido del estatus de los l�deres bajo su dependencia.
	//Si el l�der t�cnico no tiene dependientes imprime solo su estatus seguido del mensaje
	//�y sin dependientes directos todav�a�. Por ejemplo:
	//�10 M�ximo Castro tiene 5 chequeos exitosos y sin dependientes directos todav�a�.
	//Si el l�der t�cnico tiene dependientes podr�a imprimir algo parecido a:
	//�10 M�ximo Castro tiene 5 chequeos exitosos y est� supervisando: �5 Pedro Germ�n tiene 2 chequeos exitosos��  
	 
	
}
