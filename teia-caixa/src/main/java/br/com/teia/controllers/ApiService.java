package br.com.teia.controllers;


import java.util.Map;
import org.springframework.stereotype.Service;


import br.com.teia.model.Response;

import java.util.HashMap;
import java.util.LinkedHashMap;




@Service
public class ApiService {

	
	public Response manipula(Solicitacao solicitacao) {
		
		Response response = new Response();

		String texto = solicitacao.getTexto();
		
	        String textoInvertido = new StringBuilder(texto).reverse().toString();
	        response.setPalindromo(texto.equals(textoInvertido));
	    
	        
	   
	        Map<Character, Integer> ocorrencias = new HashMap<>();
	        for (char c : texto.toCharArray()) {
	            ocorrencias.put(c, ocorrencias.getOrDefault(c, 0) + 1);
	        }

	       
	       
	        Map<String, Integer> ocorrenciasFormatadas = new LinkedHashMap<>();
	        for (Map.Entry<Character, Integer> entry : ocorrencias.entrySet()) {
	            ocorrenciasFormatadas.put(String.valueOf(entry.getKey()), entry.getValue());
	        }

	       
	        response.setOcorrencias_caracteres(ocorrenciasFormatadas);

	        return response; 
	        
	
	
	}


}
