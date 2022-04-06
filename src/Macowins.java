import java.util.ArrayList;
import java.util.List;

public class Macowins {
	public List<Venta> ventasRealizadas = new ArrayList<Venta>();

	public Integer gananciasDelDia(String fecha) {		
		return ventasRealizadas.stream()
				.filter(venta-> venta.getFecha().equals(fecha))
				.mapToInt(venta->venta.precioTotal())
				.sum();
	}

}
