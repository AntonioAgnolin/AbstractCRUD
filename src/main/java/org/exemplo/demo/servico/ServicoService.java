package org.exemplo.demo.servico;

import org.exemplo.demo.servico.Servico;
import org.exemplo.demo.servico.ServicoRepository;
import org.exemplo.demo.abstractcrud.AbstractService;
import org.springframework.stereotype.Service;

@Service
//Serviço que fornece operações de negócios específicas para a entidade Servico
public class ServicoService extends AbstractService<Servico, ServicoRepository> {

    //Construtor que injeta o repositório e o gerenciador de entidades
    public ServicoService(ServicoRepository repository, EntityManager em) {
        super(repository, em);
    }
}
