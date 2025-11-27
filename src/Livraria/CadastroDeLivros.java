package Livraria;

public class CadastroDeLivros {

    public static void main(String[] args){

        Autor autorZ = new Autor();
        autorZ.setCpf("111.444.777-35");
        autorZ.setEmail("jose@gmail.com");
        autorZ.setNome("jose");

        Livro livro = new Livro();
        livro.setNome("livro 01");
        livro.setDescricao("Recursos da linguagem");
        livro.setValor(159);
        livro.setIsbn("0123456789");
        livro.setAutor(autorZ);
        livro.setNumeroPaginas(100);

        livro.mostrarDetalhes();
        //autor.mostrasDetalhes();
    }
}
