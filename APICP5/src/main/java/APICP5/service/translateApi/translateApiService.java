package APICP5.service.translateApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import APICP5.exception.translateException;

public class translateApiService {
	private static final String BASE_URL = "https://api.funtranslations.com/translate/";
	
	public static String getTranslationInfo(String translation, String texto) throws translateException {
		try {
			URL url = new URL(BASE_URL + translation + ".json" );
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			
			if(connection.getResponseCode() == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder response = new StringBuilder();
				String line;
				
				while((line = reader.readLine()) != null) {
					response.append(line);
				}
				if(response.toString().contains("\"erro\":true")) {
					throw new translateException("Translation not found" + translation + "." + "Try again.");
				}
				
				reader.close();
				connection.disconnect();
				
				return response.toString();
				
			}else {
				throw new translateException("Failed to connect. Error code: " + connection.getResponseCode());
			}
			
		}catch(IOException e) {
			throw new translateException("Error while accessing Translate API: " + e.getMessage(), e);
			
		}
	}
}

