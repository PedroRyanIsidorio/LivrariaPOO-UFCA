package Livraria;

public class Autor {

    private String nome;
    private String email;
    private String cpf;

    public Autor(){
        System.out.println("Autor criado com sucesso");
    }

    public Autor(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    void mostrasDetalhes(){
        System.out.println("Nome do autor: "+nome);
        System.out.println("Email: "+email);
        System.out.println("CPF: "+cpf);
        //System.out.println("rpz");
    }
}
