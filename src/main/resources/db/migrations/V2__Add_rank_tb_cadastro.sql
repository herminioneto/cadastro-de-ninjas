-- Migration para adicionar coluna de RANK na tabela de cadastros

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);