package co.edu.unbosque.model;

public class BicicletaDTO extends Vehículo {
	private boolean tieneCambios;
	private String color;
	private String tipo;
	private String material;
	private String tipoSuspension;

	public BicicletaDTO() {
		// TODO Auto-generated constructor stub
	}

	public BicicletaDTO(boolean tieneCambios, String color, String tipo, String material, String tipoSuspension) {
		super();
		this.tieneCambios = tieneCambios;
		this.color = color;
		this.tipo = tipo;
		this.material = material;
		this.tipoSuspension = tipoSuspension;
	}

	public BicicletaDTO(String nombreConductor, long cedulaConductor, boolean tieneCambios, String color, String tipo,
			String material, String tipoSuspension) {
		super(nombreConductor, cedulaConductor);
		this.tieneCambios = tieneCambios;
		this.color = color;
		this.tipo = tipo;
		this.material = material;
		this.tipoSuspension = tipoSuspension;
	}

	public BicicletaDTO(String nombreConductor, long cedulaConductor) {
		super(nombreConductor, cedulaConductor);
		// TODO Auto-generated constructor stub
	}

	public boolean isTieneCambios() {
		return tieneCambios;
	}

	public void setTieneCambios(boolean tieneCambios) {
		this.tieneCambios = tieneCambios;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipoSuspension() {
		return tipoSuspension;
	}

	public void setTipoSuspension(String tipoSuspension) {
		this.tipoSuspension = tipoSuspension;
	}

	@Override
	public String toString() {
		return super.toString() + "¿Tiene Cambios? " + tieneCambios + "\nColor: " + color + "\nTipo: " + tipo
				+ "\nMaterial: " + material + "\nTipo de Suspensión: " + tipoSuspension + "\n";
	}

}
