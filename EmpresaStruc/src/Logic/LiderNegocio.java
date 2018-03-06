package Logic;

import java.util.*;

public class LiderNegocio extends Contador{
	
	private ArrayList <Empleado> depend;
	private int maxDep = 10;
	
		
	public LiderNegocio(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado, double bono,
			ArrayList<LiderTecnico> support, double presupuesto, ArrayList<Empleado> depend, int maxDep) {
		super(salarioBase, nombre, jefe, estatus, idEmpleado, bono, support, presupuesto);
		this.depend = depend;
		this.maxDep = maxDep;
	}
	
	public LiderNegocio(String nombre) {
		super( nombre);
	}
	///Debe crear un nuevo líder de negocio que es gerente.
	//Su salario base debe ser el doble que el de un contador.
	//Puede empezar con una cantidad máxima de 10 dependientes. 
	 
	public boolean tieneDisponibilidadDependientes() {
		if(depend.size() < maxDep ) {
			return true;
			}
		return false;
		}
	//Retorna “true” si el número de dependientes directos es menor que la cantidad de dependientes máxima. 
	 
	public boolean asignarDependiente(Contador c, LiderTecnico EquipoSoporte) {
		if(depend.size()<maxDep) {
			depend.add(c);
			return true;
			//bonoAprobado(1.1);
			}	else {
				 return false;
				}
		//addSupport(EquipoSoporte);
		
	}
	//Recibe un objeto Contador y si tiene un número de dependientes menor que el máximo número de dependientes que puede tener,
	//agrega el mismo a la lista de sus dependientes.  Si el Contador es agregado exitosamente debe retornar “true”,
	//en caso contrario retorna “false”. Cada vez que se agrega un dependiente el bono de presupuesto
	//debe incrementarse 1.1 veces que el salario base del empleado agregado.
	//El Equipo al que el empleado está dando soporte debe ser actualizado para que haga referencia al líder técnico recibido
	//como argumento. Si el empleado es asignado exitosamente debe retornar “true”, en caso contrario “false”. 
	 
	public boolean propuestaBono(Empleado e, double bono) {
		
		return false;
	}
	//Verifica si el monto del bono propuesto es menor o igual que el presupuesto disponible del líder de negocio.
	//De ser así se asigna el bono al empleado y se reduce el presupuesto disponible del líder de negocio,
	//retornando “true”.  En caso contrario se retorna “false”. 
	 

}
