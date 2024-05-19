package FEEDBACK;


public class Feedback {

	private int id;
	private String nomeConsumidor;
	private int idade;
	private String feedbackConsumidor;
	
	
	public Feedback(int iD, String nomeConsumidor, int idade, String feedbackConsumidor) {
		super();
		id = iD;
		this.nomeConsumidor = nomeConsumidor;
		this.idade = idade;
		this.feedbackConsumidor = feedbackConsumidor;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getNomeConsumidor() {
		return nomeConsumidor;
	}
	public void setNomeConsumidor(String nomeConsumidor) {
		this.nomeConsumidor = nomeConsumidor;
	}
	
	public String getFeedbackConsumidor() {
		return feedbackConsumidor;
	}


	public void setFeedbackConsumidor(String feedbackConsumidor) {
		this.feedbackConsumidor = feedbackConsumidor;
	}


	@Override
	public String toString() {
		return "Feedback id=" + id + ", nomeConsumidor=" + nomeConsumidor + ", idade=" + idade
				+ ", feedbackConsumidor=" + feedbackConsumidor + "";
	}


	


	
	
	


	
	
	
}
