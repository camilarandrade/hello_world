package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo-controller")
public class objetivoController {
	@GetMapping
	public List<String> listaObjetivos() {
        return Arrays.asList(
                "Estudar mais sobre Spring Boot",
                "Estudar mais sobre API Rest",
                "Praticar mais e fazer exercicíos",
                "Pedir ajuda a um amigo caso sinta muita dificuldade"
                
                );
	}
}