package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// controlador q sera acessado através do api rest
@RequestMapping("/api/v1/people")// caminho de acesso principal(gerancia pessoa no projeto)
public class PersonController {

    @GetMapping//mapea um http do tipo get no browser
    public String getBook(){
        return "API Test!";
    }
}
