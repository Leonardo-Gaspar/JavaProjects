package Aula_Factory.Exemplo1;

public class MainForma {
	public static void main(String[] args) {
		Forma circulo = FormaFactory.criar("Circulo");
		Forma quadrado = FormaFactory.criar("Quadrado");
//		Forma retangulo = FormaFactory.criar("Retangulo");
		circulo.desenhar();
		quadrado.desenhar();
//		retangulo.desenhar();
		
	}

}
