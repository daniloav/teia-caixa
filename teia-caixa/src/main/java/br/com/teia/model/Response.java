package br.com.teia.model;


import java.util.Map;

public class Response {
	
	private boolean palindromo;
	
	
	//private List<CaractereOcorrencia> ocorrencias_caracteres;
	private Map<String, Integer> ocorrencias_caracteres;
	
	public boolean isPalindromo() {
		return palindromo;
	}
	public void setPalindromo(boolean palindromo) {
		this.palindromo = palindromo;
	}
	public Map<String, Integer> getOcorrencias_caracteres() {
        return ocorrencias_caracteres;
    }

    public void setOcorrencias_caracteres(Map<String, Integer> ocorrencias_caracteres) {
        this.ocorrencias_caracteres = ocorrencias_caracteres;
    }
	
	

}
		

	   
