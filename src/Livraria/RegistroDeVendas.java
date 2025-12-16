package Livraria;

public class RegistroDeVendas {

    public static void main(String[] args){
        Autor autor = new Autor();
        autor.setNome("Ruan");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Java Construct");
        livroFisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java Construct 2");
        ebook.setValor(39.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);

        System.out.println(carrinho.getTotal());
    }
}
