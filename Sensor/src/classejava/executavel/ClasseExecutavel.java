package classejava.executavel;

import javax.swing.JOptionPane;

import classes.java.Sensor;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
	   Sensor aparelho = new Sensor(); 
	
	    
	String nome = JOptionPane.showInputDialog("Qual o nome do aparelho  : "); 
	
	String tempo = JOptionPane.showInputDialog(" Em Quanto tempo apos o sensor de movimento ser desativado ele devera ser desligado (min)  "); 
	
	
	
	System.out.println(" A(o) " + nome+ " sera desligando em "+ tempo+" minutos" );
	
	}

}