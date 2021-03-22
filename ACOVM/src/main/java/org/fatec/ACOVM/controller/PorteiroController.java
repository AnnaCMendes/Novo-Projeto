package org.fatec.ACOVM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//annotation (orientação a aspecto)  - funciona como uma etiqueta

@Controller 
public class PorteiroController {
	
	// sempre necessário apontar uma rota para o GetMapping 
	// Qual o caminho raiz de qualquer aplicação web? /
	// a raiz da aplicação web é o / 
	// primeira pagina que será aberta quando acessar o site, será essa abaixo.
	
	@GetMapping("/") 
	// metodo responsavel por responder  
	
	
	public String paginaInicial() {
		// metodo de devolver a página ao cliente por meio de uma String
		// ou fazendo o retorno com um metodo chamado modelandview
		return "index";
		
	}
}
