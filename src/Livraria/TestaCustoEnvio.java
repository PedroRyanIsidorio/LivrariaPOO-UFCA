package Livraria;

public class TestaCustoEnvio {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Juan");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNumeroPaginas(100);

        System.out.println("o custo de envio foi: "+livroFisico.calcularCustoEnvio());
    }
}
