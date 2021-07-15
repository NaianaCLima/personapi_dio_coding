package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import one.digitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController// controlador q sera acessado através do api rest
@RequestMapping("/api/v1/people")// caminho de acesso principal(gerancia pessoa no projeto)
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping//cria um livro
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {//vem uma requisição do tipo pessoa
        return personService.createPerson(person);
    }
}

    /*@GetMapping//mapea um http do tipo get no browser
    public String getBook(){
        return "API Test!";
    }*/


