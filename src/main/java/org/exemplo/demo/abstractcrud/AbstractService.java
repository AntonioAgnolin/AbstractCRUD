package org.exemplo.demo.abstractcrud;

import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

//Classe abstrata que fornece a implementação básica dos serviços de CRUD
public abstract class AbstractService<Entity extends AbstractEntity, Repository extends AbstractRepository<Entity>> {
    private final Repository repository;
    private final EntityManager em;

    @Autowired
    //Construtor da classe, injeta automaticamente as dependências do repositório
    public AbstractService(Repository repository, EntityManager em) {
        this.repository = repository;
        this.em = em;
    }

    //Salva uma nova entidade no repositório
    public Entity save(Entity entity){
        return repository.save(entity);
    }

    //Encontra uma entidade pelo seu ID
    public Entity findById(Long id){
        return repository.findById(id).orElse(null);
    }

    //Exclui uma entidade pelo seu ID
    public void deleteById(Long id){
        repository.deleteById(id);
    }

    //Retorna uma lista de todas as entidades
    public List<Entity> getAll(){
        return repository.findAll();
    }

    //Atualiza uma entidade existente com novos dados
    public Entity update(Long id, Entity entity){
        Optional<Entity> entityOptional = repository.findById(id);
        if(entityOptional.isPresent()){
            Entity entityPresent = entityOptional.get();
            em.detach(entityPresent);
            BeanUtils.copyProperties(entity,entityPresent);
            return repository.save(entityPresent);
        }
        return null;
    }
}