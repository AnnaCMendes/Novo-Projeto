package org.fatec.ACOVM.controller;

import org.fatec.ACOVM.modelo.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {

	@GetMapping("/cadastrar")
	public String paginaCadastro() {
		return"cadastro";
	}
		
		
		// metodo para receber o que vai ser enviado para a máquina

	@PostMapping("/cadastrar")
	public String paginaCadastro(Pessoa p) {
		System.out.println("Testando meu controle");
		System.out.println("Nome: " + p.getNome());
		
		return "cadastro";

	}

}
