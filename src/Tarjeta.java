
public class Tarjeta extends Venta{
	public Double cantidadCuotas;
	public Double coeficiente;
	
	public Integer recargo() {
		Double calculo = cantidadCuotas * coeficiente + this.precioPrendas()/100;
		return calculo.intValue();
	}
}

