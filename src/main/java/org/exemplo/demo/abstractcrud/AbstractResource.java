package org.exemplo.demo.abstractcrud;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//Classe abstrata que define o comportamento básico de um recurso RESTful para qualquer entidade
public abstract class AbstractResource<Entity extends AbstractEntity,Repository extends AbstractRepository<Entity>,
    Service extends AbstractService<Entity,Repository>>{
    private final Service service;

    @Autowired
    //Construtor da classe, injeta automaticamente a dependência do serviço responsável
    public AbstractResource(Service service){
        this.service = service;
    }

    @PostMapping
    //Método para salvar uma nova entidade no sistema
    public ResponseEntity<Entity> save(@RequestBody Entity entity){
        Entity save = service.save(entity);
        if(Objects.nonNull(save)){
            return  ResponseEntity.ok(save);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/{id}")
    //Método para buscar uma entidade por seu ID
    public ResponseEntity<Entity> findById(@PathVariable Long id){
        Entity result = service.findById(id);
        if(Objects.nonNull(result)){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    //Método para buscar todas as entidades no sistema
    public ResponseEntity<List<Entity>> findAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    //Método para atualizar uma entidade existente com base no seu ID
    public ResponseEntity<Entity> update(@RequestBody Entity atualizado, @PathVariable Long id ){
        Entity resultUpdate = service.update(id, atualizado);
        if(Objects.nonNull(resultUpdate)){
            return ResponseEntity.ok(resultUpdate);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    //Método para excluir uma entidade por seu ID
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();

    }
}