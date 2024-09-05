-- Tabela para cadastrar clientes
CREATE TABLE cliente (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    cpf VARCHAR(11) NOT NULL UNIQUE
);

-- Tabela para cadastrar funcionários
CREATE TABLE funcionario (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    cpf VARCHAR(11) NOT NULL UNIQUE
);

-- Tabela para cadastrar serviços de funcionários
CREATE TABLE servico (
    id BIGSERIAL PRIMARY KEY,
    descricao_servico VARCHAR(255) NOT NULL,
    preco NUMERIC(10, 2) NOT NULL,
    funcionario_id BIGINT NOT NULL,
    CONSTRAINT fk_funcionario FOREIGN KEY (funcionario_id) REFERENCES funcionario (id) ON DELETE CASCADE
);
