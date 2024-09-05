package org.exemplo.demo.abstractcrud;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
//Classe abstrata que serve como base para todas as entidades do sistema
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Obtém o valor do campo ID da entidade
    public Long getId() {
        return id;
    }

    //Define o valor do campo ID da entidade
    public void setId(Long id) {
        this.id = id;
    }
}