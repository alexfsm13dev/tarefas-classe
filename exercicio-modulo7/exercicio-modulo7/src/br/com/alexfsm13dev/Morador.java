package br.com.alexfsm13dev;

/**
 * @author alexfsm13dev
 **/

public class Morador {

    // Propriedades do Objeto Morador

    private String nome;
    private int numero;
    private String endereco;
    private String email;
    private int telefone;

    // Métodos do Objeto Morador

    /**
     * @return Retorna o nome do morador cadastrado.
     * @see public String getNome() {}
     * @since version1
     **/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
