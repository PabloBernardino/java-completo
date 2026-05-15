# Sistema de Produto em Java

Projeto simples desenvolvido em Java para praticar os conceitos básicos de Programação Orientada a Objetos (POO).

---

# 📚 Conceitos praticados

- Classes
- Objetos
- Atributos
- Encapsulamento
- private
- Construtor
- Métodos
- Instanciação de objetos
- System.out.println()

---

# 📦 Estrutura do Projeto

```java
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nomeInit, double precoInit, int quantidadeEmEstoqueInit) {

        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;
    }

    public void exibirInformacoes() {

        System.out.println();

        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade disponível em estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {

        Produto pd = new Produto("Airsoft Ponto 40", 6200.60, 10);

        pd.exibirInformacoes();

    }

}
```

---

# 🚀 O que o programa faz?

O sistema:

1. Cria um produto
2. Armazena:
   - nome
   - preço
   - quantidade em estoque
3. Exibe as informações do produto no console

---

# 🖥️ Saída esperada

```text
Nome do produto: Airsoft Ponto 40
Preço do produto: 6200.6
Quantidade disponível em estoque: 10
```

---

# 🎯 Objetivo do exercício

Praticar:

- criação de classes
- criação de objetos
- uso de construtores
- encapsulamento com private
- criação de métodos
- organização do código em POO

---

# 🛠️ Tecnologias utilizadas

- Java
- Sublime Text

---

# 📖 Aprendizados

Durante este exercício foi possível entender:

- como um objeto é criado
- como métodos funcionam
- diferença entre atributos e métodos
- uso do void
- como exibir informações através de métodos
- organização básica de uma classe em Java

---

# 👨‍💻 Autor

Desenvolvido por Pablo Bernardino durante os estudos de Programação Orientada a Objetos em Java.

