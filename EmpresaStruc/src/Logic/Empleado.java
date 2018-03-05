package Logic;

public abstract class Empleado {
	
	protected double salarioBase;
	protected String nombre;
	protected String jefe;
	protected String IdEmpleado;
		
	public Empleado(String nombre, double salarioBase) {
		//
	}
	 
	 
	protected boolean equals(Empleado otro) {
		
	}
	//retorna “true” si los dos empleados tienen el mismo Id y “false” en caso contrario. 
	 
	
	protected String toString() {
		//
	}
	//Retorna un String compuesto por el Id y el nombre del empleado. 
	 
	
	protected String estatusEmpleado() {
		//
	}
	//Retorna un String que contiene el estatus del empleado.  Es diferente para cada subclase de empleado. 


	protected double getSalarioBase() {
		return salarioBase;
	}

	protected String getNombre() {
		return nombre;
	}

	protected String getJefe() {
		return jefe;
	}

	protected String getIdEmpleado() {
		return IdEmpleado;
	}
	
}
