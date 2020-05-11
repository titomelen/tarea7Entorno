package instituto;

public class asignatura {
	
	String nombreAsig;
	int numAsig;
	String tipoAsig;
	
	
	public asignatura() {}
	public asignatura(String nombreAsig, int numAsig, String tipoAsig) {
		this.nombreAsig=nombreAsig;
		this.numAsig=numAsig;
		this.tipoAsig=tipoAsig;
	}
	
	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig=nombreAsig;
	}
	
	public void setNumAsig(int numAsig) {
		this.numAsig=numAsig;
	}
	
	public void setTipoAsig(String tipoAsig) {
		this.tipoAsig=tipoAsig;
	}
	
	public String getNombreAsig() {
		return this.nombreAsig;
	}
	
	public int getNumAsig() {
		return this.numAsig;
	}
	
	public String getTipoAsig() {
		return this.tipoAsig;
	}
	
	public void darAsignatura(){
		System.out.println("Dando asignatura");
	}
	
	public void evaluarAsignatura(){
		System.out.println("Evaluando asignatura");
	}
}
