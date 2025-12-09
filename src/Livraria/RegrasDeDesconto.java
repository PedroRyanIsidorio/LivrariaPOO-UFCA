package Livraria;

public class RegrasDeDesconto {
    public static void main(String[] args) {

        Livro livroX = new Livro(new Autor());
        livroX.setValor(100);

        System.out.println(livroX.getValor());
        if(livroX.aplicaDescontoDe(10)){
            System.out.println("Desconto aplicado com sucesso");
        }else{
            System.out.println("Desconto nao aplicado");
        }
        System.out.println(livroX.getValor());
    }
}

