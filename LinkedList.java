import java.util.Objects;

public class LinkedList {
	
	private String nome;
	private int id, prioridade, espera;
	

	public LinkedList(String nome, int id, int espera, int prioridade) {
		this.nome = nome;
		this.setId(id);
		this.setEspera(espera);
		this.setPrioridade(prioridade);
	}

	public int getEspera() {
		return espera;
	}

	public void setEspera(int espera) {
		this.espera = espera;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, id, espera, prioridade);
	}
	
	public boolean equals(LinkedList objeto) {
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (getClass() != objeto.getClass())
			return false;
		LinkedList other = (LinkedList) objeto;
		return Objects.equals(nome, other.nome) && id == other.id && espera == other.espera  && prioridade == other.prioridade; 
	}
	
}
