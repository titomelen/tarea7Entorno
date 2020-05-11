package instituto;

public class actividad {
	
	String nombreActividad;
	String tipoActividad;
	int numActividad;
	
	
	public actividad() {}
	public actividad(String nombreActividad, String tipoActividad, int numActividad) {
		this.nombreActividad=nombreActividad;
		this.tipoActividad=tipoActividad;
		this.numActividad=numActividad;
	}
	
	
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad=nombreActividad;
	}
	
	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad=tipoActividad;
	}
	
	public void setNumActividad(int numActividad) {
		this.numActividad=numActividad;
	}
	
	public String getNombreActividad() {
		return this.nombreActividad;
	}
	
	public String getTipoActividad() {
		return this.tipoActividad;
	}
	
	public int getNumActividad() {
		return this.numActividad;
	}
	
	public void hacerActividades() {
		System.out.println("Haciendo actividades");
	}
	
	public void evaluarActividades() {
		System.out.println("Evaluando actividades");
	}
}
