package Logic;

public class IngenieroSoftware extends Tecnico{
	
	private boolean acceso;
	private boolean aprovado;
	
	
	public IngenieroSoftware(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado,
			int chequeos, boolean acceso, boolean aprovado) {
		super(salarioBase, nombre, jefe, estatus, idEmpleado, chequeos);
		this.acceso = acceso;
		this.aprovado = aprovado;
	}
	//Debe comenzar sin acceso al código fuente ni chequeos realizados. 
	
	 
	public boolean getAccesoCodigo() {				
		return acceso;
	}
	//Debe retornar si tiene o no acceso al código fuente. 
	 
	public void setAccesoCodigo(boolean acceso) {
		this.acceso = acceso;
	}
	//Permite actualizar los permisos de acceso o no al código fuente desde donde se ha instanciado. 
	 
	
	public int getChequeosExitosos() {
		return getChequeos();
	}
	//Retorna la cantidad de chequeos exitosos que tiene el ingeniero de software. 
	 

	public boolean codigoChequeo() {
		if(aprovado = true) {
			setChequeos(getChequeos() + 1);
			return true;
		}else {
			acceso =false;
			return false;
		}		
	}
	// Debe verificar si su jefe aprueba el chequeo. Si el chequeo es aprobado,
	//debe incrementar su cantidad de chequeos exitosos y retornar “true”.
	//Si el jefe no aprueba el chequeo se le retira su acceso al código fuente y debe retornar “false”. 
	

	protected boolean isAprovado() {
		return aprovado;
	}

	protected void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
