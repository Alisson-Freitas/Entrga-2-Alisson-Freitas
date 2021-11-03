package classes.java;

public class Sensor {

	String nome;
	  
	  int tempo;
	  

	public Sensor() {
		
	}
	public Sensor (String nomePadrao) {
		nome=nomePadrao; 
		
	}

	 public Sensor (String nomePadrao, int tempoPadrao ) {
		 nome= nomePadrao;
	     tempo = tempoPadrao;  
	 
	 }


	 public void setNome(String nome) {
		 this.nome = nome ; 
	 }
	 
	 public void setIdade(int tempo) {
		 this.tempo = tempo;
	
	
	
}
}