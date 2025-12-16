package Livraria;

public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor autorY = new Autor();

        Livro livroX = new Livro(autorY);
        livroX.setValor(100);

        System.out.println(livroX.getValor());
        if(livroX.aplicaDescontoDe(30)){
            System.out.println("Desconto aplicado com sucesso");
        }else{
            System.out.println("Desconto nao aplicado");
        }
        System.out.println(livroX.getValor());

        Ebook ebookX = new Ebook(autorY);
        ebookX.setValor(100);

        if(ebookX.aplicaDescontoDe(10)){
            System.out.println("Desconto aplicado com sucesso");
        }else{
            System.out.println("Desconto nao aplicado");
        }

    }
}

