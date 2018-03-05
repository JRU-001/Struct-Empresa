package Logic;

public  class Empleado {
	
	public double salarioBase;
	public String nombre;
	public String jefe;
	public String IdEmpleado;
		
	public Empleado(String nombre, double salarioBase) {
		//
	}
	 
	 
	public boolean equals(Empleado otro) {
		
	}
	//retorna “true” si los dos empleados tienen el mismo Id y “false” en caso contrario. 
	 
	
	public String toString() {
		//
	}
	//Retorna un String compuesto por el Id y el nombre del empleado. 
	 
	
	public String estatusEmpleado() {
		//
	}
	//Retorna un String que contiene el estatus del empleado.  Es diferente para cada subclase de empleado. 


	public double getSalarioBase() {
		return salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public String getJefe() {
		return jefe;
	}

	public String getIdEmpleado() {
		return IdEmpleado;
	}
	
}
