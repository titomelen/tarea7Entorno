package instituto;

public class instituto {

	String nombre;
	int Nprofesores;
	int Nalumnos;
	String direccion;
	
	public instituto() {}
	
	public instituto(String nombre,	int Nprofesores, int Nalumnos, String direccion) {
		this.nombre=nombre;
		this.Nprofesores=Nprofesores;
		this.Nalumnos=Nalumnos;
		this.direccion=direccion;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setNprofesores(int Nprofesores) {
		this.Nprofesores=Nprofesores;
	}
	
	public void setNalumnos(int Nalumnos) {
		this.Nalumnos=Nalumnos;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getNprofesores() {
		return this.Nprofesores;
	}
	
	public int getNalumnos() {
		return this.Nalumnos;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void contratarProfesor() {
		System.out.println("Contratando profesor");
	}
	
	public void inscribirAlumno() {
		System.out.println("Inscribiendo alumno");
	}
}
