package Logic;

public class IngenieroSoftware {
	
	public IngenieroSoftware(String nombre);
	//Debe comenzar sin acceso al código fuente ni chequeos realizados. 
	 
	public boolean getAccesoCodigo();
	//Debe retornar si tiene o no acceso al código fuente. 
	 
	public void setAccesoCodigo(boolean acceso);
	//Permite actualizar los permisos de acceso o no al código fuente desde donde se ha instanciado. 
	 
	public int getChequeosExitosos();
	//Retorna la cantidad de chequeos exitosos que tiene el ingeniero de software. 
	 
	public boolean codigoChequeo();
	// Debe verificar si su jefe aprueba el chequeo. Si el chequeo es aprobado, debe incrementar su cantidad de chequeos exitosos y retornar “true”. Si el jefe no aprueba el chequeo se le retira su acceso al código fuente y debe retornar “false”. 
	 

}
