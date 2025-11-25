package Livraria;

public class Livro {
    String nome;
    String descricao;
    double valor;
    int numeroPaginas;
    String isbn;
    Autor autor;
    //double desconto;

    public Livro(){
        System.out.println("Livro criado com sucesso");
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

    void aplicaDescontoDe(double descontoPorcento){
        valor-= valor*(descontoPorcento/100);
    }
}
