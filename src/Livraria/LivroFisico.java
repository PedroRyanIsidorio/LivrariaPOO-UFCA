package Livraria;

public class LivroFisico extends Livro {

    private String tipoCapa;


    public LivroFisico(Autor autor){
        super(autor);
    }
    public LivroFisico(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn, String tipoCapa){
        super(autor, nome, descricao, valor, numeroPaginas, isbn);
        this.tipoCapa = tipoCapa;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Tipo capa: "+tipoCapa);
    }

    public double calcularCustoEnvio(){
        double custoPorPagina = 0.08;
        double custoEnvio = custoPorPagina * this.getNumeroPaginas();

        return custoEnvio;
    }
}
