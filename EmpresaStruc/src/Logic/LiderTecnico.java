package Logic;

import java.util.*;

public class LiderTecnico extends Tecnico{
	
	private ArrayList <IngenieroSoftware> dependientes;
	private int maxDepend = 4;
	
	
	public LiderTecnico(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado, int chequeos,
			ArrayList<IngenieroSoftware> dependientes, int maxDepend) {
		super(salarioBase, nombre, jefe, estatus, idEmpleado, chequeos);
		this.dependientes = dependientes;
		this.maxDepend = maxDepend;
		salarioBase =97500;
	}
	public LiderTecnico( String nombre) {
		super(nombre);
	}
	//public LiderTecnico(String nombre) {	}
	//Crea un líder técnico que es gerente.  
	//El salario base de los líderes técnicos es 1.3 veces que el de un técnico.
	//Por defecto el número de dependientes es 4. 
	 
	public boolean tieneDepedientes(){
		if(dependientes.size() < maxDepend && dependientes.size() >1 ) {
			return true;			
		}
		return false;
	}
	//Debe retornar “true” si el número de dependientes directos que posee este líder técnico
	//es menor que la cantidad que tiene asignada. 
	 
	
	public boolean asignardependiente(IngenieroSoftware iS) {
		if(dependientes.size() < maxDepend) {
			dependientes.add(iS);
			return true;			
		}		
		return false;		
	}
	//Recibe una referencia a un objeto IngenieroSoftware,
	//si el líder técnico tiene disponibilidad para un dependiente más, asigna dicho técnico a la lista de dependientes del mismo.
	//Si este es añadido exitosamente como dependiente del líder técnico, se retorna “true” sino “false”. 
	 
	
	public boolean aprobarChequeo(IngenieroSoftware iS) {
		if (dependientes.contains(iS)) {
			if(iS.getAccesoCodigo() == true)
				return true;
		}
		return false;
	}
	//Retorna “true” si el empleado recibido como argumento, 
	//es dependiente de este Líder Técnico y si su código de acceso es “true”, en caso contrario retorna “false”. 
	
	 
	public boolean requerimientoBono(Empleado e, double bonus){
		return false;
	}
	//Debe verificar si la cantidad requerida de bono puede ser aprobada por el líder de negocios que da soporte a este líder técnico. 
	//Si es así, se asigna el bonus al empleado y se retorna “true”.  Se retorna “false” en caso contrario. 
	 
	public String getEstatusEquipo(){
		String Stat;
		if(dependientes.size()<1) {
		 Stat = this.estatusEmpleado() + " y sin dependientes directos todavia";
		}	else {
			 Stat = this.estatusEmpleado();
			for (int i = 0; i < dependientes.size(); i++) {
				Stat = Stat + dependientes.get(i);				
				}
			}		
		return Stat;
	}
	//Debe retornar un String que informe sobre este gerente y todos sus dependientes directos.
	//Una combinación del estatus de este líder técnico seguido del estatus de los líderes bajo su dependencia.
	//Si el líder técnico no tiene dependientes imprime solo su estatus seguido del mensaje
	//“y sin dependientes directos todavía”. Por ejemplo:
	//“10 Máximo Castro tiene 5 chequeos exitosos y sin dependientes directos todavía”.
	//Si el líder técnico tiene dependientes podría imprimir algo parecido a:
	//“10 Máximo Castro tiene 5 chequeos exitosos y está supervisando: ‘5 Pedro Germán tiene 2 chequeos exitosos’”  

	protected ArrayList<IngenieroSoftware> getDependientes() {
		return dependientes;
	}

	protected void setDependientes(ArrayList<IngenieroSoftware> dependientes) {
		this.dependientes = dependientes;
	}

	protected int getMaxDepend() {
		return maxDepend;
	}

	protected void setMaxDepend(int maxDepend) {
		this.maxDepend = maxDepend;
	}	 
	
}
