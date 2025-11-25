package Livraria;

public class CadastroDeLivros {

    public static void main(String[] args){

        Autor autorZ = new Autor();
        autorZ.cpf = "111.444.777-35";
        autorZ.email = "jose@gmail.com";
        autorZ.nome = "jose";

        Livro livro = new Livro();
        livro.nome = "livro 01";
        livro.descricao = "Recursos da linguagem";
        livro.valor = 159.90;
        livro.isbn = "0123456789";
        livro.numeroPaginas = 100;
        livro.autor = autorZ;

        livro.mostrarDetalhes();
        //autor.mostrasDetalhes();
    }
}
