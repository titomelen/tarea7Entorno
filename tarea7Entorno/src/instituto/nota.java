package instituto;

public class nota extends examen{
	
	int NumNotasAprobadas;
	int NumNotasSuspensas;
	int NumAlumnosNoEvaluados;
	
	
	public nota() {}
	public nota(int NumNotasAprobadas, int NumNotasSuspensas, int NumAlumnosNoEvaluados) {
		this.NumNotasAprobadas=NumNotasAprobadas;
		this.NumNotasSuspensas=NumNotasSuspensas;
		this.NumAlumnosNoEvaluados=NumAlumnosNoEvaluados;
	}
	
	
	public void setNumNotasAprobadas(int NumNotasAprobadas) {
		this.NumNotasAprobadas=NumNotasAprobadas;
	}
	
	public void setNumNotasSuspensas(int NumNotasSuspensas) {
		this.NumNotasSuspensas=NumNotasSuspensas;
	}
	
	public void setNumAlumnosNoEvaluados(int NumAlumnosNoEvaluados) {
		this.NumAlumnosNoEvaluados=NumAlumnosNoEvaluados;
	}
	
	public int getNumNotasAprobadas() {
		return this.NumNotasAprobadas;
	}
	
	public int getNumNotasSuspensas() {
		return this.NumNotasSuspensas;
	}
	
	public int getNumAlumnosNoEvaluados() {
		return this.NumAlumnosNoEvaluados;
	}
	
	public void aprobar() {
		System.out.println("Aprobaron: ");
	}
	
	public void suspender() {
		System.out.println("Suspendieron: ");
	}
}
