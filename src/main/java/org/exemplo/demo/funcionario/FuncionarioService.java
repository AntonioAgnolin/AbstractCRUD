package org.exemplo.demo.funcionario;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.exemplo.demo.funcionario.Funcionario;
import org.exemplo.demo.funcionario.FuncionarioRepository;
import org.exemplo.demo.abstractcrud.AbstractService;

@Service
//Serviço que fornece operações de negócios específicas para a entidade Funcionario
public class FuncionarioService extends AbstractService<Funcionario, FuncionarioRepository> {

    //Construtor do serviço que injeta o repositório e o gerenciador de entidades
    public FuncionarioService(FuncionarioRepository repository, EntityManager em) {
        super(repository, em);
    }
}