package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service//gerencia uma class do tipo serviço
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping//cria um livro
    public MessageResponseDTO createPerson(Person person){//vem uma requisição do tipo pessoa
        Person savePerson = personRepository.save(person);//salva a pessoa
        return MessageResponseDTO
                .builder()
                .message("Created person with ID" +savePerson.getId())
                .build();
    }
}
