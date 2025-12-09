package Livraria;

public class CadastroDeLivros {

    public static void main(String[] args){

        Autor autorZ = new Autor("jose", "jose@gmail.com", "111.444.777-35");

        //autorZ.setCpf("111.444.777-35");
        //autorZ.setEmail("jose@gmail.com");
        //autorZ.setNome("jose");

        Livro livro1 = new Livro(autorZ, "Livro 01", "Recursos da linguagem", 159, 100, "0123456789");

        Livro livro = new Livro(autorZ);
        livro.setNome("livro 01");
        livro.setDescricao("Recursos da linguagem");
        livro.setValor(159);
        livro.setIsbn("0123456789");
        livro.setNumeroPaginas(100);


        livro1.mostrarDetalhes();
        livro.mostrarDetalhes();
        //autor.mostrasDetalhes();
    }
}
