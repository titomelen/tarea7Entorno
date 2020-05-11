package instituto;

public class excursion {
	
	String tipoExcursion;
	int duracionExcursion;
	String valoresExcursion;
	
	
	public excursion() {}
	public excursion(String tipoExcursion, int duracionExcursion, String valoresExcursion) {
		this.tipoExcursion=tipoExcursion;
		this.duracionExcursion=duracionExcursion;
		this.valoresExcursion=valoresExcursion;
	}
	
	
	public void setTipoExcursion(String tipoExcursion) {
		this.tipoExcursion=tipoExcursion;
	}
	
	public void setDuracionExcursion(int duracionExcursion) {
		this.duracionExcursion=duracionExcursion;
	}
	
	public void setValoresExcursion(String valoresExcursion) {
		this.valoresExcursion=valoresExcursion;
	}
	
	public String getTipoExcursion() {
		return this.tipoExcursion;
	}
	
	public int getDuracionExcursion() {
		return this.duracionExcursion;
	}
	
	public String getValoresExcursion() {
		return this.valoresExcursion;
	}
	
	public void hacerExcursion() {
		System.out.println("Nos vamos de excursion");
	}
	
	public void rellenarSolicitudExcursion() {
		System.out.println("Rellenar la solicitud para poder ir a la excursion");
	}
}
