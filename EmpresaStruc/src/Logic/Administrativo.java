package Logic;

public class Administrativo extends Empleado{
	
	private double bonoPresupuesto;
	
	
	public Administrativo(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado,
			double bonoPresupuesto) {
		super(salarioBase, nombre, jefe, estatus, idEmpleado);
		this.bonoPresupuesto = bonoPresupuesto;
		salarioBase = 50000;
	}
	//Constructor. Los administrativos tienen un salario base de 50000.	
	
	 
	public double getBonoPresupuesto() {
		return bonoPresupuesto;
	}
	//Retorna lo que resta del bono del presupuesto del equipo al que el empleado soporta.
	//El presupuesto es determinado según el tipo de administrativo que el empleado es. 
	 
	protected void setBonoPresupuesto(double bonoPresupuesto) {
		this.bonoPresupuesto = bonoPresupuesto;
	}

	public String estatusEmpleado() {		
		String Stat = getIdEmpleado() + " " + getNombre() + " " + "con un presupuesto de " +bonoPresupuesto ;		
		return Stat;
	}
	//Retorna un String que incluye el Id, nombre y el monto del presupuesto que administra.
	//Ejemplo: “1 Melvin con un presupuesto de 22500.0” 	 

}
