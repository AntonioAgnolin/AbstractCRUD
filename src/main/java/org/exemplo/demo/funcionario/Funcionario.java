package org.exemplo.demo.funcionario;

import org.exemplo.demo.abstractcrud.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="funcionario")
//Representa um funcionário no sistema
public class Funcionario extends AbstractEntity {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    
    //Configuração de mapeamento de relacionamento entre Funcionario e Servico em JPA
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "funcionario", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("funcionario")
    private List<Servico> servicos = new ArrayList<>();

    //Construtor padrão para a entidade Funcionario
    public Funcionario() {
    }

    //Construtor com parâmetros para a entidade Funcionario
    public Funcionario(String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    //Obtém o nome do funcionário
    public String getNome() {
      return nome;
    }
    
    //Define o nome do funcionário
    public void setNome(String nome) {
      this.nome = nome;
    }

    //Obtém o e-mail do funcionário
    public String getEmail() {
      return email;
    }
    
    //Define o e-mail do funcionário
    public void setEmail(String email) {
      this.email = email;
    }

    //Obtém o telefone do funcionário
    public String getTelefone() {
      return telefone;
    }
    
    //Define o telefone do funcionário
    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }
    
    //Obtém o CPF do funcionário
    public String getCpf() {
      return cpf;
    }
    
    //Define o CPF do funcionário
    public void setCpf(String cpf) {
      this.cpf = cpf;
    }

    //Obtém a lista de serviços associados ao funcionário
    public List<Servico> getServicos() {
      return servicos;
    }

    //Define a lista de serviços associados ao funcionário
    public void setServicos(List<Servico> servicos) {
      this.servicos = servicos;
    }

    @Override
    //Compara este funcionário com outro objeto para determinar se eles são iguais
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Funcionario funcionario = (Funcionario) o;
      return Objects.equals(nome, funcionario.nome) &&
      Objects.equals(email, funcionario.email) &&
      Objects.equals(telefone, funcionario.telefone) &&
      Objects.equals(cpf, funcionario.cpf);
    }

    @Override
    //Gera um código hash para o funcionário
    public int hashCode() {
      return Objects.hash(nome, cpf);
    }
}