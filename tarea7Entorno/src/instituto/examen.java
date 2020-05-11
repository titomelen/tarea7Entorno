package instituto;

public class examen {
	
	int evaluarNotas;
	int recuperaciones;
	int fechExamen;
	
	
	public examen() {}
	public examen(int evaluarNotas, int recuperaciones, int fechExamen) {
		this.evaluarNotas=evaluarNotas;
		this.recuperaciones=recuperaciones;
		this.fechExamen=fechExamen;
	}
	
	
	public void setEvaluarNotas(int evaluarNotas) {
		this.evaluarNotas=evaluarNotas;
	}
	
	public void setRecuperaciones(int recuperaciones) {
		this.recuperaciones=recuperaciones;
	}
	
	public void setFechExamen(int fechExamen) {
		this.fechExamen=fechExamen;
	}
	
	public int getEvaluarNotas() {
		return this.evaluarNotas;
	}
	
	public int getRecuperaciones() {
		return this.recuperaciones;
	}
	
	public int getFechExamen() {
		return this.fechExamen;
	}
	
	public void aprobarExamen() {
		System.out.println("Han aprobado");
	}
	
	public void suspenderExamen() {
		System.out.println("Han suspendido");
	}
}
