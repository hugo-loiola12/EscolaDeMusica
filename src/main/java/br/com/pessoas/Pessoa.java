package br.com.pessoas;

public class Pessoa {

    // Atributos privados da classe 'Pessoa', representando as informações pessoais.
    // Estes atributos armazenam o nome, o endereço e a idade de uma pessoa.
    private String nome;       // Nome da pessoa.
    private String endereco;   // Endereço da pessoa.
    private int idade;         // Idade da pessoa.

    // Construtor da classe 'Pessoa'. Ele recebe três parâmetros: nome, endereço e idade,
    // e inicializa os atributos da classe com os valores passados como argumento.
    public Pessoa(String nome, String endereco, int idade) {
        super();  // Chama o construtor da classe pai (Object), que é implícito para todas as classes Java.
        this.nome = nome;          // Atribui o valor do parâmetro 'nome' ao atributo 'nome'.
        this.endereco = endereco;  // Atribui o valor do parâmetro 'endereco' ao atributo 'endereco'.
        this.idade = idade;        // Atribui o valor do parâmetro 'idade' ao atributo 'idade'.
    }

    // Método getter para o atributo 'nome'. Retorna o valor armazenado no atributo 'nome'.
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo 'nome'. Permite modificar o valor do atributo 'nome'.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo 'endereco'. Retorna o valor armazenado no atributo 'endereco'.
    public String getEndereco() {
        return endereco;
    }

    // Método setter para o atributo 'endereco'. Permite modificar o valor do atributo 'endereco'.
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método getter para o atributo 'idade'. Retorna o valor armazenado no atributo 'idade'.
    public int getIdade() {
        return idade;
    }

    // Método setter para o atributo 'idade'. Permite modificar o valor do atributo 'idade'.
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

