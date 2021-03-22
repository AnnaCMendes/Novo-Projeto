package org.fatec.ACOVM;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AcovmApplication.class);
	}

}


//essa programação faz o start da aplicação WEB. 
//Ele realiza o start do Servlet. 