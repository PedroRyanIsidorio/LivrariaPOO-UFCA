package Livraria;

public class AplicarDescontoLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.valor = 100.00;

        System.out.println(livro.valor);
        livro.aplicaDescontoDe(10);
        System.out.println(livro.valor);
    }
}
