package view;

import javax.swing.JOptionPane;

import controller.HashController;
import models.Números;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		int [] vetor = {30, 23, 17, 12, 76, 58, 98, 58, 24, 36, 92, 17, 75, 74, 78, 78, 0, 11, 67, 17}; 
		
		HashController hc = new HashController(); 
		
		int tamanho = vetor.length; 
		for(int i=0; i<tamanho; i++) {
			Números NM = new Números(); 
			NM.numeros = vetor[i]; 
			hc.adicionarNumero(NM);
		}
		JOptionPane.showMessageDialog(null, "Números inseridos com sucesso!. \nListando Números... ");
		
		hc.listarNumeros(); 
	}
}
