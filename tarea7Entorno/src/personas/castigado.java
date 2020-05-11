package personas;

public class castigado {
	
	String nombreCastigado;
	int vecesCastigado;
	String tipo_de_castigo;
	
	
	public castigado() {}
	public castigado(String nombreCastigado, int vecesCastigado, String tipo_de_castigo) {
		this.nombreCastigado=nombreCastigado;
		this.vecesCastigado=vecesCastigado;
		this.tipo_de_castigo=tipo_de_castigo;
	}
	
	public void setNombre(String nombreCastigado) {
		this.nombreCastigado=nombreCastigado;
	}
	
	public void setVecesCastigado(int vecesCastigado) {
		this.vecesCastigado=vecesCastigado;
	}
	
	public void setTipo_de_castigo(String tipo_de_castigo) {
		this.tipo_de_castigo=tipo_de_castigo;
	}
	
	public String getNombreCastigado() {
		return this.nombreCastigado;
	}
	
	public int getVecesCastigado() {
		return this.vecesCastigado;
	}
	
	public String getTipo_de_castigo() {
		return this.tipo_de_castigo;
	}
	
	public void hacerTareasComunitarias() {
		System.out.println("Haciendo tareas comunitarias");
	}
	
	public void hacerExamenEvaluatorio() {
		System.out.println("Haciendo examen");
	}
}
