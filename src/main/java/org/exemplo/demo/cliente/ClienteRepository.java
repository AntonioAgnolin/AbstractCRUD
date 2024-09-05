package org.exemplo.demo.cliente;

import org.springframework.stereotype.Repository;
import org.exemplo.demo.abstractcrud.AbstractRepository;
import org.exemplo.demo.cliente.Cliente;

@Repository
//Repositório que fornece acesso ao armazenamento de dados para a entidade Cliente
public interface ClienteRepository extends AbstractRepository<Cliente> {

}