package Livraria;

public class CarrinhoDeCompras {

    private double total;

    public CarrinhoDeCompras(){
    }

    public void adiciona(Livro livro){
        System.out.println("Adicionando Livro: "+livro);
        livro.aplicaDescontoDe(5);
        total += livro.getValor();
    }

    public double getTotal(){
        return total;
    }
}
