import java.util.List;

public abstract class Venta {
	public List<Prenda> prendasSeleccionadas;
	public String fecha;
	
	public String getFecha() {
		return fecha;
	}
	public Integer precioPrendas() {
		return prendasSeleccionadas.stream()
				.mapToInt(prenda->prenda.precioFinal())
				.sum();
	}
	public Integer precioTotal() {
		return this.precioPrendas() + this.recargo();
				
	}
	abstract public Integer recargo();
	
}
