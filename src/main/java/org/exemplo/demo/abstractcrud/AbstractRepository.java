package org.exemplo.demo.abstractcrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
//Interface genérica de repositório para todas as entidades que estendem
public interface AbstractRepository <T extends AbstractEntity> extends JpaRepository<T, Long > {

}