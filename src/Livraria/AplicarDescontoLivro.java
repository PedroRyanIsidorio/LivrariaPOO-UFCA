package Livraria;

public class AplicarDescontoLivro {

    public static void main(String[] args) {

        Autor autorx = new Autor("ryan", "ryamorays@gmail.com", "111-444-777-35");

        Livro livroX = new Livro(autorx, "Livro 02", "Recursos", 19, 10, "0123492829");
        livroX.setValor(10);

        livroX.mostrarDetalhes();

        System.out.println(livroX.getValor());
        if(livroX.aplicaDescontoDe(10)){
            System.out.println("Desconto aplicado com sucesso");
        }else{
            System.out.println("Desconto nao aplicado");
        }
        System.out.println(livroX.getValor());
    }
}
