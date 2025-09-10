
# Desafio Controle de Fluxo

Este projeto foi desenvolvido como parte da formação Java Developer da DIO, para exercitar conceitos de controle de fluxo em Java.

## Objetivo

O sistema recebe dois números inteiros via terminal e imprime uma sequência de números incrementados, conforme a diferença entre eles. Caso o primeiro número seja maior que o segundo, uma exceção customizada (`ParametrosInvalidosException`) é lançada, informando que o segundo parâmetro deve ser maior que o primeiro.

### Exemplo de execução

- Entrada:
  - Primeiro parâmetro: 12
  - Segundo parâmetro: 30
- Saída:
  ```
  Imprimindo o número 12
  Imprimindo o número 13
  ...
  Imprimindo o número 30
  ```

Se o primeiro parâmetro for maior que o segundo:
```
O segundo parâmetro deve ser maior que o primeiro.
```

## Estrutura do Projeto

- `src/Contador.java`: Classe principal, responsável pela lógica de leitura dos parâmetros, validação e impressão dos números.
- `src/ParametrosInvalidosException.java`: Exceção customizada lançada quando os parâmetros são inválidos.

## Como executar

1. **Compile os arquivos Java:**

	Abra o terminal na pasta raiz do projeto e execute:
	```powershell
	javac -d bin src/*.java
	```

2. **Execute o programa:**

	Ainda no terminal, execute:
	```powershell
	java -cp bin Contador
	```

3. **Siga as instruções no terminal:**
	- Digite o primeiro parâmetro (número inteiro)
	- Digite o segundo parâmetro (número inteiro)

## Requisitos
- Java 8 ou superior instalado

---

Projeto criado para fins educacionais, seguindo o desafio proposto pela DIO.
