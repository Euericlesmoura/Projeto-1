INSERT INTO ECOMMERCE.CLIENTE (NOME_COMPLETO, EMAIL, SENHA, TELEFONE, DATA_CADASTRO) 
VALUES
('ANA PAULA RIBEIRO', 'ANA.RIBEIRO@EXAMPLE.COM', 'SENHA123', '(11) 98765-4321', '2024-05-10'),
('BRUNO HENRIQUE SILVA', 'BRUNO.SILVA@EXAMPLE.COM', 'ABC@1234', '(21) 99876-5432', '2023-12-01'),
('CARLA MENDES LIMA', 'CARLA.LIMA@EXAMPLE.COM', 'CARLA2024', '(31) 91234-5678', '2025-01-15'),
('DIEGO SANTOS OLIVEIRA', 'DIEGO.OLIVEIRA@EXAMPLE.COM', 'DIEG0!2023', '(41) 93456-7890', '2023-11-20'),
('ELAINE SOUZA FERREIRA', 'ELAINE.FERREIRA@EXAMPLE.COM', 'EFERREIRA!', '(51) 97654-3210', '2024-02-25'),
('FÁBIO CASTRO MENEZES', 'FABIO.MENEZES@EXAMPLE.COM', 'FABI0CASTRO', '(61) 98712-3456', '2025-04-10'),
('GISELE ROCHA NOGUEIRA', 'GISELE.NOGUEIRA@EXAMPLE.COM', 'GISELE#2023', '(71) 91234-9876', '2023-10-05'),
('HENRIQUE LIMA DUARTE', 'HENRIQUE.DUARTE@EXAMPLE.COM', 'HDUARTE22', '(81) 99887-6655', '2024-08-18'),
('ISADORA MARTINS COSTA', 'ISADORA.COSTA@EXAMPLE.COM', 'ISAMAR123', '(91) 97654-8877', '2025-03-30'),
('JOÃO PEDRO ALMEIDA', 'JOAO.ALMEIDA@EXAMPLE.COM', 'JP_ALMEIDA!', '(31) 93456-7788', '2024-06-22'),
('LUCAS ALMEIDA PEREIRA', 'LUCAS.PEREIRA@EXAMPLE.COM', 'LUCASP@123', '(11) 91234-5678', '2024-07-10 10:30:00'),
('MARIANA SILVA COSTA', 'MARIANA.COSTA@EXAMPLE.COM', 'MARIANA!456', '(21) 99876-4321', '2023-09-15 14:45:00'),
('PEDRO HENRIQUE SOUZA', 'PEDRO.SOUZA@EXAMPLE.COM', 'PEDRO789', '(31) 93456-1234', '2025-02-20 09:10:00'),
('AMANDA OLIVEIRA ROCHA', 'AMANDA.ROCHA@EXAMPLE.COM', 'AMANDA@2024', '(41) 98765-4321', '2023-11-05 18:20:00'),
('FELIPE SANTOS LIMA', 'FELIPE.LIMA@EXAMPLE.COM', 'FELIPE#321', '(51) 97654-2109', '2024-03-25 07:50:00'),
('BIANCA MARTINS NUNES', 'BIANCA.NUNES@EXAMPLE.COM', 'BIANCA$2023', '(61) 99887-6543', '2025-05-15 13:40:00'),
('GUSTAVO ROCHA MENDES', 'GUSTAVO.MENDES@EXAMPLE.COM', 'GUSTAVO999', '(71) 91234-8765', '2023-10-10 12:05:00'),
('JULIANA CASTRO FERNANDES', 'JULIANA.FERNANDES@EXAMPLE.COM', 'JULIANA@789', '(81) 98765-4320', '2024-08-18 15:55:00'),
('RENATO CARVALHO ALVES', 'RENATO.ALVES@EXAMPLE.COM', 'RENATO#111', '(91) 97654-4433', '2025-01-30 10:15:00'),
('SABRINA LIMA TORRES', 'SABRINA.TORRES@EXAMPLE.COM', 'SABRINA123', '(31) 93456-7788', '2024-06-22 16:45:00');

INSERT INTO ecommerce.categoria (nome_categoria, descricao) 
VALUES
('Eletrônicos', 'Produtos eletrônicos como celulares, computadores e acessórios.'),
('Moda', 'Roupas, calçados e acessórios de moda para todas as idades.'),
('Beleza', 'Produtos de cuidados pessoais, maquiagem e cosméticos.'),
('Alimentos', 'Produtos alimentícios frescos, congelados e enlatados.'),
('Móveis', 'Móveis para casa, escritório e decoração.'),
('Esportes', 'Equipamentos e acessórios esportivos para diversas modalidades.'),
('Brinquedos', 'Brinquedos e jogos para crianças de várias idades.'),
('Livros', 'Livros de diversos gêneros e para todas as idades.'),
('Automotivo', 'Peças, acessórios e produtos para veículos automotores.'),
('Informática', 'Computadores, periféricos, softwares e acessórios.'),
('Jardinagem', 'Ferramentas e produtos para jardinagem e paisagismo.'),
('Saúde', 'Produtos para saúde, bem-estar e cuidados médicos.'),
('Casa e Cozinha', 'Utensílios domésticos, eletrodomésticos e artigos para cozinha.'),
('Papelaria', 'Materiais de escritório, escolar e papelaria em geral.'),
('Telefonia', 'Aparelhos telefônicos, smartphones e acessórios relacionados.');

SELECT * FROM ECOMMERCE.CATEGORIA

INSERT INTO ecommerce.produto	(id_categoria, nome_produto, descricao, preco, estoque_disponivel)
VALUES
(6, 'Bola de Basquete Profissional', 'Bola de basquete em couro sintético, ideal para quadras indoor e outdoor.', 139.90, 75),
(6, 'Camisa Esportiva Dry-Fit', 'Camisa dry-fit com tecnologia de absorção de suor, ideal para treinos.', 59.90, 150),
(6, 'Halter Emborrachado 10kg', 'Par de halteres emborrachados com pegada anatômica.', 189.00, 40),
(6, 'Garrafa Térmica 1L', 'Garrafa térmica esportiva com isolamento térmico de até 12 horas.', 79.50, 200),
(6, 'Bicicleta Speed Aro 700', 'Bicicleta speed com quadro de alumínio e 21 marchas.', 1999.00, 20),

(1, 'Smartphone Android 128GB', 'Smartphone com tela AMOLED 6.5", câmera tripla e 128GB de armazenamento.', 1799.00, 50),
(1, 'Notebook i5 8GB RAM 256GB SSD', 'Notebook com processador Intel i5, 8GB de RAM e SSD de 256GB.', 3299.00, 30),
(1, 'Fone de Ouvido Bluetooth', 'Fone sem fio com cancelamento de ruído e estojo carregador.', 249.90, 100),
(1, 'Smart TV 50" 4K', 'Smart TV com resolução 4K UHD, Wi-Fi integrado e aplicativos embarcados.', 2599.00, 25),
(1, 'Carregador Turbo USB-C 30W', 'Carregador rápido com tecnologia Power Delivery e entrada USB-C.', 89.90, 150),

(2, 'Jaqueta Jeans Oversized', 'Jaqueta jeans com corte oversized, estilo urbano e bolsos frontais.', 199.90, 40),
(2, 'Tênis Branco Casual', 'Tênis casual unissex em couro sintético com solado emborrachado.', 149.90, 75),
(2, 'Vestido Midi Estampado', 'Vestido midi com estampa floral, alças finas e tecido leve.', 179.00, 50),
(2, 'Camisa Social Slim Fit', 'Camisa social masculina com corte slim e tecido de algodão.', 129.90, 60),
(2, 'Bolsa Feminina Transversal', 'Bolsa transversal pequena com alça ajustável e fecho magnético.', 89.90, 90),

(3, 'Creme Hidratante Corporal', 'Hidratante corporal com manteiga de karité e rápida absorção.', 34.90, 120),
(3, 'Shampoo Nutritivo 300ml', 'Shampoo com óleo de argan, ideal para cabelos secos e danificados.', 29.90, 100),
(3, 'Paleta de Sombras Nude', 'Paleta com 12 cores neutras de longa duração e alta pigmentação.', 59.90, 80),
(3, 'Perfume Feminino Eau de Parfum 50ml', 'Fragrância floral frutada com notas de baunilha e jasmim.', 149.90, 60),
(3, 'Protetor Solar FPS 50', 'Protetor solar facial com toque seco e alta proteção UVA/UVB.', 42.50, 150),

(4, 'Arroz Integral 1kg', 'Arroz integral orgânico, fonte de fibras e ideal para dietas saudáveis.', 7.90, 200),
(4, 'Feijão Preto 1kg', 'Feijão preto selecionado, ideal para preparo de feijoada e pratos típicos.', 8.50, 180),
(4, 'Óleo de Coco 500ml', 'Óleo de coco extra virgem, prensado a frio, ideal para culinária e uso natural.', 22.90, 90),
(4, 'Granola com Castanhas 250g', 'Granola crocante com castanhas e frutas secas, rica em fibras.', 14.90, 120),
(4, 'Biscoito Integral de Aveia 150g', 'Biscoito integral com aveia e mel, sem adição de açúcar.', 5.99, 150),

(7, 'Carrinho de Controle Remoto', 'Carrinho elétrico com controle remoto, alcance de 30 metros.', 149.90, 50),
(7, 'Quebra-Cabeça 500 Peças', 'Quebra-cabeça colorido com 500 peças, para todas as idades.', 59.90, 80),
(7, 'Boneca Barbie Fashion', 'Boneca Barbie com roupas fashion e acessórios variados.', 89.90, 70),
(7, 'Blocos de Montar 200 Peças', 'Conjunto de blocos de montar para estimular a criatividade.', 79.90, 100),
(7, 'Jogo de Tabuleiro Estratégia', 'Jogo de tabuleiro para 2 a 4 jogadores, com foco em estratégia.', 99.90, 40),

(13, 'Conjunto de Panelas Antiaderentes 5 peças', 'Conjunto completo de panelas antiaderentes, com revestimento durável.', 299.90, 40),
(13, 'Jogo de Talheres 24 peças', 'Jogo de talheres em aço inox, design moderno e resistente.', 149.90, 60),
(13, 'Batedeira Elétrica 500W', 'Batedeira com múltiplas velocidades e tigela de aço inox.', 349.90, 25),
(13, 'Cafeteira Elétrica 12 xícaras', 'Cafeteira elétrica com filtro removível e desligamento automático.', 199.90, 30),
(13, 'Liquidificador 750W', 'Liquidificador potente com copo de vidro e várias velocidades.', 259.90, 50),
(13, 'Espremedor de Frutas Manual', 'Espremedor manual prático para limões, laranjas e outras frutas.', 39.90, 100),
(13, 'Jogo de Potes Herméticos 6 peças', 'Conjunto de potes herméticos para armazenamento de alimentos.', 79.90, 80),
(13, 'Faqueiro Inox 48 peças', 'Faqueiro completo em inox, com design elegante e resistente.', 399.90, 20),
(13, 'Panela de Pressão 4 litros', 'Panela de pressão com sistema de segurança e cabo ergonômico.', 179.90, 35),
(13, 'Toalha de Mesa Retangular 1,5m', 'Toalha de mesa em tecido resistente, com estampa clássica.', 59.90, 90),

(8, 'A Arte da Guerra', 'Livro clássico de estratégia militar escrito por Sun Tzu.', 39.90, 120),
(8, 'Dom Casmurro', 'Romance de Machado de Assis sobre amor e ciúmes.', 29.90, 100),
(8, 'O Pequeno Príncipe', 'História poética de Antoine de Saint-Exupéry, para todas as idades.', 34.90, 150),
(8, '1984', 'Distopia de George Orwell que aborda temas de vigilância e controle.', 44.90, 90),
(8, 'A Revolução dos Bichos', 'Fábula política de George Orwell sobre regimes totalitários.', 39.90, 80),
(8, 'Harry Potter e a Pedra Filosofal', 'Primeiro livro da saga do jovem bruxo Harry Potter.', 49.90, 200),
(8, 'O Senhor dos Anéis: A Sociedade do Anel', 'Livro de fantasia épica de J.R.R. Tolkien.', 59.90, 70),
(8, 'Sapiens: Uma Breve História da Humanidade', 'Livro de Yuval Noah Harari que traça a evolução da humanidade.', 69.90, 60),
(8, 'A Menina que Roubava Livros', 'Romance de Markus Zusak sobre a vida durante a Segunda Guerra Mundial.', 39.90, 110),
(8, 'O Alquimista', 'Romance de Paulo Coelho sobre busca e autoconhecimento.', 29.90, 130);

SELECT * FROM ECOMMERCE.CLIENTE

INSERT INTO ecommerce.endereco_de_entrega (id_cliente, logradouro, numero, complemento, bairro, cidade, estado, cep) 
VALUES
(1, 'Rua das Flores', 123, 'Apto 101', 'Jardim Primavera', 'São Paulo', 'SP', '01001-000'),
(2, 'Avenida Brasil', 456, 'Casa', 'Centro', 'Rio de Janeiro', 'RJ', '20010-020'),
(3, 'Travessa da Paz', 789, '', 'Vila Nova', 'Belo Horizonte', 'MG', '30120-030'),
(4, 'Rua das Palmeiras', 321, 'Bloco B', 'Centro', 'Curitiba', 'PR', '80020-040'),
(5, 'Alameda Santos', 654, 'Sala 5', 'Jardins', 'São Paulo', 'SP', '01419-001'),
(6, 'Praça Sete', 987, '', 'Centro', 'Belo Horizonte', 'MG', '30110-050'),
(7, 'Rua das Acácias', 135, 'Casa', 'Vila Mariana', 'São Paulo', 'SP', '04110-060'),
(8, 'Avenida Atlântica', 246, 'Apto 502', 'Copacabana', 'Rio de Janeiro', 'RJ', '22070-070'),
(9, 'Rua das Orquídeas', 357, '', 'Jardim América', 'São Paulo', 'SP', '01449-080'),
(10, 'Travessa dos Jasmins', 468, 'Apto 201', 'Centro', 'Fortaleza', 'CE', '60010-090'),
(11, 'Rua das Hortênsias', 579, '', 'Lourdes', 'Belo Horizonte', 'MG', '30140-100'),
(12, 'Avenida dos Bandeirantes', 680, 'Bloco C', 'Moema', 'São Paulo', 'SP', '04532-110'),
(13, 'Rua do Sol', 791, '', 'Centro', 'Porto Alegre', 'RS', '90010-120'),
(14, 'Rua das Rosas', 802, 'Casa', 'Jardim Botânico', 'Curitiba', 'PR', '80210-130'),
(15, 'Avenida Paulista', 913, 'Sala 101', 'Bela Vista', 'São Paulo', 'SP', '01311-140'),
(16, 'Rua do Comércio', 124, '', 'Centro', 'Recife', 'PE', '50010-150'),
(17, 'Rua da Praia', 235, 'Apto 303', 'Boa Viagem', 'Recife', 'PE', '51020-160'),
(18, 'Travessa do Carmo', 346, '', 'Centro', 'Salvador', 'BA', '40010-170'),
(19, 'Rua das Laranjeiras', 457, 'Casa', 'Laranjeiras', 'Rio de Janeiro', 'RJ', '22240-180'),
(20, 'Avenida Ipiranga', 568, '', 'Centro', 'Porto Alegre', 'RS', '90020-190');

