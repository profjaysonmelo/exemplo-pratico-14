
public class Circulo extends Forma implements FormaGeometrica {

	private double raio;
	private static final double PI = 3.1415;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public String desenhar() {
		return "Desenhando um c�rculo de �rea: " + calcularArea() + " m�";
	}
	
	@Override
	public double calcularArea() {
		return PI * raio * raio;
	}
}
