package estado;

public class Liquidacion implements Estado{
	public Integer modificarPrecio(Integer precioOriginal) {
		return precioOriginal/2;
	}
}
