# Exercício 02: Gerenciamento de Produtos

## Enunciado
 Desenvolva uma API REST com Spring Boot para gerenciar produtos. O objetivo é praticar mapeamento JPA com tipos numéricos e operações CRUD completas.

## Entidade: Produto
| Atributo | Tipo       | Descrição                                         |
| :---     | :---       | :---                                              |
| id       | Long       | Identificador único (chave primária, auto-gerado) |
| nome     | String     | Nome do produto                                   |
| preco    | BigDecimal | Preço do produto                                  |
| estoque  | Integer    | Quantidade em estoque                             |

## Requisitos
1. Crie uma entidade JPA chamada Produto com os atributos especificados
2. Configure o nome da entidade JPA como Produto
3. Configure o nome da tabela no banco como tb_produto
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /produtos — criar novo produto
* GET /produtos — listar todos os produtos
* GET /produtos/{id} — buscar produto por ID
* DELETE /produtos/{id} — deletar produto por ID

## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
