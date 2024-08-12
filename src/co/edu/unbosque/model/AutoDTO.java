package co.edu.unbosque.model;

public class AutoDTO extends Vehículo {
	private int numeroPasajeros;
	private String combustible;
	private String placa;
	private boolean tieneGPS;
	private boolean cambiosAutomaticos;

	public AutoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AutoDTO(int numeroPasajeros, String combustible, String placa, boolean tieneGPS, boolean cambiosAutomaticos) {
		super();
		this.numeroPasajeros = numeroPasajeros;
		this.combustible = combustible;
		this.placa = placa;
		this.tieneGPS = tieneGPS;
		this.cambiosAutomaticos = cambiosAutomaticos;
	}

	public AutoDTO(String nombreConductor, long cedulaConductor, int numeroPasajeros, String combustible, String placa,
			boolean tieneGPS, boolean cambiosAutomaticos) {
		super(nombreConductor, cedulaConductor);
		this.numeroPasajeros = numeroPasajeros;
		this.combustible = combustible;
		this.placa = placa;
		this.tieneGPS = tieneGPS;
		this.cambiosAutomaticos = cambiosAutomaticos;
	}

	public AutoDTO(String nombreConductor, long cedulaConductor) {
		super(nombreConductor, cedulaConductor);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isTieneGPS() {
		return tieneGPS;
	}

	public void setTieneGPS(boolean tieneGPS) {
		this.tieneGPS = tieneGPS;
	}

	public boolean isCambiosAutomaticos() {
		return cambiosAutomaticos;
	}

	public void setCambiosAutomaticos(boolean cambiosAutomaticos) {
		this.cambiosAutomaticos = cambiosAutomaticos;
	}

	@Override
	public String toString() {
		return super.toString() + "Número de Pasajeros: " + numeroPasajeros + "\nTipo de Combustible: " + combustible + "\nPlaca: " + placa
				+ "\n¿Tiene GPS? " + tieneGPS + "\n¿Es Automático? " + cambiosAutomaticos + "\n";
	}

}
