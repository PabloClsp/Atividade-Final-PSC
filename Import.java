import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public Produto buscarProduto(String isbn) {
        for (Produto produto : produtos) {
            if (produto.getIsbn().equals(isbn)) {
                return produto;
            }
        }
        return null;
    }

    public boolean removerProduto(String isbn) {
        Produto produto = buscarProduto(isbn);
        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }

    public void salvarEstoque() {
        
    }

    public void carregarEstoque() {
        
    }
}
