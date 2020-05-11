package personas;

public class alumno {
	
	String nombre;
	int numClases;
	int numAsignaturas;
	
	
	public alumno() {}
	public alumno(String nombre, int numClases, int numAsignaturas) {
		this.nombre=nombre;
		this.numAsignaturas=numAsignaturas;
		this.numClases=numClases;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setNumClases(int numClases) {
		this.numClases=numClases;
	}
	
	public void setNumAsignaturas(int numAsignaturas) {
		this.numAsignaturas=numAsignaturas;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getNumClases() {
		return this.numClases;
	}
	
	public int getNumAsignaturas() {
		return this.numAsignaturas;
	}
	
	public void hacerExamen() {
		System.out.println("Haciendo examen");
	}
	
	public void recogerNotas(){
		System.out.println("Recogiendo notas");
	}

}
