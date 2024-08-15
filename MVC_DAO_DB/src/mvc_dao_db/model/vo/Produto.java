package mvc_dao_db.model.vo;

public class Produto {
	private int id;
	private String name;
	private float preco;
	

	public Produto(int id, String name, float preco) {
		this.id = id;
		this.name = name;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
