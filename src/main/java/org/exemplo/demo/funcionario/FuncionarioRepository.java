package org.exemplo.demo.funcionario;

import org.springframework.stereotype.Repository;
import org.exemplo.demo.abstractcrud.AbstractRepository;
import org.exemplo.demo.funcionario.Funcionario;

@Repository
//Repositório que fornece acesso ao armazenamento de dados para a entidade Funcionario
public interface FuncionarioRepository extends AbstractRepository<Funcionario> {

}