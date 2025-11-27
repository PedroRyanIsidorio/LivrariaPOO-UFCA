package Livraria;

import java.util.Set;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    int numeroPaginas;
    private String isbn;
    private Autor autor;
    //double desconto;

    public Livro(){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.autor = autor;
        System.out.println("Livro criado com sucesso");
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutores(){
        return autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }




    void mostrarDetalhes(){
        System.out.println("Nome: "+nome);
        System.out.println("Descricao: "+descricao);

        /*
        if(temDesconto()){
            System.out.println("Valor com desconto: "+desconto);
        }else{
            System.out.println("Valor normal: "+valor);
        }
         */

        System.out.println("Valor normal: "+valor);
        System.out.println("Nome: "+numeroPaginas);
        System.out.println("Nome: "+isbn);
        if(temAutor()){
            System.out.println("///// autor /////");
            autor.mostrasDetalhes();
        }
    }

    boolean temAutor(){
        return autor != null;
    }

    public boolean aplicaDescontoDe(double descontoPorcento){
        if(descontoPorcento<=30 && descontoPorcento>=0){
            valor-= valor*(descontoPorcento/100);
            return true;
        }
        return false;
    }
}
