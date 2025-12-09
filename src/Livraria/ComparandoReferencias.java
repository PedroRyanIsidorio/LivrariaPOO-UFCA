package Livraria;

public class ComparandoReferencias {

    public static void main(String[] args){

        Autor autor1 = new Autor();
        autor1.setNome("Luana");
        autor1.setEmail("Luana@gmail.com");
        autor1.setCpf("000.000.000-01");

        Autor autor2 = new Autor();
        autor2.setNome("Luana");
        autor2.setEmail("Luana@gmail.com");
        autor2.setCpf("000.000.000-01");

        Livro livroX = new Livro(autor1);
        //livroX.nome = "nomeLivro";
        livroX.setAutor(autor1);
        livroX.getAutores().setNome("test");

        livroX.mostrarDetalhes();

        System.out.println("///Debugger///");
        System.out.println(autor1);
        System.out.println(autor2);
    }
}
