package controlVersiones;

/**
 * 
 * @author Alain
 * @version Version 1,2021
 * @since 24/05/2021
 * 
 */
public class Empleado {
	private String nombre;
	private String apellidos;
	private double salario; 

/**
 * 
 * @param nombre
 * @param apellido
 * @param salario
 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}


/**
 * 
 * @return nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * 
 * @param nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * 
 * @return apellidos
 */
public String getApellidos() {
	return apellidos;
}
/**
 * 
 * @param apellidos
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
/**
 * 
 * @return salario
 */
public double getSalario() {
	return salario;
}
/**
 * 
 * @param salario
 * 
 */
public void setSalario(double salario) {
	this.salario = salario;
}

/**
 * 
 * @param subida
 * @apiNote salario + subida
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}


}