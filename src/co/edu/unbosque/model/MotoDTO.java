package co.edu.unbosque.model;

public class MotoDTO extends Vehículo {
	private String marca;
	private int cilindraje;
	private String tipoFrenos;
	private boolean tieneModificaciones;
	private String frecuenciaUso;

	public MotoDTO() {
		// TODO Auto-generated constructor stub
	}

	public MotoDTO(String marca, int cilindraje, String tipoFrenos, boolean tieneModificaciones, String frecuenciaUso) {
		super();
		this.marca = marca;
		this.cilindraje = cilindraje;
		this.tipoFrenos = tipoFrenos;
		this.tieneModificaciones = tieneModificaciones;
		this.frecuenciaUso = frecuenciaUso;
	}

	public MotoDTO(String nombreConductor, long cedulaConductor, String marca, int cilindraje, String tipoFrenos,
			boolean tieneModificaciones, String frecuenciaUso) {
		super(nombreConductor, cedulaConductor);
		this.marca = marca;
		this.cilindraje = cilindraje;
		this.tipoFrenos = tipoFrenos;
		this.tieneModificaciones = tieneModificaciones;
		this.frecuenciaUso = frecuenciaUso;
	}

	public MotoDTO(String nombreConductor, long cedulaConductor) {
		super(nombreConductor, cedulaConductor);
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getTipoFrenos() {
		return tipoFrenos;
	}

	public void setTipoFrenos(String tipoFrenos) {
		this.tipoFrenos = tipoFrenos;
	}

	public boolean isTieneModificaciones() {
		return tieneModificaciones;
	}

	public void setTieneModificaciones(boolean tieneModificaciones) {
		this.tieneModificaciones = tieneModificaciones;
	}

	public String getFrecuenciaUso() {
		return frecuenciaUso;
	}

	public void setFrecuenciaUso(String frecuenciaUso) {
		this.frecuenciaUso = frecuenciaUso;
	}

	@Override
	public String toString() {
		return super.toString() + "Marca: " + marca + "\nCilindraje: " + cilindraje + "\nTipo de Frenos: " + tipoFrenos
				+ "\n¿Tiene Modificaciones? " + tieneModificaciones + "\nFrecuencia de Uso: " + frecuenciaUso + "\n";
	}

}
