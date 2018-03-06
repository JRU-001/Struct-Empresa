package Logic;

public class Tecnico extends Empleado{
	
	private int chequeos;
		 
	
	 public Tecnico(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado, int chequeos) {
		super(salarioBase, nombre, jefe, estatus, idEmpleado);
		this.chequeos = chequeos;
		salarioBase = 75000;
	}
	//Constructor.  Los técnicos tienen un salario base de 75000. 
	 
	 public Tecnico(String nombre) {
			super(nombre);
		}
	 
	public String estatusEmpleado() {		
		String Stat = getIdEmpleado() + " " + getNombre() + " " + Integer.toString(chequeos) + "Chequeos exitosos";		
		return Stat;
	}
	//Retorna un String compuesto por el Id, el nombre y la cantidad de chequeos exitosos que ha tenido.
	//Ejemplo: “1 Julio Bonilla – 20 chequeos exitosos” 

	protected int getChequeos() {
		return chequeos;
	}

	protected void setChequeos(int chequeos) {
		this.chequeos = chequeos;
	}	 	
	 
}
