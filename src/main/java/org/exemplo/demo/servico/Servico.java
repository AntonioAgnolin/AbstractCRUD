package org.exemplo.demo.servico;

import org.exemplo.demo.abstractcrud.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="servico")
//Representa um serviço no sistema
public class Servico extends AbstractEntity {

    //Descrição do serviço, mapeado para a coluna "descricao_servico" na tabela "servico"
    @Column(name="descricao_servico")
    private String descricaoServico;

    private double preco;

    //Relacionamento muitos-para-um com Funcionario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="funcionario_id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonIgnoreProperties("servicos")
    private Funcionario funcionario;

    //Construtor padrão para a entidade Servico
    public Servico() {
    }

    //Construtor com parâmetros para a entidade Servico
    public Servico(String descricaoServico, double preco, Funcionario funcionario) {
      this.descricaoServico = descricaoServico;
      this.preco = preco;
      this.funcionario = funcionario;
    }

    //Obtém a descrição do serviço
    public String getDescricaoServico() {
      return descricaoServico;
    }

    //Define a descrição do serviço
    public void setDescricaoServico(String descricaoServico) {
      this.descricaoServico = descricaoServico;
    }

    //Obtém o preço do serviço
    public double getPreco() {
      return preco;
    }

    //Define o preço do serviço
    public void setPreco(double preco) {
      this.preco = preco;
    }

    //Obtém o funcionário que fornece o serviço
    public Funcionario getFuncionario() {
      return funcionario;
    }

    //Define o funcionário que fornece o serviço
    public void setFuncionario(Funcionario funcionario) {
      this.funcionario = funcionario;
    }

    @Override
    //Compara este serviço com outro objeto para determinar se eles são iguais
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Servico servico = (Servico) o;
      return Objects.equals(descricaoServico, servico.descricaoServico) && 
      Objects.equals(preco, servico.preco) &&
      Objects.equals(funcionario, servico.funcionario);
    }

    @Override
    //Gera um código hash para o serviço
    public int hashCode() {
      return Objects.hash(descricaoServico, preco, funcionario);
    }
}