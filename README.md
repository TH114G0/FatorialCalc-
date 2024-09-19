# FatorialCalc

**FatorialCalc** é uma aplicação Java para calcular o fatorial de números inteiros positivos. Este projeto demonstra conceitos básicos de programação em Java, como loops, tratamento de exceções e interação com o usuário via terminal.

## Funcionalidades

- **Calcular Fatorial:** Calcula o fatorial de um número inteiro fornecido pelo usuário.
- **Exibição Detalhada:** Mostra o cálculo do fatorial em cada etapa.
- **Validação de Entrada:** Verifica se o valor inserido é um número inteiro não-negativo e solicita um novo valor se necessário.
- **Interação com o Usuário:** Permite ao usuário continuar calculando fatoriais ou sair do programa.

## Como Usar

1. **Executar o Programa:**
   - Compile o código Java com o comando `javac Main.java`.
   - Execute o programa com `java Main`.

2. **Entrada do Usuário:**
   - Quando solicitado, informe um número inteiro não-negativo para calcular o fatorial.
   - O programa exibirá o cálculo passo a passo e o resultado final.

3. **Continuar ou Sair:**
   - Após exibir o resultado, o programa perguntará se você deseja calcular o fatorial de outro número.
   - Digite `S` para continuar ou `N` para sair. Se inserir algo diferente, o programa pedirá para usar apenas `S` ou `N`.

## Exemplo de Uso

5! = 5 × 4 × 3 × 2 × 1 = 120

Fatorial de 5 é: 120

Deseja informar outro valor ? (s/n): N Saindo....


## Requisitos

- Java 8 ou superior.

## Considerações

- **Tratamento de Exceções:** O programa lida com entradas inválidas e números negativos.
- **Uso do Scanner:** O `Scanner` é usado para entrada de dados e deve ser fechado após o uso para liberar recursos.

## Contribuição

Sinta-se à vontade para contribuir com melhorias ou correções. Para isso, faça um fork do repositório e envie pull requests com suas alterações.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

