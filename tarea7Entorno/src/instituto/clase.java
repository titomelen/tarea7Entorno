package instituto;

public class clase {
	
	String nombreClase;
	int numClase;
	String tipoClase;
	

	public clase() {}
	public clase(String nombreClase, int numClase, String tipoClase) {
		this.nombreClase=nombreClase;
		this.numClase=numClase;
		this.tipoClase=tipoClase;
	}
	
	public void setNombreClase(String nombreClase) {
		this.nombreClase=nombreClase;
	}
	
	public void setNumClase(int numClase) {
		this.numClase=numClase;
	}
	
	public void setTipoClase(String tipoClase) {
		this.tipoClase=tipoClase;
	}
	
	public String getNombreClase() {
		return this.nombreClase;
	}
	
	public int getNumClase() {
		return this.numClase;
	}
	
	public String getTipoClase() {
		return this.tipoClase;
	}
	
	public void hacerActividades() {
		System.out.println("Haciendo actividades");
	}
	
	public void evaluarActividades() {
		System.out.println("Evaluando actividades");
	}
}
