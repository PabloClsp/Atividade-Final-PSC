public class Produto {
    private String titulo;
    private String autor;
    private String isbn;
    private int quantidade;
    private double preco;

    public Produto(String titulo, String autor, String isbn, int quantidade, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "Produto [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
