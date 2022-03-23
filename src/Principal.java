/*
 * Utilizando interfaces, implementar a hierarquia de Formas Geom�tricas, 
 * onde cada tipo de forma ( c�rculo, quadrado, tri�ngulo ) 
 * implementa os m�todos da interface;
 */
public class Principal {

	public static void main(String[] args) {
				
		Circulo c = new Circulo();
		c.setRaio(15);
		
		Quadrado q = new Quadrado();
		q.setLado(15);
		q.setCor("AMARELO");
		
		Triangulo t = new Triangulo();
		t.setBase(15);
		t.setAltura(15);
		
		Forma forma = c;
		
		System.out.println(forma.desenhar());
		
		forma = q;
		
		System.out.println(forma.desenhar());
		
		forma = t;
		
		System.out.println(forma.desenhar());
		
	}
}
