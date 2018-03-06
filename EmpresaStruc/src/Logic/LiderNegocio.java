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
	///Debe crear un nuevo l�der de negocio que es gerente.
	//Su salario base debe ser el doble que el de un contador.
	//Puede empezar con una cantidad m�xima de 10 dependientes. 
	 
	public boolean tieneDisponibilidadDependientes() {
		if(depend.size() < maxDep ) {
			return true;
			}
		return false;
		}
	//Retorna �true� si el n�mero de dependientes directos es menor que la cantidad de dependientes m�xima. 
	 
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
	//Recibe un objeto Contador y si tiene un n�mero de dependientes menor que el m�ximo n�mero de dependientes que puede tener,
	//agrega el mismo a la lista de sus dependientes.  Si el Contador es agregado exitosamente debe retornar �true�,
	//en caso contrario retorna �false�. Cada vez que se agrega un dependiente el bono de presupuesto
	//debe incrementarse 1.1 veces que el salario base del empleado agregado.
	//El Equipo al que el empleado est� dando soporte debe ser actualizado para que haga referencia al l�der t�cnico recibido
	//como argumento. Si el empleado es asignado exitosamente debe retornar �true�, en caso contrario �false�. 
	 
	public boolean propuestaBono(Empleado e, double bono) {
		
		return false;
	}
	//Verifica si el monto del bono propuesto es menor o igual que el presupuesto disponible del l�der de negocio.
	//De ser as� se asigna el bono al empleado y se reduce el presupuesto disponible del l�der de negocio,
	//retornando �true�.  En caso contrario se retorna �false�. 
	 

}
