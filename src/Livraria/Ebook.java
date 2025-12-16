package Livraria;

public class Ebook extends Livro{

    private String formato;
    private double tamanhoMB;

    public Ebook(Autor autor){
        super(autor);
    }

    public Ebook(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn, String formato, double tamanhoMB){
        super(autor, nome, descricao, valor, numeroPaginas, isbn);
        this.formato = formato;
        this.tamanhoMB = tamanhoMB;
    }

    public  String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }

    public void setTamanhoMB(double tamanhoMB) {
        this.tamanhoMB = tamanhoMB;
    }

    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Formato: " + formato);
        System.out.println("Tamanho MB: " + tamanhoMB);
    }

    @Override
    public boolean aplicaDescontoDe(double descontoPorcento) {
        if(descontoPorcento<=15 && descontoPorcento>=0){
            this.setValor(this.getValor()-(getValor()*(descontoPorcento/100)));
            return true;
        }
        return false;
    }
}
