package models;

import java.util.Objects;

public class Números {
	
	public int numeros; 
	
	public int GetNumero() {
		return numeros; 
	}

	@Override
	public int hashCode() {
		int posição = (int) numeros/10;
		return posição; 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Números other = (Números) obj;
		return numeros == other.numeros;
	}
	
	

}
