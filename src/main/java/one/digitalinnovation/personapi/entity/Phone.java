package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data // insere get e set pelo lombok
@Builder//construção de objetos
@AllArgsConstructor//insere o construtor c objetos
@NoArgsConstructor// construtor vazio eu acho
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)//define como string o q foi criado la na class enum PhoneType
    @Column(nullable = false)//criando como notnull no BD
    private PhoneType type;

    @Column(nullable = false, unique = true)
    private String number;


}
