/*DROP*/

DROP TABLE IF EXISTS CIDADAO CASCADE;
DROP TABLE IF EXISTS COLETOR CASCADE;
DROP TABLE IF EXISTS BAIRRO CASCADE;
DROP TABLE IF EXISTS LIXEIRA CASCADE;
DROP TABLE IF EXISTS STATUS CASCADE;
DROP TABLE IF EXISTS SITUACAO_OPERACIONAL CASCADE;
DROP TABLE IF EXISTS COLETA CASCADE;
DROP TABLE IF EXISTS DESCARTE CASCADE;


/*CREATE*/

CREATE TABLE CIDADAO (
    cod_cidadao SERIAL,
    nome VARCHAR(64),
    senha VARCHAR(16),
    email VARCHAR(64) UNIQUE,
    latitude FLOAT,
    longitude FLOAT,
    CONSTRAINT pk_cidadao PRIMARY KEY(cod_cidadao)
);

CREATE TABLE COLETOR (
    cod_coletor SERIAL,
    placa VARCHAR(8),
    modelo VARCHAR(16),
    marca VARCHAR(16),
    ano INTEGER,
    capacidade FLOAT,
    latitude FLOAT,
    longitude FLOAT,
    CONSTRAINT pk_coletor PRIMARY KEY(cod_coletor)
);

CREATE TABLE BAIRRO (
    cod_bairro SERIAL,
    nome VARCHAR(32) UNIQUE,
    CONSTRAINT pk_bairro PRIMARY KEY(cod_bairro)
);

CREATE TABLE LIXEIRA (
    cod_lixeira SERIAL ,
    cod_bairro INTEGER,
    capacidade FLOAT,
    latitude FLOAT,
    longitude FLOAT,
    nivel_atual FLOAT,
    CONSTRAINT pk_lixeira PRIMARY KEY(cod_lixeira),
    CONSTRAINT fk_bairro_lixeira FOREIGN KEY (cod_bairro) REFERENCES BAIRRO (cod_bairro)
);

CREATE TABLE STATUS (
    cod_status SERIAL,
    descricao VARCHAR(256) UNIQUE,
    CONSTRAINT pk_status PRIMARY KEY(cod_status)
);

CREATE TABLE SITUACAO_OPERACIONAL (
    cod_lixeira INTEGER,
    cod_coletor INTEGER,
    cod_status INTEGER,
    hora_status TIME,
    data_status DATE,
    CONSTRAINT fk_lixeira_situacao_operacioanal FOREIGN KEY (cod_lixeira) REFERENCES LIXEIRA (cod_lixeira),
    CONSTRAINT fk_coletor_situacao_operacioanal FOREIGN KEY (cod_coletor) REFERENCES COLETOR (cod_coletor),
    CONSTRAINT fk_status_situacao_operacioanal FOREIGN KEY (cod_status) REFERENCES STATUS (cod_status)
);

CREATE TABLE COLETA (
    cod_coletor INTEGER,
    cod_lixeira INTEGER,
    volume FLOAT,
    hora_coleta TIME,
    data_coleta DATE,
    CONSTRAINT fk_coletor_coleta FOREIGN KEY (cod_coletor) REFERENCES COLETOR (cod_coletor),
    CONSTRAINT fk_lixeira_coleta FOREIGN KEY (cod_lixeira) REFERENCES LIXEIRA (cod_lixeira)
);

CREATE TABLE DESCARTE (
    cod_cidadao INTEGER,
    cod_lixeira INTEGER,
    volume FLOAT,
    data_descarte DATE,
    hora_descarte TIME,
    CONSTRAINT fk_cidadao_descarte FOREIGN KEY (cod_cidadao) REFERENCES CIDADAO (cod_cidadao),
    CONSTRAINT fk_lixeira_descarte FOREIGN KEY (cod_lixeira) REFERENCES LIXEIRA (cod_lixeira)
);


/*INSERT*/

INSERT INTO BAIRRO  (nome) VALUES 
	('Grande Goiabeiras'),
	('Centro de Vitória'),
	('Colina de Laranjeiras'),
	('Porto de Santana'),
	('Carapina'),
	('Jardim da Penha'),
	('Jardim Camburi'),
	('Manguinhos'),
	('Mata da Praia'),
	('Bento Ferreira');
	
	
INSERT INTO LIXEIRA (cod_bairro, latitude, longitude, capacidade, nivel_atual) VALUES 
    (1,-20.196136,-40.255506,160,90), 
    (2,-20.198243,-40.253086,200,97), 
    (3,-20.198688,-40.258084,235,87), 
    (4,-20.195919,-40.258796,241,77), 
    (5,-20.192521,-40.256842,100,70), 
    (6,-20.193271,-40.252901,50,80), 
    (7,-20.195081,-40.251535,35,86), 
    (8,-20.196941,-40.251623,60,99), 
    (9,-20.196955,-40.251233,120,10), 
    (10,-20.196958,-40.252933,200,50), 
    (10,-20.196928,-40.196928,100,90), 
    (10,-20.196918,-40.196918,120,80), 
    (10,-20.193958,-40.193958,110,50), 
    (10,-20.196958,-40.196958,100,40), 
    (10,-20.196758,-40.196758,160,80), 
    (10,-20.196858,-40.196858,200,90), 
    (10,-20.196998,-40.196998,300,99), 
    (10,-20.192998,-40.192398,200,0), 
    (10,-20.192398,-40.192698,400,0);


INSERT INTO COLETOR (placa, modelo, marca, ano, capacidade, longitude, latitude) VALUES
	('MTR3338','VEGALIX','Mercedes Benz',2016,10000,-40.2555063,-20.1961361),
	('MTV4311','SITA 6000','Volkswagen',2015,10000,-40.2530861,-20.1982403),
	('MQZ8687','VEGALIX','Mercedes Benz',2013,12000,-40.2580835,-20.1986875),
	('MTB1361','EZ PACK','Volvo',2015,15000,-40.2587904,-20.1959193),
	('MSG4883','EZ PACK','Volvo',2013,10000,-40.2568421,-20.1925205),
	('MSZ7251','COLECOM','Scania',2016,12000,-40.2529013,-20.1932706),
	('MRB6206','COLECOM','Scania',2019,10000,-40.2515352,-20.1950812),
	('MRY5351','EZ PACK','Volvo',2019,12000,-40.2516228,-20.1969409),
	('MRF7474','SITA 6000','Volkswagen',2016,12000,-40.2512928,-20.1349409),
	('MSI6750','EZ PACK','Volvo',2018,15000,-40.2006228,-20.1962209);
	
INSERT INTO CIDADAO (nome, email, senha, latitude, longitude) VALUES
	('Livinho Silve','livinho@gmail.com','1231212',-20.0507711,-40.2209473),
	('Maria Joaquina','maria@hotmail.com','1234212',-20.0868885,-40.2703857),
	('Marcelo Paiva','marcelo@hotmail.com','1234512',-20.2003469,-40.2484131),
	('Livia Estrela','livia@hotmail.com','1234412',-20.2621971,-40.3417969),
	('Kellen Andrade','kellen@gmail.com','1231212',-20.3909744,-40.2978516),
	('Maria Luisa','maria123@gmail.com','1234112',-20.2055012,-40.2044678),
	('Lais Laticinio','lala888@hotmail.com','3213412',-20.1745675,-40.3363037),
	('Orides Identico','oi123@gmail.com','4324212',-20.2950455,-40.3054047),
	('Otavio Freitas','oooo111@gmail.com','1112812',-19.2950455,-39.3054029),
	('Daniel Miranda','miranda_d@gmail.com','2234512',-18.2930455,-38.3052043);


INSERT INTO STATUS (descricao) VALUES
	('Quebrada'),
	('Não atende a demanda'),
	('OK');

