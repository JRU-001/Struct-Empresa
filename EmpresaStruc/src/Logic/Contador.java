package Logic;

import java.util.*;

public class Contador extends Empleado{
	private double bono =0;
	private ArrayList <LiderTecnico> support;
	private double presupuesto;
	
	
	
	public Contador(double salarioBase, String nombre, String jefe, String estatus, int idEmpleado, double bono,
			ArrayList<LiderTecnico> support, double presupuesto) {
		super(salarioBase, nombre, jefe, estatus, idEmpleado);
		this.bono = bono;
		this.support = support;
		this.presupuesto = presupuesto;
	}
	
	public Contador(String nombre) {
		super(nombre);
	}
	//Debe comenzar con un bono de presupuesto de 0 y sin equipo al que oficialmente le d� soporte. 
	
	 
	public LiderTecnico getEquipoSoporta() {
		return null;
	}
	//Retorna una referencia al l�der t�cnico al que actualmente le da soporte.
	//Si no ha sido asignado a un l�der t�cnico debe retornar �null�. 
	 
	public void equipoSoporte (LiderTecnico lid) {
		
	}
	//Asigna una referencia al l�der t�cnico.
	//El bono de presupuesto del contador se debe actualizar con el total de los salarios base de los ingenieros de software 
	//que reportan al l�der t�cnico asignado m�s el 10%. Por ejemplo, si el l�der t�cnico asignado tiene 2 ingenieros bajo su dependencia,
	//cada uno con un salario base de 75000.00, el presupuesto del contador debe ser 150,000 + 15,000 para un total de 165,000.00. 
	 
	public boolean bonoAprobado(double bonus) {
		return false;
	}
	//Recibe un monto de bono propuesto y comprueba si hay presupuesto disponible.
	//Si el bono es mayor que el presupuesto disponible, debe retornar �false�,
	//de lo contrario �true�. Si el contador no est� dando soporte a ning�n equipo, debe retornar �false�. 
	 
	public String estatusEmpleado() {
		String stats;
		
		stats = this.estatusEmpleado() + "con un presupu8esto de  "+ presupuesto +"da soporte a " + support.get(0); 
		return stats;
	}
	//Debe retornar un String compuesto por el Id, nombre,
	//el monto del presupuesto administrado y el nombre del l�der t�cnico del equipo al que da soporte.
	//Ejemplo: �1 Melvin con un presupuesto de 22500.00, da soporte a Juan Gonz�lez�. 

	protected double getBono() {
		return bono;
	}

	protected void setBono(double bono) {
		this.bono = bono;
	}

	protected ArrayList<LiderTecnico> getSupport() {
		return support;
	}

	protected void addSupport(LiderTecnico lid) {
		this.support.add(lid);
	}

	protected double getPresupuesto() {
		return presupuesto;
	}

	protected void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
}
