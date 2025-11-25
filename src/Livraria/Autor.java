package Livraria;

public class Autor {

    String nome;
    String email;
    String cpf;

    public Autor(){
        System.out.println("Autor criado com sucesso");
    }

    void mostrasDetalhes(){
        System.out.println("Nome do autor: "+nome);
        System.out.println("Email: "+email);
        System.out.println("CPF: "+cpf);
        //System.out.println("rpz");
    }
}
