package personas;

public class profesor {
	
	String nombre;
	String asignatura;
	int NumClase;
	
	
	public profesor() {}
	public profesor(String nombre, String asignatura, int NumClase) {
		this.nombre=nombre;
		this.asignatura=asignatura;
		this.NumClase=NumClase;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setAsignatura(String asignatura) {
		this.asignatura=asignatura;
	}
	
	public void setNumClase(int NumClase) {
		this.NumClase=NumClase;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getAsignatura() {
		return this.asignatura;
	}
	
	public int getNumClase() {
		return this.NumClase;
	}
	
	public void evaluarExamen() {
		System.out.println("Corrigiendo examen");
	}
	
	public void darClases() {
		System.out.println("Dando clases");
	}
}
