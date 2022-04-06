package estado;

public class Promocion implements Estado{
	public Integer descuentoFijo;
	
	public Integer modificarPrecio(Integer precioOriginal) {
		return precioOriginal-descuentoFijo;
	}
}
