# Exemplo de Api Rest com Spring Boot, Mysql, JPA Repository e Docker

Essa API foi construída com base no vídeo [[JAVA] - Construindo uma Api Rest com Spring Boot, Mysql, JPA Repository e fazendo deploy na Docker](https://www.youtube.com/watch?v=HR5Np1HmC7c&t=3s)

Repositório original do vídeo [spring-boot-com-mysql](https://github.com/rodrigorahman/spring-boot-com-mysql)

## Minhas Alterações

Como esse vídeo é de 2020, tive que alterar algumas coisas para funcionar:

- Troquei o `Mysql5` pelo `Mysql8`, pois o `Mysql5` NÃO tem compatibilidade com o novo processador Apple Silicon ARM64.
- No arquivo `docker-compose.yml`, troquei o `links` por `networks`, já que o `links` agora é legado, e porque tava tendo problemas de race condition, ou seja, a aplicação estava rodando antes do banco de dados.
- Ao invés da versão 11 do Java, usei a versão 17

## Dependências

- Spring Web
- Jersey
- MySQL Driver
- Spring Data JPA

## Executando a Aplicação

```shell
mvn clean install -e -X
```

Ao rodar o comando acima, no final irá aparecer um erro de que não foi possível se conectar ao banco de dados, mas sem problemas, pois o comando abaixo criará o banco de dados pra gente:

```shell
docker compose up --build --force-recreate
```
