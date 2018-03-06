package Logic;


public  class Empleado {
	
	private double salarioBase;
	private String nombre;
	private String jefe;
	private String estatus;
	private int IdEmpleado;
		
	 
	public Empleado(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado) {
		super();
		this.salarioBase = salarioBase;
		this.nombre = nombre;
		this.jefe = jefe;
		this.estatus = estatus;
		IdEmpleado = idEmpleado;
	}
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public double getSalarioBase() {
		return salarioBase;
	} 
	
	public String getNombre() {
		return nombre;
	}
	
	public int getIdEmpleado() {
		return IdEmpleado;
	}	

	public String getJefe() {		
		return jefe;
	}	
	
	public boolean equals(Empleado otro) {
		if(this.IdEmpleado == otro.IdEmpleado) {
			return true;
		}
		return false;		
	}
	//retorna “true” si los dos empleados tienen el mismo Id y “false” en caso contrario. 
	 
	
	public String toString() {		 
		String completo = IdEmpleado +" " + nombre;		
		return completo;		
	}
	//Retorna un String compuesto por el Id y el nombre del empleado. 
	 
	
	public String estatusEmpleado() {
		return estatus;
	}
	//Retorna un String que contiene el estatus del empleado.  Es diferente para cada subclase de empleado. 
	
}
