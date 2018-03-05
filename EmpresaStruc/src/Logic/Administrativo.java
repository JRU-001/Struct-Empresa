package Logic;

public class Administrativo {
	
	public Administrativo(String nombre);
	//Constructor. Los administrativos tienen un salario base de 50000. 
	 
	public double getBonoPresupuesto();
	//Retorna lo que resta del bono del presupuesto del equipo al que el empleado soporta.
	//El presupuesto es determinado según el tipo de administrativo que el empleado es. 
	 
	public String estatusEmpleado();
	//Retorna un String que incluye el Id, nombre y el monto del presupuesto que administra.
	//Ejemplo: “1 Melvin con un presupuesto de 22500.0” 	 

}
