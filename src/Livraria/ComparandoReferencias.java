package Livraria;

public class ComparandoReferencias {

    public static void main(String[] args){

        Autor autor1 = new Autor();
        autor1.nome = "Luana batista";
        autor1.email = "Luana@gmail.com";
        autor1.cpf = "000.000.000-01";

        Autor autor2 = new Autor();
        autor2.nome = "Luana batista";
        autor2.email = "Luana@gmail.com";
        autor2.cpf = "000.000.000-01";

        Livro livroX = new Livro();
        livroX.nome = "nomeLivro";
        livroX.autor = autor1;
        livroX.autor.nome = "test";

        livroX.mostrarDetalhes();

        System.out.println("///Debugger///");
        System.out.println(autor1);
        System.out.println(autor2);
    }
}
