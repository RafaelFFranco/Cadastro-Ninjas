--Migration para adicionar rank na tabela de ninjas

ALTER TABLE tb_ninjas
ADD COLUMN rank VARCHAR(255);