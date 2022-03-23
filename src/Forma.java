
public abstract class Forma {

	private String cor;
	private String area;
	
	public Forma() {
	}
	public Forma(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public abstract String desenhar();
}
