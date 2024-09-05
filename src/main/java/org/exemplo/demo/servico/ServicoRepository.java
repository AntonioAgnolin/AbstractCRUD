package org.exemplo.demo.servico;

import org.exemplo.demo.servico.servico.Servico;
import org.springframework.stereotype.Repository;
import org.exemplo.demo.abstractcrud.AbstractRepository;

@Repository
//Repositório que fornece acesso ao armazenamento de dados para a entidade Servico
public interface ServicoRepository extends AbstractRepository<Servico> {

}