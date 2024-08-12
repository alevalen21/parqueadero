package co.edu.unbosque.model;

public class Vehículo {
	private String nombreConductor;
	private long cedulaConductor;

	public Vehículo() {
		// TODO Auto-generated constructor stub
	}

	public Vehículo(String nombreConductor, long cedulaConductor) {
		super();
		this.nombreConductor = nombreConductor;
		this.cedulaConductor = cedulaConductor;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public long getCedulaConductor() {
		return cedulaConductor;
	}

	public void setCedulaConductor(long cedulaConductor) {
		this.cedulaConductor = cedulaConductor;
	}

	@Override
	public String toString() {
		return "Nombre del Conductor: " + nombreConductor + "\nCédula del Conductor: " + cedulaConductor + "\n";
	}

}
