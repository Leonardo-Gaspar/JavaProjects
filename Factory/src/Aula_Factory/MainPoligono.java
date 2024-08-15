package Aula_Factory;

public class MainPoligono {
	public static void main(String[] args) {
		
		System.out.println(PoligonoFactory.getPoligono(0));
		System.out.println(PoligonoFactory.getPoligono(3));
		System.out.println(PoligonoFactory.getPoligono(4));
		System.out.println(PoligonoFactory.getPoligono(5));
		
	}

}
