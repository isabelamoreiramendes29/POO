# POO — Programação Orientada a Objetos

Exercícios e códigos feitos em aula, em Java.

Cada aula é uma pasta e um projeto do IntelliJ. Dentro de `src/`, cada exercício
fica em sua própria subpasta, com seu próprio `Main` — assim vários exercícios
convivem sem conflito de nomes de classe.

## Conteúdo

| Pasta | Assunto |
|---|---|
| `aula03/` | Estruturas de controle: `switch` com `Scanner` e jogo de adivinhação com `while` e `Random` |
| `aula04/` | Classes e objetos — a classe `Zumbi`, depois `Personagem`/`Arma` e `Piloto`/`Kart`/`Motor` |
| `aula05/` | Arrays |
| `aula06/` | Pacotes |
| `Exercicio1/` | Média de lanches com `Scanner`; e cálculo de aprovado/reprovado por nota |
| `untitled/` | Primeiros testes: Hello World e classe inicial |

### Dentro de `aula04/src/`

| Exercício | Assunto |
|---|---|
| `exercicio01/` | Primeira classe: atributos e métodos (`apresentar`, `andar`, `morder`) |
| `exercicio02/` | Método com parâmetros: transferir vida entre dois zumbis |
| `exercicio03/` | Referências de objetos: o que acontece quando `zumbi1 = zumbi2` |
| `exercicio04/` | Continuação do exercício de referências |

## Como executar

Abra a pasta da aula no IntelliJ IDEA (**File > Open**) e clique no botão de
executar ao lado do `main` do exercício que quiser rodar.

Pelo terminal, a partir da pasta da aula:

```bash
javac -d out src/exercicio01/*.java
java -cp out exercicio01.Main
```

## Sobre a linha `package`

O primeiro comando de cada arquivo é, por exemplo:

```java
package exercicio01;
```

Isso diz ao Java que a classe pertence à subpasta `exercicio01`. O nome do
pacote precisa ser igual ao nome da pasta — se renomear uma, renomeie a outra.
