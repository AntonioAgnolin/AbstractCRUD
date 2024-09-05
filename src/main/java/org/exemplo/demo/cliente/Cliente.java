package org.exemplo.demo.cliente;

import org.exemplo.demo.abstractcrud.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="cliente")
//Representa um cliente no sistema
public class Cliente extends AbstractEntity {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    
    //Construtor padrão da classe
    public Cliente() {
    }

    //Construtor que inicializa os campos obrigatórios da classe
    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    //Obtém o nome do cliente
    public String getNome() {
      return nome;
    }

    //Define o nome do cliente
    public void setNome(String nome) {
      this.nome = nome;
    }

    //Obtém o endereço do cliente
    public String getEndereco() {
      return endereco;
    }
    
    //Define o endereço do cliente
    public void setEndereco(String endereco) {
      this.endereco = endereco;
    }
    
    //Obtém o telefone do cliente
    public String getTelefone() {
      return telefone;
    }
    
    //Define o telefone do cliente
    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }

    //Obtém o CPF do cliente
    public String getCpf() {
      return cpf;
    }
    
    //Define o CPF do cliente
    public void setCpf(String cpf) {
      this.cpf = cpf;
    }

    @Override
    //Compara este cliente com outro objeto para determinar se eles são iguais
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Cliente cliente = (Cliente) o;
      return Objects.equals(nome, cliente.nome) &&
      Objects.equals(endereco, cliente.endereco) &&
      Objects.equals(telefone, cliente.telefone) &&
      Objects.equals(cpf, cliente.cpf);
    }

    @Override
    //Gera um código hash para o cliente
    public int hashCode() {
      return Objects.hash(nome, endereco, telefone, cpf);
    }
}