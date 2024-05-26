package controller;

import model.Lista;
import models.Números;

public class HashController {
	
	Lista [] tabelaNumeros; 
	
	public HashController() {
		tabelaNumeros = new Lista[10]; 
		inicializarLista(); 
	}
	
	public void inicializarLista() {
		int tamanho = tabelaNumeros.length; 
		for(int i=0; i<tamanho; i++) {
			tabelaNumeros[i]= new Lista(); 
		}
	}
	
	public void adicionarNumero(Números nu) {
		int posicao = nu.hashCode(); 
		tabelaNumeros[posicao].addFirst(nu);
	}
	
	public void listarNumeros() throws Exception {
		int tamanho = tabelaNumeros.length; 
		for(int i=0; i<tamanho; i++) {
			int tamanho2 = tabelaNumeros[i].size(); 
			for(int j=0; j<tamanho2; j++) {
				Números NM = (Números) tabelaNumeros[i].get(j); 
				System.out.println("Índice: " + i + " Número: "+ NM.GetNumero());
			}
		}
		
	}
	
}
