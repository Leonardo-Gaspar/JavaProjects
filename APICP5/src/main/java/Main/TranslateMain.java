package Main;

import APICP5.exception.translateException;
import APICP5.service.translateApi.translateApiService;

public class TranslateMain {
	public static void main(String[] args) {
		translateApiService translateAPIService = new translateApiService();
		try {
			translateApiService.getTranslationInfo("gungan","You came to my home and I said okay!");
		} catch (translateException e) {
			e.printStackTrace();
		}
	}

}
