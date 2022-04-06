import estado.Estado;

public class Prenda {
	String tipoPrenda;
	Integer precio;
	Estado estado;
	
	public Integer precioFinal() {
		return estado.modificarPrecio(precio);
	}
}
