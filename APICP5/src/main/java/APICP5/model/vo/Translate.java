package APICP5.model.vo;

public class Translate {
	private int id_translate;
	private String texto_translate;
	private String traducao_translate;
	private String lingua_translate;
		
	public Translate(int id_translate, String texto_translate, String traducao_translate, String lingua_translate) {
		this.id_translate = id_translate;
		this.texto_translate = texto_translate;
		this.traducao_translate = traducao_translate;
		this.lingua_translate = lingua_translate;
	}
	@Override
	public String toString() {
		return "Translate [texto=" + texto_translate + ", traducao=" + traducao_translate + ", lingua=" + lingua_translate + "]";
	}
	public String getTexto_translate() {
		return texto_translate;
	}
	public void setTexto_translate(String texto_translate) {
		this.texto_translate = texto_translate;
	}
	public String getTraducao_translate() {
		return traducao_translate;
	}
	public void setTraducao_translate(String traducao_translate) {
		this.traducao_translate = traducao_translate;
	}
	public String getLingua_translate() {
		return lingua_translate;
	}
	public void setLingua_translate(String lingua_translate) {
		this.lingua_translate = lingua_translate;
	}
	public int getId_translate() {
		return id_translate;
	}
	public void setId_translate(int id_translate) {
		this.id_translate = id_translate;
	}	
}
