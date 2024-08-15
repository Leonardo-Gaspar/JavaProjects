package Aula_Factory.Exemplo1;

public class FormaFactory {
	public static Forma criar(String tipo) {
		
		if(tipo.equalsIgnoreCase("Circulo")){
			return new Circulo();
		}else if(tipo.equalsIgnoreCase("Quadrado")){
			return new Quadrado();
		}else {
			throw new IllegalArgumentException("Forma inválida: " + tipo);
		}

	}
}
