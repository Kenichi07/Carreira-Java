Este README serve como um guia de referência rápida para os fundamentos da linguagem Java e as convenções de código que regem este projeto back-end.

# ☕ Tipos Primitivos em Java
Tipos primitivos são os blocos de construção fundamentais de dados em Java, definindo o tamanho e o tipo de valores que uma variável pode armazenar.

    Tipo | Descrição | Tamanho(Bytes) | Exemplo
    1. byte | Inteiro muito pequeno. | 1 | byte x = 120;
    2. short | Inteiro pequeno. | 2 | short s = 30000;
    3. int | Inteiro padrão (mais comum). | 4 | int i = 150000;
    4. long | Inteiro longo. | 8 | long l = 9999999999L;
    5. float | Ponto flutuante de precisão simples. | 4 | float f = 3.14f;
    6. double | Ponto flutuante de precisão dupla (padrão). | 8 | double d = 1.618;
    7. char | "Um único caractere Unicode (letras| dígitos| etc.)." | 2 | char c = 'A';
    8. boolean | Valor lógico: true ou false. | 1 | boolean b = true;

# 🧮 Operadores em Java
Java possui diversos operadores utilizados para realizar cálculos, comparações e manipulação de variáveis.

1 - Operadores Aritméticos  
   Usados para realizar operações matemáticas.

    Operador | Nome | Exemplo
    1. + | Adição | a + b 
    2. - | Subtração | a - b
    3. * | Multiplicação | a * b
    4. / | Divisão | a / b
    5. % | Módulo (Resto da divisão) | a % b

2 - Operadores de Atribuição  
   Usados para atribuir valores a variáveis. O mais comum é o =, mas existem operadores compostos para simplificar a escrita.

    Operador | Exemplo | Equivalente a
    1. = | x = 5; | Atribui 5 a x
    2. += | x += 3; | x = x + 3;
    3. -= | x -= 2; | x = x - 2;
    4. *= | x *= 4; | x = x * 4;
    5. /= | x /= 2; | x = x / 2;

3 - Operadores de Incremento e Decremento  
   Usados para aumentar (++) ou diminuir (--) o valor de uma variável em 1.

     Pós-incremento/decremento (i++, i--): O valor é usado primeiro na expressão e depois incrementado/decrementado.  
     Pré-incremento/decremento (++i, --i): O valor é incrementado/decrementado primeiro e depois usado na expressão.

4 - Operadores Relacionais  
  Usados para comparar dois valores, retornando um resultado booleano (true ou false).

    Operador | Descrição
    == | Igual a
    != | Diferente de
    > | Maior que
    < | Menor que
    >= | Maior ou igual a
    <= | Menor ou igual a   

5 - Operadores Lógicos  
   Usados para combinar expressões booleanas ou inverter um resultado booleano.

    Operador | Descrição | Exemplo
    && | E (AND lógico) | (a > 0) && (b < 10) (True se ambos forem true)
    || | OU (OR lógico) | idade < 18 || pontuacao > 70 (True se um for true)
    ! | NÃO (NOT lógico) | ! (idade < 18) (Inverte o resultado)

# 📝 Convenções de Código Java (Padrão Oracle)
A padronização do código é essencial para a leitura e manutenção do projeto. Adotamos as seguintes convenções de nomenclatura:

1 - Nomenclatura (Case Styles)

    Elemento | Convenção | Exemplo
    1. Classes | "PascalCase (Começa com Maiúscula, cada nova palavra Maiúscula)." | "UsuarioService, RelatorioFinanceiro"
    2. Métodos | "camelCase (Começa com minúscula, cada nova palavra Maiúscula)." | "calcularSalario(), atualizarEstoque()"
    3. Variáveis | "camelCase (Começa com minúscula, cada nova palavra Maiúscula)." | "nomeCliente, valorTotal"
    4. Constantes | "SCREAMING_SNAKE_CASE (Todas Maiúsculas, separadas por underscore)." | "MAX_TENTATIVAS, URL_API_PADRAO"
    5. Pacotes | "Minúsculas (separados por ponto, sem CamelCase)." | "com.empresa.servicos, br.proj.modelo"

# ⚙️ Strings e Comentários em Java
  1. 📝 Trabalhando com Strings em Java  
    Em Java, a String não é um tipo primitivo, mas sim uma classe pertencente ao pacote java.lang. Strings são sequências de caracteres e são imutáveis (uma vez criadas, seu conteúdo não pode ser alterado; qualquer modificação resulta em uma nova String).

  1.1 Declaração e Inicialização  
    Existem duas formas principais de criar objetos String:  
    
    1. Usando literais (método mais comum e eficiente):
      String nome = "João Silva";
    2. Usando a palavra-chave new (cria um novo objeto na memória heap):
      String sobrenome = new String("Santos");

  1.2 Concatenação de Strings  
    Para combinar ou juntar Strings, usamos o operador de adição (+) ou o método concat().

    String saudacao = "Olá, ";
    String mensagem = saudacao + nome + "!"; // Usa o operador +
    // ou
    String mensagem2 = saudacao.concat(nome).concat("!");

  2. 💬 Tipos de Comentários em Java  
    Comentários são essenciais para documentar o código e explicar a lógica por trás de implementações complexas. Java suporta três tipos principais de comentários.

    2.1 Comentário de Linha Única
      Sintaxe: Inicia com //.
      Uso: Explicações rápidas, breves notas sobre uma única linha de código, ou para desabilitar uma linha temporariamente.

      // Esta é uma linha de comentário simples
      int contador = 0; // Inicializa a variável com zero

    2.2 Comentário de Múltiplas Linhas
      Sintaxe: Inicia com /* e termina com */.
      Uso: Ideal para descrever blocos de código grandes ou para comentários que ocupam várias linhas.
      /*
      Este bloco de código é responsável
      por processar a lista de usuários
      e filtrá-los por idade mínima.
      */
      for (Usuario user : lista) { ... }

# 🛠️ Palavras-Chave de Declaração e Conversão em Java

1 - 🔑 Palavras-Chave Reservadas para Declaração de Variáveis  
  Palavras-chave são identificadores pré-definidos que possuem um significado específico para o compilador Java. Elas não podem ser usadas como nomes de variáveis, métodos ou classes.

1.1 - Palavras-Chave de Tipos Primitivos (Tipos de Dados)  
  Essas palavras-chave definem o tipo de dado que a variável armazenará e a quantidade de memória que ela ocupará.

    Tipo | Descrição | Exemplo de Declaração
    byte | Inteiro de 8 bits. | byte nivelAcesso = 5;
    short | Inteiro de 16 bits. | short contador = 1000;
    int | Inteiro de 32 bits (padrão). | int idade = 25;
    long | Inteiro de 64 bits. | long populacaoMundial = 8000000000L;
    float | Ponto flutuante de 32 bits. | float preco = 19.99f;
    double | Ponto flutuante de 64 bits (padrão). | double pi = 3.14159;
    boolean | Valor lógico (true ou false). | boolean ativo = true;
    char | Caractere Unicode de 16 bits. | char letra = 'A';

1.2 - Modificadores e Declarações Adicionais  
  Estas palavras-chave modificam a forma como a variável é armazenada, acessada ou utilizada. 

    Palavra-Chave | Uso na Variável | Descrição
    final | final int IDADE_MINIMA = 18; | Declara uma constante. O valor deve ser atribuído uma vez e não pode ser alterado posteriormente.
    static | static int contadorGeral; | Cria uma variável de classe (compartilhada por todas as instâncias).
    transient | transient String senha; | Indica que o campo não deve ser serializado (ignorada durante o salvamento do objeto).
    volatile | volatile boolean flag; | "Indica que a variável pode ser alterada por múltiplas threads simultaneamente, garantindo que o valor seja lido da memória principal."
    var (Java 10+) | "var nome = "Alice"; | "Declara uma variável local onde o tipo é inferido pelo compilador (substitui String ou int, etc., em variáveis locais)."

2 - 🔄 Conversão de Valores (Type Casting)  
  A conversão de valores é o processo de mudar o tipo de dado de uma variável para outro. Em Java, isso pode ser implícito ou explícito.

2.1 - Conversão Implícita (Widening Conversion)  
  Ocorre automaticamente (promovida pelo compilador) quando se move de um tipo menor para um tipo maior, sem risco de perda de dados.

    int meuInteiro = 100;
    double meuDouble = meuInteiro; // Conversão Implícita (int -> double)
    
    // meuDouble agora vale 100.0

2.2 - Conversão Explícita (Narrowing Conversion)  
  Requer um cast manual (colocando o tipo desejado entre parênteses) pois há o risco de perda de dados ou precisão (ex: de double para int).

    double meuDouble = 9.99;
    
    // Conversão Explícita (double -> int):
    // O valor fracionário (.99) será truncado e perdido.
    int meuInteiro = (int) meuDouble;
    
    // meuInteiro agora vale 9

# 💡 Conclusão: Princípios Chave
Tipos de Dados: Use o tipo primitivo mais adequado para economizar memória (ex: int para contagens, double para valores monetários).

Operadores: Entenda a diferença entre == (comparação) e = (atribuição).

Convenção: Siga rigorosamente as convenções de PascalCase (Classes) e camelCase (Métodos/Variáveis) para garantir um código limpo e coeso.

Comentários: Priorize a escrita de código claro, mas use Javadoc para documentar todas as interfaces públicas de métodos e classes, garantindo que a documentação técnica seja sempre gerada e atualizada.

Keywords: Não use palavras-chave como nomes de variáveis. Use a palavra-chave final para definir constantes.

Casting: Use conversão implícita sempre que possível. Use conversão explícita com cautela, pois pode resultar em perda de dados (truncamento) ou, em casos extremos, overflow.


