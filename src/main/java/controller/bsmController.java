package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-controller")
public class bsmController {
	@GetMapping
	public String bsm(){
		
		return"Mentalidades:\r\n"
				+ "⁠Responsabilidade pessoal\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "⁠Orientação ao futuro\r\n"
				+ "⁠Persistência \r\n"
				+ "\r\n"
				+ "Competências comportamentais:\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+"Orientação ao detalhe\r\n"
				+"Trabalho em equipe\r\n";
	}
}
	

