-- Criação da tabela
CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    quantidade INT
);

-- Inserção de dados
INSERT INTO produto (nome, quantidade) VALUES ('Produto 1', 10);
INSERT INTO produto (nome, quantidade) VALUES ('Produto 2', 20);
