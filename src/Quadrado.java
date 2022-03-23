
public class Quadrado extends Forma implements FormaGeometrica {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	public Quadrado() {
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String desenhar() {
		return "Desenhando um quadrado de área: " + calcularArea() + " m²";
	}
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
}
