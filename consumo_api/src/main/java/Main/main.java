package Main;

import java.io.IOException;

import consumo_api.model.Endereco;
import consumo_api.service.ViaCEPService;

public class main {	
	public static void main(String[]args) {
		ViaCEPService viaCepService = new ViaCEPService();
		viaCepService.getEndereco("04437000");
//		try {
//			Endereco endereco = viaCepService.getEndereco("04437000");
//			System.out.println(endereco);
//		}catch(IOException e) {
//			e.printStackTrace();
//			
//		}
		
	}

}
