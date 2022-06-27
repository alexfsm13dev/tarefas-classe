package br.com.alexfsm13dev;

public class Programa1 {

    public static void main(String[] args) {

        Morador morador1 = new Morador();
        morador1.setNome("Alex");
        morador1.setNumero(13);
        morador1.setEndereco("Rua Teste 01");
        morador1.setEmail("alex@gmail.com");
        morador1.setTelefone(999999999);

        System.out.println("Nome: " + morador1.getNome());
        System.out.println("Numero: " + morador1.getNumero());
        System.out.println("Endereco: " + morador1.getEndereco());
        System.out.println("E-mail: " + morador1.getEmail());
        System.out.println("Telefone: "+ morador1.getTelefone());

    }

}
