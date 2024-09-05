package org.exemplo.demo.cliente;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.exemplo.demo.cliente.Cliente;
import org.exemplo.demo.cliente.ClienteRepository;
import org.exemplo.demo.abstractcrud.AbstractService;

@Service
//Serviço que fornece operações de negócios específicas para a entidade Cliente
public class ClienteService extends AbstractService<Cliente, ClienteRepository> {

    //Construtor do serviço que injeta o repositório e o EntityManager
    public ClienteService(ClienteRepository repository, EntityManager em) {
        super(repository, em);
    }
}
